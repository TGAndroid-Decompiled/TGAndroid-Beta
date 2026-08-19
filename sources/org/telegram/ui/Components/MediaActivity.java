package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class MediaActivity extends BaseFragment implements SharedMediaLayout.SharedMediaPreloaderDelegate, FloatingDebugProvider, NotificationCenter.NotificationCenterDelegate {
    private SparseArray actionModeMessageObjects;
    private Runnable applyBulletin;
    ProfileActivity.AvatarImageView avatarImageView;
    private BackDrawable backDrawable;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private ActionBarMenuSubItem calendarItem;
    private TLRPC.ChatFull currentChatInfo;
    private TLRPC.UserFull currentUserInfo;
    private ActionBarMenuItem deleteItem;
    private long dialogId;
    private boolean filterPhotos;
    private boolean filterVideos;
    private final boolean[] firstSubtitleCheck;
    private String hashtag;
    private int initialTab;
    private int lastTab;
    private SimpleTextView[] nameTextView;
    private ActionBarMenuItem optionsItem;
    private AnimatedTextView selectedTextView;
    SharedMediaLayout sharedMediaLayout;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private int shiftDp;
    private ActionBarMenuSubItem showPhotosItem;
    private ActionBarMenuSubItem showVideosItem;
    private int storiesCount;
    private final ValueAnimator[] subtitleAnimator;
    private final boolean[] subtitleShown;
    private final float[] subtitleT;
    private AnimatedTextView[] subtitleTextView;
    private StoriesTabsView tabsView;
    private FrameLayout[] titles;
    private FrameLayout titlesContainer;
    private long topicId;
    private int type;
    private String username;
    private ActionBarMenuSubItem zoomInItem;
    private ActionBarMenuSubItem zoomOutItem;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public MediaActivity(Bundle bundle, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader) {
        super(bundle);
        this.titles = new FrameLayout[2];
        this.nameTextView = new SimpleTextView[2];
        this.subtitleTextView = new AnimatedTextView[2];
        this.filterPhotos = true;
        this.filterVideos = true;
        this.shiftDp = -12;
        this.subtitleShown = new boolean[2];
        this.subtitleT = new float[2];
        this.firstSubtitleCheck = new boolean[]{true, true};
        this.subtitleAnimator = new ValueAnimator[2];
        this.sharedMediaPreloader = sharedMediaPreloader;
    }

    @Override
    public boolean onFragmentCreate() {
        int i;
        this.type = getArguments().getInt("type", 0);
        this.dialogId = getArguments().getLong("dialog_id");
        this.topicId = getArguments().getLong("topic_id", 0L);
        this.hashtag = getArguments().getString("hashtag", "");
        this.username = getArguments().getString("username", "");
        this.storiesCount = getArguments().getInt("storiesCount", -1);
        int i2 = this.type;
        if (i2 == 2) {
            i = 9;
        } else {
            i = i2 == 1 ? 8 : 0;
        }
        this.initialTab = getArguments().getInt("start_from", i);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.dialogId) && this.topicId == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.currentUserInfo = getMessagesController().getUserFull(this.dialogId);
            }
        }
        if (this.sharedMediaPreloader == null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
        }
        this.sharedMediaPreloader.addDelegate(this);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            this.applyBulletin = null;
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.dialogId) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.currentUserInfo = userFull;
            SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
            if (sharedMediaLayout != null) {
                sharedMediaLayout.setUserInfo(userFull);
            }
        }
    }

    @Override
    public View createView(Context context) {
        int i;
        AvatarDrawable avatarDrawable;
        TLRPC.User user;
        AvatarDrawable avatarDrawable2;
        TLRPC.User user2;
        SimpleTextView simpleTextView;
        ActionBarMenuItem actionBarMenuItem;
        AvatarDrawable avatarDrawable3;
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.setAnimationTime(240.0f);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        final FrameLayout frameLayout = new FrameLayout(context);
        final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                ((FrameLayout.LayoutParams) MediaActivity.this.sharedMediaLayout.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = ActionBar.getCurrentActionBarHeight();
                for (int i4 = 0; i4 < 2; i4++) {
                    if (MediaActivity.this.nameTextView[i4] != null) {
                        ((FrameLayout.LayoutParams) MediaActivity.this.nameTextView[i4].getLayoutParams()).topMargin = (((ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(22.0f)) / 2) + AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f);
                    }
                    if (MediaActivity.this.subtitleTextView[i4] != null) {
                        ((FrameLayout.LayoutParams) MediaActivity.this.subtitleTextView[i4].getLayoutParams()).topMargin = ((ActionBar.getCurrentActionBarHeight() / 2) + (((ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) MediaActivity.this.avatarImageView.getLayoutParams()).topMargin = (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2;
                super.onMeasure(i2, i3);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                SharedMediaLayout sharedMediaLayout = MediaActivity.this.sharedMediaLayout;
                if (sharedMediaLayout != null && sharedMediaLayout.isInFastScroll()) {
                    return MediaActivity.this.sharedMediaLayout.dispatchFastScrollEvent(motionEvent);
                }
                SharedMediaLayout sharedMediaLayout2 = MediaActivity.this.sharedMediaLayout;
                if (sharedMediaLayout2 == null || !sharedMediaLayout2.checkPinchToZoom(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }

            @Override
            protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
                MediaActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
            }
        };
        sizeNotifierFrameLayout.needBlur = true;
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        final ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i2 = this.type;
        if (i2 == 1 || i2 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.actionBar.addView(frameLayout2, LayoutHelper.createFrame(56, 56, 85));
            int i3 = Theme.key_actionBarActionModeDefaultSelector;
            int themedColor = getThemedColor(i3);
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, actionBarMenuCreateMenu, themedColor, getThemedColor(i4));
            this.deleteItem = actionBarMenuItem2;
            actionBarMenuItem2.setIcon(R.drawable.msg_delete);
            this.deleteItem.setVisibility(8);
            this.deleteItem.setAlpha(0.0f);
            this.deleteItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    actionBarMenuCreateMenu.onItemClick(2);
                }
            });
            frameLayout2.addView(this.deleteItem);
            ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, actionBarMenuCreateMenu, getThemedColor(i3), getThemedColor(i4));
            this.optionsItem = actionBarMenuItem3;
            actionBarMenuItem3.setIcon(R.drawable.ic_ab_other);
            this.optionsItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.optionsItem.toggleSubMenu();
                }
            });
            this.optionsItem.setVisibility(8);
            this.optionsItem.setAlpha(0.0f);
            frameLayout2.addView(this.optionsItem);
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = this.optionsItem.addSubItem(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.zoomInItem = actionBarMenuSubItemAddSubItem;
            actionBarMenuSubItemAddSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MediaActivity.m2430$r8$lambda$E7pTo51h2ckezgK3zPyZy35dE(this.f$0, view);
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = this.optionsItem.addSubItem(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.zoomOutItem = actionBarMenuSubItemAddSubItem2;
            actionBarMenuSubItemAddSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MediaActivity.m2433$r8$lambda$GN5T1QeQASBByvZssgLi1OcWtE(this.f$0, view);
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = this.optionsItem.addSubItem(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.calendarItem = actionBarMenuSubItemAddSubItem3;
            actionBarMenuSubItemAddSubItem3.setEnabled(false);
            this.calendarItem.setAlpha(0.5f);
            this.optionsItem.addColoredGap();
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem4 = this.optionsItem.addSubItem(6, 0, (CharSequence) LocaleController.getString(R.string.MediaShowPhotos), true);
            this.showPhotosItem = actionBarMenuSubItemAddSubItem4;
            actionBarMenuSubItemAddSubItem4.setChecked(this.filterPhotos);
            this.showPhotosItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MediaActivity.m2435$r8$lambda$h0mNMsrI0mtl2Eo_mwLwYNeQAo(this.f$0, view);
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem5 = this.optionsItem.addSubItem(7, 0, (CharSequence) LocaleController.getString(R.string.MediaShowVideos), true);
            this.showVideosItem = actionBarMenuSubItemAddSubItem5;
            actionBarMenuSubItemAddSubItem5.setChecked(this.filterVideos);
            this.showVideosItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MediaActivity.m2437$r8$lambda$y7_E4MTouDfU74ULTBaGRNY4i0(this.f$0, view);
                }
            });
        }
        boolean z = this.type == 0;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.titlesContainer = frameLayout3;
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        int i5 = 0;
        while (true) {
            if (i5 >= (this.type == 1 ? 2 : 1)) {
                break;
            }
            this.titles[i5] = new FrameLayout(context);
            this.titlesContainer.addView(this.titles[i5], LayoutHelper.createFrame(-1, -1, 119));
            this.nameTextView[i5] = new SimpleTextView(context);
            this.nameTextView[i5].setPivotX(0.0f);
            this.nameTextView[i5].setPivotY(AndroidUtilities.dp(9.0f));
            this.nameTextView[i5].setTextSize(18);
            this.nameTextView[i5].setGravity(3);
            this.nameTextView[i5].setTypeface(AndroidUtilities.bold());
            this.nameTextView[i5].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            this.nameTextView[i5].setScrollNonFitText(true);
            this.nameTextView[i5].setImportantForAccessibility(2);
            this.titles[i5].addView(this.nameTextView[i5], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            this.subtitleTextView[i5] = new AnimatedTextView(context, true, true, true);
            this.subtitleTextView[i5].setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.subtitleTextView[i5].setTextSize(AndroidUtilities.dp(14.0f));
            this.subtitleTextView[i5].setTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle));
            this.titles[i5].addView(this.subtitleTextView[i5], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i5 != 0) {
                this.titles[i5].setAlpha(0.0f);
            }
            i5++;
        }
        ProfileActivity.AvatarImageView avatarImageView = new ProfileActivity.AvatarImageView(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
                    return;
                }
                accessibilityNodeInfo.setVisibleToUser(false);
            }
        };
        this.avatarImageView = avatarImageView;
        avatarImageView.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((getDialogId() == getUserConfig().getClientUserId() && this.topicId == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.avatarImageView.setPivotX(0.0f);
        this.avatarImageView.setPivotY(0.0f);
        AvatarDrawable avatarDrawable4 = new AvatarDrawable();
        avatarDrawable4.setProfile(true);
        this.avatarImageView.setVisibility(z ? 0 : 8);
        this.avatarImageView.setImageDrawable(avatarDrawable4);
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.selectedTextView = animatedTextView;
        animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.selectedTextView.setTextSize(AndroidUtilities.dp(20.0f));
        this.selectedTextView.setGravity(3);
        AnimatedTextView animatedTextView2 = this.selectedTextView;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView2.setTextColor(getThemedColor(i6));
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.selectedTextView, LayoutHelper.createFrame(-2, -1.0f, 23, (z ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.type == 1) {
            StoriesTabsView storiesTabsView = new StoriesTabsView(context, getResourceProvider());
            this.tabsView = storiesTabsView;
            storiesTabsView.setOnTabClick(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.sharedMediaLayout.scrollToPage(((Integer) obj).intValue() + 8);
                }
            });
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.buttonContainer = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, getResourceProvider());
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), false);
            this.button.setShowZero(true);
            this.button.setCount(0, false);
            this.button.setEnabled(false);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MediaActivity.$r8$lambda$4uHbAoCwpIhBOFnBHiJhdEm12uw(this.f$0, view);
                }
            });
            this.buttonContainer.addView(this.button);
            this.buttonContainer.setAlpha(0.0f);
            this.buttonContainer.setTranslationY(AndroidUtilities.dp(100.0f));
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                @Override
                public boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public boolean clipWithGradient(int i7) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i7);
                }

                @Override
                public int getTopOffset(int i7) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i7);
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }

                @Override
                public int getBottomOffset(int i7) {
                    return AndroidUtilities.dp(64.0f);
                }
            });
        }
        if (this.type == 0 && this.dialogId == getUserConfig().getClientUserId() && this.topicId == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.initialTab = 11;
        }
        SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, this.dialogId, this.sharedMediaPreloader, 0, null, this.currentChatInfo, this.currentUserInfo, this.initialTab, 0, this, new SharedMediaLayout.Delegate() {
            @Override
            public boolean canSearchMembers() {
                return false;
            }

            @Override
            public TLRPC.Chat getCurrentChat() {
                return null;
            }

            @Override
            public RecyclerListView getListView() {
                return null;
            }

            @Override
            public boolean isFragmentOpened() {
                return true;
            }

            @Override
            public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z2, boolean z3, View view) {
                return false;
            }

            @Override
            public void scrollToSharedMedia() {
            }

            @Override
            public void updateSelectedMediaTabText() {
                MediaActivity.this.updateMediaCount();
            }
        }, 0, getResourceProvider()) {
            private AnimatorSet actionModeAnimation;

            @Override
            protected void onSelectedTabChanged() {
                super.onSelectedTabChanged();
                MediaActivity.this.updateMediaCount();
            }

            @Override
            public String getStoriesHashtag() {
                return MediaActivity.this.hashtag;
            }

            @Override
            public String getStoriesHashtagUsername() {
                return MediaActivity.this.username;
            }

            @Override
            protected boolean canShowSearchItem() {
                return (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) ? false : true;
            }

            @Override
            protected void onSearchStateChanged(boolean z2) {
                AndroidUtilities.removeAdjustResize(MediaActivity.this.getParentActivity(), ((BaseFragment) MediaActivity.this).classGuid);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, !z2, 0.95f, true);
            }

            @Override
            protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
                sizeNotifierFrameLayout.drawBlurRect(canvas, getY() + f, rect, paint, true);
            }

            @Override
            protected void invalidateBlur() {
                sizeNotifierFrameLayout.invalidateBlur();
            }

            @Override
            protected boolean isStoriesView() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2;
            }

            @Override
            protected boolean customTabs() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2 || MediaActivity.this.type == 3;
            }

            @Override
            protected boolean includeStories() {
                return MediaActivity.this.type == 1 || MediaActivity.this.type == 2;
            }

            @Override
            protected boolean includeSavedDialogs() {
                return MediaActivity.this.type == 0 && MediaActivity.this.dialogId == MediaActivity.this.getUserConfig().getClientUserId() && MediaActivity.this.topicId == 0;
            }

            @Override
            protected boolean isArchivedOnlyStoriesView() {
                return MediaActivity.this.type == 2;
            }

            @Override
            protected int getInitialTab() {
                return MediaActivity.this.initialTab;
            }

            @Override
            protected void showActionMode(final boolean z2) {
                if (MediaActivity.this.type == 0) {
                    super.showActionMode(z2);
                    return;
                }
                if (this.isActionModeShowed == z2) {
                    return;
                }
                this.isActionModeShowed = z2;
                AnimatorSet animatorSet = this.actionModeAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) {
                    disableScroll(z2);
                }
                if (z2) {
                    MediaActivity.this.selectedTextView.setVisibility(0);
                    if (MediaActivity.this.buttonContainer != null) {
                        MediaActivity.this.buttonContainer.setVisibility(0);
                    }
                } else {
                    MediaActivity.this.titlesContainer.setVisibility(0);
                }
                float f = 0.0f;
                MediaActivity.this.backDrawable.setRotation(z2 ? 1.0f : 0.0f, true);
                this.actionModeAnimation = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                AnimatedTextView animatedTextView3 = MediaActivity.this.selectedTextView;
                float[] fArr = {z2 ? 1.0f : 0.0f};
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(animatedTextView3, (Property<AnimatedTextView, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.titlesContainer, (Property<FrameLayout, Float>) property, z2 ? 0.0f : 1.0f));
                if (MediaActivity.this.buttonContainer != null) {
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.buttonContainer, (Property<FrameLayout, Float>) property, z2 ? 1.0f : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.buttonContainer, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z2 ? 0.0f : MediaActivity.this.buttonContainer.getMeasuredHeight()));
                }
                if (MediaActivity.this.deleteItem != null) {
                    MediaActivity.this.deleteItem.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.deleteItem, (Property<ActionBarMenuItem, Float>) property, z2 ? 1.0f : 0.0f));
                }
                final boolean z3 = getStoriesCount(getClosestTab()) == 0;
                if (MediaActivity.this.optionsItem != null) {
                    MediaActivity.this.optionsItem.setVisibility(0);
                    ActionBarMenuItem actionBarMenuItem4 = MediaActivity.this.optionsItem;
                    if (!z2 && !z3) {
                        f = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem4, (Property<ActionBarMenuItem, Float>) property, f));
                }
                if (MediaActivity.this.tabsView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(MediaActivity.this.tabsView, (Property<StoriesTabsView, Float>) property, z2 ? 0.4f : 1.0f));
                }
                this.actionModeAnimation.playTogether(arrayList);
                this.actionModeAnimation.setDuration(300L);
                this.actionModeAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animator) {
                        AnonymousClass6.this.actionModeAnimation = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (AnonymousClass6.this.actionModeAnimation == null) {
                            return;
                        }
                        AnonymousClass6.this.actionModeAnimation = null;
                        if (!z2) {
                            MediaActivity.this.selectedTextView.setVisibility(4);
                            if (MediaActivity.this.buttonContainer != null) {
                                MediaActivity.this.buttonContainer.setVisibility(4);
                            }
                            if (MediaActivity.this.deleteItem != null) {
                                MediaActivity.this.deleteItem.setVisibility(8);
                            }
                            if (!z3 || MediaActivity.this.optionsItem == null) {
                                return;
                            }
                            MediaActivity.this.optionsItem.setVisibility(8);
                            return;
                        }
                        MediaActivity.this.titlesContainer.setVisibility(4);
                        if (MediaActivity.this.optionsItem != null) {
                            MediaActivity.this.optionsItem.setVisibility(8);
                        }
                    }
                });
                this.actionModeAnimation.start();
            }

            @Override
            protected void onActionModeSelectedUpdate(SparseArray sparseArray) {
                int size = sparseArray.size();
                MediaActivity.this.actionModeMessageObjects = sparseArray;
                if (MediaActivity.this.type == 1 || MediaActivity.this.type == 2) {
                    MediaActivity.this.selectedTextView.cancelAnimation();
                    MediaActivity.this.selectedTextView.setText(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL);
                    if (MediaActivity.this.button != null) {
                        MediaActivity.this.button.setEnabled(size > 0);
                        MediaActivity.this.button.setCount(size, true);
                        if (MediaActivity.this.sharedMediaLayout.getClosestTab() == 8) {
                            MediaActivity.this.button.setText(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true);
                        }
                    }
                }
            }

            @Override
            public void onTabProgress(float f) {
                if (MediaActivity.this.type != 1) {
                    return;
                }
                float f2 = f - 8.0f;
                if (MediaActivity.this.tabsView != null) {
                    MediaActivity.this.tabsView.setProgress(f2);
                }
                float f3 = 1.0f - f2;
                MediaActivity.this.titles[0].setAlpha(f3);
                MediaActivity.this.titles[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f2);
                MediaActivity.this.titles[1].setAlpha(f2);
                MediaActivity.this.titles[1].setTranslationX(AndroidUtilities.dp(12.0f) * f3);
            }

            @Override
            protected void onTabScroll(boolean z2) {
                if (MediaActivity.this.tabsView != null) {
                    MediaActivity.this.tabsView.setScrolling(z2);
                }
            }
        };
        this.sharedMediaLayout = sharedMediaLayout;
        sharedMediaLayout.scrollSlidingTextTabStrip.setOpen(true);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i6), PorterDuff.Mode.SRC_IN));
        }
        this.sharedMediaLayout.setPinnedToTop(true);
        this.sharedMediaLayout.getSearchItem().setTranslationY(0.0f);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i7 = this.type;
        if (i7 == 1 || i7 == 2) {
            sizeNotifierFrameLayout.addView(this.sharedMediaLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            sizeNotifierFrameLayout.addView(this.sharedMediaLayout);
        }
        sizeNotifierFrameLayout.addView(this.actionBar);
        sizeNotifierFrameLayout.addView(frameLayout);
        sizeNotifierFrameLayout.blurBehindViews.add(this.sharedMediaLayout);
        if (this.type == 1) {
            showSubtitle(0, false, false);
            showSubtitle(1, false, false);
        }
        StoriesTabsView storiesTabsView2 = this.tabsView;
        if (storiesTabsView2 != null) {
            i = -1;
            sizeNotifierFrameLayout.addView(storiesTabsView2, LayoutHelper.createFrame(-1, -2, 87));
        } else {
            i = -1;
        }
        FrameLayout frameLayout5 = this.buttonContainer;
        if (frameLayout5 != null) {
            sizeNotifierFrameLayout.addView(frameLayout5, LayoutHelper.createFrame(i, 64, 87));
        }
        long j = this.dialogId;
        if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
            j = this.topicId;
        }
        int i8 = this.type;
        if (i8 == 3) {
            this.nameTextView[0].setText(this.hashtag);
            int i9 = this.storiesCount;
            if (i9 != i) {
                this.subtitleTextView[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i9));
            }
        } else if (i8 == 2) {
            this.nameTextView[0].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
        } else {
            if (i8 == 1) {
                this.nameTextView[0].setText(LocaleController.getString(R.string.ProfileMyStories));
                this.nameTextView[1].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
            } else {
                if (j == 2666000) {
                    this.nameTextView[0].setText(LocaleController.getString(R.string.AnonymousForward));
                    AvatarDrawable avatarDrawable5 = avatarDrawable4;
                    avatarDrawable5.setAvatarType(21);
                    avatarDrawable5.setScaleSize(0.75f);
                    avatarDrawable3 = avatarDrawable5;
                } else {
                    avatarDrawable = avatarDrawable4;
                    if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
                        this.nameTextView[0].setText(LocaleController.getString(R.string.MyNotes));
                        avatarDrawable.setAvatarType(22);
                        avatarDrawable.setScaleSize(0.75f);
                        avatarDrawable3 = avatarDrawable;
                    } else if (DialogObject.isEncryptedDialog(j)) {
                        TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
                        if (encryptedChat != null && (user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id))) != null) {
                            avatarDrawable3 = avatarDrawable;
                            avatarDrawable3 = avatarDrawable;
                            this.nameTextView[0].setText(ContactsController.formatName(user.first_name, user.last_name));
                            avatarDrawable.setInfo(this.currentAccount, user);
                            user2 = user;
                            avatarDrawable2 = avatarDrawable;
                        }
                    } else if (DialogObject.isUserDialog(j)) {
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                        if (user3 != null) {
                            if (user3.self) {
                                avatarDrawable3 = avatarDrawable;
                                this.nameTextView[0].setText(LocaleController.getString(R.string.SavedMessages));
                                avatarDrawable.setAvatarType(1);
                                avatarDrawable.setScaleSize(0.8f);
                                avatarDrawable3 = avatarDrawable;
                            } else {
                                avatarDrawable3 = avatarDrawable;
                                this.nameTextView[0].setText(ContactsController.formatName(user3.first_name, user3.last_name));
                                avatarDrawable.setInfo(this.currentAccount, user3);
                                user2 = user3;
                                avatarDrawable2 = avatarDrawable;
                            }
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                        if (chat != null) {
                            avatarDrawable3 = avatarDrawable;
                            this.nameTextView[0].setText(chat.title);
                            avatarDrawable.setInfo(this.currentAccount, chat);
                            user2 = chat;
                            avatarDrawable2 = avatarDrawable;
                        }
                    }
                }
                avatarDrawable3 = avatarDrawable;
                avatarDrawable3 = avatarDrawable;
                avatarDrawable3 = avatarDrawable;
                avatarDrawable3 = avatarDrawable;
                avatarDrawable3 = avatarDrawable;
                user2 = null;
                avatarDrawable2 = avatarDrawable3;
            }
            this.avatarImageView.setImage(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", avatarDrawable2, user2);
            simpleTextView = this.nameTextView[0];
            if (simpleTextView != null && TextUtils.isEmpty(simpleTextView.getText())) {
                this.nameTextView[0].setText(LocaleController.getString(R.string.SharedContentTitle));
            }
            if (this.sharedMediaLayout.isSearchItemVisible() && this.type != 1) {
                this.sharedMediaLayout.getSearchItem().setVisibility(0);
            }
            actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
            if (actionBarMenuItem != null && this.initialTab != 11) {
                actionBarMenuItem.setVisibility(8);
            }
            if (this.sharedMediaLayout.getSearchOptionsItem() != null && this.type != 1) {
                SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                sharedMediaLayout2.animateSearchToOptions(!sharedMediaLayout2.isSearchItemVisible(), false);
                this.sharedMediaLayout.getSearchOptionsItem().setVisibility(0);
            }
            if (!this.sharedMediaLayout.isCalendarItemVisible() && this.type != 1) {
                this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(0);
            } else {
                this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
            }
            this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
            updateMediaCount();
            updateColors();
            if (this.type == 1 && this.initialTab == 9) {
                this.sharedMediaLayout.onTabProgress(9.0f);
            }
            return sizeNotifierFrameLayout;
        }
        avatarDrawable3 = avatarDrawable4;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        avatarDrawable3 = avatarDrawable;
        user2 = null;
        avatarDrawable2 = avatarDrawable3;
        this.avatarImageView.setImage(ImageLocation.getForUserOrChat(this.currentAccount, user2, 1), "50_50", avatarDrawable2, user2);
        simpleTextView = this.nameTextView[0];
        if (simpleTextView != null) {
            this.nameTextView[0].setText(LocaleController.getString(R.string.SharedContentTitle));
        }
        if (this.sharedMediaLayout.isSearchItemVisible()) {
            this.sharedMediaLayout.getSearchItem().setVisibility(0);
        }
        actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            SharedMediaLayout sharedMediaLayout3 = this.sharedMediaLayout;
            sharedMediaLayout3.animateSearchToOptions(!sharedMediaLayout3.isSearchItemVisible(), false);
            this.sharedMediaLayout.getSearchOptionsItem().setVisibility(0);
        }
        if (!this.sharedMediaLayout.isCalendarItemVisible()) {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
        } else {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
        }
        this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
        updateMediaCount();
        updateColors();
        if (this.type == 1) {
            this.sharedMediaLayout.onTabProgress(9.0f);
        }
        return sizeNotifierFrameLayout;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (MediaActivity.this.sharedMediaLayout.closeActionMode(true)) {
                    return;
                }
                MediaActivity.this.finishFragment();
                return;
            }
            if (i != 2) {
                if (i == 10) {
                    SharedMediaLayout sharedMediaLayout = MediaActivity.this.sharedMediaLayout;
                    sharedMediaLayout.showMediaCalendar(sharedMediaLayout.getClosestTab(), false);
                    return;
                } else {
                    if (i == 11) {
                        MediaActivity.this.sharedMediaLayout.closeActionMode(true);
                        MediaActivity.this.sharedMediaLayout.getSearchItem().openSearch(false);
                        return;
                    }
                    return;
                }
            }
            if (MediaActivity.this.actionModeMessageObjects != null) {
                final ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < MediaActivity.this.actionModeMessageObjects.size(); i2++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) MediaActivity.this.actionModeMessageObjects.valueAt(i2)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MediaActivity.this.getContext(), MediaActivity.this.getResourceProvider());
                builder.setTitle(LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle));
                builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        MediaActivity.AnonymousClass1.$r8$lambda$vOJSjXEj69qgBzGEjM8KnkKtJAc(this.f$0, arrayList, alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        alertDialog.dismiss();
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.show();
                alertDialogCreate.redPositive();
            }
        }

        public static void $r8$lambda$vOJSjXEj69qgBzGEjM8KnkKtJAc(AnonymousClass1 anonymousClass1, ArrayList arrayList, AlertDialog alertDialog, int i) {
            MediaActivity.this.getMessagesController().getStoriesController().deleteStories(MediaActivity.this.dialogId, arrayList);
            MediaActivity.this.sharedMediaLayout.closeActionMode(false);
        }
    }

    public static void m2430$r8$lambda$E7pTo51h2ckezgK3zPyZy35dE(MediaActivity mediaActivity, View view) {
        Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn();
        if (boolZoomIn == null) {
            return;
        }
        boolean zBooleanValue = boolZoomIn.booleanValue();
        mediaActivity.zoomOutItem.setEnabled(true);
        mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        mediaActivity.zoomInItem.setEnabled(zBooleanValue);
        mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public static void m2433$r8$lambda$GN5T1QeQASBByvZssgLi1OcWtE(MediaActivity mediaActivity, View view) {
        Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut();
        if (boolZoomOut == null) {
            return;
        }
        mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
        mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
        mediaActivity.zoomInItem.setEnabled(true);
        mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
    }

    public static void m2435$r8$lambda$h0mNMsrI0mtl2Eo_mwLwYNeQAo(MediaActivity mediaActivity, View view) {
        boolean z = mediaActivity.filterPhotos;
        if (z && !mediaActivity.filterVideos) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
            int i = -mediaActivity.shiftDp;
            mediaActivity.shiftDp = i;
            AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i);
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
        boolean z2 = !z;
        mediaActivity.filterPhotos = z2;
        actionBarMenuSubItem2.setChecked(z2);
        mediaActivity.sharedMediaLayout.setStoriesFilter(mediaActivity.filterPhotos, mediaActivity.filterVideos);
    }

    public static void m2437$r8$lambda$y7_E4MTouDfU74ULTBaGRNY4i0(MediaActivity mediaActivity, View view) {
        boolean z = mediaActivity.filterVideos;
        if (z && !mediaActivity.filterPhotos) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showVideosItem;
            int i = -mediaActivity.shiftDp;
            mediaActivity.shiftDp = i;
            AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i);
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showVideosItem;
        boolean z2 = !z;
        mediaActivity.filterVideos = z2;
        actionBarMenuSubItem2.setChecked(z2);
        mediaActivity.sharedMediaLayout.setStoriesFilter(mediaActivity.filterPhotos, mediaActivity.filterVideos);
    }

    public static void $r8$lambda$4uHbAoCwpIhBOFnBHiJhdEm12uw(final MediaActivity mediaActivity, View view) {
        int i;
        Bulletin bulletinShow;
        Runnable runnable = mediaActivity.applyBulletin;
        if (runnable != null) {
            runnable.run();
            mediaActivity.applyBulletin = null;
        }
        Bulletin.hideVisible();
        final boolean z = mediaActivity.sharedMediaLayout.getClosestTab() == 9;
        final ArrayList arrayList = new ArrayList();
        if (mediaActivity.actionModeMessageObjects != null) {
            i = 0;
            for (int i2 = 0; i2 < mediaActivity.actionModeMessageObjects.size(); i2++) {
                TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity.actionModeMessageObjects.valueAt(i2)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                    i++;
                }
            }
        } else {
            i = 0;
        }
        mediaActivity.sharedMediaLayout.closeActionMode(false);
        if (z) {
            mediaActivity.sharedMediaLayout.scrollToPage(8);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean[] zArr = new boolean[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i3);
            zArr[i3] = storyItem2.pinned;
            storyItem2.pinned = z;
        }
        mediaActivity.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity.dialogId, arrayList);
        final boolean[] zArr2 = {false};
        mediaActivity.applyBulletin = new Runnable() {
            @Override
            public final void run() {
                MediaActivity mediaActivity2 = this.f$0;
                mediaActivity2.getMessagesController().getStoriesController().updateStoriesPinned(mediaActivity2.dialogId, arrayList, z, null);
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                MediaActivity.m2434$r8$lambda$LQ9Fc079CMz4ntqmlD1J_YCrHs(this.f$0, zArr2, arrayList, zArr);
            }
        };
        if (z) {
            bulletinShow = BulletinFactory.of(mediaActivity).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), runnable2).show();
        } else {
            bulletinShow = BulletinFactory.of(mediaActivity).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i, new Object[0]), LocaleController.getString("Undo"), 5000, runnable2).show();
        }
        bulletinShow.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                MediaActivity.m2432$r8$lambda$x8kCnpm3xJuGbTra4n8aQmzbgE(this.f$0, zArr2);
            }
        });
    }

    public static void m2434$r8$lambda$LQ9Fc079CMz4ntqmlD1J_YCrHs(MediaActivity mediaActivity, boolean[] zArr, ArrayList arrayList, boolean[] zArr2) {
        mediaActivity.getClass();
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(mediaActivity.applyBulletin);
        for (int i = 0; i < arrayList.size(); i++) {
            ((TL_stories.StoryItem) arrayList.get(i)).pinned = zArr2[i];
        }
        mediaActivity.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity.dialogId, arrayList);
    }

    public static void m2432$r8$lambda$x8kCnpm3xJuGbTra4n8aQmzbgE(MediaActivity mediaActivity, boolean[] zArr) {
        Runnable runnable;
        mediaActivity.getClass();
        if (!zArr[0] && (runnable = mediaActivity.applyBulletin) != null) {
            runnable.run();
        }
        mediaActivity.applyBulletin = null;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
            }
            return false;
        }
        if (!this.sharedMediaLayout.isActionModeShown()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.sharedMediaLayout.closeActionMode(false);
        }
        return false;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return this.sharedMediaLayout.isCurrentTabFirst();
        }
        return false;
    }

    @Override
    public boolean canBeginSlide() {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return super.canBeginSlide();
        }
        return false;
    }

    public void updateMediaCount() {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            if (this.subtitleTextView[0] == null) {
                return;
            }
            int closestTab = sharedMediaLayout.getClosestTab();
            if (this.type != 3 || closestTab == 8) {
                int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
                boolean z = LocaleController.isRTL;
                boolean z2 = !z;
                int i = (this.type == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab == 8 || closestTab == 9) {
                    ActionBarMenuSubItem actionBarMenuSubItem = this.zoomOutItem;
                    if (actionBarMenuSubItem != null) {
                        actionBarMenuSubItem.setEnabled(this.sharedMediaLayout.canZoomOut());
                        ActionBarMenuSubItem actionBarMenuSubItem2 = this.zoomOutItem;
                        actionBarMenuSubItem2.setAlpha(actionBarMenuSubItem2.isEnabled() ? 1.0f : 0.5f);
                    }
                    ActionBarMenuSubItem actionBarMenuSubItem3 = this.zoomInItem;
                    if (actionBarMenuSubItem3 != null) {
                        actionBarMenuSubItem3.setEnabled(this.sharedMediaLayout.canZoomIn());
                        ActionBarMenuSubItem actionBarMenuSubItem4 = this.zoomInItem;
                        actionBarMenuSubItem4.setAlpha(actionBarMenuSubItem4.isEnabled() ? 1.0f : 0.5f);
                    }
                    int storiesCount = this.sharedMediaLayout.getStoriesCount(8);
                    if (storiesCount > 0) {
                        if (this.type == 3) {
                            if (TextUtils.isEmpty(this.subtitleTextView[0].getText())) {
                                showSubtitle(0, true, true);
                                this.subtitleTextView[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", storiesCount), z2);
                            }
                        } else {
                            showSubtitle(0, true, true);
                            this.subtitleTextView[0].setText(LocaleController.formatPluralString("ProfileMyStoriesCount", storiesCount, new Object[0]), z2);
                        }
                    } else {
                        showSubtitle(0, false, true);
                    }
                    if (this.type == 1) {
                        int storiesCount2 = this.sharedMediaLayout.getStoriesCount(9);
                        if (storiesCount2 > 0) {
                            showSubtitle(1, true, true);
                            this.subtitleTextView[1].setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", storiesCount2, new Object[0]), z2);
                        } else {
                            showSubtitle(1, false, true);
                        }
                    }
                    if (this.optionsItem != null) {
                        SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                        final boolean z3 = sharedMediaLayout2.getStoriesCount(sharedMediaLayout2.getClosestTab()) <= 0;
                        if (!z3) {
                            this.optionsItem.setVisibility(0);
                        }
                        this.optionsItem.animate().alpha(z3 ? 0.0f : 1.0f).withEndAction(new Runnable() {
                            @Override
                            public final void run() {
                                MediaActivity.$r8$lambda$U7bZOMWLNagKFxkNHOwgwplJVxA(this.f$0, z3);
                            }
                        }).setDuration(220L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    ButtonWithCounterView buttonWithCounterView = this.button;
                    if (buttonWithCounterView != null) {
                        boolean z4 = !z && this.lastTab == closestTab;
                        if (closestTab == 8) {
                            SparseArray sparseArray = this.actionModeMessageObjects;
                            buttonWithCounterView.setText(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z4);
                        } else {
                            buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), z4);
                        }
                        this.lastTab = closestTab;
                    }
                    if (this.calendarItem != null) {
                        boolean z5 = this.sharedMediaLayout.getStoriesCount(closestTab) > 0;
                        this.calendarItem.setEnabled(z5);
                        this.calendarItem.setAlpha(z5 ? 1.0f : 0.5f);
                        return;
                    }
                    return;
                }
                if (closestTab == 11) {
                    showSubtitle(i, true, true);
                    this.subtitleTextView[i].setText(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z2);
                    return;
                }
                if (closestTab >= 0) {
                    if (closestTab >= lastMediaCount.length || lastMediaCount[closestTab] >= 0) {
                        if (closestTab == 0) {
                            showSubtitle(i, true, true);
                            if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1) {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]), z2);
                                return;
                            } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2) {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]), z2);
                                return;
                            } else {
                                this.subtitleTextView[i].setText(LocaleController.formatPluralString("Media", lastMediaCount[0], new Object[0]), z2);
                                return;
                            }
                        }
                        if (closestTab == 1) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Files", lastMediaCount[1], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 2) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Voice", lastMediaCount[2], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 3) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Links", lastMediaCount[3], new Object[0]), z2);
                            return;
                        }
                        if (closestTab == 4) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("MusicFiles", lastMediaCount[4], new Object[0]), z2);
                        } else if (closestTab == 5) {
                            showSubtitle(i, true, true);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("GIFs", lastMediaCount[5], new Object[0]), z2);
                        } else if (closestTab == 10) {
                            showSubtitle(i, true, true);
                            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.dialogId);
                            this.subtitleTextView[i].setText(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.more + channelRecommendations.chats.size(), new Object[0]), z2);
                        }
                    }
                }
            }
        }
    }

    public static void $r8$lambda$U7bZOMWLNagKFxkNHOwgwplJVxA(MediaActivity mediaActivity, boolean z) {
        if (z) {
            mediaActivity.optionsItem.setVisibility(8);
        } else {
            mediaActivity.getClass();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.currentChatInfo = chatFull;
    }

    public long getDialogId() {
        return this.dialogId;
    }

    private void showSubtitle(final int i, final boolean z, boolean z2) {
        int i2 = this.type;
        if (i2 == 3) {
            return;
        }
        if (i == 1 && i2 == 2) {
            return;
        }
        boolean[] zArr = this.subtitleShown;
        if (zArr[i] != z || this.firstSubtitleCheck[i]) {
            boolean[] zArr2 = this.firstSubtitleCheck;
            boolean z3 = !zArr2[i] && z2;
            zArr2[i] = false;
            zArr[i] = z;
            ValueAnimator valueAnimator = this.subtitleAnimator[i];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subtitleAnimator[i] = null;
            }
            if (z3) {
                this.subtitleTextView[i].setVisibility(0);
                this.subtitleAnimator[i] = ValueAnimator.ofFloat(this.subtitleT[i], z ? 1.0f : 0.0f);
                this.subtitleAnimator[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        MediaActivity.m2431$r8$lambda$Zs9cAenV_0Nd3YH1C7bkGMyJh0(this.f$0, i, valueAnimator2);
                    }
                });
                this.subtitleAnimator[i].addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        MediaActivity.this.subtitleT[i] = z ? 1.0f : 0.0f;
                        MediaActivity.this.nameTextView[i].setScaleX(z ? 1.0f : 1.111f);
                        MediaActivity.this.nameTextView[i].setScaleY(z ? 1.0f : 1.111f);
                        MediaActivity.this.nameTextView[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                        MediaActivity.this.subtitleTextView[i].setAlpha(z ? 1.0f : 0.0f);
                        if (z) {
                            return;
                        }
                        MediaActivity.this.subtitleTextView[i].setVisibility(8);
                    }
                });
                this.subtitleAnimator[i].setDuration(320L);
                this.subtitleAnimator[i].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.subtitleAnimator[i].start();
                return;
            }
            this.subtitleT[i] = z ? 1.0f : 0.0f;
            this.nameTextView[i].setScaleX(z ? 1.0f : 1.111f);
            this.nameTextView[i].setScaleY(z ? 1.0f : 1.111f);
            this.nameTextView[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
            this.subtitleTextView[i].setAlpha(z ? 1.0f : 0.0f);
            this.subtitleTextView[i].setVisibility(z ? 0 : 8);
        }
    }

    public static void m2431$r8$lambda$Zs9cAenV_0Nd3YH1C7bkGMyJh0(MediaActivity mediaActivity, int i, ValueAnimator valueAnimator) {
        mediaActivity.subtitleT[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mediaActivity.nameTextView[i].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, mediaActivity.subtitleT[i]));
        mediaActivity.nameTextView[i].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, mediaActivity.subtitleT[i]));
        mediaActivity.nameTextView[i].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, mediaActivity.subtitleT[i]));
        mediaActivity.subtitleTextView[i].setAlpha(mediaActivity.subtitleT[i]);
    }

    @Override
    public void mediaCountUpdated() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && (sharedMediaPreloader = this.sharedMediaPreloader) != null) {
            sharedMediaLayout.setNewMediaCounts(sharedMediaPreloader.getLastMediaCount());
        }
        updateMediaCount();
    }

    public void updateColors() {
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(i), false);
        this.actionBar.setItemsColor(Theme.getColor(i), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(Theme.getColor(i));
        SimpleTextView simpleTextView = this.nameTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(Theme.getColor(i));
        }
        SimpleTextView simpleTextView2 = this.nameTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setTextColor(Theme.getColor(i));
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.addAll(this.sharedMediaLayout.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (getLastStoryViewer() != null && getLastStoryViewer().isShown()) {
            return false;
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }

    @Override
    public List onGetDebugItems() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShapeDetector.isLearning(getContext()) ? "Disable" : "Enable");
        sb.append(" shape detector learning debug");
        return Arrays.asList(new FloatingDebugController.DebugItem(sb.toString(), new Runnable() {
            @Override
            public final void run() {
                MediaActivity mediaActivity = this.f$0;
                ShapeDetector.setLearning(mediaActivity.getContext(), !ShapeDetector.isLearning(mediaActivity.getContext()));
            }
        }));
    }

    private class StoriesTabsView extends BottomPagerTabs {
        public StoriesTabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public BottomPagerTabs.Tab[] createTabs() {
            return new BottomPagerTabs.Tab[]{new BottomPagerTabs.Tab(0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new BottomPagerTabs.Tab(1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        }
    }

    @Override
    public int getNavigationBarColor() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        return (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) ? themedColor : getLastStoryViewer().getNavigationBarColor(themedColor);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.setPagesPaddingBottom(i4);
        }
    }
}
