package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
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
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.AutoDeletePopupWrapper;
import org.telegram.p009ui.Components.SharedMediaLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_chatFull;
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
    private boolean[] isOnline;
    private CharSequence lastSubtitle;
    private String lastSubtitleColorKey;
    private int leftPadding;
    private boolean occupyStatusBar;
    private int onlineCount;
    private Integer overrideSubtitleColor;
    private ChatActivity parentFragment;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean secretChatTimer;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private StatusDrawable[] statusDrawables;
    public boolean[] statusMadeShorter;
    private SimpleTextView subtitleTextView;
    private ImageView timeItem;
    private TimerDrawable timerDrawable;
    private AnimatorSet titleAnimation;
    private SimpleTextView titleTextView;

    public ChatAvatarContainer(Context context, ChatActivity chatActivity, boolean z) {
        this(context, chatActivity, z, null);
    }

    public ChatAvatarContainer(Context context, ChatActivity chatActivity, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.statusDrawables = new StatusDrawable[6];
        this.avatarDrawable = new AvatarDrawable();
        this.currentAccount = UserConfig.selectedAccount;
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.m34dp(8.0f);
        this.isOnline = new boolean[1];
        this.statusMadeShorter = new boolean[1];
        this.onlineCount = -1;
        this.allowShorterStatus = false;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = chatActivity;
        final boolean z2 = chatActivity != null && chatActivity.getChatMode() == 0 && !UserObject.isReplyUser(this.parentFragment.getCurrentUser());
        this.avatarImageView = new BackupImageView(this, context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!z2 || !getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setVisibleToUser(false);
                    return;
                }
                accessibilityNodeInfo.setText(LocaleController.getString("AccDescrProfilePicture", C0952R.string.AccDescrProfilePicture));
                if (Build.VERSION.SDK_INT >= 21) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("Open", C0952R.string.Open)));
                }
            }
        };
        if (this.parentFragment != null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(chatActivity);
            if (this.parentFragment.isThreadChat() || this.parentFragment.getChatMode() == 2) {
                this.avatarImageView.setVisibility(8);
            }
        }
        this.avatarImageView.setContentDescription(LocaleController.getString("AccDescrProfilePicture", C0952R.string.AccDescrProfilePicture));
        this.avatarImageView.setRoundRadius(AndroidUtilities.m34dp(21.0f));
        addView(this.avatarImageView);
        if (z2) {
            this.avatarImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAvatarContainer.this.lambda$new$0(view);
                }
            });
        }
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextColor(getThemedColor("actionBarDefaultTitle"));
        this.titleTextView.setTextSize(18);
        this.titleTextView.setGravity(3);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.titleTextView.setLeftDrawableTopPadding(-AndroidUtilities.m34dp(1.3f));
        addView(this.titleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.subtitleTextView = simpleTextView2;
        simpleTextView2.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
        this.subtitleTextView.setTag("actionBarDefaultSubtitle");
        this.subtitleTextView.setTextSize(14);
        this.subtitleTextView.setGravity(3);
        addView(this.subtitleTextView);
        if (this.parentFragment != null) {
            ImageView imageView = new ImageView(context);
            this.timeItem = imageView;
            imageView.setPadding(AndroidUtilities.m34dp(10.0f), AndroidUtilities.m34dp(10.0f), AndroidUtilities.m34dp(5.0f), AndroidUtilities.m34dp(5.0f));
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
                this.timeItem.setContentDescription(LocaleController.getString("SetTimer", C0952R.string.SetTimer));
            } else {
                this.timeItem.setContentDescription(LocaleController.getString("AccAutoDeleteTimer", C0952R.string.AccAutoDeleteTimer));
            }
        }
        ChatActivity chatActivity2 = this.parentFragment;
        if (chatActivity2 != null && chatActivity2.getChatMode() == 0) {
            if (!this.parentFragment.isThreadChat() && !UserObject.isReplyUser(this.parentFragment.getCurrentUser())) {
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
                if (i < statusDrawableArr.length) {
                    statusDrawableArr[i].setIsChat(currentChat != null);
                    i++;
                } else {
                    return;
                }
            }
        }
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

    public void setOverrideSubtitleColor(Integer num) {
        this.overrideSubtitleColor = num;
    }

    public boolean openSetTimer() {
        int i;
        if (this.parentFragment.getParentActivity() == null) {
            return false;
        }
        TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
        if (currentChat == null || ChatObject.canUserDoAdminAction(currentChat, 13)) {
            TLRPC$ChatFull currentChatInfo = this.parentFragment.getCurrentChatInfo();
            TLRPC$UserFull currentUserInfo = this.parentFragment.getCurrentUserInfo();
            if (currentUserInfo != null) {
                i = currentUserInfo.ttl_period;
            } else {
                i = currentChatInfo != null ? currentChatInfo.ttl_period : 0;
            }
            AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(getContext(), null, new AutoDeletePopupWrapper.Callback() {
                @Override
                public void dismiss() {
                    ActionBarPopupWindow[] actionBarPopupWindowArr = r2;
                    if (actionBarPopupWindowArr[0] != null) {
                        actionBarPopupWindowArr[0].dismiss();
                    }
                }

                @Override
                public void setAutoDeleteHistory(int i2, int i3) {
                    if (ChatAvatarContainer.this.parentFragment != null) {
                        ChatAvatarContainer.this.parentFragment.getMessagesController().setDialogHistoryTTL(ChatAvatarContainer.this.parentFragment.getDialogId(), i2);
                        TLRPC$ChatFull currentChatInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentChatInfo();
                        TLRPC$UserFull currentUserInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentUserInfo();
                        if (currentUserInfo2 != null || currentChatInfo2 != null) {
                            ChatAvatarContainer.this.parentFragment.getUndoView().showWithAction(ChatAvatarContainer.this.parentFragment.getDialogId(), i3, ChatAvatarContainer.this.parentFragment.getCurrentUser(), Integer.valueOf(currentUserInfo2 != null ? currentUserInfo2.ttl_period : currentChatInfo2.ttl_period), (Runnable) null, (Runnable) null);
                        }
                    }
                }
            }, true, this.resourcesProvider);
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
            actionBarPopupWindowArr[0].setAnimationStyle(C0952R.style.PopupContextAnimation);
            actionBarPopupWindowArr[0].setFocusable(true);
            autoDeletePopupWrapper.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE));
            actionBarPopupWindowArr[0].setInputMethodMode(2);
            actionBarPopupWindowArr[0].getContentView().setFocusableInTouchMode(true);
            ActionBarPopupWindow actionBarPopupWindow = actionBarPopupWindowArr[0];
            BackupImageView backupImageView = this.avatarImageView;
            actionBarPopupWindow.showAtLocation(backupImageView, 0, (int) (backupImageView.getX() + getX()), (int) this.avatarImageView.getY());
            this.parentFragment.dimBehindView(true);
            return true;
        }
        if (this.timeItem.getTag() != null) {
            this.parentFragment.showTimerHint();
        }
        return false;
    }

    private void openProfile(boolean r8) {
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
        int size = View.MeasureSpec.getSize(i);
        int dp = size - AndroidUtilities.m34dp((this.avatarImageView.getVisibility() == 0 ? 54 : 0) + 16);
        this.avatarImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
        this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(24.0f), Integer.MIN_VALUE));
        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(20.0f), Integer.MIN_VALUE));
        ImageView imageView = this.timeItem;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(34.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int currentActionBarHeight = ((C1006ActionBar.getCurrentActionBarHeight() - AndroidUtilities.m34dp(42.0f)) / 2) + ((Build.VERSION.SDK_INT < 21 || !this.occupyStatusBar) ? 0 : AndroidUtilities.statusBarHeight);
        BackupImageView backupImageView = this.avatarImageView;
        int i6 = this.leftPadding;
        backupImageView.layout(i6, currentActionBarHeight, AndroidUtilities.m34dp(42.0f) + i6, AndroidUtilities.m34dp(42.0f) + currentActionBarHeight);
        int i7 = this.leftPadding;
        if (this.avatarImageView.getVisibility() == 0) {
            i5 = AndroidUtilities.m34dp(54.0f);
        }
        int i8 = i7 + i5;
        if (this.subtitleTextView.getVisibility() != 8) {
            this.titleTextView.layout(i8, AndroidUtilities.m34dp(1.3f) + currentActionBarHeight, this.titleTextView.getMeasuredWidth() + i8, this.titleTextView.getTextHeight() + currentActionBarHeight + AndroidUtilities.m34dp(1.3f));
        } else {
            this.titleTextView.layout(i8, AndroidUtilities.m34dp(11.0f) + currentActionBarHeight, this.titleTextView.getMeasuredWidth() + i8, this.titleTextView.getTextHeight() + currentActionBarHeight + AndroidUtilities.m34dp(11.0f));
        }
        ImageView imageView = this.timeItem;
        if (imageView != null) {
            imageView.layout(this.leftPadding + AndroidUtilities.m34dp(16.0f), AndroidUtilities.m34dp(15.0f) + currentActionBarHeight, this.leftPadding + AndroidUtilities.m34dp(50.0f), AndroidUtilities.m34dp(49.0f) + currentActionBarHeight);
        }
        this.subtitleTextView.layout(i8, AndroidUtilities.m34dp(24.0f) + currentActionBarHeight, this.subtitleTextView.getMeasuredWidth() + i8, currentActionBarHeight + this.subtitleTextView.getTextHeight() + AndroidUtilities.m34dp(24.0f));
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
        if (imageView != null && imageView.getTag() != null) {
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
    }

    public void setTime(int i, boolean z) {
        if (this.timerDrawable != null) {
            if (i != 0 || this.secretChatTimer) {
                showTimeItem(z);
                this.timerDrawable.setTime(i);
            }
        }
    }

    public void setTitleIcons(Drawable drawable, Drawable drawable2) {
        this.titleTextView.setLeftDrawable(drawable);
        if (!(this.titleTextView.getRightDrawable() instanceof ScamDrawable)) {
            this.titleTextView.setRightDrawable(drawable2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false, false);
    }

    public void setTitle(CharSequence charSequence, boolean z, boolean z2) {
        this.titleTextView.setText(charSequence);
        if (z || z2) {
            if (!(this.titleTextView.getRightDrawable() instanceof ScamDrawable)) {
                ScamDrawable scamDrawable = new ScamDrawable(11, !z ? 1 : 0);
                scamDrawable.setColor(getThemedColor("actionBarDefaultSubtitle"));
                this.titleTextView.setRightDrawable(scamDrawable);
            }
        } else if (this.titleTextView.getRightDrawable() instanceof ScamDrawable) {
            this.titleTextView.setRightDrawable((Drawable) null);
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
                    if (i < statusDrawableArr.length) {
                        if (i == intValue) {
                            statusDrawableArr[i].start();
                        } else {
                            statusDrawableArr[i].stop();
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        } else {
            this.currentTypingDrawable = null;
            this.subtitleTextView.setLeftDrawable((Drawable) null);
            this.subtitleTextView.replaceTextWithDrawable(null, null);
            while (true) {
                StatusDrawable[] statusDrawableArr2 = this.statusDrawables;
                if (i < statusDrawableArr2.length) {
                    statusDrawableArr2[i].stop();
                    i++;
                } else {
                    return;
                }
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
        if (chatActivity != null) {
            TLRPC$User currentUser = chatActivity.getCurrentUser();
            if (!UserObject.isUserSelf(currentUser) && !UserObject.isReplyUser(currentUser) && this.parentFragment.getChatMode() == 0) {
                TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
                boolean z2 = false;
                CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.parentFragment.getDialogId(), this.parentFragment.getThreadId(), false);
                String str = "";
                if (printingString != null) {
                    printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{str});
                }
                boolean[] zArr = null;
                if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(currentChat) || currentChat.megagroup)) {
                    if (this.parentFragment.isThreadChat() && this.titleTextView.getTag() != null) {
                        this.titleTextView.setTag(null);
                        this.subtitleTextView.setVisibility(0);
                        AnimatorSet animatorSet = this.titleAnimation;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.titleAnimation = null;
                        }
                        if (z) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.titleAnimation = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.titleTextView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(this.subtitleTextView, View.ALPHA, 1.0f));
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
                    str = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.parentFragment.getDialogId(), this.parentFragment.getThreadId()).intValue() == 5 ? Emoji.replaceEmoji(printingString, this.subtitleTextView.getTextPaint().getFontMetricsInt(), AndroidUtilities.m34dp(15.0f), false) : printingString;
                    setTypingAnimation(true);
                    z2 = true;
                } else if (!this.parentFragment.isThreadChat()) {
                    setTypingAnimation(false);
                    if (currentChat != null) {
                        TLRPC$ChatFull currentChatInfo = this.parentFragment.getCurrentChatInfo();
                        if (ChatObject.isChannel(currentChat)) {
                            if (currentChatInfo == null || (i = currentChatInfo.participants_count) == 0) {
                                if (currentChat.megagroup) {
                                    if (currentChatInfo == null) {
                                        string = LocaleController.getString("Loading", C0952R.string.Loading).toLowerCase();
                                    } else if (currentChat.has_geo) {
                                        string = LocaleController.getString("MegaLocation", C0952R.string.MegaLocation).toLowerCase();
                                    } else if (!TextUtils.isEmpty(currentChat.username)) {
                                        string = LocaleController.getString("MegaPublic", C0952R.string.MegaPublic).toLowerCase();
                                    } else {
                                        string = LocaleController.getString("MegaPrivate", C0952R.string.MegaPrivate).toLowerCase();
                                    }
                                } else if ((currentChat.flags & 64) != 0) {
                                    string = LocaleController.getString("ChannelPublic", C0952R.string.ChannelPublic).toLowerCase();
                                } else {
                                    string = LocaleController.getString("ChannelPrivate", C0952R.string.ChannelPrivate).toLowerCase();
                                }
                            } else if (currentChat.megagroup) {
                                string = this.onlineCount > 1 ? String.format("%s, %s", LocaleController.formatPluralString("Members", i), LocaleController.formatPluralString("OnlineCount", Math.min(this.onlineCount, currentChatInfo.participants_count))) : LocaleController.formatPluralString("Members", i);
                            } else {
                                int[] iArr = new int[1];
                                String formatShortNumber = LocaleController.formatShortNumber(i, iArr);
                                if (currentChat.megagroup) {
                                    string = LocaleController.formatPluralString("Members", iArr[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                } else {
                                    string = LocaleController.formatPluralString("Subscribers", iArr[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                }
                            }
                        } else if (ChatObject.isKickedFromChat(currentChat)) {
                            string = LocaleController.getString("YouWereKicked", C0952R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(currentChat)) {
                            string = LocaleController.getString("YouLeft", C0952R.string.YouLeft);
                        } else {
                            int i2 = currentChat.participants_count;
                            if (!(currentChatInfo == null || (tLRPC$ChatParticipants = currentChatInfo.participants) == null)) {
                                i2 = tLRPC$ChatParticipants.participants.size();
                            }
                            string = (this.onlineCount <= 1 || i2 == 0) ? LocaleController.formatPluralString("Members", i2) : String.format("%s, %s", LocaleController.formatPluralString("Members", i2), LocaleController.formatPluralString("OnlineCount", this.onlineCount));
                        }
                    } else if (currentUser != null) {
                        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentUser.f985id));
                        if (user != null) {
                            currentUser = user;
                        }
                        if (!UserObject.isReplyUser(currentUser)) {
                            if (currentUser.f985id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                string = LocaleController.getString("ChatYourSelf", C0952R.string.ChatYourSelf);
                            } else {
                                long j = currentUser.f985id;
                                if (j == 333000 || j == 777000 || j == 42777) {
                                    string = LocaleController.getString("ServiceNotifications", C0952R.string.ServiceNotifications);
                                } else if (MessagesController.isSupportUser(currentUser)) {
                                    string = LocaleController.getString("SupportStatus", C0952R.string.SupportStatus);
                                } else if (currentUser.bot) {
                                    string = LocaleController.getString("Bot", C0952R.string.Bot);
                                } else {
                                    boolean[] zArr2 = this.isOnline;
                                    zArr2[0] = false;
                                    int i3 = this.currentAccount;
                                    if (this.allowShorterStatus) {
                                        zArr = this.statusMadeShorter;
                                    }
                                    str = LocaleController.formatUserStatus(i3, currentUser, zArr2, zArr);
                                    z2 = this.isOnline[0];
                                }
                            }
                        }
                    }
                    str = string;
                } else if (this.titleTextView.getTag() == null) {
                    this.titleTextView.setTag(1);
                    AnimatorSet animatorSet3 = this.titleAnimation;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.titleAnimation = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.titleAnimation = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(this.titleTextView, View.TRANSLATION_Y, AndroidUtilities.m34dp(9.7f)), ObjectAnimator.ofFloat(this.subtitleTextView, View.ALPHA, 0.0f));
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
                    this.titleTextView.setTranslationY(AndroidUtilities.m34dp(9.7f));
                    this.subtitleTextView.setAlpha(0.0f);
                    this.subtitleTextView.setVisibility(4);
                    return;
                } else {
                    return;
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
            } else if (this.subtitleTextView.getVisibility() != 8) {
                this.subtitleTextView.setVisibility(8);
            }
        }
    }

    public void setChatAvatar(TLRPC$Chat tLRPC$Chat) {
        this.avatarDrawable.setInfo(tLRPC$Chat);
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        }
    }

    public void setUserAvatar(TLRPC$User tLRPC$User) {
        setUserAvatar(tLRPC$User, false);
    }

    public void setUserAvatar(TLRPC$User tLRPC$User, boolean z) {
        this.avatarDrawable.setInfo(tLRPC$User);
        if (UserObject.isReplyUser(tLRPC$User)) {
            this.avatarDrawable.setAvatarType(12);
            this.avatarDrawable.setSmallSize(true);
            BackupImageView backupImageView = this.avatarImageView;
            if (backupImageView != null) {
                backupImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, tLRPC$User);
            }
        } else if (!UserObject.isUserSelf(tLRPC$User) || z) {
            this.avatarDrawable.setSmallSize(false);
            BackupImageView backupImageView2 = this.avatarImageView;
            if (backupImageView2 != null) {
                backupImageView2.setForUserOrChat(tLRPC$User, this.avatarDrawable);
            }
        } else {
            this.avatarDrawable.setAvatarType(1);
            this.avatarDrawable.setSmallSize(true);
            BackupImageView backupImageView3 = this.avatarImageView;
            if (backupImageView3 != null) {
                backupImageView3.setImage((ImageLocation) null, (String) null, this.avatarDrawable, tLRPC$User);
            }
        }
    }

    public void checkAndUpdateAvatar() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            TLRPC$User currentUser = chatActivity.getCurrentUser();
            TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
            if (currentUser != null) {
                this.avatarDrawable.setInfo(currentUser);
                if (UserObject.isReplyUser(currentUser)) {
                    this.avatarDrawable.setSmallSize(true);
                    this.avatarDrawable.setAvatarType(12);
                    BackupImageView backupImageView = this.avatarImageView;
                    if (backupImageView != null) {
                        backupImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, currentUser);
                    }
                } else if (UserObject.isUserSelf(currentUser)) {
                    this.avatarDrawable.setSmallSize(true);
                    this.avatarDrawable.setAvatarType(1);
                    BackupImageView backupImageView2 = this.avatarImageView;
                    if (backupImageView2 != null) {
                        backupImageView2.setImage((ImageLocation) null, (String) null, this.avatarDrawable, currentUser);
                    }
                } else {
                    this.avatarDrawable.setSmallSize(false);
                    BackupImageView backupImageView3 = this.avatarImageView;
                    if (backupImageView3 != null) {
                        backupImageView3.setForUserOrChat(currentUser, this.avatarDrawable);
                    }
                }
            } else if (currentChat != null) {
                this.avatarDrawable.setInfo(currentChat);
                BackupImageView backupImageView4 = this.avatarImageView;
                if (backupImageView4 != null) {
                    backupImageView4.setForUserOrChat(currentChat, this.avatarDrawable);
                }
            }
        }
    }

    public void updateOnlineCount() {
        TLRPC$UserStatus tLRPC$UserStatus;
        boolean z;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            this.onlineCount = 0;
            TLRPC$ChatFull currentChatInfo = chatActivity.getCurrentChatInfo();
            if (currentChatInfo != null) {
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                if ((currentChatInfo instanceof TLRPC$TL_chatFull) || (((z = currentChatInfo instanceof TLRPC$TL_channelFull)) && currentChatInfo.participants_count <= 200 && currentChatInfo.participants != null)) {
                    for (int i = 0; i < currentChatInfo.participants.participants.size(); i++) {
                        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentChatInfo.participants.participants.get(i).user_id));
                        if (!(user == null || (tLRPC$UserStatus = user.status) == null || ((tLRPC$UserStatus.expires <= currentTime && user.f985id != UserConfig.getInstance(this.currentAccount).getClientUserId()) || user.status.expires <= 10000))) {
                            this.onlineCount++;
                        }
                    }
                } else if (z && currentChatInfo.participants_count > 200) {
                    this.onlineCount = currentChatInfo.online_count;
                }
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
            this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
            updateCurrentConnectionState();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int connectionState;
        if (i == NotificationCenter.didUpdateConnectionState && this.currentConnectionState != (connectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState())) {
            this.currentConnectionState = connectionState;
            updateCurrentConnectionState();
        }
    }

    private void updateCurrentConnectionState() {
        String str;
        int i = this.currentConnectionState;
        if (i == 2) {
            str = LocaleController.getString("WaitingForNetwork", C0952R.string.WaitingForNetwork);
        } else if (i == 1) {
            str = LocaleController.getString("Connecting", C0952R.string.Connecting);
        } else if (i == 5) {
            str = LocaleController.getString("Updating", C0952R.string.Updating);
        } else {
            str = i == 4 ? LocaleController.getString("ConnectingToProxy", C0952R.string.ConnectingToProxy) : null;
        }
        if (str == null) {
            CharSequence charSequence = this.lastSubtitle;
            if (charSequence != null) {
                this.subtitleTextView.setText(charSequence);
                this.lastSubtitle = null;
                Integer num = this.overrideSubtitleColor;
                if (num != null) {
                    this.subtitleTextView.setTextColor(num.intValue());
                    return;
                }
                String str2 = this.lastSubtitleColorKey;
                if (str2 != null) {
                    this.subtitleTextView.setTextColor(getThemedColor(str2));
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
        this.subtitleTextView.setText(str);
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
        if (accessibilityNodeInfo.isClickable() && Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("OpenProfile", C0952R.string.OpenProfile)));
        }
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
