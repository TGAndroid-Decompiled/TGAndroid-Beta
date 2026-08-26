package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController$DebugItem;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class MediaActivity extends BaseFragment implements SharedMediaLayout.SharedMediaPreloaderDelegate, FloatingDebugProvider, NotificationCenter.NotificationCenterDelegate {
    public SparseArray actionModeMessageObjects;
    public PhotoViewer$$ExternalSyntheticLambda89 applyBulletin;
    public AnonymousClass3 avatarImageView;
    public BackDrawable backDrawable;
    public ButtonWithCounterView button;
    public FrameLayout buttonContainer;
    public ActionBarMenuSubItem calendarItem;
    public TLRPC.ChatFull currentChatInfo;
    public TLRPC.UserFull currentUserInfo;
    public ActionBarMenuItem deleteItem;
    public long dialogId;
    public boolean filterPhotos;
    public boolean filterVideos;
    public final boolean[] firstSubtitleCheck;
    public String hashtag;
    public int initialTab;
    public int lastTab;
    public final SimpleTextView[] nameTextView;
    public ActionBarMenuItem optionsItem;
    public AnimatedTextView selectedTextView;
    public AnonymousClass6 sharedMediaLayout;
    public SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    public int shiftDp;
    public ActionBarMenuSubItem showPhotosItem;
    public ActionBarMenuSubItem showVideosItem;
    public int storiesCount;
    public final ValueAnimator[] subtitleAnimator;
    public final boolean[] subtitleShown;
    public final float[] subtitleT;
    public final AnimatedTextView[] subtitleTextView;
    public StoriesTabsView tabsView;
    public final FrameLayout[] titles;
    public FrameLayout titlesContainer;
    public long topicId;
    public int type;
    public String username;
    public ActionBarMenuSubItem zoomInItem;
    public ActionBarMenuSubItem zoomOutItem;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            MediaActivity mediaActivity = MediaActivity.this;
            if (i == -1) {
                if (mediaActivity.sharedMediaLayout.closeActionMode(true)) {
                    return;
                }
                mediaActivity.finishFragment();
                return;
            }
            if (i != 2) {
                if (i == 10) {
                    AnonymousClass6 anonymousClass6 = mediaActivity.sharedMediaLayout;
                    anonymousClass6.showMediaCalendar(anonymousClass6.getClosestTab(), false);
                    return;
                } else {
                    if (i == 11) {
                        mediaActivity.sharedMediaLayout.closeActionMode(true);
                        mediaActivity.sharedMediaLayout.getSearchItem().openSearch(false);
                        return;
                    }
                    return;
                }
            }
            if (mediaActivity.actionModeMessageObjects != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < mediaActivity.actionModeMessageObjects.size(); i2++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity.actionModeMessageObjects.valueAt(i2)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(mediaActivity.getParentActivity(), 0, mediaActivity.getResourceProvider());
                String string = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new RateCallLayout$$ExternalSyntheticLambda1(7, this, arrayList));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda21(27));
                alertDialog.show();
                alertDialog.redPositive();
            }
        }
    }

    public final class AnonymousClass3 extends ProfileActivity.AvatarImageView {
        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (!getImageReceiver().hasNotThumb()) {
                accessibilityNodeInfo.setVisibleToUser(false);
                return;
            }
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
        }
    }

    public final class AnonymousClass6 extends SharedMediaLayout {
        public AnimatorSet actionModeAnimation;
        public final FrameLayout val$avatarContainer;
        public final PasscodeActivity.AnonymousClass2 val$fragmentView;

        public AnonymousClass6(Context context, long j, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i, MediaActivity mediaActivity, AnonymousClass5 anonymousClass5, Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, PasscodeActivity.AnonymousClass2 anonymousClass2) {
            super(context, j, sharedMediaPreloader, 0, null, chatFull, userFull, i, 0, mediaActivity, anonymousClass5, 0, resourcesProvider, null);
            this.val$avatarContainer = frameLayout;
            this.val$fragmentView = anonymousClass2;
        }

        @Override
        public final boolean canShowSearchItem() {
            int i = MediaActivity.this.type;
            return (i == 1 || i == 2) ? false : true;
        }

        @Override
        public final boolean customTabs() {
            int i = MediaActivity.this.type;
            return i == 1 || i == 2 || i == 3;
        }

        @Override
        public final void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
            this.val$fragmentView.drawBlurRect(canvas, getY() + f, rect, paint, true);
        }

        @Override
        public final int getInitialTab() {
            return MediaActivity.this.initialTab;
        }

        @Override
        public final String getStoriesHashtag() {
            return MediaActivity.this.hashtag;
        }

        @Override
        public final String getStoriesHashtagUsername() {
            return MediaActivity.this.username;
        }

        @Override
        public final boolean includeSavedDialogs() {
            MediaActivity mediaActivity = MediaActivity.this;
            return mediaActivity.type == 0 && mediaActivity.dialogId == mediaActivity.getUserConfig().getClientUserId() && mediaActivity.topicId == 0;
        }

        @Override
        public final boolean includeStories() {
            int i = MediaActivity.this.type;
            return i == 1 || i == 2;
        }

        @Override
        public final void invalidateBlur() {
            this.val$fragmentView.invalidateBlur();
        }

        @Override
        public final boolean isArchivedOnlyStoriesView() {
            return MediaActivity.this.type == 2;
        }

        @Override
        public final boolean isStoriesView() {
            int i = MediaActivity.this.type;
            return i == 1 || i == 2;
        }

        @Override
        public final void onActionModeSelectedUpdate(SparseArray sparseArray) {
            int size = sparseArray.size();
            MediaActivity mediaActivity = MediaActivity.this;
            mediaActivity.actionModeMessageObjects = sparseArray;
            int i = mediaActivity.type;
            if (i == 1 || i == 2) {
                mediaActivity.selectedTextView.drawable.cancelAnimation();
                mediaActivity.selectedTextView.setText(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
                ButtonWithCounterView buttonWithCounterView = mediaActivity.button;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setEnabled(size > 0);
                    mediaActivity.button.setCount(size, true);
                    if (mediaActivity.sharedMediaLayout.getClosestTab() == 8) {
                        mediaActivity.button.setText(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                    }
                }
            }
        }

        @Override
        public final void onSearchStateChanged(boolean z) {
            MediaActivity mediaActivity = MediaActivity.this;
            AndroidUtilities.removeAdjustResize(mediaActivity.getParentActivity(), ((BaseFragment) mediaActivity).classGuid);
            AndroidUtilities.updateViewVisibilityAnimated(this.val$avatarContainer, !z, 0.95f, true);
        }

        @Override
        public final void onSelectedTabChanged() {
            super.onSelectedTabChanged();
            MediaActivity.this.updateMediaCount();
        }

        @Override
        public final void onTabProgress(float f) {
            MediaActivity mediaActivity = MediaActivity.this;
            if (mediaActivity.type != 1) {
                return;
            }
            float f2 = f - 8.0f;
            StoriesTabsView storiesTabsView = mediaActivity.tabsView;
            if (storiesTabsView != null) {
                storiesTabsView.setProgress(f2);
            }
            float f3 = 1.0f - f2;
            mediaActivity.titles[0].setAlpha(f3);
            mediaActivity.titles[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f2);
            mediaActivity.titles[1].setAlpha(f2);
            mediaActivity.titles[1].setTranslationX(AndroidUtilities.dp(12.0f) * f3);
        }

        @Override
        public final void onTabScroll(boolean z) {
            StoriesTabsView storiesTabsView = MediaActivity.this.tabsView;
            if (storiesTabsView != null) {
                storiesTabsView.setScrolling(z);
            }
        }

        @Override
        public final void showActionMode$1(boolean z) {
            MediaActivity mediaActivity = MediaActivity.this;
            if (mediaActivity.type == 0) {
                super.showActionMode$1(z);
                return;
            }
            if (this.isActionModeShowed == z) {
                return;
            }
            this.isActionModeShowed = z;
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i = mediaActivity.type;
            if (i == 1 || i == 2) {
                if (z) {
                    stopScroll(null);
                }
                this.disableScrolling = z;
            }
            if (z) {
                mediaActivity.selectedTextView.setVisibility(0);
                FrameLayout frameLayout = mediaActivity.buttonContainer;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                mediaActivity.titlesContainer.setVisibility(0);
            }
            float f = 0.0f;
            mediaActivity.backDrawable.setRotation(z ? 1.0f : 0.0f, true);
            this.actionModeAnimation = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            AnimatedTextView animatedTextView = mediaActivity.selectedTextView;
            float[] fArr = {z ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(animatedTextView, (Property<AnimatedTextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(mediaActivity.titlesContainer, (Property<FrameLayout, Float>) property, z ? 0.0f : 1.0f));
            FrameLayout frameLayout2 = mediaActivity.buttonContainer;
            if (frameLayout2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
                FrameLayout frameLayout3 = mediaActivity.buttonContainer;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? 0.0f : frameLayout3.getMeasuredHeight()));
            }
            ActionBarMenuItem actionBarMenuItem = mediaActivity.deleteItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(mediaActivity.deleteItem, (Property<ActionBarMenuItem, Float>) property, z ? 1.0f : 0.0f));
            }
            boolean z2 = getStoriesCount(getClosestTab()) == 0;
            ActionBarMenuItem actionBarMenuItem2 = mediaActivity.optionsItem;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(0);
                ActionBarMenuItem actionBarMenuItem3 = mediaActivity.optionsItem;
                if (!z && !z2) {
                    f = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem3, (Property<ActionBarMenuItem, Float>) property, f));
            }
            StoriesTabsView storiesTabsView = mediaActivity.tabsView;
            if (storiesTabsView != null) {
                arrayList.add(ObjectAnimator.ofFloat(storiesTabsView, (Property<StoriesTabsView, Float>) property, z ? 0.4f : 1.0f));
            }
            this.actionModeAnimation.playTogether(arrayList);
            this.actionModeAnimation.setDuration(300L);
            this.actionModeAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionModeAnimation.addListener(new LoginActivity.AnonymousClass8(this, z, z2, 5));
            this.actionModeAnimation.start();
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final NotificationCenter.NotificationCenterDelegate this$0;
        public final int val$i;
        public final boolean val$show;

        public AnonymousClass7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i, boolean z, int i2) {
            this.$r8$classId = i2;
            this.this$0 = notificationCenterDelegate;
            this.val$i = i;
            this.val$show = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    StickersAlert stickersAlert = (StickersAlert) this.this$0;
                    AnimatorSet[] animatorSetArr = stickersAlert.shadowAnimation;
                    int i = this.val$i;
                    AnimatorSet animatorSet = animatorSetArr[i];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        stickersAlert.shadowAnimation[i] = null;
                        break;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    MediaActivity mediaActivity = (MediaActivity) this.this$0;
                    float[] fArr = mediaActivity.subtitleT;
                    boolean z = this.val$show;
                    float f = z ? 1.0f : 0.0f;
                    int i = this.val$i;
                    fArr[i] = f;
                    SimpleTextView[] simpleTextViewArr = mediaActivity.nameTextView;
                    simpleTextViewArr[i].setScaleX(z ? 1.0f : 1.111f);
                    simpleTextViewArr[i].setScaleY(z ? 1.0f : 1.111f);
                    simpleTextViewArr[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                    AnimatedTextView[] animatedTextViewArr = mediaActivity.subtitleTextView;
                    animatedTextViewArr[i].setAlpha(z ? 1.0f : 0.0f);
                    if (!z) {
                        animatedTextViewArr[i].setVisibility(8);
                    }
                    break;
                default:
                    StickersAlert stickersAlert = (StickersAlert) this.this$0;
                    AnimatorSet[] animatorSetArr = stickersAlert.shadowAnimation;
                    int i2 = this.val$i;
                    AnimatorSet animatorSet = animatorSetArr[i2];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        if (!this.val$show) {
                            stickersAlert.shadow[i2].setVisibility(4);
                        }
                        stickersAlert.shadowAnimation[i2] = null;
                        break;
                    }
                    break;
            }
        }
    }

    public final class StoriesTabsView extends BottomPagerTabs {
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
    public final boolean canBeginSlide() {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        float f;
        AnimatedTextView[] animatedTextViewArr;
        SimpleTextView[] simpleTextViewArr;
        int i;
        AvatarDrawable avatarDrawable;
        TLRPC.User user;
        TLRPC.User user2;
        AvatarDrawable avatarDrawable2;
        SimpleTextView simpleTextView;
        AnonymousClass6 anonymousClass6;
        ActionBarMenuItem actionBarMenuItem;
        ?? r9;
        int i2;
        AvatarDrawable avatarDrawable3;
        Context context2 = context;
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.animationTime = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        FrameLayout frameLayout = new FrameLayout(context2);
        PasscodeActivity.AnonymousClass2 anonymousClass2 = new PasscodeActivity.AnonymousClass2(this, context2, frameLayout, 1);
        anonymousClass2.needBlur = true;
        this.fragmentView = anonymousClass2;
        anonymousClass2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i3 = this.type;
        if (i3 == 1 || i3 == 2) {
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.actionBar.addView(frameLayout2, LayoutHelper.createFrame(56, 56, 85));
            int i4 = Theme.key_actionBarActionModeDefaultSelector;
            int themedColor = getThemedColor(i4);
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            f = 0.0f;
            ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context2, actionBarMenuCreateMenu, themedColor, getThemedColor(i5), false, null);
            this.deleteItem = actionBarMenuItem2;
            actionBarMenuItem2.setIcon(R.drawable.msg_delete);
            this.deleteItem.setVisibility(8);
            this.deleteItem.setAlpha(0.0f);
            this.deleteItem.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(actionBarMenuCreateMenu, 5));
            frameLayout2.addView(this.deleteItem);
            context2 = context;
            ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context2, actionBarMenuCreateMenu, getThemedColor(i4), getThemedColor(i5), false, null);
            this.optionsItem = actionBarMenuItem3;
            actionBarMenuItem3.setIcon(R.drawable.ic_ab_other);
            final int i6 = 0;
            this.optionsItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i7;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i6) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z = mediaActivity.filterPhotos;
                            if (z && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i8 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i8;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i8);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z2 = !z;
                                mediaActivity.filterPhotos = z2;
                                actionBarMenuSubItem2.setChecked(z2);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z3 = mediaActivity.filterPhotos;
                                boolean z4 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z3;
                                    storiesList2.showVideos = z4;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z3;
                                    storiesList.showVideos = z4;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z5 = mediaActivity.filterVideos;
                            if (z5 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i9 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i9;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i9);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z6 = !z5;
                                mediaActivity.filterVideos = z6;
                                actionBarMenuSubItem4.setChecked(z6);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z7 = mediaActivity.filterPhotos;
                                boolean z8 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z7;
                                    storiesList4.showVideos = z8;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z7;
                                    storiesList3.showVideos = z8;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z9 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i7 = 0;
                                for (int i10 = 0; i10 < mediaActivity2.actionModeMessageObjects.size(); i10++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i10)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i7++;
                                    }
                                }
                            } else {
                                i7 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z9) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i11);
                                    zArr[i11] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z9, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z9 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i7, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i7, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.optionsItem.setVisibility(8);
            this.optionsItem.setAlpha(0.0f);
            frameLayout2.addView(this.optionsItem);
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = this.optionsItem.addSubItem(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.zoomInItem = actionBarMenuSubItemAddSubItem;
            final int i7 = 1;
            actionBarMenuSubItemAddSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i8;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i7) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z = mediaActivity.filterPhotos;
                            if (z && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i9 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i9;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i9);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z2 = !z;
                                mediaActivity.filterPhotos = z2;
                                actionBarMenuSubItem2.setChecked(z2);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z3 = mediaActivity.filterPhotos;
                                boolean z4 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z3;
                                    storiesList2.showVideos = z4;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z3;
                                    storiesList.showVideos = z4;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z5 = mediaActivity.filterVideos;
                            if (z5 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i10 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i10;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i10);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z6 = !z5;
                                mediaActivity.filterVideos = z6;
                                actionBarMenuSubItem4.setChecked(z6);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z7 = mediaActivity.filterPhotos;
                                boolean z8 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z7;
                                    storiesList4.showVideos = z8;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z7;
                                    storiesList3.showVideos = z8;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z9 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i8 = 0;
                                for (int i11 = 0; i11 < mediaActivity2.actionModeMessageObjects.size(); i11++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i11)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i8++;
                                    }
                                }
                            } else {
                                i8 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z9) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i12);
                                    zArr[i12] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z9, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z9 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i8, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i8, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = this.optionsItem.addSubItem(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.zoomOutItem = actionBarMenuSubItemAddSubItem2;
            final int i8 = 2;
            actionBarMenuSubItemAddSubItem2.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i9;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i8) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z = mediaActivity.filterPhotos;
                            if (z && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i10 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i10;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i10);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z2 = !z;
                                mediaActivity.filterPhotos = z2;
                                actionBarMenuSubItem2.setChecked(z2);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z3 = mediaActivity.filterPhotos;
                                boolean z4 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z3;
                                    storiesList2.showVideos = z4;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z3;
                                    storiesList.showVideos = z4;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z5 = mediaActivity.filterVideos;
                            if (z5 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i11 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i11;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i11);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z6 = !z5;
                                mediaActivity.filterVideos = z6;
                                actionBarMenuSubItem4.setChecked(z6);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z7 = mediaActivity.filterPhotos;
                                boolean z8 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z7;
                                    storiesList4.showVideos = z8;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z7;
                                    storiesList3.showVideos = z8;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z9 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i9 = 0;
                                for (int i12 = 0; i12 < mediaActivity2.actionModeMessageObjects.size(); i12++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i12)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i9++;
                                    }
                                }
                            } else {
                                i9 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z9) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i13);
                                    zArr[i13] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z9, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z9 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i9, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i9, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = this.optionsItem.addSubItem(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.calendarItem = actionBarMenuSubItemAddSubItem3;
            actionBarMenuSubItemAddSubItem3.setEnabled(false);
            this.calendarItem.setAlpha(0.5f);
            this.optionsItem.addColoredGap(-1);
            ActionBarMenuItem actionBarMenuItem4 = this.optionsItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem4 = actionBarMenuItem4.addSubItem(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, actionBarMenuItem4.resourcesProvider);
            this.showPhotosItem = actionBarMenuSubItemAddSubItem4;
            actionBarMenuSubItemAddSubItem4.setChecked(this.filterPhotos);
            final int i9 = 3;
            this.showPhotosItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i10;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i9) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z = mediaActivity.filterPhotos;
                            if (z && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i11 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i11;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i11);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z2 = !z;
                                mediaActivity.filterPhotos = z2;
                                actionBarMenuSubItem2.setChecked(z2);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z3 = mediaActivity.filterPhotos;
                                boolean z4 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z3;
                                    storiesList2.showVideos = z4;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z3;
                                    storiesList.showVideos = z4;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z5 = mediaActivity.filterVideos;
                            if (z5 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i12 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i12;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i12);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z6 = !z5;
                                mediaActivity.filterVideos = z6;
                                actionBarMenuSubItem4.setChecked(z6);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z7 = mediaActivity.filterPhotos;
                                boolean z8 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z7;
                                    storiesList4.showVideos = z8;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z7;
                                    storiesList3.showVideos = z8;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z9 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i10 = 0;
                                for (int i13 = 0; i13 < mediaActivity2.actionModeMessageObjects.size(); i13++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i13)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i10++;
                                    }
                                }
                            } else {
                                i10 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z9) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i14);
                                    zArr[i14] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z9, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z9 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            ActionBarMenuItem actionBarMenuItem5 = this.optionsItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem5 = actionBarMenuItem5.addSubItem(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, actionBarMenuItem5.resourcesProvider);
            this.showVideosItem = actionBarMenuSubItemAddSubItem5;
            actionBarMenuSubItemAddSubItem5.setChecked(this.filterVideos);
            final int i10 = 4;
            this.showVideosItem.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i11;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i10) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z = mediaActivity.filterPhotos;
                            if (z && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i12 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i12;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i12);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z2 = !z;
                                mediaActivity.filterPhotos = z2;
                                actionBarMenuSubItem2.setChecked(z2);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z3 = mediaActivity.filterPhotos;
                                boolean z4 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z3;
                                    storiesList2.showVideos = z4;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z3;
                                    storiesList.showVideos = z4;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z5 = mediaActivity.filterVideos;
                            if (z5 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i13 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i13;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i13);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z6 = !z5;
                                mediaActivity.filterVideos = z6;
                                actionBarMenuSubItem4.setChecked(z6);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z7 = mediaActivity.filterPhotos;
                                boolean z8 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z7;
                                    storiesList4.showVideos = z8;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z7;
                                    storiesList3.showVideos = z8;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z9 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i11 = 0;
                                for (int i14 = 0; i14 < mediaActivity2.actionModeMessageObjects.size(); i14++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i14)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i11++;
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z9) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i15);
                                    zArr[i15] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z9, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z9 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i11, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i11, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            f = 0.0f;
        }
        boolean z = this.type == 0;
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.titlesContainer = frameLayout3;
        int i11 = 119;
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        int i12 = 0;
        while (true) {
            int i13 = this.type == 1 ? 2 : 1;
            animatedTextViewArr = this.subtitleTextView;
            simpleTextViewArr = this.nameTextView;
            if (i12 >= i13) {
                break;
            }
            FrameLayout frameLayout4 = new FrameLayout(context2);
            FrameLayout[] frameLayoutArr = this.titles;
            frameLayoutArr[i12] = frameLayout4;
            this.titlesContainer.addView(frameLayout4, LayoutHelper.createFrame(-1, -1, i11));
            SimpleTextView simpleTextView2 = new SimpleTextView(context2);
            simpleTextViewArr[i12] = simpleTextView2;
            simpleTextView2.setPivotX(f);
            simpleTextViewArr[i12].setPivotY(AndroidUtilities.dp(9.0f));
            simpleTextViewArr[i12].setTextSize(18);
            simpleTextViewArr[i12].setGravity(3);
            simpleTextViewArr[i12].setTypeface(AndroidUtilities.bold());
            simpleTextViewArr[i12].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            simpleTextViewArr[i12].setScrollNonFitText(true);
            simpleTextViewArr[i12].setImportantForAccessibility(2);
            frameLayoutArr[i12].addView(simpleTextViewArr[i12], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context2, true, true, true);
            animatedTextViewArr[i12] = animatedTextView;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.4f;
            animatedTextDrawable.animateDuration = 320L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextViewArr[i12].setTextColor(Theme.getColor(null, Theme.key_player_actionBarSubtitle, false));
            frameLayoutArr[i12].addView(animatedTextViewArr[i12], LayoutHelper.createFrame(-2, -2.0f, 51, z ? 118.0f : 72.0f, 0.0f, 56.0f, 0.0f));
            if (i12 != 0) {
                frameLayoutArr[i12].setAlpha(f);
            }
            i12++;
            i11 = 119;
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context2);
        this.avatarImageView = anonymousClass3;
        anonymousClass3.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((this.dialogId == getUserConfig().getClientUserId() && this.topicId == 0 && getMessagesController().savedViewAsChats) ? 13.0f : 21.0f));
        this.avatarImageView.setPivotX(f);
        this.avatarImageView.setPivotY(f);
        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable4.isProfile = true;
        this.avatarImageView.setVisibility(z ? 0 : 8);
        this.avatarImageView.setImageDrawable(avatarDrawable4);
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context2, true, true, true);
        this.selectedTextView = animatedTextView2;
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = animatedTextView2.drawable;
        animatedTextDrawable2.moveAmplitude = 0.4f;
        animatedTextDrawable2.animateDuration = 320L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(20.0f));
        this.selectedTextView.setGravity(3);
        AnimatedTextView animatedTextView3 = this.selectedTextView;
        int i14 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView3.setTextColor(getThemedColor(i14));
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(this.selectedTextView, LayoutHelper.createFrame(-2, -1.0f, 23, (z ? 48 : 0) + 72, -2.0f, 72.0f, 0.0f));
        if (this.type == 1) {
            StoriesTabsView storiesTabsView = new StoriesTabsView(context2, getResourceProvider());
            this.tabsView = storiesTabsView;
            storiesTabsView.setOnTabClick(new DialogCell$$ExternalSyntheticLambda6(this, 19));
            FrameLayout frameLayout5 = new FrameLayout(context2);
            this.buttonContainer = frameLayout5;
            frameLayout5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, getResourceProvider(), true);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.button.setShowZero(true);
            this.button.setCount(0, false);
            this.button.setEnabled(false);
            final int i15 = 5;
            this.button.setOnClickListener(new View.OnClickListener(this) {
                public final MediaActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    StoriesController.StoriesList storiesList;
                    StoriesController.StoriesList storiesList2;
                    StoriesController.StoriesList storiesList3;
                    StoriesController.StoriesList storiesList4;
                    int i16;
                    MediaActivity mediaActivity = this.f$0;
                    switch (i15) {
                        case 0:
                            mediaActivity.optionsItem.toggleSubMenu(null, null);
                            break;
                        case 1:
                            Boolean boolZoomIn = mediaActivity.sharedMediaLayout.zoomIn(null, null);
                            if (boolZoomIn != null) {
                                boolean zBooleanValue = boolZoomIn.booleanValue();
                                mediaActivity.zoomOutItem.setEnabled(true);
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(zBooleanValue);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 2:
                            Boolean boolZoomOut = mediaActivity.sharedMediaLayout.zoomOut(null, null);
                            if (boolZoomOut != null) {
                                mediaActivity.zoomOutItem.setEnabled(boolZoomOut.booleanValue());
                                mediaActivity.zoomOutItem.animate().alpha(mediaActivity.zoomOutItem.isEnabled() ? 1.0f : 0.5f).start();
                                mediaActivity.zoomInItem.setEnabled(true);
                                mediaActivity.zoomInItem.animate().alpha(mediaActivity.zoomInItem.isEnabled() ? 1.0f : 0.5f).start();
                                break;
                            }
                            break;
                        case 3:
                            boolean z2 = mediaActivity.filterPhotos;
                            if (z2 && !mediaActivity.filterVideos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem = mediaActivity.showPhotosItem;
                                int i17 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i17;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem, i17);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = mediaActivity.showPhotosItem;
                                boolean z3 = !z2;
                                mediaActivity.filterPhotos = z3;
                                actionBarMenuSubItem2.setChecked(z3);
                                MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                                boolean z4 = mediaActivity.filterPhotos;
                                boolean z5 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass9 = anonymousClass7.storiesAdapter;
                                if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
                                    storiesList2.showPhotos = z4;
                                    storiesList2.showVideos = z5;
                                    storiesList2.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass11 = anonymousClass7.archivedStoriesAdapter;
                                if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
                                    storiesList.showPhotos = z4;
                                    storiesList.showVideos = z5;
                                    storiesList.fill(true);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            boolean z6 = mediaActivity.filterVideos;
                            if (z6 && !mediaActivity.filterPhotos) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                ActionBarMenuSubItem actionBarMenuSubItem3 = mediaActivity.showVideosItem;
                                int i18 = -mediaActivity.shiftDp;
                                mediaActivity.shiftDp = i18;
                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem3, i18);
                                break;
                            } else {
                                ActionBarMenuSubItem actionBarMenuSubItem4 = mediaActivity.showVideosItem;
                                boolean z7 = !z6;
                                mediaActivity.filterVideos = z7;
                                actionBarMenuSubItem4.setChecked(z7);
                                MediaActivity.AnonymousClass6 anonymousClass8 = mediaActivity.sharedMediaLayout;
                                boolean z8 = mediaActivity.filterPhotos;
                                boolean z9 = mediaActivity.filterVideos;
                                SharedMediaLayout.AnonymousClass9 anonymousClass10 = anonymousClass8.storiesAdapter;
                                if (anonymousClass10 != null && (storiesList4 = anonymousClass10.storiesList) != null) {
                                    storiesList4.showPhotos = z8;
                                    storiesList4.showVideos = z9;
                                    storiesList4.fill(true);
                                }
                                SharedMediaLayout.AnonymousClass11 anonymousClass12 = anonymousClass8.archivedStoriesAdapter;
                                if (anonymousClass12 != null && (storiesList3 = anonymousClass12.storiesList) != null) {
                                    storiesList3.showPhotos = z8;
                                    storiesList3.showVideos = z9;
                                    storiesList3.fill(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            MediaActivity mediaActivity2 = this.f$0;
                            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = mediaActivity2.applyBulletin;
                            if (photoViewer$$ExternalSyntheticLambda89 != null) {
                                photoViewer$$ExternalSyntheticLambda89.run();
                                mediaActivity2.applyBulletin = null;
                            }
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null) {
                                bulletin.hide();
                            }
                            boolean z10 = mediaActivity2.sharedMediaLayout.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (mediaActivity2.actionModeMessageObjects != null) {
                                i16 = 0;
                                for (int i19 = 0; i19 < mediaActivity2.actionModeMessageObjects.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) mediaActivity2.actionModeMessageObjects.valueAt(i19)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                            } else {
                                i16 = 0;
                            }
                            mediaActivity2.sharedMediaLayout.closeActionMode(false);
                            if (z10) {
                                mediaActivity2.sharedMediaLayout.scrollToPage(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i110 = 0; i110 < arrayList.size(); i110++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i110);
                                    zArr[i110] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                mediaActivity2.getMessagesController().getStoriesController().updateStoriesInLists(mediaActivity2.dialogId, arrayList, false);
                                boolean[] zArr2 = {false};
                                mediaActivity2.applyBulletin = new PhotoViewer$$ExternalSyntheticLambda89(mediaActivity2, arrayList, z10, 15);
                                ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(mediaActivity2, zArr2, arrayList, zArr, 15);
                                (z10 ? BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i16, new Object[0]), LocaleController.getString("StorySavedSubtitle"), LocaleController.getString("Undo"), chatUsersActivity$$ExternalSyntheticLambda13).show() : BulletinFactory.of(mediaActivity2).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i16, new Object[0]), LocaleController.getString("Undo"), 5000, false, chatUsersActivity$$ExternalSyntheticLambda13).show()).onHideListener = new ImageUpdater$$ExternalSyntheticLambda2(9, mediaActivity2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.buttonContainer.addView(this.button);
            this.buttonContainer.setAlpha(f);
            this.buttonContainer.setTranslationY(AndroidUtilities.dp(100.0f));
            setBulletinDelegate(new LaunchActivity.AnonymousClass7(3));
        }
        if (this.type == 0 && this.dialogId == getUserConfig().getClientUserId() && this.topicId == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.initialTab = 11;
        }
        AnonymousClass6 anonymousClass7 = new AnonymousClass6(context, this.dialogId, this.sharedMediaPreloader, this.currentChatInfo, this.currentUserInfo, this.initialTab, this, new SharedMediaLayout.Delegate() {
            @Override
            public final boolean canSearchMembers() {
                return false;
            }

            @Override
            public final TLRPC.Chat getCurrentChat() {
                return null;
            }

            @Override
            public final RecyclerListView getListView() {
                return null;
            }

            @Override
            public final boolean isFragmentOpened() {
                return true;
            }

            @Override
            public final boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z2, boolean z3, View view) {
                return false;
            }

            @Override
            public final void scrollToSharedMedia() {
            }

            @Override
            public final void updateSelectedMediaTabText() {
                MediaActivity.this.updateMediaCount();
            }
        }, getResourceProvider(), frameLayout, anonymousClass2);
        this.sharedMediaLayout = anonymousClass7;
        anonymousClass7.scrollSlidingTextTabStrip.setOpen(true);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), PorterDuff.Mode.SRC_IN));
        }
        this.sharedMediaLayout.setPinnedToTop(true);
        this.sharedMediaLayout.getSearchItem().setTranslationY(0.0f);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setTranslationY(0.0f);
        }
        int i16 = this.type;
        if (i16 == 1 || i16 == 2) {
            anonymousClass2.addView(this.sharedMediaLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 64.0f));
        } else {
            anonymousClass2.addView(this.sharedMediaLayout);
        }
        anonymousClass2.addView(this.actionBar);
        anonymousClass2.addView(frameLayout);
        anonymousClass2.blurBehindViews.add(this.sharedMediaLayout);
        if (this.type == 1) {
            showSubtitle(0, false, false);
            showSubtitle(1, false, false);
        }
        StoriesTabsView storiesTabsView2 = this.tabsView;
        if (storiesTabsView2 != null) {
            i = -1;
            anonymousClass2.addView(storiesTabsView2, LayoutHelper.createFrame(-1, -2, 87));
        } else {
            i = -1;
        }
        FrameLayout frameLayout6 = this.buttonContainer;
        if (frameLayout6 != null) {
            anonymousClass2.addView(frameLayout6, LayoutHelper.createFrame(i, 64, 87));
        }
        long j = this.dialogId;
        if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
            j = this.topicId;
        }
        int i17 = this.type;
        if (i17 == 3) {
            simpleTextViewArr[0].setText(this.hashtag);
            int i18 = this.storiesCount;
            if (i18 != -1) {
                animatedTextViewArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", i18));
            }
        } else {
            if (i17 != 2) {
                if (i17 == 1) {
                    simpleTextViewArr[0].setText(LocaleController.getString(R.string.ProfileMyStories));
                    simpleTextViewArr[1].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
                } else {
                    if (j == 2666000) {
                        simpleTextViewArr[0].setText(LocaleController.getString(R.string.AnonymousForward));
                        AvatarDrawable avatarDrawable5 = avatarDrawable4;
                        avatarDrawable5.setAvatarType(21);
                        avatarDrawable5.scaleSize = 0.75f;
                        avatarDrawable3 = avatarDrawable5;
                    } else {
                        avatarDrawable = avatarDrawable4;
                        if (this.topicId != 0 && j == getUserConfig().getClientUserId()) {
                            simpleTextViewArr[0].setText(LocaleController.getString(R.string.MyNotes));
                            avatarDrawable.setAvatarType(22);
                            avatarDrawable.scaleSize = 0.75f;
                            avatarDrawable3 = avatarDrawable;
                        } else if (DialogObject.isEncryptedDialog(j)) {
                            TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(getMessagesController(), j);
                            if (encryptedChatM != null && (user = getMessagesController().getUser(Long.valueOf(encryptedChatM.user_id))) != null) {
                                avatarDrawable3 = avatarDrawable;
                                avatarDrawable3 = avatarDrawable;
                                simpleTextViewArr[0].setText(ContactsController.formatName(user.first_name, user.last_name));
                                avatarDrawable.setInfo(this.currentAccount, user);
                                avatarDrawable2 = avatarDrawable;
                                user2 = user;
                            }
                        } else if (DialogObject.isUserDialog(j)) {
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                            if (user3 != null) {
                                if (user3.self) {
                                    avatarDrawable3 = avatarDrawable;
                                    simpleTextViewArr[0].setText(LocaleController.getString(R.string.SavedMessages));
                                    avatarDrawable.setAvatarType(1);
                                    avatarDrawable.scaleSize = 0.8f;
                                    avatarDrawable3 = avatarDrawable;
                                } else {
                                    avatarDrawable3 = avatarDrawable;
                                    simpleTextViewArr[0].setText(ContactsController.formatName(user3.first_name, user3.last_name));
                                    avatarDrawable.setInfo(this.currentAccount, user3);
                                    avatarDrawable2 = avatarDrawable;
                                    user2 = user3;
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                            if (chat != null) {
                                avatarDrawable3 = avatarDrawable;
                                simpleTextViewArr[0].setText(chat.title);
                                avatarDrawable.setInfo(this.currentAccount, chat);
                                avatarDrawable2 = avatarDrawable;
                                user2 = chat;
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
                simpleTextView = simpleTextViewArr[0];
                if (simpleTextView != null && TextUtils.isEmpty(simpleTextView.getText())) {
                    simpleTextViewArr[0].setText(LocaleController.getString(R.string.SharedContentTitle));
                }
                anonymousClass6 = this.sharedMediaLayout;
                if (anonymousClass6.isSearchItemVisible(anonymousClass6.mediaPages[0].selectedType) && this.type != 1) {
                    this.sharedMediaLayout.getSearchItem().setVisibility(0);
                }
                actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
                if (actionBarMenuItem != null && this.initialTab != 11) {
                    actionBarMenuItem.setVisibility(8);
                }
                if (this.sharedMediaLayout.getSearchOptionsItem() != null || this.type == 1) {
                    r9 = 0;
                } else {
                    AnonymousClass6 anonymousClass8 = this.sharedMediaLayout;
                    r9 = 0;
                    anonymousClass8.animateSearchToOptions(!anonymousClass8.isSearchItemVisible(anonymousClass8.mediaPages[0].selectedType), false);
                    this.sharedMediaLayout.getSearchOptionsItem().setVisibility(0);
                }
                AnonymousClass6 anonymousClass9 = this.sharedMediaLayout;
                i2 = anonymousClass9.mediaPages[r9].selectedType;
                if ((i2 != 0 || SharedMediaLayout.isAnyStoryPageType(i2) || anonymousClass9.mediaPages[r9].selectedType == 11) && this.type != 1) {
                    this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(r9);
                } else {
                    this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                }
                this.actionBar.setDrawBlurBackground(anonymousClass2);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r9);
                updateMediaCount();
                updateColors$3();
                if (this.type == 1 && this.initialTab == 9) {
                    this.sharedMediaLayout.onTabProgress(9.0f);
                }
                return anonymousClass2;
            }
            simpleTextViewArr[0].setText(LocaleController.getString(R.string.ProfileStoriesArchive));
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
        simpleTextView = simpleTextViewArr[0];
        if (simpleTextView != null) {
            simpleTextViewArr[0].setText(LocaleController.getString(R.string.SharedContentTitle));
        }
        anonymousClass6 = this.sharedMediaLayout;
        if (anonymousClass6.isSearchItemVisible(anonymousClass6.mediaPages[0].selectedType)) {
            this.sharedMediaLayout.getSearchItem().setVisibility(0);
        }
        actionBarMenuItem = this.sharedMediaLayout.searchItemIcon;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            r9 = 0;
        } else {
            r9 = 0;
        }
        AnonymousClass6 anonymousClass10 = this.sharedMediaLayout;
        i2 = anonymousClass10.mediaPages[r9].selectedType;
        if (i2 != 0) {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(r9);
        } else {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(r9);
        }
        this.actionBar.setDrawBlurBackground(anonymousClass2);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r9);
        updateMediaCount();
        updateColors$3();
        if (this.type == 1) {
            this.sharedMediaLayout.onTabProgress(9.0f);
        }
        return anonymousClass2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.dialogId) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.currentUserInfo = userFull;
            AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
            if (anonymousClass6 != null) {
                anonymousClass6.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        if (getLastStoryViewer() == null || !getLastStoryViewer().attachedToParent()) {
            return themedColor;
        }
        StoryViewer lastStoryViewer = getLastStoryViewer();
        return ColorUtils.blendARGB((((1.0f - lastStoryViewer.progressToDismiss) * 0.5f) + 0.5f) * lastStoryViewer.progressToOpen, themedColor, -16777216);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 16);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.addAll(this.sharedMediaLayout.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().isClosed) {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(null, Theme.key_actionBarActionModeDefault, false);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.sharedMediaLayout.isSwipeBackEnabled()) {
            return false;
        }
        AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
        return anonymousClass6.getSelectedTab() == anonymousClass6.scrollSlidingTextTabStrip.getFirstTabId();
    }

    @Override
    public final void mediaCountUpdated() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
        AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
        if (anonymousClass6 != null && (sharedMediaPreloader = this.sharedMediaPreloader) != null) {
            anonymousClass6.setNewMediaCounts(sharedMediaPreloader.lastMediaCount);
        }
        updateMediaCount();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
            if (!anonymousClass6.isActionModeShowed) {
                return super.onBackPressed(z);
            }
            if (z) {
                anonymousClass6.closeActionMode(false);
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
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
        this.sharedMediaPreloader.delegates.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = this.applyBulletin;
        if (photoViewer$$ExternalSyntheticLambda89 != null) {
            this.applyBulletin = null;
            AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda89);
        }
    }

    @Override
    public final List onGetDebugItems() {
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = ShapeDetector.queue;
        return Arrays.asList(new FloatingDebugController$DebugItem((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new HintView$1$$ExternalSyntheticLambda0(this, 18)));
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
        if (anonymousClass6 != null) {
            anonymousClass6.setPagesPaddingBottom(i4);
        }
    }

    public final void setChatInfo(TLRPC.ChatFull chatFull) {
        this.currentChatInfo = chatFull;
    }

    public final void showSubtitle(int i, boolean z, boolean z2) {
        int i2 = 0;
        int i3 = this.type;
        if (i3 == 3) {
            return;
        }
        if (i == 1 && i3 == 2) {
            return;
        }
        boolean[] zArr = this.subtitleShown;
        boolean z3 = zArr[i];
        boolean[] zArr2 = this.firstSubtitleCheck;
        if (z3 != z || zArr2[i]) {
            boolean z4 = !zArr2[i] && z2;
            zArr2[i] = false;
            zArr[i] = z;
            ValueAnimator[] valueAnimatorArr = this.subtitleAnimator;
            ValueAnimator valueAnimator = valueAnimatorArr[i];
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimatorArr[i] = null;
            }
            float[] fArr = this.subtitleT;
            AnimatedTextView[] animatedTextViewArr = this.subtitleTextView;
            if (!z4) {
                fArr[i] = z ? 1.0f : 0.0f;
                SimpleTextView[] simpleTextViewArr = this.nameTextView;
                simpleTextViewArr[i].setScaleX(z ? 1.0f : 1.111f);
                simpleTextViewArr[i].setScaleY(z ? 1.0f : 1.111f);
                simpleTextViewArr[i].setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                animatedTextViewArr[i].setAlpha(z ? 1.0f : 0.0f);
                animatedTextViewArr[i].setVisibility(z ? 0 : 8);
                return;
            }
            animatedTextViewArr[i].setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr[i], z ? 1.0f : 0.0f);
            valueAnimatorArr[i] = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(this, i, 4));
            valueAnimatorArr[i].addListener(new AnonymousClass7(this, i, z, i2));
            valueAnimatorArr[i].setDuration(320L);
            valueAnimatorArr[i].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            valueAnimatorArr[i].start();
        }
    }

    public final void updateColors$3() {
        if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
            this.sharedMediaLayout.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        SimpleTextView[] simpleTextViewArr = this.nameTextView;
        SimpleTextView simpleTextView = simpleTextViewArr[0];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(Theme.getColor(null, i, false));
        }
        SimpleTextView simpleTextView2 = simpleTextViewArr[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setTextColor(Theme.getColor(null, i, false));
        }
    }

    public final void updateMediaCount() {
        boolean z;
        SharedMediaLayout.MediaPage mediaPage;
        AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
        if (anonymousClass6 != null) {
            AnimatedTextView[] animatedTextViewArr = this.subtitleTextView;
            if (animatedTextViewArr[0] == null) {
                return;
            }
            int closestTab = anonymousClass6.getClosestTab();
            int i = this.type;
            if (i != 3 || closestTab == 8) {
                int[] iArr = this.sharedMediaPreloader.lastMediaCount;
                boolean z2 = LocaleController.isRTL;
                boolean z3 = !z2;
                int i2 = (i == 1 && closestTab != 8) ? 1 : 0;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        showSubtitle(i2, true, true);
                        animatedTextViewArr[i2].setText(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]), z3, true);
                        return;
                    }
                    if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                showSubtitle(i2, true, true);
                                if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1) {
                                    animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]), z3, true);
                                    return;
                                } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2) {
                                    animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]), z3, true);
                                    return;
                                } else {
                                    animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Media", iArr[0], new Object[0]), z3, true);
                                    return;
                                }
                            }
                            if (closestTab == 1) {
                                showSubtitle(i2, true, true);
                                animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Files", iArr[1], new Object[0]), z3, true);
                                return;
                            }
                            if (closestTab == 2) {
                                showSubtitle(i2, true, true);
                                animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]), z3, true);
                                return;
                            }
                            if (closestTab == 3) {
                                showSubtitle(i2, true, true);
                                animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Links", iArr[3], new Object[0]), z3, true);
                                return;
                            }
                            if (closestTab == 4) {
                                showSubtitle(i2, true, true);
                                animatedTextViewArr[i2].setText(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]), z3, true);
                                return;
                            } else if (closestTab == 5) {
                                showSubtitle(i2, true, true);
                                animatedTextViewArr[i2].setText(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]), z3, true);
                                return;
                            } else {
                                if (closestTab == 10) {
                                    showSubtitle(i2, true, true);
                                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.dialogId);
                                    animatedTextViewArr[i2].setText(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]), z3, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ActionBarMenuSubItem actionBarMenuSubItem = this.zoomOutItem;
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.setEnabled(this.sharedMediaLayout.canZoomOut());
                    ActionBarMenuSubItem actionBarMenuSubItem2 = this.zoomOutItem;
                    actionBarMenuSubItem2.setAlpha(actionBarMenuSubItem2.isEnabled() ? 1.0f : 0.5f);
                }
                ActionBarMenuSubItem actionBarMenuSubItem3 = this.zoomInItem;
                if (actionBarMenuSubItem3 != null) {
                    AnonymousClass6 anonymousClass7 = this.sharedMediaLayout;
                    SharedMediaLayout.MediaPage[] mediaPageArr = anonymousClass7.mediaPages;
                    if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
                        z = false;
                    } else {
                        boolean zIsAnyStoryPageType = SharedMediaLayout.isAnyStoryPageType(mediaPage.selectedType);
                        int i3 = anonymousClass7.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
                        if (i3 != anonymousClass7.getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i3, true)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    actionBarMenuSubItem3.setEnabled(z);
                    ActionBarMenuSubItem actionBarMenuSubItem4 = this.zoomInItem;
                    actionBarMenuSubItem4.setAlpha(actionBarMenuSubItem4.isEnabled() ? 1.0f : 0.5f);
                }
                int storiesCount = this.sharedMediaLayout.getStoriesCount(8);
                if (storiesCount <= 0) {
                    showSubtitle(0, false, true);
                } else if (this.type != 3) {
                    showSubtitle(0, true, true);
                    animatedTextViewArr[0].setText(LocaleController.formatPluralString("ProfileMyStoriesCount", storiesCount, new Object[0]), z3, true);
                } else if (TextUtils.isEmpty(animatedTextViewArr[0].getText())) {
                    showSubtitle(0, true, true);
                    animatedTextViewArr[0].setText(LocaleController.formatPluralStringSpaced("FoundStories", storiesCount), z3, true);
                }
                if (this.type == 1) {
                    int storiesCount2 = this.sharedMediaLayout.getStoriesCount(9);
                    if (storiesCount2 > 0) {
                        showSubtitle(1, true, true);
                        animatedTextViewArr[1].setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", storiesCount2, new Object[0]), z3, true);
                    } else {
                        showSubtitle(1, false, true);
                    }
                }
                if (this.optionsItem != null) {
                    AnonymousClass6 anonymousClass8 = this.sharedMediaLayout;
                    boolean z4 = anonymousClass8.getStoriesCount(anonymousClass8.getClosestTab()) <= 0;
                    if (!z4) {
                        this.optionsItem.setVisibility(0);
                    }
                    this.optionsItem.animate().alpha(z4 ? 0.0f : 1.0f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(19, this, z4)).setDuration(220L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                ButtonWithCounterView buttonWithCounterView = this.button;
                if (buttonWithCounterView != null) {
                    boolean z5 = !z2 && this.lastTab == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.actionModeMessageObjects;
                        buttonWithCounterView.setText(LocaleController.formatPluralString("ArchiveStories", sparseArray == null ? 0 : sparseArray.size(), new Object[0]), z5, true);
                    } else {
                        buttonWithCounterView.setText(LocaleController.getString(R.string.SaveToProfile), z5, true);
                    }
                    this.lastTab = closestTab;
                }
                if (this.calendarItem != null) {
                    boolean z6 = this.sharedMediaLayout.getStoriesCount(closestTab) > 0;
                    this.calendarItem.setEnabled(z6);
                    this.calendarItem.setAlpha(z6 ? 1.0f : 0.5f);
                }
            }
        }
    }
}
