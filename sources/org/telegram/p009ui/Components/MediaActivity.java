package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AudioPlayerAlert;
import org.telegram.p009ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.p009ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.p009ui.Components.Paint.ShapeDetector;
import org.telegram.p009ui.Components.SharedMediaLayout;
import org.telegram.p009ui.ProfileActivity;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$User;

public class MediaActivity extends BaseFragment implements SharedMediaLayout.SharedMediaPreloaderDelegate, FloatingDebugProvider {
    ProfileActivity.AvatarImageView avatarImageView;
    private TLRPC$ChatFull currentChatInfo;
    private long dialogId;
    AudioPlayerAlert.ClippingTextViewSwitcher mediaCounterTextView;
    private SimpleTextView nameTextView;
    SharedMediaLayout sharedMediaLayout;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;

    public MediaActivity(Bundle bundle, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader) {
        super(bundle);
        this.sharedMediaPreloader = sharedMediaPreloader;
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = getArguments().getLong("dialog_id");
        if (this.sharedMediaPreloader == null) {
            SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
            this.sharedMediaPreloader = sharedMediaPreloader;
            sharedMediaPreloader.addDelegate(this);
        }
        return super.onFragmentCreate();
    }

    @Override
    public View createView(final Context context) {
        AvatarDrawable avatarDrawable;
        ?? r5;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User user;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    MediaActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.setColorFilterMode(PorterDuff.Mode.SRC_IN);
        final FrameLayout frameLayout = new FrameLayout(context);
        final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                ((FrameLayout.LayoutParams) MediaActivity.this.sharedMediaLayout.getLayoutParams()).topMargin = C1133ActionBar.getCurrentActionBarHeight() + (((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) MediaActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = C1133ActionBar.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) MediaActivity.this.nameTextView.getLayoutParams()).topMargin = (((C1133ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.m35dp(22.0f)) / 2) + AndroidUtilities.m35dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f);
                ((FrameLayout.LayoutParams) MediaActivity.this.mediaCounterTextView.getLayoutParams()).topMargin = ((C1133ActionBar.getCurrentActionBarHeight() / 2) + (((C1133ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.m35dp(19.0f)) / 2)) - AndroidUtilities.m35dp(3.0f);
                ((FrameLayout.LayoutParams) MediaActivity.this.avatarImageView.getLayoutParams()).topMargin = (C1133ActionBar.getCurrentActionBarHeight() - AndroidUtilities.m35dp(42.0f)) / 2;
                super.onMeasure(i, i2);
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
            public void drawList(Canvas canvas, boolean z) {
                MediaActivity.this.sharedMediaLayout.drawListForBlur(canvas);
            }
        };
        sizeNotifierFrameLayout.needBlur = true;
        this.fragmentView = sizeNotifierFrameLayout;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextSize(18);
        this.nameTextView.setGravity(3);
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.nameTextView.setLeftDrawableTopPadding(-AndroidUtilities.m35dp(1.3f));
        this.nameTextView.setScrollNonFitText(true);
        this.nameTextView.setImportantForAccessibility(2);
        frameLayout.addView(this.nameTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 118.0f, 0.0f, 56.0f, 0.0f));
        ProfileActivity.AvatarImageView avatarImageView = new ProfileActivity.AvatarImageView(this, context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrProfilePicture", C1072R.string.AccDescrProfilePicture));
                    if (Build.VERSION.SDK_INT >= 21) {
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("Open", C1072R.string.Open)));
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccDescrOpenInPhotoViewer", C1072R.string.AccDescrOpenInPhotoViewer)));
                        return;
                    }
                    return;
                }
                accessibilityNodeInfo.setVisibleToUser(false);
            }
        };
        this.avatarImageView = avatarImageView;
        avatarImageView.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.avatarImageView.setRoundRadius(AndroidUtilities.m35dp(21.0f));
        this.avatarImageView.setPivotX(0.0f);
        this.avatarImageView.setPivotY(0.0f);
        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
        avatarDrawable2.setProfile(true);
        this.avatarImageView.setImageDrawable(avatarDrawable2);
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = new AudioPlayerAlert.ClippingTextViewSwitcher(this, context) {
            @Override
            protected TextView createTextView() {
                TextView textView = new TextView(context);
                textView.setTextColor(Theme.getColor("player_actionBarSubtitle"));
                textView.setTextSize(1, 14.0f);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
            }
        };
        this.mediaCounterTextView = clippingTextViewSwitcher;
        frameLayout.addView(clippingTextViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 51, 118.0f, 0.0f, 56.0f, 0.0f));
        SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, this.dialogId, this.sharedMediaPreloader, 0, null, this.currentChatInfo, false, this, new SharedMediaLayout.Delegate() {
            @Override
            public boolean canSearchMembers() {
                return false;
            }

            @Override
            public TLRPC$Chat getCurrentChat() {
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
            public boolean onMemberClick(TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, boolean z2) {
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
            @Override
            protected void onSelectedTabChanged() {
                MediaActivity.this.updateMediaCount();
            }

            @Override
            protected void onSearchStateChanged(boolean z) {
                if (SharedConfig.smoothKeyboard) {
                    AndroidUtilities.removeAdjustResize(MediaActivity.this.getParentActivity(), ((BaseFragment) MediaActivity.this).classGuid);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, !z, 0.95f, true);
            }

            @Override
            protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
                sizeNotifierFrameLayout.drawBlurRect(canvas, getY() + f, rect, paint, true);
            }

            @Override
            protected void invalidateBlur() {
                sizeNotifierFrameLayout.invalidateBlur();
            }
        };
        this.sharedMediaLayout = sharedMediaLayout;
        sharedMediaLayout.setPinnedToTop(true);
        this.sharedMediaLayout.getSearchItem().setTranslationY(0.0f);
        this.sharedMediaLayout.photoVideoOptionsItem.setTranslationY(0.0f);
        sizeNotifierFrameLayout.addView(this.sharedMediaLayout);
        sizeNotifierFrameLayout.addView(this.actionBar);
        sizeNotifierFrameLayout.addView(frameLayout);
        sizeNotifierFrameLayout.blurBehindViews.add(this.sharedMediaLayout);
        TLObject tLObject = null;
        if (DialogObject.isEncryptedDialog(this.dialogId)) {
            TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.dialogId)));
            if (encryptedChat == null || (user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id))) == null) {
                avatarDrawable = avatarDrawable2;
            } else {
                this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                avatarDrawable = avatarDrawable2;
                avatarDrawable.setInfo(user);
                tLRPC$Chat = user;
                tLObject = tLRPC$Chat;
            }
        } else {
            avatarDrawable = avatarDrawable2;
            if (DialogObject.isUserDialog(this.dialogId)) {
                TLRPC$User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                if (user2 != null) {
                    if (user2.self) {
                        this.nameTextView.setText(LocaleController.getString("SavedMessages", C1072R.string.SavedMessages));
                        avatarDrawable.setAvatarType(1);
                        avatarDrawable.setScaleSize(0.8f);
                    } else {
                        this.nameTextView.setText(ContactsController.formatName(user2.first_name, user2.last_name));
                        avatarDrawable.setInfo(user2);
                        tLRPC$Chat = user2;
                        tLObject = tLRPC$Chat;
                    }
                }
            } else {
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                if (chat != null) {
                    this.nameTextView.setText(chat.title);
                    avatarDrawable.setInfo(chat);
                    tLRPC$Chat = chat;
                    tLObject = tLRPC$Chat;
                }
            }
        }
        this.avatarImageView.setImage(ImageLocation.getForUserOrChat(tLObject, 1), "50_50", avatarDrawable, tLObject);
        if (TextUtils.isEmpty(this.nameTextView.getText())) {
            this.nameTextView.setText(LocaleController.getString("SharedContentTitle", C1072R.string.SharedContentTitle));
        }
        if (this.sharedMediaLayout.isSearchItemVisible()) {
            r5 = 0;
            this.sharedMediaLayout.getSearchItem().setVisibility(0);
        } else {
            r5 = 0;
        }
        if (this.sharedMediaLayout.isCalendarItemVisible()) {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(r5);
        } else {
            this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
        }
        this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, r5);
        updateMediaCount();
        lambda$getThemeDescriptions$0();
        return sizeNotifierFrameLayout;
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
        int closestTab = this.sharedMediaLayout.getClosestTab();
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        if (closestTab < 0 || lastMediaCount[closestTab] < 0) {
            return;
        }
        if (closestTab == 0) {
            if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]));
            } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]));
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Media", lastMediaCount[0], new Object[0]));
            }
        } else if (closestTab == 1) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("Files", lastMediaCount[1], new Object[0]));
        } else if (closestTab == 2) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("Voice", lastMediaCount[2], new Object[0]));
        } else if (closestTab == 3) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("Links", lastMediaCount[3], new Object[0]));
        } else if (closestTab == 4) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("MusicFiles", lastMediaCount[4], new Object[0]));
        } else if (closestTab == 5) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("GIFs", lastMediaCount[5], new Object[0]));
        }
    }

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.currentChatInfo = tLRPC$ChatFull;
    }

    public long getDialogId() {
        return this.dialogId;
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

    public void lambda$getThemeDescriptions$0() {
        this.actionBar.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.actionBar.setItemsColor(Theme.getColor("actionBarActionModeDefaultIcon"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarActionModeDefaultSelector"), false);
        this.actionBar.setTitleColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                MediaActivity.this.lambda$getThemeDescriptions$0();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "actionBarActionModeDefaultSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundWhiteBlackText"));
        arrayList.addAll(this.sharedMediaLayout.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        int color = Theme.getColor("windowBackgroundWhite");
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor("actionBarActionModeDefault");
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }

    @Override
    public List<FloatingDebugController.DebugItem> onGetDebugItems() {
        FloatingDebugController.DebugItem[] debugItemArr = new FloatingDebugController.DebugItem[1];
        StringBuilder sb = new StringBuilder();
        sb.append(ShapeDetector.isLearning(getContext()) ? "Disable" : "Enable");
        sb.append(" shape detector learning debug");
        debugItemArr[0] = new FloatingDebugController.DebugItem(sb.toString(), new Runnable() {
            @Override
            public final void run() {
                MediaActivity.this.lambda$onGetDebugItems$1();
            }
        });
        return Arrays.asList(debugItemArr);
    }

    public void lambda$onGetDebugItems$1() {
        ShapeDetector.setLearning(getContext(), !ShapeDetector.isLearning(getContext()));
    }
}
