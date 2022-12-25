package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AutoDeletePopupWrapper;
import org.telegram.p009ui.Components.SharedMediaLayout;
import org.telegram.p009ui.TopicsFragment;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserStatus;

public class ChatAvatarContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean allowShorterStatus;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private int currentAccount;
    private int currentConnectionState;
    StatusDrawable currentTypingDrawable;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatusDrawable;
    private boolean[] isOnline;
    private int largerWidth;
    private CharSequence lastSubtitle;
    private String lastSubtitleColorKey;
    private int lastWidth;
    private int leftPadding;
    private boolean occupyStatusBar;
    private int onlineCount;
    private Integer overrideSubtitleColor;
    private ChatActivity parentFragment;
    private Theme.ResourcesProvider resourcesProvider;
    private String rightDrawableContentDescription;
    private boolean rightDrawableIsScamOrVerified;
    private boolean secretChatTimer;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private StatusDrawable[] statusDrawables;
    public boolean[] statusMadeShorter;
    private SimpleTextView subtitleTextLargerCopyView;
    private SimpleTextView subtitleTextView;
    private ImageView timeItem;
    private TimerDrawable timerDrawable;
    private AnimatorSet titleAnimation;
    private SimpleTextView titleTextLargerCopyView;
    private SimpleTextView titleTextView;

    public ChatAvatarContainer(Context context, BaseFragment baseFragment, boolean z) {
        this(context, baseFragment, z, null);
    }

    public ChatAvatarContainer(Context context, BaseFragment baseFragment, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.statusDrawables = new StatusDrawable[6];
        this.avatarDrawable = new AvatarDrawable();
        this.currentAccount = UserConfig.selectedAccount;
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.m35dp(8.0f);
        this.lastWidth = -1;
        this.largerWidth = -1;
        this.isOnline = new boolean[1];
        this.statusMadeShorter = new boolean[1];
        this.onlineCount = -1;
        this.allowShorterStatus = false;
        this.rightDrawableIsScamOrVerified = false;
        this.rightDrawableContentDescription = null;
        this.resourcesProvider = resourcesProvider;
        boolean z2 = baseFragment instanceof ChatActivity;
        if (z2) {
            this.parentFragment = (ChatActivity) baseFragment;
        }
        ChatActivity chatActivity = this.parentFragment;
        final boolean z3 = (chatActivity == null || chatActivity.getChatMode() != 0 || UserObject.isReplyUser(this.parentFragment.getCurrentUser())) ? false : true;
        this.avatarImageView = new BackupImageView(this, context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (z3 && getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrProfilePicture", C1072R.string.AccDescrProfilePicture));
                    if (Build.VERSION.SDK_INT >= 21) {
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("Open", C1072R.string.Open)));
                        return;
                    }
                    return;
                }
                accessibilityNodeInfo.setVisibleToUser(false);
            }
        };
        if (z2 || (baseFragment instanceof TopicsFragment)) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(baseFragment);
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && (chatActivity2.isThreadChat() || this.parentFragment.getChatMode() == 2)) {
                this.avatarImageView.setVisibility(8);
            }
        }
        this.avatarImageView.setContentDescription(LocaleController.getString("AccDescrProfilePicture", C1072R.string.AccDescrProfilePicture));
        this.avatarImageView.setRoundRadius(AndroidUtilities.m35dp(21.0f));
        addView(this.avatarImageView);
        if (z3) {
            this.avatarImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAvatarContainer.this.lambda$new$0(view);
                }
            });
        }
        SimpleTextView simpleTextView = new SimpleTextView(context) {
            @Override
            public boolean setText(CharSequence charSequence) {
                if (ChatAvatarContainer.this.titleTextLargerCopyView != null) {
                    ChatAvatarContainer.this.titleTextLargerCopyView.setText(charSequence);
                }
                return super.setText(charSequence);
            }

            @Override
            public void setTranslationY(float f) {
                if (ChatAvatarContainer.this.titleTextLargerCopyView != null) {
                    ChatAvatarContainer.this.titleTextLargerCopyView.setTranslationY(f);
                }
                super.setTranslationY(f);
            }
        };
        this.titleTextView = simpleTextView;
        simpleTextView.setEllipsizeByGradient(true);
        this.titleTextView.setTextColor(getThemedColor("actionBarDefaultTitle"));
        this.titleTextView.setTextSize(18);
        this.titleTextView.setGravity(3);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextView.setLeftDrawableTopPadding(-AndroidUtilities.m35dp(1.3f));
        this.titleTextView.setCanHideRightDrawable(false);
        this.titleTextView.setRightDrawableOutside(true);
        this.titleTextView.setPadding(0, AndroidUtilities.m35dp(6.0f), 0, AndroidUtilities.m35dp(12.0f));
        addView(this.titleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context) {
            @Override
            public boolean setText(CharSequence charSequence) {
                if (ChatAvatarContainer.this.subtitleTextLargerCopyView != null) {
                    ChatAvatarContainer.this.subtitleTextLargerCopyView.setText(charSequence);
                }
                return super.setText(charSequence);
            }

            @Override
            public void setTranslationY(float f) {
                if (ChatAvatarContainer.this.subtitleTextLargerCopyView != null) {
                    ChatAvatarContainer.this.subtitleTextLargerCopyView.setTranslationY(f);
                }
                super.setTranslationY(f);
            }
        };
        this.subtitleTextView = simpleTextView2;
        simpleTextView2.setEllipsizeByGradient(true);
        this.subtitleTextView.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
        this.subtitleTextView.setTag("actionBarDefaultSubtitle");
        this.subtitleTextView.setTextSize(14);
        this.subtitleTextView.setGravity(3);
        this.subtitleTextView.setPadding(0, 0, AndroidUtilities.m35dp(10.0f), 0);
        addView(this.subtitleTextView);
        if (this.parentFragment != null) {
            ImageView imageView = new ImageView(context);
            this.timeItem = imageView;
            imageView.setPadding(AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(5.0f));
            this.timeItem.setScaleType(ImageView.ScaleType.CENTER);
            this.timeItem.setAlpha(0.0f);
            this.timeItem.setScaleY(0.0f);
            this.timeItem.setScaleX(0.0f);
            this.timeItem.setVisibility(8);
            ImageView imageView2 = this.timeItem;
            TimerDrawable timerDrawable = new TimerDrawable(context, resourcesProvider);
            this.timerDrawable = timerDrawable;
            imageView2.setImageDrawable(timerDrawable);
            addView(this.timeItem);
            this.secretChatTimer = z;
            this.timeItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAvatarContainer.this.lambda$new$1(resourcesProvider, view);
                }
            });
            if (this.secretChatTimer) {
                this.timeItem.setContentDescription(LocaleController.getString("SetTimer", C1072R.string.SetTimer));
            } else {
                this.timeItem.setContentDescription(LocaleController.getString("AccAutoDeleteTimer", C1072R.string.AccAutoDeleteTimer));
            }
        }
        ChatActivity chatActivity3 = this.parentFragment;
        if (chatActivity3 != null && chatActivity3.getChatMode() == 0) {
            if ((!this.parentFragment.isThreadChat() || this.parentFragment.isTopic) && !UserObject.isReplyUser(this.parentFragment.getCurrentUser())) {
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChatAvatarContainer.this.lambda$new$2(view);
                    }
                });
            }
            TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
            this.statusDrawables[0] = new TypingDotsDrawable(true);
            this.statusDrawables[1] = new RecordStatusDrawable(true);
            this.statusDrawables[2] = new SendingFileDrawable(true);
            this.statusDrawables[3] = new PlayingGameDrawable(false, resourcesProvider);
            this.statusDrawables[4] = new RoundStatusDrawable(true);
            this.statusDrawables[5] = new ChoosingStickerStatusDrawable(true);
            int i = 0;
            while (true) {
                StatusDrawable[] statusDrawableArr = this.statusDrawables;
                if (i >= statusDrawableArr.length) {
                    break;
                }
                statusDrawableArr[i].setIsChat(currentChat != null);
                i++;
            }
        }
        this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.titleTextView, AndroidUtilities.m35dp(24.0f));
    }

    public void lambda$new$0(View view) {
        openProfile(true);
    }

    public void lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.secretChatTimer) {
            this.parentFragment.showDialog(AlertsCreator.createTTLAlert(getContext(), this.parentFragment.getCurrentEncryptedChat(), resourcesProvider).create());
        } else {
            openSetTimer();
        }
    }

    public void lambda$new$2(View view) {
        openProfile(false);
    }

    public void setTitleExpand(boolean z) {
        int m35dp = z ? AndroidUtilities.m35dp(10.0f) : 0;
        if (this.titleTextView.getPaddingRight() != m35dp) {
            this.titleTextView.setPadding(0, AndroidUtilities.m35dp(6.0f), m35dp, AndroidUtilities.m35dp(12.0f));
            requestLayout();
            invalidate();
        }
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.overrideSubtitleColor = num;
    }

    public boolean openSetTimer() {
        int i;
        if (this.parentFragment.getParentActivity() == null) {
            return false;
        }
        TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
        if (currentChat != null && !ChatObject.canUserDoAdminAction(currentChat, 13)) {
            if (this.timeItem.getTag() != null) {
                this.parentFragment.showTimerHint();
            }
            return false;
        }
        TLRPC$ChatFull currentChatInfo = this.parentFragment.getCurrentChatInfo();
        TLRPC$UserFull currentUserInfo = this.parentFragment.getCurrentUserInfo();
        if (currentUserInfo != null) {
            i = currentUserInfo.ttl_period;
        } else {
            i = currentChatInfo != null ? currentChatInfo.ttl_period : 0;
        }
        AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(getContext(), null, new AutoDeletePopupWrapper.Callback() {
            @Override
            public void showGlobalAutoDeleteScreen() {
                AutoDeletePopupWrapper.Callback.CC.$default$showGlobalAutoDeleteScreen(this);
            }

            @Override
            public void dismiss() {
                ActionBarPopupWindow[] actionBarPopupWindowArr = r2;
                if (actionBarPopupWindowArr[0] != null) {
                    actionBarPopupWindowArr[0].dismiss();
                }
            }

            @Override
            public void setAutoDeleteHistory(int i2, int i3) {
                if (ChatAvatarContainer.this.parentFragment == null) {
                    return;
                }
                ChatAvatarContainer.this.parentFragment.getMessagesController().setDialogHistoryTTL(ChatAvatarContainer.this.parentFragment.getDialogId(), i2);
                TLRPC$ChatFull currentChatInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentChatInfo();
                TLRPC$UserFull currentUserInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentUserInfo();
                if (currentUserInfo2 == null && currentChatInfo2 == null) {
                    return;
                }
                ChatAvatarContainer.this.parentFragment.getUndoView().showWithAction(ChatAvatarContainer.this.parentFragment.getDialogId(), i3, ChatAvatarContainer.this.parentFragment.getCurrentUser(), Integer.valueOf(currentUserInfo2 != null ? currentUserInfo2.ttl_period : currentChatInfo2.ttl_period), (Runnable) null, (Runnable) null);
            }
        }, true, 0, this.resourcesProvider);
        autoDeletePopupWrapper.lambda$updateItems$7(i);
        final ActionBarPopupWindow[] actionBarPopupWindowArr = {new ActionBarPopupWindow(autoDeletePopupWrapper.windowLayout, -2, -2) {
            @Override
            public void dismiss() {
                super.dismiss();
                if (ChatAvatarContainer.this.parentFragment != null) {
                    ChatAvatarContainer.this.parentFragment.dimBehindView(false);
                }
            }
        }};
        actionBarPopupWindowArr[0].setPauseNotifications(true);
        actionBarPopupWindowArr[0].setDismissAnimationDuration(220);
        actionBarPopupWindowArr[0].setOutsideTouchable(true);
        actionBarPopupWindowArr[0].setClippingEnabled(true);
        actionBarPopupWindowArr[0].setAnimationStyle(C1072R.style.PopupContextAnimation);
        actionBarPopupWindowArr[0].setFocusable(true);
        autoDeletePopupWrapper.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindowArr[0].setInputMethodMode(2);
        actionBarPopupWindowArr[0].getContentView().setFocusableInTouchMode(true);
        ActionBarPopupWindow actionBarPopupWindow = actionBarPopupWindowArr[0];
        BackupImageView backupImageView = this.avatarImageView;
        actionBarPopupWindow.showAtLocation(backupImageView, 0, (int) (backupImageView.getX() + getX()), (int) this.avatarImageView.getY());
        this.parentFragment.dimBehindView(true);
        return true;
    }

    public void openProfile(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.ChatAvatarContainer.openProfile(boolean):void");
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void setTitleColors(int i, int i2) {
        this.titleTextView.setTextColor(i);
        this.subtitleTextView.setTextColor(i2);
        this.subtitleTextView.setTag(Integer.valueOf(i2));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) + this.titleTextView.getPaddingRight();
        int m35dp = size - AndroidUtilities.m35dp((this.avatarImageView.getVisibility() == 0 ? 54 : 0) + 16);
        this.avatarImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(42.0f), 1073741824));
        this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(32.0f) + this.titleTextView.getPaddingRight(), Integer.MIN_VALUE));
        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), Integer.MIN_VALUE));
        ImageView imageView = this.timeItem;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(34.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i3 = this.lastWidth;
        if (i3 != -1 && i3 != size && i3 > size) {
            fadeOutToLessWidth(i3);
        }
        if (this.titleTextLargerCopyView != null) {
            this.titleTextLargerCopyView.measure(View.MeasureSpec.makeMeasureSpec(this.largerWidth - AndroidUtilities.m35dp((this.avatarImageView.getVisibility() != 0 ? 0 : 54) + 16), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(24.0f), Integer.MIN_VALUE));
        }
        this.lastWidth = size;
    }

    private void fadeOutToLessWidth(int i) {
        this.largerWidth = i;
        SimpleTextView simpleTextView = this.titleTextLargerCopyView;
        if (simpleTextView != null) {
            removeView(simpleTextView);
        }
        SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
        this.titleTextLargerCopyView = simpleTextView2;
        simpleTextView2.setTextColor(getThemedColor("actionBarDefaultTitle"));
        this.titleTextLargerCopyView.setTextSize(18);
        this.titleTextLargerCopyView.setGravity(3);
        this.titleTextLargerCopyView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextLargerCopyView.setLeftDrawableTopPadding(-AndroidUtilities.m35dp(1.3f));
        this.titleTextLargerCopyView.setRightDrawable(this.titleTextView.getRightDrawable());
        this.titleTextLargerCopyView.setRightDrawableOutside(this.titleTextView.getRightDrawableOutside());
        this.titleTextLargerCopyView.setLeftDrawable(this.titleTextView.getLeftDrawable());
        this.titleTextLargerCopyView.setText(this.titleTextView.getText());
        ViewPropertyAnimator duration = this.titleTextLargerCopyView.animate().alpha(0.0f).setDuration(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatAvatarContainer.this.lambda$fadeOutToLessWidth$3();
            }
        }).start();
        addView(this.titleTextLargerCopyView);
        SimpleTextView simpleTextView3 = new SimpleTextView(getContext());
        this.subtitleTextLargerCopyView = simpleTextView3;
        simpleTextView3.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
        this.subtitleTextLargerCopyView.setTag("actionBarDefaultSubtitle");
        this.subtitleTextLargerCopyView.setTextSize(14);
        this.subtitleTextLargerCopyView.setGravity(3);
        this.subtitleTextLargerCopyView.setText(this.subtitleTextView.getText());
        this.subtitleTextLargerCopyView.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatAvatarContainer.this.lambda$fadeOutToLessWidth$4();
            }
        }).start();
        addView(this.subtitleTextLargerCopyView);
        setClipChildren(false);
    }

    public void lambda$fadeOutToLessWidth$3() {
        SimpleTextView simpleTextView = this.titleTextLargerCopyView;
        if (simpleTextView != null) {
            removeView(simpleTextView);
            this.titleTextLargerCopyView = null;
        }
    }

    public void lambda$fadeOutToLessWidth$4() {
        SimpleTextView simpleTextView = this.subtitleTextLargerCopyView;
        if (simpleTextView != null) {
            removeView(simpleTextView);
            this.subtitleTextLargerCopyView = null;
            setClipChildren(true);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int currentActionBarHeight = ((C1133ActionBar.getCurrentActionBarHeight() - AndroidUtilities.m35dp(42.0f)) / 2) + ((Build.VERSION.SDK_INT < 21 || !this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
        BackupImageView backupImageView = this.avatarImageView;
        int i5 = this.leftPadding;
        int i6 = currentActionBarHeight + 1;
        backupImageView.layout(i5, i6, AndroidUtilities.m35dp(42.0f) + i5, AndroidUtilities.m35dp(42.0f) + i6);
        int m35dp = this.leftPadding + (this.avatarImageView.getVisibility() == 0 ? AndroidUtilities.m35dp(54.0f) : 0);
        if (this.subtitleTextView.getVisibility() != 8) {
            this.titleTextView.layout(m35dp, (AndroidUtilities.m35dp(1.3f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + m35dp, (((this.titleTextView.getTextHeight() + currentActionBarHeight) + AndroidUtilities.m35dp(1.3f)) - this.titleTextView.getPaddingTop()) + this.titleTextView.getPaddingBottom());
            SimpleTextView simpleTextView = this.titleTextLargerCopyView;
            if (simpleTextView != null) {
                simpleTextView.layout(m35dp, AndroidUtilities.m35dp(1.3f) + currentActionBarHeight, this.titleTextLargerCopyView.getMeasuredWidth() + m35dp, this.titleTextLargerCopyView.getTextHeight() + currentActionBarHeight + AndroidUtilities.m35dp(1.3f));
            }
        } else {
            this.titleTextView.layout(m35dp, (AndroidUtilities.m35dp(11.0f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + m35dp, (((this.titleTextView.getTextHeight() + currentActionBarHeight) + AndroidUtilities.m35dp(11.0f)) - this.titleTextView.getPaddingTop()) + this.titleTextView.getPaddingBottom());
            SimpleTextView simpleTextView2 = this.titleTextLargerCopyView;
            if (simpleTextView2 != null) {
                simpleTextView2.layout(m35dp, AndroidUtilities.m35dp(11.0f) + currentActionBarHeight, this.titleTextLargerCopyView.getMeasuredWidth() + m35dp, this.titleTextLargerCopyView.getTextHeight() + currentActionBarHeight + AndroidUtilities.m35dp(11.0f));
            }
        }
        ImageView imageView = this.timeItem;
        if (imageView != null) {
            imageView.layout(this.leftPadding + AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(15.0f) + currentActionBarHeight, this.leftPadding + AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(49.0f) + currentActionBarHeight);
        }
        this.subtitleTextView.layout(m35dp, AndroidUtilities.m35dp(24.0f) + currentActionBarHeight, this.subtitleTextView.getMeasuredWidth() + m35dp, this.subtitleTextView.getTextHeight() + currentActionBarHeight + AndroidUtilities.m35dp(24.0f));
        SimpleTextView simpleTextView3 = this.subtitleTextLargerCopyView;
        if (simpleTextView3 != null) {
            simpleTextView3.layout(m35dp, AndroidUtilities.m35dp(24.0f) + currentActionBarHeight, this.subtitleTextLargerCopyView.getMeasuredWidth() + m35dp, currentActionBarHeight + this.subtitleTextLargerCopyView.getTextHeight() + AndroidUtilities.m35dp(24.0f));
        }
    }

    public void setLeftPadding(int i) {
        this.leftPadding = i;
    }

    public void showTimeItem(boolean z) {
        ImageView imageView = this.timeItem;
        if (imageView != null && imageView.getTag() == null && this.avatarImageView.getVisibility() == 0) {
            this.timeItem.clearAnimation();
            this.timeItem.setVisibility(0);
            this.timeItem.setTag(1);
            if (z) {
                this.timeItem.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(null).start();
                return;
            }
            this.timeItem.setAlpha(1.0f);
            this.timeItem.setScaleY(1.0f);
            this.timeItem.setScaleX(1.0f);
        }
    }

    public void hideTimeItem(boolean z) {
        ImageView imageView = this.timeItem;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.timeItem.clearAnimation();
        this.timeItem.setTag(null);
        if (z) {
            this.timeItem.animate().setDuration(180L).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAvatarContainer.this.timeItem.setVisibility(8);
                    super.onAnimationEnd(animator);
                }
            }).start();
            return;
        }
        this.timeItem.setVisibility(8);
        this.timeItem.setAlpha(0.0f);
        this.timeItem.setScaleY(0.0f);
        this.timeItem.setScaleX(0.0f);
    }

    public void setTime(int i, boolean z) {
        if (this.timerDrawable == null) {
            return;
        }
        if (i != 0 || this.secretChatTimer) {
            showTimeItem(z);
            this.timerDrawable.setTime(i);
        }
    }

    public void setTitleIcons(Drawable drawable, Drawable drawable2) {
        this.titleTextView.setLeftDrawable(drawable);
        if (this.rightDrawableIsScamOrVerified) {
            return;
        }
        if (drawable2 != null) {
            this.rightDrawableContentDescription = LocaleController.getString("NotificationsMuted", C1072R.string.NotificationsMuted);
        } else {
            this.rightDrawableContentDescription = null;
        }
        this.titleTextView.setRightDrawable(drawable2);
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false, false, false, false, null, false);
    }

    public void setTitle(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC$EmojiStatus tLRPC$EmojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.titleTextView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(24.0f), false);
        }
        this.titleTextView.setText(charSequence);
        if (z || z2) {
            if (this.titleTextView.getRightDrawable() instanceof ScamDrawable) {
                return;
            }
            ScamDrawable scamDrawable = new ScamDrawable(11, !z ? 1 : 0);
            scamDrawable.setColor(getThemedColor("actionBarDefaultSubtitle"));
            this.titleTextView.setRightDrawable(scamDrawable);
            this.rightDrawableContentDescription = LocaleController.getString("ScamMessage", C1072R.string.ScamMessage);
            this.rightDrawableIsScamOrVerified = true;
        } else if (z3) {
            Drawable mutate = getResources().getDrawable(C1072R.C1073drawable.verified_area).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("profile_verifiedBackground"), PorterDuff.Mode.MULTIPLY));
            Drawable mutate2 = getResources().getDrawable(C1072R.C1073drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor("profile_verifiedCheck"), PorterDuff.Mode.MULTIPLY));
            this.titleTextView.setRightDrawable(new CombinedDrawable(mutate, mutate2));
            this.rightDrawableIsScamOrVerified = true;
            this.rightDrawableContentDescription = LocaleController.getString("AccDescrVerified", C1072R.string.AccDescrVerified);
        } else if (z4) {
            boolean z6 = tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatus;
            if (!z6 && (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil)) {
                int i = ((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus).until;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            if ((this.titleTextView.getRightDrawable() instanceof AnimatedEmojiDrawable.WrapSizeDrawable) && (((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).getDrawable() instanceof AnimatedEmojiDrawable)) {
                ((AnimatedEmojiDrawable) ((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).getDrawable()).removeView(this.titleTextView);
            }
            if (z6) {
                this.emojiStatusDrawable.set(((TLRPC$TL_emojiStatus) tLRPC$EmojiStatus).document_id, z5);
            } else {
                if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) {
                    TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil = (TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus;
                    if (tLRPC$TL_emojiStatusUntil.until > ((int) (System.currentTimeMillis() / 1000))) {
                        this.emojiStatusDrawable.set(tLRPC$TL_emojiStatusUntil.document_id, z5);
                    }
                }
                Drawable mutate3 = ContextCompat.getDrawable(ApplicationLoader.applicationContext, C1072R.C1073drawable.msg_premium_liststar).mutate();
                mutate3.setColorFilter(new PorterDuffColorFilter(getThemedColor("profile_verifiedBackground"), PorterDuff.Mode.MULTIPLY));
                this.emojiStatusDrawable.set(mutate3, z5);
            }
            this.emojiStatusDrawable.setColor(Integer.valueOf(getThemedColor("profile_verifiedBackground")));
            this.titleTextView.setRightDrawable(this.emojiStatusDrawable);
            this.rightDrawableIsScamOrVerified = true;
            this.rightDrawableContentDescription = LocaleController.getString("AccDescrPremium", C1072R.string.AccDescrPremium);
        } else if (this.titleTextView.getRightDrawable() instanceof ScamDrawable) {
            this.titleTextView.setRightDrawable((Drawable) null);
            this.rightDrawableIsScamOrVerified = false;
            this.rightDrawableContentDescription = null;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.lastSubtitle == null) {
            this.subtitleTextView.setText(charSequence);
        } else {
            this.lastSubtitle = charSequence;
        }
    }

    public ImageView getTimeItem() {
        return this.timeItem;
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView;
    }

    public SimpleTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public void onDestroy() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (sharedMediaPreloader != null) {
            sharedMediaPreloader.onDestroy(this.parentFragment);
        }
    }

    private void setTypingAnimation(boolean z) {
        int i = 0;
        if (z) {
            try {
                int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.parentFragment.getDialogId(), this.parentFragment.getThreadId()).intValue();
                if (intValue == 5) {
                    this.subtitleTextView.replaceTextWithDrawable(this.statusDrawables[intValue], "**oo**");
                    this.statusDrawables[intValue].setColor(getThemedColor("chat_status"));
                    this.subtitleTextView.setLeftDrawable((Drawable) null);
                } else {
                    this.subtitleTextView.replaceTextWithDrawable(null, null);
                    this.statusDrawables[intValue].setColor(getThemedColor("chat_status"));
                    this.subtitleTextView.setLeftDrawable(this.statusDrawables[intValue]);
                }
                this.currentTypingDrawable = this.statusDrawables[intValue];
                while (true) {
                    StatusDrawable[] statusDrawableArr = this.statusDrawables;
                    if (i >= statusDrawableArr.length) {
                        return;
                    }
                    if (i == intValue) {
                        statusDrawableArr[i].start();
                    } else {
                        statusDrawableArr[i].stop();
                    }
                    i++;
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        } else {
            this.currentTypingDrawable = null;
            this.subtitleTextView.setLeftDrawable((Drawable) null);
            this.subtitleTextView.replaceTextWithDrawable(null, null);
            while (true) {
                StatusDrawable[] statusDrawableArr2 = this.statusDrawables;
                if (i >= statusDrawableArr2.length) {
                    return;
                }
                statusDrawableArr2[i].stop();
                i++;
            }
        }
    }

    public void updateSubtitle() {
        updateSubtitle(false);
    }

    public void updateSubtitle(boolean z) {
        String string;
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        int i;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        TLRPC$User currentUser = chatActivity.getCurrentUser();
        if (UserObject.isUserSelf(currentUser) || UserObject.isReplyUser(currentUser) || this.parentFragment.getChatMode() != 0) {
            if (this.subtitleTextView.getVisibility() != 8) {
                this.subtitleTextView.setVisibility(8);
                return;
            }
            return;
        }
        TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
        boolean z2 = false;
        CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.parentFragment.getDialogId(), this.parentFragment.getThreadId(), false);
        String str = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        if (printingString == null || printingString.length() == 0 || (ChatObject.isChannel(currentChat) && !currentChat.megagroup)) {
            if (this.parentFragment.isThreadChat() && !this.parentFragment.isTopic) {
                if (this.titleTextView.getTag() != null) {
                    return;
                }
                this.titleTextView.setTag(1);
                AnimatorSet animatorSet = this.titleAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.titleAnimation = null;
                }
                if (z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.titleAnimation = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this.titleTextView, View.TRANSLATION_Y, AndroidUtilities.m35dp(9.7f)), ObjectAnimator.ofFloat(this.subtitleTextView, View.ALPHA, 0.0f));
                    this.titleAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationCancel(Animator animator) {
                            ChatAvatarContainer.this.titleAnimation = null;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ChatAvatarContainer.this.titleAnimation == animator) {
                                ChatAvatarContainer.this.subtitleTextView.setVisibility(4);
                                ChatAvatarContainer.this.titleAnimation = null;
                            }
                        }
                    });
                    this.titleAnimation.setDuration(180L);
                    this.titleAnimation.start();
                    return;
                }
                this.titleTextView.setTranslationY(AndroidUtilities.m35dp(9.7f));
                this.subtitleTextView.setAlpha(0.0f);
                this.subtitleTextView.setVisibility(4);
                return;
            }
            setTypingAnimation(false);
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2.isTopic && currentChat != null) {
                TLRPC$TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(currentChat.f857id, this.parentFragment.getTopicId());
                int i2 = findTopic != null ? findTopic.totalMessagesCount - 1 : 0;
                string = i2 > 0 ? LocaleController.formatPluralString("messages", i2, Integer.valueOf(i2)) : LocaleController.formatString("TopicProfileStatus", C1072R.string.TopicProfileStatus, currentChat.title);
            } else if (currentChat != null) {
                TLRPC$ChatFull currentChatInfo = chatActivity2.getCurrentChatInfo();
                if (ChatObject.isChannel(currentChat)) {
                    if (currentChatInfo != null && (i = currentChatInfo.participants_count) != 0) {
                        if (currentChat.megagroup) {
                            string = this.onlineCount > 1 ? String.format("%s, %s", LocaleController.formatPluralString("Members", i, new Object[0]), LocaleController.formatPluralString("OnlineCount", Math.min(this.onlineCount, currentChatInfo.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i, new Object[0]);
                        } else {
                            int[] iArr = new int[1];
                            String formatShortNumber = LocaleController.formatShortNumber(i, iArr);
                            if (currentChat.megagroup) {
                                string = LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                            } else {
                                string = LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                            }
                        }
                    } else if (currentChat.megagroup) {
                        if (currentChatInfo == null) {
                            string = LocaleController.getString("Loading", C1072R.string.Loading).toLowerCase();
                        } else if (currentChat.has_geo) {
                            string = LocaleController.getString("MegaLocation", C1072R.string.MegaLocation).toLowerCase();
                        } else if (ChatObject.isPublic(currentChat)) {
                            string = LocaleController.getString("MegaPublic", C1072R.string.MegaPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString("MegaPrivate", C1072R.string.MegaPrivate).toLowerCase();
                        }
                    } else if (ChatObject.isPublic(currentChat)) {
                        string = LocaleController.getString("ChannelPublic", C1072R.string.ChannelPublic).toLowerCase();
                    } else {
                        string = LocaleController.getString("ChannelPrivate", C1072R.string.ChannelPrivate).toLowerCase();
                    }
                } else if (ChatObject.isKickedFromChat(currentChat)) {
                    string = LocaleController.getString("YouWereKicked", C1072R.string.YouWereKicked);
                } else if (ChatObject.isLeftFromChat(currentChat)) {
                    string = LocaleController.getString("YouLeft", C1072R.string.YouLeft);
                } else {
                    int i3 = currentChat.participants_count;
                    if (currentChatInfo != null && (tLRPC$ChatParticipants = currentChatInfo.participants) != null) {
                        i3 = tLRPC$ChatParticipants.participants.size();
                    }
                    string = (this.onlineCount <= 1 || i3 == 0) ? LocaleController.formatPluralString("Members", i3, new Object[0]) : String.format("%s, %s", LocaleController.formatPluralString("Members", i3, new Object[0]), LocaleController.formatPluralString("OnlineCount", this.onlineCount, new Object[0]));
                }
            } else if (currentUser != null) {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentUser.f995id));
                if (user != null) {
                    currentUser = user;
                }
                if (!UserObject.isReplyUser(currentUser)) {
                    if (currentUser.f995id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                        string = LocaleController.getString("ChatYourSelf", C1072R.string.ChatYourSelf);
                    } else {
                        long j = currentUser.f995id;
                        if (j == 333000 || j == 777000 || j == 42777) {
                            string = LocaleController.getString("ServiceNotifications", C1072R.string.ServiceNotifications);
                        } else if (MessagesController.isSupportUser(currentUser)) {
                            string = LocaleController.getString("SupportStatus", C1072R.string.SupportStatus);
                        } else if (currentUser.bot) {
                            string = LocaleController.getString("Bot", C1072R.string.Bot);
                        } else {
                            boolean[] zArr = this.isOnline;
                            zArr[0] = false;
                            str = LocaleController.formatUserStatus(this.currentAccount, currentUser, zArr, this.allowShorterStatus ? this.statusMadeShorter : null);
                            z2 = this.isOnline[0];
                        }
                    }
                }
            }
            str = string;
        } else {
            if (this.parentFragment.isThreadChat() && this.titleTextView.getTag() != null) {
                this.titleTextView.setTag(null);
                this.subtitleTextView.setVisibility(0);
                AnimatorSet animatorSet3 = this.titleAnimation;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.titleAnimation = null;
                }
                if (z) {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.titleAnimation = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.titleTextView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(this.subtitleTextView, View.ALPHA, 1.0f));
                    this.titleAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAvatarContainer.this.titleAnimation = null;
                        }
                    });
                    this.titleAnimation.setDuration(180L);
                    this.titleAnimation.start();
                } else {
                    this.titleTextView.setTranslationY(0.0f);
                    this.subtitleTextView.setAlpha(1.0f);
                }
            }
            str = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.parentFragment.getDialogId(), this.parentFragment.getThreadId()).intValue() == 5 ? Emoji.replaceEmoji(printingString, this.subtitleTextView.getTextPaint().getFontMetricsInt(), AndroidUtilities.m35dp(15.0f), false) : printingString;
            setTypingAnimation(true);
            z2 = true;
        }
        this.lastSubtitleColorKey = z2 ? "chat_status" : "actionBarDefaultSubtitle";
        if (this.lastSubtitle == null) {
            this.subtitleTextView.setText(str);
            Integer num = this.overrideSubtitleColor;
            if (num == null) {
                this.subtitleTextView.setTextColor(getThemedColor(this.lastSubtitleColorKey));
                this.subtitleTextView.setTag(this.lastSubtitleColorKey);
                return;
            }
            this.subtitleTextView.setTextColor(num.intValue());
            return;
        }
        this.lastSubtitle = str;
    }

    public String getLastSubtitleColorKey() {
        return this.lastSubtitleColorKey;
    }

    public void setChatAvatar(TLRPC$Chat tLRPC$Chat) {
        this.avatarDrawable.setInfo(tLRPC$Chat);
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
            this.avatarImageView.setRoundRadius(AndroidUtilities.m35dp((tLRPC$Chat == null || !tLRPC$Chat.forum) ? 21.0f : 16.0f));
        }
    }

    public void setUserAvatar(TLRPC$User tLRPC$User) {
        setUserAvatar(tLRPC$User, false);
    }

    public void setUserAvatar(TLRPC$User tLRPC$User, boolean z) {
        this.avatarDrawable.setInfo(tLRPC$User);
        if (UserObject.isReplyUser(tLRPC$User)) {
            this.avatarDrawable.setAvatarType(12);
            this.avatarDrawable.setScaleSize(0.8f);
            BackupImageView backupImageView = this.avatarImageView;
            if (backupImageView != null) {
                backupImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, tLRPC$User);
            }
        } else if (UserObject.isUserSelf(tLRPC$User) && !z) {
            this.avatarDrawable.setAvatarType(1);
            this.avatarDrawable.setScaleSize(0.8f);
            BackupImageView backupImageView2 = this.avatarImageView;
            if (backupImageView2 != null) {
                backupImageView2.setImage((ImageLocation) null, (String) null, this.avatarDrawable, tLRPC$User);
            }
        } else {
            this.avatarDrawable.setScaleSize(1.0f);
            BackupImageView backupImageView3 = this.avatarImageView;
            if (backupImageView3 != null) {
                backupImageView3.setForUserOrChat(tLRPC$User, this.avatarDrawable);
            }
        }
    }

    public void checkAndUpdateAvatar() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        TLRPC$User currentUser = chatActivity.getCurrentUser();
        TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
        if (currentUser == null) {
            if (currentChat != null) {
                this.avatarDrawable.setInfo(currentChat);
                BackupImageView backupImageView = this.avatarImageView;
                if (backupImageView != null) {
                    backupImageView.setForUserOrChat(currentChat, this.avatarDrawable);
                }
                this.avatarImageView.setRoundRadius(AndroidUtilities.m35dp(currentChat.forum ? 16.0f : 21.0f));
                return;
            }
            return;
        }
        this.avatarDrawable.setInfo(currentUser);
        if (UserObject.isReplyUser(currentUser)) {
            this.avatarDrawable.setScaleSize(0.8f);
            this.avatarDrawable.setAvatarType(12);
            BackupImageView backupImageView2 = this.avatarImageView;
            if (backupImageView2 != null) {
                backupImageView2.setImage((ImageLocation) null, (String) null, this.avatarDrawable, currentUser);
            }
        } else if (UserObject.isUserSelf(currentUser)) {
            this.avatarDrawable.setScaleSize(0.8f);
            this.avatarDrawable.setAvatarType(1);
            BackupImageView backupImageView3 = this.avatarImageView;
            if (backupImageView3 != null) {
                backupImageView3.setImage((ImageLocation) null, (String) null, this.avatarDrawable, currentUser);
            }
        } else {
            this.avatarDrawable.setScaleSize(1.0f);
            BackupImageView backupImageView4 = this.avatarImageView;
            if (backupImageView4 != null) {
                backupImageView4.imageReceiver.setForUserOrChat(currentUser, this.avatarDrawable, null, true);
            }
        }
    }

    public void updateOnlineCount() {
        TLRPC$UserStatus tLRPC$UserStatus;
        boolean z;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        this.onlineCount = 0;
        TLRPC$ChatFull currentChatInfo = chatActivity.getCurrentChatInfo();
        if (currentChatInfo == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if ((currentChatInfo instanceof TLRPC$TL_chatFull) || (((z = currentChatInfo instanceof TLRPC$TL_channelFull)) && currentChatInfo.participants_count <= 200 && currentChatInfo.participants != null)) {
            for (int i = 0; i < currentChatInfo.participants.participants.size(); i++) {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentChatInfo.participants.participants.get(i).user_id));
                if (user != null && (tLRPC$UserStatus = user.status) != null && ((tLRPC$UserStatus.expires > currentTime || user.f995id == UserConfig.getInstance(this.currentAccount).getClientUserId()) && user.status.expires > 10000)) {
                    this.onlineCount++;
                }
            }
        } else if (z && currentChatInfo.participants_count > 200) {
            this.onlineCount = currentChatInfo.online_count;
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
            updateCurrentConnectionState();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
            if (this.currentConnectionState != connectionState) {
                this.currentConnectionState = connectionState;
                updateCurrentConnectionState();
            }
        } else if (i == NotificationCenter.emojiLoaded) {
            SimpleTextView simpleTextView = this.titleTextView;
            if (simpleTextView != null) {
                simpleTextView.invalidate();
            }
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            if (simpleTextView2 != null) {
                simpleTextView2.invalidate();
            }
            invalidate();
        }
    }

    private void updateCurrentConnectionState() {
        String string;
        int i = this.currentConnectionState;
        if (i == 2) {
            string = LocaleController.getString("WaitingForNetwork", C1072R.string.WaitingForNetwork);
        } else if (i == 1) {
            string = LocaleController.getString("Connecting", C1072R.string.Connecting);
        } else if (i == 5) {
            string = LocaleController.getString("Updating", C1072R.string.Updating);
        } else {
            string = i == 4 ? LocaleController.getString("ConnectingToProxy", C1072R.string.ConnectingToProxy) : null;
        }
        if (string == null) {
            CharSequence charSequence = this.lastSubtitle;
            if (charSequence != null) {
                this.subtitleTextView.setText(charSequence);
                this.lastSubtitle = null;
                Integer num = this.overrideSubtitleColor;
                if (num != null) {
                    this.subtitleTextView.setTextColor(num.intValue());
                    return;
                }
                String str = this.lastSubtitleColorKey;
                if (str != null) {
                    this.subtitleTextView.setTextColor(getThemedColor(str));
                    this.subtitleTextView.setTag(this.lastSubtitleColorKey);
                    return;
                }
                return;
            }
            return;
        }
        if (this.lastSubtitle == null) {
            this.lastSubtitle = this.subtitleTextView.getText();
        }
        this.subtitleTextView.setText(string);
        Integer num2 = this.overrideSubtitleColor;
        if (num2 != null) {
            this.subtitleTextView.setTextColor(num2.intValue());
            return;
        }
        this.subtitleTextView.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
        this.subtitleTextView.setTag("actionBarDefaultSubtitle");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.titleTextView.getText());
        if (this.rightDrawableContentDescription != null) {
            sb.append(", ");
            sb.append(this.rightDrawableContentDescription);
        }
        sb.append("\n");
        sb.append(this.subtitleTextView.getText());
        accessibilityNodeInfo.setContentDescription(sb);
        if (!accessibilityNodeInfo.isClickable() || Build.VERSION.SDK_INT < 21) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("OpenProfile", C1072R.string.OpenProfile)));
    }

    public SharedMediaLayout.SharedMediaPreloader getSharedMediaPreloader() {
        return this.sharedMediaPreloader;
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void updateColors() {
        StatusDrawable statusDrawable = this.currentTypingDrawable;
        if (statusDrawable != null) {
            statusDrawable.setColor(getThemedColor("chat_status"));
        }
    }
}
