package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.CommunityArrowDrawable;

public class ChatAvatarContainer extends FrameLayout implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate {
    private static final int ANIMATOR_ID_TIME_ITEM_VISIBLE = 0;
    private ActionBar actionBar;
    public boolean allowDrawStories;
    public boolean allowShorterStatus;
    private AnimatedTextView animatedSubtitleTextView;
    private final BoolAnimator animatorTimeVisible;
    private AvatarDrawable avatarDrawable;
    private boolean avatarImageIsHidden;
    public BackupImageView avatarImageView;
    private int avatarSizeInDp;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationDrawable;
    public ButtonBounce bounce;
    private ImageView communityItem;
    private int currentAccount;
    private int currentConnectionState;
    StatusDrawable currentTypingDrawable;
    private Drawable emojiStatusDefaultDrawable;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatusDrawable;
    private boolean glassMode;
    public boolean ignoreTouches;
    private boolean[] isOnline;
    private int largerWidth;
    private CharSequence lastSubtitle;
    private int lastSubtitleColorKey;
    private int lastWidth;
    private int leftPadding;
    private boolean occupyStatusBar;
    private Runnable onLongClick;
    private int onlineCount;
    private Integer overrideSubtitleColor;
    private ChatActivity parentFragment;
    public boolean premiumIconHiddable;
    private boolean pressed;
    private Theme.ResourcesProvider resourcesProvider;
    private int rightAvatarPadding;
    private String rightDrawable2ContentDescription;
    private String rightDrawableContentDescription;
    private boolean rightDrawableIsScam;
    private boolean rightDrawableIsScamOrVerified;
    private boolean secretChatTimer;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private boolean showingSavedMessagesHint;
    private ImageView starBgItem;
    private ImageView starFgItem;
    public boolean stars;
    private StatusDrawable[] statusDrawables;
    public boolean[] statusMadeShorter;
    private Integer storiesForceState;
    private boolean subtitleIsThinkingBot;
    private AtomicReference<SimpleTextView> subtitleTextLargerCopyView;
    private SimpleTextView subtitleTextView;
    private ImageView timeItem;
    private TimerDrawable timerDrawable;
    private AnimatorSet titleAnimation;
    private AtomicReference<SimpleTextView> titleTextLargerCopyView;
    private SimpleTextView titleTextView;
    private Drawable verifiedBackground;
    private Drawable verifiedCheck;

    public class AnonymousClass1 extends BackupImageView {
        StoriesUtilities.AvatarStoryParams params;
        final boolean val$avatarClickable;
        final BaseFragment val$baseFragment;
        final Theme.ResourcesProvider val$resourcesProvider;

        public class C00161 extends StoriesUtilities.AvatarStoryParams {
            public C00161(boolean z) {
                super(z, null);
            }

            public boolean lambda$openStory$0(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                ImageReceiver imageReceiver = anonymousClass1.imageReceiver;
                transitionViewHolder.storyImage = imageReceiver;
                transitionViewHolder.crossfadeToAvatarImage = imageReceiver;
                StoriesUtilities.AvatarStoryParams avatarStoryParams = anonymousClass1.params;
                transitionViewHolder.params = avatarStoryParams;
                boolean z = avatarStoryParams.drawnLive;
                BackupImageView backupImageView = ChatAvatarContainer.this.avatarImageView;
                transitionViewHolder.view = backupImageView;
                transitionViewHolder.alpha = backupImageView.getAlpha();
                transitionViewHolder.clipTop = 0.0f;
                transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
                transitionViewHolder.clipParent = (View) AnonymousClass1.this.getParent();
                return true;
            }

            @Override
            public void openStory(long j, Runnable runnable) {
                AnonymousClass1.this.val$baseFragment.getOrCreateStoryViewer().open(AnonymousClass1.this.getContext(), j, new EmojiView$$ExternalSyntheticLambda21(this, 6));
            }
        }

        public AnonymousClass1(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$baseFragment = baseFragment;
            this.val$avatarClickable = z;
            this.val$resourcesProvider = resourcesProvider;
            this.params = new C00161(true);
        }

        @Override
        public void onDraw(Canvas canvas) {
            long dialogId;
            if (!ChatAvatarContainer.this.allowDrawStories || this.animatedEmojiDrawable != null) {
                super.onDraw(canvas);
                return;
            }
            this.params.originalAvatarRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            avatarStoryParams.drawSegments = true;
            avatarStoryParams.drawInside = true;
            avatarStoryParams.resourcesProvider = this.val$resourcesProvider;
            if (ChatAvatarContainer.this.storiesForceState != null) {
                this.params.forceState = ChatAvatarContainer.this.storiesForceState.intValue();
            }
            if (ChatAvatarContainer.this.parentFragment != null) {
                dialogId = ChatAvatarContainer.this.parentFragment.getDialogId();
            } else {
                BaseFragment baseFragment = this.val$baseFragment;
                dialogId = baseFragment instanceof TopicsFragment ? ((TopicsFragment) baseFragment).getDialogId() : 0L;
            }
            StoriesUtilities.drawAvatarWithStory(dialogId, canvas, this.imageReceiver, this.params);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (!this.val$avatarClickable || !getImageReceiver().hasNotThumb()) {
                accessibilityNodeInfo.setVisibleToUser(false);
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAvatarContainer.this.allowDrawStories && this.params.checkOnTouchEvent(motionEvent, this)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class SimpleTextConnectedView extends SimpleTextView {
        private AtomicReference<SimpleTextView> reference;

        public SimpleTextConnectedView(Context context, AtomicReference<SimpleTextView> atomicReference) {
            super(context);
            this.reference = atomicReference;
        }

        @Override
        public boolean setText(CharSequence charSequence) {
            SimpleTextView simpleTextView;
            AtomicReference<SimpleTextView> atomicReference = this.reference;
            if (atomicReference != null && (simpleTextView = atomicReference.get()) != null) {
                simpleTextView.setText(charSequence);
            }
            return super.setText(charSequence);
        }

        @Override
        public void setTranslationY(float f) {
            SimpleTextView simpleTextView;
            AtomicReference<SimpleTextView> atomicReference = this.reference;
            if (atomicReference != null && (simpleTextView = atomicReference.get()) != null) {
                simpleTextView.setTranslationY(f);
            }
            super.setTranslationY(f);
        }
    }

    public ChatAvatarContainer(Context context, BaseFragment baseFragment, boolean z) {
        this(context, baseFragment, z, null);
    }

    private void checkActionBar(boolean z) {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.checkAvatarContainerWidth(z);
        }
    }

    private void fadeOutToLessWidth(int i) {
        this.largerWidth = i;
        View view = (SimpleTextView) this.titleTextLargerCopyView.get();
        if (view != null) {
            removeView(view);
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.titleTextLargerCopyView.set(simpleTextView);
        simpleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        simpleTextView.setTextSizePx(AndroidUtilities.dp(this.glassMode ? 17.5f : 18.0f));
        simpleTextView.setGravity(3);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        simpleTextView.setRightDrawable(this.titleTextView.getRightDrawable());
        simpleTextView.setRightDrawable2(this.titleTextView.getRightDrawable2());
        simpleTextView.setRightDrawableOutside(this.titleTextView.getRightDrawableOutside());
        simpleTextView.setLeftDrawable(this.titleTextView.getLeftDrawable());
        simpleTextView.setText(this.titleTextView.getText());
        ViewPropertyAnimator duration = simpleTextView.animate().alpha(0.0f).setDuration(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        duration.setInterpolator(cubicBezierInterpolator).withEndAction(new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 0)).start();
        addView(simpleTextView);
        View view2 = (SimpleTextView) this.subtitleTextLargerCopyView.get();
        if (view2 != null) {
            removeView(view2);
        }
        SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
        this.subtitleTextLargerCopyView.set(simpleTextView2);
        int i2 = Theme.key_actionBarDefaultSubtitle;
        simpleTextView2.setTextColor(getThemedColor(i2));
        simpleTextView2.setTag(Integer.valueOf(i2));
        simpleTextView2.setTextSizePx(AndroidUtilities.dp(this.glassMode ? 13.5f : 14.0f));
        simpleTextView2.setGravity(3);
        SimpleTextView simpleTextView3 = this.subtitleTextView;
        if (simpleTextView3 != null) {
            simpleTextView2.setText(simpleTextView3.getText());
        } else {
            AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
            if (animatedTextView != null) {
                simpleTextView2.setText(animatedTextView.getText());
            }
        }
        simpleTextView2.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).withEndAction(new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 1)).start();
        addView(simpleTextView2);
        setClipChildren(false);
    }

    public static CharSequence getChatSubtitle(TLRPC.Chat chat, TLRPC.ChatFull chatFull, int i) {
        TLRPC.ChatParticipants chatParticipants;
        int i2;
        String shortNumber;
        if (!ChatObject.isChannel(chat)) {
            if (ChatObject.isKickedFromChat(chat)) {
                return LocaleController.getString(R.string.YouWereKicked);
            }
            if (ChatObject.isLeftFromChat(chat)) {
                return LocaleController.getString(R.string.YouLeft);
            }
            int size = chat.participants_count;
            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                size = chatParticipants.participants.size();
            }
            return (i <= 1 || size == 0) ? LocaleController.formatPluralString("Members", size, new Object[0]) : zzjx.m(LocaleController.formatPluralString("Members", size, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i, new Object[0]));
        }
        if (chatFull == null || (i2 = chatFull.participants_count) == 0) {
            if (!chat.megagroup) {
                return ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            }
            if (chatFull == null) {
                return LocaleController.getString(R.string.Loading).toLowerCase();
            }
            if (chat.has_geo) {
                return LocaleController.getString(R.string.MegaLocation).toLowerCase();
            }
            return ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        }
        if (chat.megagroup) {
            return i > 1 ? zzjx.m(LocaleController.formatPluralString("Members", i2, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i2, new Object[0]);
        }
        int[] iArr = new int[1];
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            int i3 = chatFull.participants_count;
            iArr[0] = i3;
            shortNumber = String.valueOf(i3);
        } else {
            shortNumber = LocaleController.formatShortNumber(chatFull.participants_count, iArr);
        }
        return chat.megagroup ? LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber) : LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$fadeOutToLessWidth$4() {
        SimpleTextView simpleTextView = this.titleTextLargerCopyView.get();
        if (simpleTextView != null) {
            removeView(simpleTextView);
            this.titleTextLargerCopyView.set(null);
        }
    }

    public void lambda$fadeOutToLessWidth$5() {
        SimpleTextView simpleTextView = this.subtitleTextLargerCopyView.get();
        if (simpleTextView != null) {
            removeView(simpleTextView);
            this.subtitleTextLargerCopyView.set(null);
            if (this.allowDrawStories) {
                return;
            }
            setClipChildren(true);
        }
    }

    public void lambda$new$0(View view) {
        if (onAvatarClick()) {
            return;
        }
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

    public void lambda$new$3() {
        this.pressed = false;
        this.bounce.setPressed(false);
        if (canSearch()) {
            openSearch();
        }
    }

    public void lambda$setStars$6(boolean z) {
        if (z) {
            return;
        }
        this.starBgItem.setVisibility(4);
    }

    public void lambda$setStars$7(boolean z) {
        if (z) {
            return;
        }
        this.starFgItem.setVisibility(4);
    }

    private void setTypingAnimation(boolean z) {
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (simpleTextView == null) {
            return;
        }
        int i = 0;
        if (z) {
            try {
                int iIntValue = this.subtitleIsThinkingBot ? 0 : MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.parentFragment.getDialogId(), this.parentFragment.getThreadId()).intValue();
                StatusDrawable statusDrawable = this.statusDrawables[iIntValue];
                if (statusDrawable == null) {
                    return;
                }
                if (iIntValue == 5) {
                    this.subtitleTextView.replaceTextWithDrawable(statusDrawable, "**oo**");
                    this.statusDrawables[iIntValue].setColor(getThemedColor(Theme.key_chat_status));
                    this.subtitleTextView.setLeftDrawable((Drawable) null);
                } else {
                    this.subtitleTextView.replaceTextWithDrawable(null, null);
                    this.statusDrawables[iIntValue].setColor(getThemedColor(Theme.key_chat_status));
                    this.subtitleTextView.setLeftDrawable(this.statusDrawables[iIntValue]);
                }
                this.currentTypingDrawable = this.statusDrawables[iIntValue];
                while (true) {
                    StatusDrawable[] statusDrawableArr = this.statusDrawables;
                    if (i >= statusDrawableArr.length) {
                        return;
                    }
                    StatusDrawable statusDrawable2 = statusDrawableArr[i];
                    if (statusDrawable2 != null) {
                        if (i == iIntValue) {
                            statusDrawable2.start();
                        } else {
                            statusDrawable2.stop();
                        }
                    }
                    i++;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            this.currentTypingDrawable = null;
            simpleTextView.setLeftDrawable((Drawable) null);
            this.subtitleTextView.replaceTextWithDrawable(null, null);
            while (true) {
                StatusDrawable[] statusDrawableArr2 = this.statusDrawables;
                if (i >= statusDrawableArr2.length) {
                    return;
                }
                StatusDrawable statusDrawable3 = statusDrawableArr2[i];
                if (statusDrawable3 != null) {
                    statusDrawable3.stop();
                }
                i++;
            }
        }
    }

    private void updateCurrentConnectionState() {
        String string;
        int i = this.currentConnectionState;
        if (i == 2) {
            string = LocaleController.getString(R.string.WaitingForNetwork);
        } else if (i == 1) {
            string = LocaleController.getString(R.string.Connecting);
        } else if (i == 5) {
            string = LocaleController.getString(R.string.Updating);
        } else {
            string = i == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        }
        if (string == null) {
            CharSequence charSequence = this.lastSubtitle;
            if (charSequence != null) {
                SimpleTextView simpleTextView = this.subtitleTextView;
                if (simpleTextView != null) {
                    simpleTextView.setText(charSequence);
                    this.lastSubtitle = null;
                    Integer num = this.overrideSubtitleColor;
                    if (num != null) {
                        this.subtitleTextView.setTextColor(num.intValue());
                    } else {
                        int i2 = this.lastSubtitleColorKey;
                        if (i2 >= 0) {
                            this.subtitleTextView.setTextColor(getThemedColor(i2));
                            this.subtitleTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                        }
                    }
                } else {
                    AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
                    if (animatedTextView != null) {
                        animatedTextView.setText(charSequence, !LocaleController.isRTL);
                        this.lastSubtitle = null;
                        Integer num2 = this.overrideSubtitleColor;
                        if (num2 != null) {
                            this.animatedSubtitleTextView.setTextColor(num2.intValue());
                        } else {
                            int i3 = this.lastSubtitleColorKey;
                            if (i3 >= 0) {
                                this.animatedSubtitleTextView.setTextColor(getThemedColor(i3));
                                this.animatedSubtitleTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                            }
                        }
                    }
                }
            }
        } else {
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            if (simpleTextView2 != null) {
                if (this.lastSubtitle == null) {
                    this.lastSubtitle = simpleTextView2.getText();
                }
                this.subtitleTextView.setText(string);
                Integer num3 = this.overrideSubtitleColor;
                if (num3 != null) {
                    this.subtitleTextView.setTextColor(num3.intValue());
                } else {
                    SimpleTextView simpleTextView3 = this.subtitleTextView;
                    int i4 = Theme.key_actionBarDefaultSubtitle;
                    simpleTextView3.setTextColor(getThemedColor(i4));
                    this.subtitleTextView.setTag(Integer.valueOf(i4));
                }
            } else {
                AnimatedTextView animatedTextView2 = this.animatedSubtitleTextView;
                if (animatedTextView2 != null) {
                    if (this.lastSubtitle == null) {
                        this.lastSubtitle = animatedTextView2.getText();
                    }
                    this.animatedSubtitleTextView.setText(string, !LocaleController.isRTL);
                    Integer num4 = this.overrideSubtitleColor;
                    if (num4 != null) {
                        this.animatedSubtitleTextView.setTextColor(num4.intValue());
                    } else {
                        AnimatedTextView animatedTextView3 = this.animatedSubtitleTextView;
                        int i5 = Theme.key_actionBarDefaultSubtitle;
                        animatedTextView3.setTextColor(getThemedColor(i5));
                        this.animatedSubtitleTextView.setTag(Integer.valueOf(i5));
                    }
                }
            }
        }
        checkActionBar(true);
    }

    public boolean canSearch() {
        return false;
    }

    public void checkAndUpdateAvatar() {
        TLRPC.User user;
        int iDp;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        TLRPC.User currentUser = chatActivity.getCurrentUser();
        TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
        if (this.parentFragment.getChatMode() == 3) {
            long savedDialogId = this.parentFragment.getSavedDialogId();
            if (savedDialogId >= 0) {
                user = this.parentFragment.getMessagesController().getUser(Long.valueOf(savedDialogId));
                currentChat = null;
            } else {
                currentChat = this.parentFragment.getMessagesController().getChat(Long.valueOf(-savedDialogId));
                user = null;
            }
        } else {
            user = currentUser;
        }
        if (user == null) {
            if (!ChatObject.isMonoForum(currentChat)) {
                if (currentChat != null) {
                    this.avatarDrawable.setScaleSize(1.0f);
                    this.avatarDrawable.setInfo(this.currentAccount, currentChat);
                    BackupImageView backupImageView = this.avatarImageView;
                    if (backupImageView != null) {
                        backupImageView.setAnimatedEmojiDrawable(null);
                        this.avatarImageView.setForUserOrChat(currentChat, this.avatarDrawable);
                        BackupImageView backupImageView2 = this.avatarImageView;
                        if (currentChat.forum) {
                            iDp = AndroidUtilities.dp(ChatObject.hasStories(currentChat) ? 11.0f : 16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(21.0f);
                        }
                        backupImageView2.setRoundRadius(iDp);
                        return;
                    }
                    return;
                }
                return;
            }
            long topicId = this.parentFragment.getTopicId();
            if (!ChatObject.canManageMonoForum(this.currentAccount, currentChat) || topicId == 0) {
                this.avatarImageView.setAnimatedEmojiDrawable(null);
                int i = this.currentAccount;
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                BackupImageView backupImageView3 = this.avatarImageView;
                int i2 = ForumUtilities.$r8$clinit;
                TLRPC.Chat chat = ChatObject.isMonoForum(currentChat) ? MessagesController.getInstance(i).getChat(Long.valueOf(currentChat.linked_monoforum_id)) : null;
                if (chat != null) {
                    currentChat = chat;
                }
                avatarDrawable.setInfo(i, currentChat);
                backupImageView3.setForUserOrChat(chat, avatarDrawable);
            } else if (topicId > 0) {
                TLRPC.User user2 = this.parentFragment.getMessagesController().getUser(Long.valueOf(topicId));
                this.avatarDrawable.setInfo(user2);
                this.avatarImageView.setAnimatedEmojiDrawable(null);
                this.avatarImageView.setForUserOrChat(user2, this.avatarDrawable);
            } else {
                TLRPC.Chat chat2 = this.parentFragment.getMessagesController().getChat(Long.valueOf(-topicId));
                this.avatarDrawable.setInfo(chat2);
                this.avatarImageView.setAnimatedEmojiDrawable(null);
                this.avatarImageView.setForUserOrChat(chat2, this.avatarDrawable);
            }
            this.avatarImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        this.avatarDrawable.setInfo(this.currentAccount, user);
        if (UserObject.isReplyUser(user)) {
            this.avatarDrawable.setScaleSize(0.8f);
            this.avatarDrawable.setAvatarType(12);
            BackupImageView backupImageView4 = this.avatarImageView;
            if (backupImageView4 != null) {
                backupImageView4.setAnimatedEmojiDrawable(null);
                this.avatarImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            this.avatarDrawable.setScaleSize(0.8f);
            this.avatarDrawable.setAvatarType(21);
            BackupImageView backupImageView5 = this.avatarImageView;
            if (backupImageView5 != null) {
                backupImageView5.setAnimatedEmojiDrawable(null);
                this.avatarImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && this.parentFragment.getChatMode() == 3) {
            this.avatarDrawable.setScaleSize(0.8f);
            this.avatarDrawable.setAvatarType(22);
            BackupImageView backupImageView6 = this.avatarImageView;
            if (backupImageView6 != null) {
                backupImageView6.setAnimatedEmojiDrawable(null);
                this.avatarImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            this.avatarDrawable.setScaleSize(1.0f);
            BackupImageView backupImageView7 = this.avatarImageView;
            if (backupImageView7 != null) {
                backupImageView7.setAnimatedEmojiDrawable(null);
                this.avatarImageView.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 3, false);
                return;
            }
            return;
        }
        this.avatarDrawable.setScaleSize(0.8f);
        this.avatarDrawable.setAvatarType(1);
        BackupImageView backupImageView8 = this.avatarImageView;
        if (backupImageView8 != null) {
            backupImageView8.setAnimatedEmojiDrawable(null);
            this.avatarImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
            if (this.currentConnectionState != connectionState) {
                this.currentConnectionState = connectionState;
                updateCurrentConnectionState();
                return;
            }
            return;
        }
        if (i != NotificationCenter.emojiLoaded) {
            if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                updateSubtitle(true);
            }
        } else {
            SimpleTextView simpleTextView = this.titleTextView;
            if (simpleTextView != null) {
                simpleTextView.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float scale = this.bounce.getScale(0.02f);
        canvas.scale(scale, scale, getPivotX(), getHeight() - (ActionBar.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ignoreTouches) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.avatarImageView) {
            ImageView imageView = this.timeItem;
            boolean z = false;
            boolean z2 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.communityItem;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z = true;
            }
            if (z2 || z) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (z2) {
                    canvas.drawCircle((this.timeItem.getWidth() / 2.0f) + this.timeItem.getX(), ((this.timeItem.getHeight() / 2.0f) + this.timeItem.getY()) - AndroidUtilities.dpf2(0.33f), this.timeItem.getScaleX() * AndroidUtilities.dpf2(12.0f), Theme.PAINT_CLEAR);
                }
                if (z) {
                    canvas.drawCircle((this.communityItem.getWidth() / 2.0f) + this.communityItem.getX(), (this.communityItem.getHeight() / 2.0f) + this.communityItem.getY(), this.communityItem.getScaleX() * AndroidUtilities.dpf2(7.66f), Theme.PAINT_CLEAR);
                }
                canvas.restore();
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable getBotVerificationDrawable(long j, boolean z) {
        if (j == 0) {
            return null;
        }
        this.botVerificationDrawable.set(j, z);
        this.botVerificationDrawable.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
        this.botVerificationDrawable.offset(0, AndroidUtilities.dp(1.0f));
        return this.botVerificationDrawable;
    }

    public int getLastSubtitleColorKey() {
        return this.lastSubtitleColorKey;
    }

    public int getLeftPadding() {
        return this.leftPadding;
    }

    public SharedMediaLayout.SharedMediaPreloader getSharedMediaPreloader() {
        return this.sharedMediaPreloader;
    }

    public TextPaint getSubtitlePaint() {
        SimpleTextView simpleTextView = this.subtitleTextView;
        return simpleTextView != null ? simpleTextView.getTextPaint() : this.animatedSubtitleTextView.getPaint();
    }

    public View getSubtitleTextView() {
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (simpleTextView != null) {
            return simpleTextView;
        }
        AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
        if (animatedTextView != null) {
            return animatedTextView;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.timeItem;
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView;
    }

    public int getVisualWidth() {
        SimpleTextView simpleTextView = this.titleTextView;
        float fMax = simpleTextView != null ? Math.max(0.0f, simpleTextView.getExactWidthIncludeDrawables()) : 0.0f;
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        if (simpleTextView2 != null) {
            fMax = Math.max(fMax, simpleTextView2.getExactWidthIncludeDrawables());
        }
        return (int) (fMax + (hasVisibleAvatar() ? AndroidUtilities.dp(70.0f) : AndroidUtilities.dp(34.0f)));
    }

    public boolean hasVisibleAvatar() {
        BackupImageView backupImageView = this.avatarImageView;
        return backupImageView != null && backupImageView.getVisibility() == 0;
    }

    public void hideSubtitle() {
        if (getSubtitleTextView() != null) {
            getSubtitleTextView().setVisibility(8);
        }
    }

    public void hideTimeItem(boolean z) {
        this.animatorTimeVisible.setValue(false, z);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (this.parentFragment.getChatMode() == 3) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
            updateCurrentConnectionState();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerificationDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.attach();
        }
    }

    public boolean onAvatarClick() {
        return false;
    }

    public void onDestroy() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (sharedMediaPreloader != null) {
            sharedMediaPreloader.onDestroy(this.parentFragment);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.parentFragment != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (this.parentFragment.getChatMode() == 3) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerificationDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.detach();
        }
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ImageView imageView;
        if (i != 0 || (imageView = this.timeItem) == null) {
            return;
        }
        imageView.setAlpha(f);
        float f3 = 0.85f * f;
        this.timeItem.setScaleX(f3);
        this.timeItem.setScaleY(f3);
        this.timeItem.setVisibility(f > 0.0f ? 0 : 8);
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
        if (this.rightDrawable2ContentDescription != null) {
            sb.append(", ");
            sb.append(this.rightDrawable2ContentDescription);
        }
        sb.append("\n");
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (simpleTextView != null) {
            sb.append(simpleTextView.getText());
        } else {
            AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
            if (animatedTextView != null) {
                sb.append(animatedTextView.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int currentActionBarHeight = (((ActionBar.getCurrentActionBarHeight() - this.avatarImageView.getMeasuredHeight()) - 2) / 2) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0);
        int iDp = AndroidUtilities.dp(this.glassMode ? 23.66f : 24.0f) + currentActionBarHeight;
        BackupImageView backupImageView = this.avatarImageView;
        int i5 = this.leftPadding + 1;
        int i6 = currentActionBarHeight + 1;
        backupImageView.layout(i5, i6, backupImageView.getMeasuredWidth() + i5, this.avatarImageView.getMeasuredHeight() + i6);
        int i7 = this.leftPadding;
        if (this.avatarImageView.getVisibility() == 0) {
            f = this.glassMode ? 49.66f : 55.0f;
        } else {
            f = this.glassMode ? 13.0f : 1.0f;
        }
        int iDp2 = i7 + AndroidUtilities.dp(f) + this.rightAvatarPadding;
        SimpleTextView simpleTextView = this.titleTextLargerCopyView.get();
        if (getSubtitleTextView().getVisibility() != 8) {
            this.titleTextView.layout(iDp2, (AndroidUtilities.dp(1.66f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + iDp2, this.titleTextView.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (this.titleTextView.getTextHeight() + currentActionBarHeight)) - this.titleTextView.getPaddingTop()));
            if (simpleTextView != null) {
                simpleTextView.layout(iDp2, AndroidUtilities.dp(1.66f) + currentActionBarHeight, simpleTextView.getMeasuredWidth() + iDp2, AndroidUtilities.dp(1.66f) + simpleTextView.getTextHeight() + currentActionBarHeight);
            }
        } else {
            this.titleTextView.layout(iDp2, (AndroidUtilities.dp(11.0f) + currentActionBarHeight) - this.titleTextView.getPaddingTop(), this.titleTextView.getMeasuredWidth() + iDp2, this.titleTextView.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (this.titleTextView.getTextHeight() + currentActionBarHeight)) - this.titleTextView.getPaddingTop()));
            if (simpleTextView != null) {
                simpleTextView.layout(iDp2, AndroidUtilities.dp(10.0f) + currentActionBarHeight, simpleTextView.getMeasuredWidth() + iDp2, AndroidUtilities.dp(10.0f) + simpleTextView.getTextHeight() + currentActionBarHeight);
            }
        }
        ImageView imageView = this.communityItem;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.leftPadding, AndroidUtilities.dp(27.33f) + currentActionBarHeight, this.communityItem.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.leftPadding, this.communityItem.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + currentActionBarHeight);
        }
        ImageView imageView2 = this.timeItem;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.leftPadding, currentActionBarHeight - AndroidUtilities.dp(8.0f), this.timeItem.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.leftPadding, this.timeItem.getMeasuredHeight() + (currentActionBarHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.starBgItem;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.leftPadding, AndroidUtilities.dp(24.0f) + currentActionBarHeight, this.starBgItem.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.leftPadding, this.starBgItem.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + currentActionBarHeight);
        }
        ImageView imageView4 = this.starFgItem;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.leftPadding, AndroidUtilities.dp(24.0f) + currentActionBarHeight, this.starFgItem.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.leftPadding, this.starFgItem.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + currentActionBarHeight);
        }
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        if (simpleTextView2 != null) {
            simpleTextView2.layout(iDp2, iDp, simpleTextView2.getMeasuredWidth() + iDp2, this.subtitleTextView.getTextHeight() + iDp);
        } else {
            AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
            if (animatedTextView != null) {
                animatedTextView.layout(iDp2, iDp, animatedTextView.getMeasuredWidth() + iDp2, this.animatedSubtitleTextView.getTextHeight() + iDp);
            }
        }
        SimpleTextView simpleTextView3 = this.subtitleTextLargerCopyView.get();
        if (simpleTextView3 != null) {
            simpleTextView3.layout(iDp2, iDp, simpleTextView3.getMeasuredWidth() + iDp2, simpleTextView3.getTextHeight() + iDp);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = size - AndroidUtilities.dp((this.avatarImageView.getVisibility() == 0 ? 54 : 0) + 16);
        this.avatarImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.avatarSizeInDp) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.avatarSizeInDp) - 2, 1073741824));
        this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (simpleTextView != null) {
            simpleTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else {
            AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
            if (animatedTextView != null) {
                animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
            }
        }
        ImageView imageView = this.communityItem;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.timeItem;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.starBgItem;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.starFgItem;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i3 = this.lastWidth;
        if (i3 != -1 && i3 != size && i3 > size) {
            fadeOutToLessWidth(i3);
        }
        SimpleTextView simpleTextView2 = this.titleTextLargerCopyView.get();
        if (simpleTextView2 != null) {
            simpleTextView2.measure(OKLCH.m((this.avatarImageView.getVisibility() == 0 ? 54 : 0) + 16, this.largerWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.lastWidth = size;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && canSearch()) {
            this.pressed = true;
            this.bounce.setPressed(true);
            AndroidUtilities.cancelRunOnUIThread(this.onLongClick);
            AndroidUtilities.runOnUIThread(this.onLongClick, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.pressed) {
            this.bounce.setPressed(false);
            this.pressed = false;
            if (isClickable()) {
                openProfile(false);
            }
            AndroidUtilities.cancelRunOnUIThread(this.onLongClick);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void openProfile(boolean z) {
        openProfile(z, true, false);
    }

    public void openSearch() {
    }

    public boolean openSetTimer() {
        int i;
        if (this.parentFragment.getParentActivity() == null) {
            return false;
        }
        TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
        if (currentChat != null && !ChatObject.canUserDoAdminAction(currentChat, 13)) {
            if (this.animatorTimeVisible.value) {
                this.parentFragment.showTimerHint();
            }
            return false;
        }
        TLRPC.ChatFull currentChatInfo = this.parentFragment.getCurrentChatInfo();
        TLRPC.UserFull currentUserInfo = this.parentFragment.getCurrentUserInfo();
        if (currentUserInfo != null) {
            i = currentUserInfo.ttl_period;
        } else {
            i = currentChatInfo != null ? currentChatInfo.ttl_period : 0;
        }
        AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(getContext(), null, new AutoDeletePopupWrapper.Callback() {
            @Override
            public void dismiss() {
                ActionBarPopupWindow actionBarPopupWindow = actionBarPopupWindowArr[0];
                if (actionBarPopupWindow != null) {
                    actionBarPopupWindow.dismiss();
                }
            }

            @Override
            public void setAutoDeleteHistory(int i2, int i3) {
                UndoView undoView;
                if (ChatAvatarContainer.this.parentFragment == null) {
                    return;
                }
                ChatAvatarContainer.this.parentFragment.getMessagesController().setDialogHistoryTTL(ChatAvatarContainer.this.parentFragment.getDialogId(), i2);
                TLRPC.ChatFull currentChatInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentChatInfo();
                TLRPC.UserFull currentUserInfo2 = ChatAvatarContainer.this.parentFragment.getCurrentUserInfo();
                if ((currentUserInfo2 == null && currentChatInfo2 == null) || (undoView = ChatAvatarContainer.this.parentFragment.getUndoView()) == null) {
                    return;
                }
                undoView.showWithAction(ChatAvatarContainer.this.parentFragment.getDialogId(), i3, ChatAvatarContainer.this.parentFragment.getCurrentUser(), Integer.valueOf(currentUserInfo2 != null ? currentUserInfo2.ttl_period : currentChatInfo2.ttl_period), (Runnable) null, (Runnable) null);
            }

            @Override
            public final void showGlobalAutoDeleteScreen() {
                AutoDeletePopupWrapper.Callback.CC.$default$showGlobalAutoDeleteScreen(this);
            }
        }, true, 0, this.resourcesProvider);
        autoDeletePopupWrapper.lambda$updateItems$7(i);
        int i2 = -2;
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(autoDeletePopupWrapper.windowLayout, i2, i2) {
            @Override
            public void dismiss() {
                dismiss(true);
                if (ChatAvatarContainer.this.parentFragment != null) {
                    ChatAvatarContainer.this.parentFragment.dimBehindView(false);
                }
            }
        };
        final ActionBarPopupWindow[] actionBarPopupWindowArr = {actionBarPopupWindow};
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindowArr[0].setDismissAnimationDuration(220);
        actionBarPopupWindowArr[0].setOutsideTouchable(true);
        actionBarPopupWindowArr[0].setClippingEnabled(true);
        actionBarPopupWindowArr[0].setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindowArr[0].setFocusable(true);
        autoDeletePopupWrapper.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindowArr[0].setInputMethodMode(2);
        actionBarPopupWindowArr[0].getContentView().setFocusableInTouchMode(true);
        ActionBarPopupWindow actionBarPopupWindow2 = actionBarPopupWindowArr[0];
        BackupImageView backupImageView = this.avatarImageView;
        actionBarPopupWindow2.showAtLocation(backupImageView, 0, (int) (getX() + backupImageView.getX()), (int) this.avatarImageView.getY());
        this.parentFragment.dimBehindView(true);
        return true;
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f;
        this.avatarDrawable.setInfo(this.currentAccount, chat);
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setForUserOrChat(chat, this.avatarDrawable);
            BackupImageView backupImageView2 = this.avatarImageView;
            if (ChatObject.isForum(chat)) {
                f = ChatObject.hasStories(chat) ? 11.0f : 16.0f;
            } else {
                f = 21.0f;
            }
            backupImageView2.setRoundRadius(AndroidUtilities.dp(f));
        }
    }

    public void setCommunityItemVisible(boolean z) {
        ImageView imageView = this.communityItem;
        if (imageView != null) {
            imageView.setVisibility((!z || this.avatarImageIsHidden) ? 8 : 0);
        }
    }

    public void setGlassMode() {
        SimpleTextView simpleTextView = this.titleTextView;
        if (simpleTextView != null) {
            simpleTextView.setTextSizePx(AndroidUtilities.dp(17.5f));
        }
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        if (simpleTextView2 != null) {
            simpleTextView2.setTextSizePx(AndroidUtilities.dp(13.5f));
        }
        this.glassMode = true;
    }

    public void setLeftPadding(int i) {
        this.leftPadding = i;
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.overrideSubtitleColor = num;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.bounce.setPressed(z);
    }

    public void setRightAvatarPadding(int i) {
        this.rightAvatarPadding = i;
    }

    public void setStars(final boolean z, boolean z2) {
        ImageView imageView = this.starBgItem;
        if (imageView == null || this.starFgItem == null) {
            return;
        }
        this.stars = z;
        if (z2) {
            if (z) {
                imageView.setVisibility(0);
                this.starFgItem.setVisibility(0);
            }
            final int i = 0;
            this.starBgItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.1f : 0.0f).scaleY(z ? 1.1f : 0.0f).withEndAction(new Runnable(this) {
                public final ChatAvatarContainer f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$setStars$6(z);
                            break;
                        default:
                            this.f$0.lambda$setStars$7(z);
                            break;
                    }
                }
            }).start();
            final int i2 = 1;
            this.starFgItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.0f).scaleY(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) {
                public final ChatAvatarContainer f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$setStars$6(z);
                            break;
                        default:
                            this.f$0.lambda$setStars$7(z);
                            break;
                    }
                }
            }).start();
            return;
        }
        imageView.setVisibility(z ? 0 : 4);
        this.starBgItem.setAlpha(z ? 1.0f : 0.0f);
        this.starBgItem.setScaleX(z ? 1.1f : 0.0f);
        this.starBgItem.setScaleY(z ? 1.1f : 0.0f);
        this.starFgItem.setVisibility(z ? 0 : 4);
        this.starFgItem.setAlpha(z ? 1.0f : 0.0f);
        this.starFgItem.setScaleX(z ? 1.0f : 0.0f);
        this.starFgItem.setScaleY(z ? 1.0f : 0.0f);
    }

    public void setStoriesForceState(Integer num) {
        this.storiesForceState = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.lastSubtitle == null) {
            SimpleTextView simpleTextView = this.subtitleTextView;
            if (simpleTextView != null) {
                simpleTextView.setText(charSequence);
            } else {
                AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
                if (animatedTextView != null) {
                    animatedTextView.setText(charSequence);
                }
            }
        } else {
            this.lastSubtitle = charSequence;
        }
        checkActionBar(true);
    }

    public void setTime(int i, boolean z) {
        if (this.timerDrawable == null) {
            return;
        }
        boolean z2 = this.stars;
        if (i != 0 || this.secretChatTimer) {
            if (z2) {
                hideTimeItem(z);
            } else {
                showTimeItem(z);
                this.timerDrawable.setTime(i);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false, false, false, false, null, false);
    }

    public void setTitleColors(int i, int i2) {
        this.titleTextView.setTextColor(i);
        this.subtitleTextView.setTextColor(i2);
        this.subtitleTextView.setTag(Integer.valueOf(i2));
    }

    public void setTitleIcons(Drawable drawable, Drawable drawable2) {
        this.titleTextView.setLeftDrawable(drawable);
        if (!this.rightDrawableIsScamOrVerified && !this.rightDrawableIsScam) {
            if (drawable2 != null) {
                this.rightDrawable2ContentDescription = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.rightDrawable2ContentDescription = null;
            }
            this.titleTextView.setRightDrawable2(drawable2);
        }
        checkActionBar(true);
    }

    public void setUserAvatar(TLRPC.User user) {
        setUserAvatar(user, false);
    }

    public void showTimeItem(boolean z) {
        this.animatorTimeVisible.setValue(true, z);
    }

    public void updateColors() {
        StatusDrawable statusDrawable = this.currentTypingDrawable;
        if (statusDrawable != null) {
            statusDrawable.setColor(getThemedColor(Theme.key_chat_status));
        }
        Drawable drawable = this.emojiStatusDefaultDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botVerificationDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
        }
        Drawable drawable2 = this.verifiedBackground;
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
        }
        Drawable drawable3 = this.verifiedCheck;
        if (drawable3 != null) {
            drawable3.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedCheck), PorterDuff.Mode.MULTIPLY));
        }
        invalidate();
    }

    public void updateOnlineCount() {
        TLRPC.UserStatus userStatus;
        boolean z;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        this.onlineCount = 0;
        TLRPC.ChatFull currentChatInfo = chatActivity.getCurrentChatInfo();
        if (currentChatInfo == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (!(currentChatInfo instanceof TLRPC.TL_chatFull) && (!((z = currentChatInfo instanceof TLRPC.TL_channelFull)) || currentChatInfo.participants_count > 200 || currentChatInfo.participants == null)) {
            if (!z || currentChatInfo.participants_count <= 200) {
                return;
            }
            this.onlineCount = currentChatInfo.online_count;
            return;
        }
        for (int i = 0; i < currentChatInfo.participants.participants.size(); i++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentChatInfo.participants.participants.get(i).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(this.currentAccount).getClientUserId()) && user.status.expires > 10000)) {
                this.onlineCount++;
            }
        }
    }

    public void updateSubtitle() {
        updateSubtitle(false);
    }

    public boolean useAnimatedSubtitle() {
        return false;
    }

    public ChatAvatarContainer(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        Context context2;
        char c;
        char c2;
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTimeVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.avatarSizeInDp = 42;
        this.titleTextLargerCopyView = new AtomicReference<>();
        this.subtitleTextLargerCopyView = new AtomicReference<>();
        this.statusDrawables = new StatusDrawable[6];
        this.avatarDrawable = new AvatarDrawable();
        this.currentAccount = UserConfig.selectedAccount;
        this.occupyStatusBar = true;
        this.leftPadding = AndroidUtilities.dp(8.0f);
        this.rightAvatarPadding = 0;
        this.lastWidth = -1;
        this.largerWidth = -1;
        this.isOnline = new boolean[1];
        this.statusMadeShorter = new boolean[1];
        this.onlineCount = -1;
        this.lastSubtitleColorKey = -1;
        this.allowShorterStatus = false;
        this.premiumIconHiddable = false;
        this.bounce = new ButtonBounce(this);
        this.onLongClick = new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 2);
        this.rightDrawableIsScamOrVerified = false;
        this.rightDrawableIsScam = false;
        this.rightDrawableContentDescription = null;
        this.rightDrawable2ContentDescription = null;
        this.resourcesProvider = resourcesProvider;
        boolean z2 = baseFragment instanceof ChatActivity;
        if (z2) {
            this.parentFragment = (ChatActivity) baseFragment;
        }
        ChatActivity chatActivity = this.parentFragment;
        boolean z3 = chatActivity != null && (chatActivity.getChatMode() == 0 || this.parentFragment.getChatMode() == 8) && !UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && (this.parentFragment.getCurrentUser() == null || this.parentFragment.getCurrentUser().id != 489000);
        this.avatarImageView = new AnonymousClass1(context, baseFragment, z3, resourcesProvider);
        if (z2 || (baseFragment instanceof TopicsFragment)) {
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 == null || (chatActivity2.getChatMode() != 5 && this.parentFragment.getChatMode() != 9 && this.parentFragment.getChatMode() != 6 && this.parentFragment.getChatMode() != 8 && !this.parentFragment.isInBotForumMode())) {
                this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(baseFragment);
            }
            ChatActivity chatActivity3 = this.parentFragment;
            boolean z4 = chatActivity3 != null && ((chatActivity3.isThreadChat() && !this.parentFragment.isReplyChatComment()) || this.parentFragment.getChatMode() == 2 || this.parentFragment.getChatMode() == 5 || this.parentFragment.getChatMode() == 9 || this.parentFragment.getChatMode() == 6);
            this.avatarImageIsHidden = z4;
            if (z4) {
                this.avatarImageView.setVisibility(8);
            }
        }
        this.avatarImageView.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(this.avatarImageView);
        if (z3) {
            ChatActivity chatActivity4 = this.parentFragment;
            TLRPC.Chat currentChat = chatActivity4 != null ? chatActivity4.getCurrentChat() : null;
            if (currentChat != null && currentChat.linked_community_id != 0) {
                ScaleStateListAnimator.apply(this.avatarImageView, 0.05f, 1.2f);
            }
            final int i = 0;
            this.avatarImageView.setOnClickListener(new View.OnClickListener(this) {
                public final ChatAvatarContainer f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$0(view);
                            break;
                        default:
                            this.f$0.lambda$new$2(view);
                            break;
                    }
                }
            });
        }
        SimpleTextConnectedView simpleTextConnectedView = new SimpleTextConnectedView(context, this.titleTextLargerCopyView);
        this.titleTextView = simpleTextConnectedView;
        simpleTextConnectedView.setEllipsizeByGradient(true);
        this.titleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        this.titleTextView.setTextSize(18);
        this.titleTextView.setGravity(3);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        this.titleTextView.setCanHideRightDrawable(false);
        this.titleTextView.setRightDrawableOutside(true);
        this.titleTextView.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(this.titleTextView);
        if (useAnimatedSubtitle()) {
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
            this.animatedSubtitleTextView = animatedTextView;
            context2 = context;
            c = 2;
            c2 = 5;
            animatedTextView.setAnimationProperties(0.3f, 0L, 320L, cubicBezierInterpolator);
            this.animatedSubtitleTextView.setEllipsizeByGradient(true);
            AnimatedTextView animatedTextView2 = this.animatedSubtitleTextView;
            int i2 = Theme.key_actionBarDefaultSubtitle;
            animatedTextView2.setTextColor(getThemedColor(i2));
            this.animatedSubtitleTextView.setTag(Integer.valueOf(i2));
            this.animatedSubtitleTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.animatedSubtitleTextView.setGravity(3);
            this.animatedSubtitleTextView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            this.animatedSubtitleTextView.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(this.animatedSubtitleTextView);
        } else {
            context2 = context;
            c = 2;
            c2 = 5;
            SimpleTextConnectedView simpleTextConnectedView2 = new SimpleTextConnectedView(context2, this.subtitleTextLargerCopyView);
            this.subtitleTextView = simpleTextConnectedView2;
            simpleTextConnectedView2.setEllipsizeByGradient(true);
            SimpleTextView simpleTextView = this.subtitleTextView;
            int i3 = Theme.key_actionBarDefaultSubtitle;
            simpleTextView.setTextColor(getThemedColor(i3));
            this.subtitleTextView.setTag(Integer.valueOf(i3));
            this.subtitleTextView.setTextSize(14);
            this.subtitleTextView.setGravity(3);
            this.subtitleTextView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(this.subtitleTextView);
        }
        if (this.parentFragment != null) {
            ImageView imageView = new ImageView(context2);
            this.communityItem = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.communityItem.setVisibility(8);
            this.communityItem.setImageDrawable(new CommunityArrowDrawable());
            addView(this.communityItem);
            ImageView imageView2 = new ImageView(context2);
            this.timeItem = imageView2;
            imageView2.setScaleType(scaleType);
            this.timeItem.setVisibility(8);
            ImageView imageView3 = this.timeItem;
            TimerDrawable timerDrawable = new TimerDrawable(context2, resourcesProvider);
            this.timerDrawable = timerDrawable;
            imageView3.setImageDrawable(timerDrawable);
            this.timerDrawable.setBackgroundColor(0);
            addView(this.timeItem);
            this.secretChatTimer = z;
            this.timeItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(20, this, resourcesProvider));
            if (this.secretChatTimer) {
                this.timeItem.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                this.timeItem.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView4 = new ImageView(context2);
            this.starBgItem = imageView4;
            imageView4.setImageResource(R.drawable.star_small_outline);
            this.starBgItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefault), PorterDuff.Mode.SRC_IN));
            this.starBgItem.setAlpha(0.0f);
            this.starBgItem.setVisibility(4);
            this.starBgItem.setScaleY(0.0f);
            this.starBgItem.setScaleX(0.0f);
            addView(this.starBgItem);
            ImageView imageView5 = new ImageView(context2);
            this.starFgItem = imageView5;
            imageView5.setImageResource(R.drawable.star_small_inner);
            this.starFgItem.setAlpha(0.0f);
            this.starFgItem.setVisibility(4);
            this.starFgItem.setScaleY(0.0f);
            this.starFgItem.setScaleX(0.0f);
            addView(this.starFgItem);
        }
        ChatActivity chatActivity5 = this.parentFragment;
        if (chatActivity5 != null && (chatActivity5.getChatMode() == 0 || this.parentFragment.getChatMode() == 8 || this.parentFragment.getChatMode() == 3)) {
            if (this.parentFragment.isThreadChat()) {
                ChatActivity chatActivity6 = this.parentFragment;
                if (chatActivity6.isTopic || chatActivity6.isComments) {
                    if (!UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && (this.parentFragment.getCurrentUser() == null || this.parentFragment.getCurrentUser().id != 489000)) {
                        final int i4 = 1;
                        setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAvatarContainer f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        this.f$0.lambda$new$0(view);
                                        break;
                                    default:
                                        this.f$0.lambda$new$2(view);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (!UserObject.isReplyUser(this.parentFragment.getCurrentUser())) {
                final int i5 = 1;
                setOnClickListener(new View.OnClickListener(this) {
                    public final ChatAvatarContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$new$0(view);
                                break;
                            default:
                                this.f$0.lambda$new$2(view);
                                break;
                        }
                    }
                });
            }
            TLRPC.Chat currentChat2 = this.parentFragment.getCurrentChat();
            this.statusDrawables[0] = new TypingDotsDrawable(true);
            this.statusDrawables[1] = new RecordStatusDrawable(true);
            this.statusDrawables[c] = new SendingFileDrawable(true);
            this.statusDrawables[3] = new PlayingGameDrawable(false, resourcesProvider);
            this.statusDrawables[4] = new RoundStatusDrawable(true);
            this.statusDrawables[c2] = new ChoosingStickerStatusDrawable(true);
            int i6 = 0;
            while (true) {
                StatusDrawable[] statusDrawableArr = this.statusDrawables;
                if (i6 >= statusDrawableArr.length) {
                    break;
                }
                statusDrawableArr[i6].setIsChat(currentChat2 != null);
                i6++;
            }
        }
        this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.titleTextView, AndroidUtilities.dp(24.0f));
        this.botVerificationDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.titleTextView, AndroidUtilities.dp(17.0f));
    }

    public void openProfile(boolean z, boolean z2, boolean z3) {
        boolean z4;
        TLRPC.User user;
        if (z) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y && this.avatarImageView.getImageReceiver().hasNotThumb()) {
                    z4 = z;
                }
            }
            z4 = false;
        } else {
            z4 = z;
        }
        TLRPC.User currentUser = this.parentFragment.getCurrentUser();
        TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
        boolean z5 = currentChat != null && currentChat.monoforum;
        if (currentChat != null && currentChat.monoforum) {
            currentChat = this.parentFragment.getMessagesController().getChat(Long.valueOf(currentChat.linked_monoforum_id));
            if (currentChat == null) {
                return;
            }
            if (this.parentFragment.getSendMonoForumPeerId() != 0 && (user = this.parentFragment.getMessagesController().getUser(Long.valueOf(this.parentFragment.getSendMonoForumPeerId()))) != null) {
                currentChat = null;
                currentUser = user;
            }
        }
        ImageReceiver imageReceiver = this.avatarImageView.getImageReceiver();
        String imageKey = imageReceiver.getImageKey();
        ImageLoader imageLoader = ImageLoader.getInstance();
        if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
            Drawable drawable = imageReceiver.getDrawable();
            if ((drawable instanceof BitmapDrawable) && !(drawable instanceof AnimatedFileDrawable)) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity.isComments) {
            if (currentChat == null) {
                return;
            }
            chatActivity.presentFragment(ProfileActivity.of(-currentChat.id), z3);
            return;
        }
        if (currentUser == null) {
            if (currentChat != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", currentChat.id);
                if (this.parentFragment.getChatMode() == 3) {
                    bundle.putLong("topic_id", this.parentFragment.getSavedDialogId());
                } else {
                    ChatActivity chatActivity2 = this.parentFragment;
                    if (chatActivity2.isTopic) {
                        bundle.putLong("topic_id", chatActivity2.getThreadMessage().getId());
                    }
                }
                ProfileActivity profileActivity = new ProfileActivity(bundle, this.sharedMediaPreloader);
                if (!z5) {
                    profileActivity.setChatInfo(this.parentFragment.getCurrentChatInfo());
                }
                if (z2) {
                    profileActivity.setPlayProfileAnimation(z4 ? 2 : 1);
                }
                this.parentFragment.presentFragment(profileActivity, z3);
                return;
            }
            return;
        }
        if (currentUser.id == 489000) {
            return;
        }
        Bundle bundle2 = new Bundle();
        if (UserObject.isUserSelf(currentUser)) {
            if (this.sharedMediaPreloader.hasSharedMedia()) {
                bundle2.putLong("dialog_id", this.parentFragment.getDialogId());
                if (this.parentFragment.getChatMode() == 3) {
                    bundle2.putLong("topic_id", this.parentFragment.getSavedDialogId());
                }
                MediaActivity mediaActivity = new MediaActivity(bundle2, this.sharedMediaPreloader);
                mediaActivity.setChatInfo(this.parentFragment.getCurrentChatInfo());
                this.parentFragment.presentFragment(mediaActivity, z3);
                return;
            }
            return;
        }
        if (this.parentFragment.getChatMode() == 3) {
            long savedDialogId = this.parentFragment.getSavedDialogId();
            bundle2.putBoolean("saved", true);
            if (savedDialogId >= 0) {
                bundle2.putLong("user_id", savedDialogId);
            } else {
                bundle2.putLong("chat_id", -savedDialogId);
            }
        } else {
            bundle2.putLong("user_id", currentUser.id);
            if (this.timeItem != null && !z5) {
                bundle2.putLong("dialog_id", this.parentFragment.getDialogId());
            }
        }
        if (UserObject.isBotForum(currentUser)) {
            bundle2.putLong("topic_id", this.parentFragment.getTopicId());
        }
        bundle2.putBoolean("reportSpam", this.parentFragment.hasReportSpam());
        bundle2.putInt("actionBarColor", getThemedColor(Theme.key_actionBarDefault));
        ProfileActivity profileActivity2 = new ProfileActivity(bundle2, this.sharedMediaPreloader);
        if (!z5) {
            TLRPC.UserFull currentUserInfo = this.parentFragment.getCurrentUserInfo();
            ChatActivity chatActivity3 = this.parentFragment;
            profileActivity2.setUserInfo(currentUserInfo, chatActivity3.profileChannelMessageFetcher, chatActivity3.birthdayAssetsFetcher);
        }
        if (z2) {
            profileActivity2.setPlayProfileAnimation(z4 ? 2 : 1);
        }
        this.parentFragment.presentFragment(profileActivity2, z3);
    }

    public void setTitle(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.titleTextView.getPaint().getFontMetricsInt(), false);
        }
        this.titleTextView.setText(charSequence);
        this.rightDrawableIsScam = false;
        if (z || z2) {
            this.rightDrawableIsScam = true;
            if (!(this.titleTextView.getRightDrawable() instanceof ScamDrawable)) {
                ScamDrawable scamDrawable = new ScamDrawable(11, !z ? 1 : 0);
                scamDrawable.setColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
                this.titleTextView.setRightDrawable2(scamDrawable);
                this.rightDrawable2ContentDescription = LocaleController.getString(R.string.ScamMessage);
                this.rightDrawableIsScamOrVerified = true;
            }
        } else if (z3) {
            Drawable drawableMutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.verifiedBackground = drawableMutate;
            int themedColor = getThemedColor(Theme.key_profile_verifiedBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.verifiedCheck = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedCheck), mode));
            this.titleTextView.setRightDrawable2(new CombinedDrawable(this.verifiedBackground, this.verifiedCheck));
            this.rightDrawableIsScamOrVerified = true;
            this.rightDrawable2ContentDescription = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.titleTextView.getRightDrawable() instanceof ScamDrawable) {
            this.titleTextView.setRightDrawable2(null);
            this.rightDrawableIsScamOrVerified = false;
            this.rightDrawable2ContentDescription = null;
        }
        if (z4 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.titleTextView.getRightDrawable() instanceof AnimatedEmojiDrawable.WrapSizeDrawable) && (((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).getDrawable() instanceof AnimatedEmojiDrawable)) {
                ((AnimatedEmojiDrawable) ((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).getDrawable()).removeView(this.titleTextView);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.emojiStatusDrawable.set(DialogObject.getEmojiStatusDocumentId(emojiStatus), z5);
            } else if (z4) {
                Drawable drawableMutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.emojiStatusDefaultDrawable = drawableMutate3;
                drawableMutate3.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
                this.emojiStatusDrawable.set(this.emojiStatusDefaultDrawable, z5);
            } else {
                this.emojiStatusDrawable.set((Drawable) null, z5);
            }
            this.emojiStatusDrawable.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
            this.titleTextView.setRightDrawable(this.emojiStatusDrawable);
            this.rightDrawableIsScamOrVerified = false;
            this.rightDrawableContentDescription = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.titleTextView.setRightDrawable((Drawable) null);
            this.rightDrawableContentDescription = null;
        }
        checkActionBar(z5);
    }

    public void setUserAvatar(TLRPC.User user, boolean z) {
        this.avatarDrawable.setInfo(this.currentAccount, user);
        if (UserObject.isReplyUser(user)) {
            this.avatarDrawable.setAvatarType(12);
            this.avatarDrawable.setScaleSize(0.8f);
            BackupImageView backupImageView = this.avatarImageView;
            if (backupImageView != null) {
                backupImageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            this.avatarDrawable.setAvatarType(21);
            this.avatarDrawable.setScaleSize(0.8f);
            BackupImageView backupImageView2 = this.avatarImageView;
            if (backupImageView2 != null) {
                backupImageView2.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z) {
            this.avatarDrawable.setScaleSize(1.0f);
            BackupImageView backupImageView3 = this.avatarImageView;
            if (backupImageView3 != null) {
                backupImageView3.setForUserOrChat(user, this.avatarDrawable);
                return;
            }
            return;
        }
        this.avatarDrawable.setAvatarType(1);
        this.avatarDrawable.setScaleSize(0.8f);
        BackupImageView backupImageView4 = this.avatarImageView;
        if (backupImageView4 != null) {
            backupImageView4.setImage((ImageLocation) null, (String) null, this.avatarDrawable, user);
        }
    }

    public void updateSubtitle(boolean z) {
        ChatActivity chatActivity;
        TLRPC.User user;
        long j;
        long j2;
        int i;
        ChatActivity chatActivity2;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        int i2;
        int topicsCount;
        String string;
        float f;
        boolean z2 = false;
        boolean z3 = true;
        ChatActivity chatActivity3 = this.parentFragment;
        if (chatActivity3 == null) {
            return;
        }
        if (chatActivity3.getChatMode() == 6) {
            String strSubstring = this.parentFragment.businessLink.link;
            BusinessLinksController[] businessLinksControllerArr = BusinessLinksController.Instance;
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            setSubtitle(strSubstring);
            return;
        }
        TLRPC.User currentUser = this.parentFragment.getCurrentUser();
        TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
        boolean z4 = UserObject.isUserSelf(currentUser) && this.parentFragment.getChatMode() == 0 && this.parentFragment.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.showingSavedMessagesHint || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(currentUser) && !z4) || UserObject.isReplyUser(currentUser) || ((currentUser != null && currentUser.id == 489000) || (this.parentFragment.getChatMode() != 0 && this.parentFragment.getChatMode() != 8))) && this.parentFragment.getChatMode() != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z4) {
            if (getSubtitleTextView().getVisibility() != 0) {
                getSubtitleTextView().setVisibility(0);
            }
            if (!this.showingSavedMessagesHint) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) + 1).apply();
                this.showingSavedMessagesHint = true;
            }
        }
        this.subtitleIsThinkingBot = false;
        CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.parentFragment.getDialogId(), this.parentFragment.getThreadId(), false);
        if (printingString == null) {
            UserObject.isBotForum(currentUser);
        }
        CharSequence string2 = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        if (printingString != null && printingString.length() != 0) {
            if (ChatObject.isChannel(currentChat)) {
                f = 0.0f;
                if (!currentChat.megagroup) {
                    if (!this.parentFragment.isThreadChat()) {
                    }
                    setTypingAnimation(false);
                    if (this.parentFragment.getChatMode() == 8) {
                        chatActivity2 = this.parentFragment;
                        if (chatActivity2.isSubscriberSuggestions) {
                            string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                        } else if (chatActivity2.getTopicId() == 0) {
                            topicsCount = this.parentFragment.getMessagesController().getTopicsController().getTopicsCount(-this.parentFragment.getDialogId());
                            if (topicsCount > 0) {
                                string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                            } else {
                                string = LocaleController.getString(R.string.ChatMessageSuggestions);
                            }
                            string2 = string;
                        } else {
                            tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(currentChat.id, this.parentFragment.getTopicId());
                            if (tL_forumTopicFindTopic != null) {
                                i2 = tL_forumTopicFindTopic.totalMessagesCount;
                            } else {
                                i2 = 0;
                            }
                            if (i2 > 0) {
                                string2 = LocaleController.formatPluralString("messages", i2, Integer.valueOf(i2));
                            } else {
                                string2 = LocaleController.formatString(R.string.TopicProfileStatus, ForumUtilities.getMonoForumTitle(currentChat, this.currentAccount, false));
                            }
                        }
                    } else if (this.parentFragment.getChatMode() == 3) {
                        string2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, this.parentFragment.getMessagesController().getSavedMessagesController().getMessagesCount(this.parentFragment.getSavedDialogId())), new Object[0]);
                    } else {
                        chatActivity = this.parentFragment;
                        if (!chatActivity.isTopic) {
                            if (currentChat != null) {
                                string2 = getChatSubtitle(currentChat, chatActivity.getCurrentChatInfo(), this.onlineCount);
                            } else if (currentUser != null) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentUser.id));
                                if (user != null) {
                                    currentUser = user;
                                }
                                if (!UserObject.isReplyUser(currentUser)) {
                                    j = currentUser.id;
                                    if (j != 489000) {
                                        if (j != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                            j2 = currentUser.id;
                                            if (j2 != 333000) {
                                                string2 = LocaleController.getString(R.string.ServiceNotifications);
                                            } else {
                                                string2 = LocaleController.getString(R.string.ServiceNotifications);
                                            }
                                        } else if (z4) {
                                            string2 = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                                        } else {
                                            string2 = LocaleController.getString(R.string.ChatYourSelf);
                                        }
                                    }
                                }
                            }
                        } else if (currentChat != null) {
                            string2 = getChatSubtitle(currentChat, chatActivity.getCurrentChatInfo(), this.onlineCount);
                        } else if (currentUser != null) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentUser.id));
                            if (user != null) {
                                currentUser = user;
                            }
                            if (!UserObject.isReplyUser(currentUser)) {
                                j = currentUser.id;
                                if (j != 489000) {
                                    if (j != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                        j2 = currentUser.id;
                                        if (j2 != 333000) {
                                            string2 = LocaleController.getString(R.string.ServiceNotifications);
                                        } else {
                                            string2 = LocaleController.getString(R.string.ServiceNotifications);
                                        }
                                    } else if (z4) {
                                        string2 = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                                    } else {
                                        string2 = LocaleController.getString(R.string.ChatYourSelf);
                                    }
                                }
                            }
                        }
                    }
                    z3 = z2;
                    printingString = string2;
                }
            } else {
                f = 0.0f;
            }
            if (this.parentFragment.isThreadChat() && this.titleTextView.getTag() != null) {
                this.titleTextView.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.titleAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.titleAnimation = null;
                }
                if (z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.titleAnimation = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this.titleTextView, (Property<SimpleTextView, Float>) property2, f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
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
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.parentFragment.getDialogId(), this.parentFragment.getThreadId());
            if (printingStringType != null && printingStringType.intValue() == 5) {
                printingString = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            }
            setTypingAnimation(true);
        } else {
            if (!this.parentFragment.isThreadChat() && !this.parentFragment.isTopic) {
                if (this.titleTextView.getTag() != null) {
                    return;
                }
                this.titleTextView.setTag(1);
                AnimatorSet animatorSet3 = this.titleAnimation;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.titleAnimation = null;
                }
                if (!z) {
                    this.titleTextView.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.titleAnimation = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.titleTextView, (Property<SimpleTextView, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.titleAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationCancel(Animator animator) {
                            ChatAvatarContainer.this.titleAnimation = null;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ChatAvatarContainer.this.titleAnimation == animator) {
                                ChatAvatarContainer.this.getSubtitleTextView().setVisibility(4);
                                ChatAvatarContainer.this.titleAnimation = null;
                            }
                        }
                    });
                    this.titleAnimation.setDuration(180L);
                    this.titleAnimation.start();
                    return;
                }
            }
            setTypingAnimation(false);
            if (this.parentFragment.getChatMode() == 8) {
                chatActivity2 = this.parentFragment;
                if (chatActivity2.isSubscriberSuggestions) {
                    string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (chatActivity2.getTopicId() == 0) {
                    topicsCount = this.parentFragment.getMessagesController().getTopicsController().getTopicsCount(-this.parentFragment.getDialogId());
                    if (topicsCount > 0) {
                        string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                    } else {
                        string = LocaleController.getString(R.string.ChatMessageSuggestions);
                    }
                    string2 = string;
                } else {
                    tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(currentChat.id, this.parentFragment.getTopicId());
                    if (tL_forumTopicFindTopic != null) {
                        i2 = tL_forumTopicFindTopic.totalMessagesCount;
                    } else {
                        i2 = 0;
                    }
                    if (i2 > 0) {
                        string2 = LocaleController.formatPluralString("messages", i2, Integer.valueOf(i2));
                    } else {
                        string2 = LocaleController.formatString(R.string.TopicProfileStatus, ForumUtilities.getMonoForumTitle(currentChat, this.currentAccount, false));
                    }
                }
            } else if (this.parentFragment.getChatMode() == 3) {
                string2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, this.parentFragment.getMessagesController().getSavedMessagesController().getMessagesCount(this.parentFragment.getSavedDialogId())), new Object[0]);
            } else {
                chatActivity = this.parentFragment;
                if (!chatActivity.isTopic && currentChat != null) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic2 = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(currentChat.id, this.parentFragment.getTopicId());
                    int i3 = tL_forumTopicFindTopic2 != null ? tL_forumTopicFindTopic2.totalMessagesCount - 1 : 0;
                    string2 = i3 > 0 ? LocaleController.formatPluralString("messages", i3, Integer.valueOf(i3)) : LocaleController.formatString(R.string.TopicProfileStatus, currentChat.title);
                } else if (currentChat != null) {
                    string2 = getChatSubtitle(currentChat, chatActivity.getCurrentChatInfo(), this.onlineCount);
                } else if (currentUser != null) {
                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(currentUser.id));
                    if (user != null) {
                        currentUser = user;
                    }
                    if (!UserObject.isReplyUser(currentUser)) {
                        j = currentUser.id;
                        if (j != 489000) {
                            if (j != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                j2 = currentUser.id;
                                if (j2 != 333000 || j2 == 777000 || j2 == 42777) {
                                    string2 = LocaleController.getString(R.string.ServiceNotifications);
                                } else if (MessagesController.isSupportUser(currentUser)) {
                                    string2 = LocaleController.getString(R.string.SupportStatus);
                                } else {
                                    boolean z5 = currentUser.bot;
                                    if (z5 && (i = currentUser.bot_active_users) != 0) {
                                        string2 = LocaleController.formatPluralStringComma("BotUsers", i, ',');
                                    } else if (z5) {
                                        string2 = LocaleController.getString(R.string.Bot);
                                    } else {
                                        boolean[] zArr = this.isOnline;
                                        zArr[0] = false;
                                        string2 = LocaleController.formatUserStatus(this.currentAccount, currentUser, zArr, this.allowShorterStatus ? this.statusMadeShorter : null);
                                        z2 = this.isOnline[0];
                                    }
                                }
                            } else if (z4) {
                                string2 = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                            } else {
                                string2 = LocaleController.getString(R.string.ChatYourSelf);
                            }
                        }
                    }
                }
            }
            z3 = z2;
            printingString = string2;
        }
        this.lastSubtitleColorKey = z3 ? Theme.key_chat_status : Theme.key_actionBarDefaultSubtitle;
        if (this.lastSubtitle == null) {
            SimpleTextView simpleTextView = this.subtitleTextView;
            if (simpleTextView != null) {
                simpleTextView.setText(printingString);
                Integer num = this.overrideSubtitleColor;
                if (num == null) {
                    this.subtitleTextView.setTextColor(getThemedColor(this.lastSubtitleColorKey));
                    this.subtitleTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                } else {
                    this.subtitleTextView.setTextColor(num.intValue());
                }
            } else {
                this.animatedSubtitleTextView.setText(printingString, z);
                Integer num2 = this.overrideSubtitleColor;
                if (num2 == null) {
                    this.animatedSubtitleTextView.setTextColor(getThemedColor(this.lastSubtitleColorKey));
                    this.animatedSubtitleTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                } else {
                    this.animatedSubtitleTextView.setTextColor(num2.intValue());
                }
            }
        } else {
            this.lastSubtitle = printingString;
        }
        checkActionBar(z);
    }
}
