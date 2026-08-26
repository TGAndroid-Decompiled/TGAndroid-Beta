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
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.CommunityArrowDrawable;

public class ChatAvatarContainer extends FrameLayout implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate {
    public ActionBar actionBar;
    public boolean allowDrawStories;
    public boolean allowShorterStatus;
    public final AnimatedTextView animatedSubtitleTextView;
    public final BoolAnimator animatorTimeVisible;
    public final AvatarDrawable avatarDrawable;
    public final boolean avatarImageIsHidden;
    public final AnonymousClass1 avatarImageView;
    public final int avatarSizeInDp;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationDrawable;
    public final ButtonBounce bounce;
    public final ImageView communityItem;
    public final int currentAccount;
    public int currentConnectionState;
    public StatusDrawable currentTypingDrawable;
    public Drawable emojiStatusDefaultDrawable;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatusDrawable;
    public boolean glassMode;
    public final boolean[] isOnline;
    public int largerWidth;
    public CharSequence lastSubtitle;
    public int lastSubtitleColorKey;
    public int lastWidth;
    public int leftPadding;
    public boolean occupyStatusBar;
    public final ChatAvatarContainer$$ExternalSyntheticLambda0 onLongClick;
    public int onlineCount;
    public Integer overrideSubtitleColor;
    public final ChatActivity parentFragment;
    public boolean pressed;
    public final Theme.ResourcesProvider resourcesProvider;
    public int rightAvatarPadding;
    public String rightDrawable2ContentDescription;
    public String rightDrawableContentDescription;
    public boolean rightDrawableIsScam;
    public boolean rightDrawableIsScamOrVerified;
    public final boolean secretChatTimer;
    public final SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    public boolean showingSavedMessagesHint;
    public final ImageView starBgItem;
    public final ImageView starFgItem;
    public boolean stars;
    public final StatusDrawable[] statusDrawables;
    public final boolean[] statusMadeShorter;
    public Integer storiesForceState;
    public final AtomicReference subtitleTextLargerCopyView;
    public final SimpleTextConnectedView subtitleTextView;
    public final ImageView timeItem;
    public final TimerDrawable timerDrawable;
    public AnimatorSet titleAnimation;
    public final AtomicReference titleTextLargerCopyView;
    public final SimpleTextConnectedView titleTextView;
    public Drawable verifiedBackground;
    public Drawable verifiedCheck;

    public final class AnonymousClass1 extends BackupImageView {
        public final UserCell.AnonymousClass1 params;
        public final boolean val$avatarClickable;
        public final BaseFragment val$baseFragment;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass1(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$baseFragment = baseFragment;
            this.val$avatarClickable = z;
            this.val$resourcesProvider = resourcesProvider;
            this.params = new UserCell.AnonymousClass1(this);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            long dialogId;
            ChatAvatarContainer chatAvatarContainer = ChatAvatarContainer.this;
            if (!chatAvatarContainer.allowDrawStories || this.animatedEmojiDrawable != null) {
                super.onDraw(canvas);
                return;
            }
            UserCell.AnonymousClass1 anonymousClass1 = this.params;
            anonymousClass1.originalAvatarRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            anonymousClass1.drawSegments = true;
            anonymousClass1.drawInside = true;
            anonymousClass1.resourcesProvider = this.val$resourcesProvider;
            Integer num = chatAvatarContainer.storiesForceState;
            if (num != null) {
                anonymousClass1.forceState = num.intValue();
            }
            ChatActivity chatActivity = chatAvatarContainer.parentFragment;
            if (chatActivity != null) {
                dialogId = chatActivity.getDialogId();
            } else {
                BaseFragment baseFragment = this.val$baseFragment;
                dialogId = baseFragment instanceof TopicsFragment ? -((TopicsFragment) baseFragment).chatId : 0L;
            }
            StoriesUtilities.drawAvatarWithStory(dialogId, canvas, this.imageReceiver, anonymousClass1);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (!this.val$avatarClickable || !getImageReceiver().hasNotThumb()) {
                accessibilityNodeInfo.setVisibleToUser(false);
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAvatarContainer.this.allowDrawStories && this.params.checkOnTouchEvent(motionEvent, this)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final class SimpleTextConnectedView extends SimpleTextView {
        public final AtomicReference reference;

        public SimpleTextConnectedView(Context context, AtomicReference atomicReference) {
            super(context);
            this.reference = atomicReference;
        }

        @Override
        public final boolean setText(CharSequence charSequence) {
            SimpleTextView simpleTextView;
            AtomicReference atomicReference = this.reference;
            if (atomicReference != null && (simpleTextView = (SimpleTextView) atomicReference.get()) != null) {
                simpleTextView.setText(charSequence);
            }
            return setText(charSequence, false);
        }

        @Override
        public final void setTranslationY(float f) {
            SimpleTextView simpleTextView;
            AtomicReference atomicReference = this.reference;
            if (atomicReference != null && (simpleTextView = (SimpleTextView) atomicReference.get()) != null) {
                simpleTextView.setTranslationY(f);
            }
            super.setTranslationY(f);
        }
    }

    public ChatAvatarContainer(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTimeVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.avatarSizeInDp = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.titleTextLargerCopyView = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.subtitleTextLargerCopyView = atomicReference2;
        StatusDrawable[] statusDrawableArr = new StatusDrawable[6];
        this.statusDrawables = statusDrawableArr;
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
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
        this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
        this.onLongClick = new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 2);
        this.rightDrawableIsScamOrVerified = false;
        this.rightDrawableIsScam = false;
        this.rightDrawableContentDescription = null;
        this.rightDrawable2ContentDescription = null;
        this.resourcesProvider = resourcesProvider;
        boolean z3 = baseFragment instanceof ChatActivity;
        if (z3) {
            this.parentFragment = (ChatActivity) baseFragment;
        }
        ChatActivity chatActivity = this.parentFragment;
        boolean z4 = chatActivity != null && ((i4 = chatActivity.chatMode) == 0 || i4 == 8) && !UserObject.isReplyUser(chatActivity.getCurrentUser()) && (this.parentFragment.getCurrentUser() == null || this.parentFragment.getCurrentUser().id != 489000);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, baseFragment, z4, resourcesProvider);
        this.avatarImageView = anonymousClass1;
        if (z3 || (baseFragment instanceof TopicsFragment)) {
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 == null || ((i2 = chatActivity2.chatMode) != 5 && i2 != 9 && i2 != 6 && i2 != 8 && !UserObject.isBotForum(chatActivity2.currentUser))) {
                this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(baseFragment);
            }
            ChatActivity chatActivity3 = this.parentFragment;
            if (chatActivity3 == null) {
                z2 = false;
            } else {
                if (chatActivity3.isThreadChat()) {
                    ChatActivity chatActivity4 = this.parentFragment;
                    if (chatActivity4.threadMessageObject != null && chatActivity4.isComments) {
                        i = this.parentFragment.chatMode;
                        if (i == 2 && i != 5 && i != 9 && i != 6) {
                            z2 = false;
                        }
                    }
                } else {
                    i = this.parentFragment.chatMode;
                    if (i == 2) {
                    }
                }
                z2 = true;
            }
            this.avatarImageIsHidden = z2;
            if (z2) {
                anonymousClass1.setVisibility(8);
            }
        }
        anonymousClass1.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        anonymousClass1.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(anonymousClass1);
        if (z4) {
            ChatActivity chatActivity5 = this.parentFragment;
            TLRPC.Chat chat = chatActivity5 != null ? chatActivity5.currentChat : null;
            if (chat != null && chat.linked_community_id != 0) {
                ScaleStateListAnimator.apply(anonymousClass1, 0.05f, 1.2f);
            }
            final int i5 = 0;
            anonymousClass1.setOnClickListener(new View.OnClickListener(this) {
                public final ChatAvatarContainer f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            ChatAvatarContainer chatAvatarContainer = this.f$0;
                            if (!chatAvatarContainer.onAvatarClick()) {
                                chatAvatarContainer.openProfile(true, false);
                            }
                            break;
                        default:
                            this.f$0.openProfile(false, false);
                            break;
                    }
                }
            });
        }
        SimpleTextConnectedView simpleTextConnectedView = new SimpleTextConnectedView(context, atomicReference);
        this.titleTextView = simpleTextConnectedView;
        simpleTextConnectedView.setEllipsizeByGradient(true);
        simpleTextConnectedView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
        simpleTextConnectedView.setTextSize(18);
        simpleTextConnectedView.setGravity(3);
        simpleTextConnectedView.setTypeface(AndroidUtilities.bold());
        simpleTextConnectedView.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        simpleTextConnectedView.setCanHideRightDrawable(false);
        simpleTextConnectedView.setRightDrawableOutside(true);
        simpleTextConnectedView.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(simpleTextConnectedView);
        if (useAnimatedSubtitle()) {
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
            this.animatedSubtitleTextView = animatedTextView;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.3f;
            animatedTextDrawable.animateDuration = 320L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setEllipsizeByGradient(true);
            int i6 = Theme.key_actionBarDefaultSubtitle;
            animatedTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
            animatedTextView.setTag(Integer.valueOf(i6));
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextView.setGravity(3);
            animatedTextView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            animatedTextView.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(animatedTextView);
        } else {
            SimpleTextConnectedView simpleTextConnectedView2 = new SimpleTextConnectedView(context, atomicReference2);
            this.subtitleTextView = simpleTextConnectedView2;
            simpleTextConnectedView2.setEllipsizeByGradient(true);
            int i7 = Theme.key_actionBarDefaultSubtitle;
            simpleTextConnectedView2.setTextColor(Theme.getColor(i7, resourcesProvider));
            simpleTextConnectedView2.setTag(Integer.valueOf(i7));
            simpleTextConnectedView2.setTextSize(14);
            simpleTextConnectedView2.setGravity(3);
            simpleTextConnectedView2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(simpleTextConnectedView2);
        }
        if (this.parentFragment != null) {
            ImageView imageView = new ImageView(context);
            this.communityItem = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new CommunityArrowDrawable());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.timeItem = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            TimerDrawable timerDrawable = new TimerDrawable(context, resourcesProvider);
            this.timerDrawable = timerDrawable;
            imageView2.setImageDrawable(timerDrawable);
            timerDrawable.overrideColor = true;
            timerDrawable.paint.setColor(0);
            addView(imageView2);
            this.secretChatTimer = z;
            imageView2.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(15, this, resourcesProvider));
            if (z) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.starBgItem = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefault, resourcesProvider), PorterDuff.Mode.SRC_IN));
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.starFgItem = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        ChatActivity chatActivity6 = this.parentFragment;
        if (chatActivity6 != null && ((i3 = chatActivity6.chatMode) == 0 || i3 == 8 || i3 == 3)) {
            if (chatActivity6.isThreadChat()) {
                ChatActivity chatActivity7 = this.parentFragment;
                if (chatActivity7.isTopic || chatActivity7.isComments) {
                    if (!UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && (this.parentFragment.getCurrentUser() == null || this.parentFragment.getCurrentUser().id != 489000)) {
                        final int i8 = 1;
                        setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAvatarContainer f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        ChatAvatarContainer chatAvatarContainer = this.f$0;
                                        if (!chatAvatarContainer.onAvatarClick()) {
                                            chatAvatarContainer.openProfile(true, false);
                                        }
                                        break;
                                    default:
                                        this.f$0.openProfile(false, false);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (!UserObject.isReplyUser(this.parentFragment.getCurrentUser())) {
                final int i9 = 1;
                setOnClickListener(new View.OnClickListener(this) {
                    public final ChatAvatarContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                ChatAvatarContainer chatAvatarContainer = this.f$0;
                                if (!chatAvatarContainer.onAvatarClick()) {
                                    chatAvatarContainer.openProfile(true, false);
                                }
                                break;
                            default:
                                this.f$0.openProfile(false, false);
                                break;
                        }
                    }
                });
            }
            TLRPC.Chat chat2 = this.parentFragment.currentChat;
            statusDrawableArr[0] = new TypingDotsDrawable(true);
            statusDrawableArr[1] = new RecordStatusDrawable(true);
            statusDrawableArr[2] = new SendingFileDrawable(true);
            statusDrawableArr[3] = new PlayingGameDrawable(resourcesProvider, false);
            statusDrawableArr[4] = new RoundStatusDrawable(true);
            statusDrawableArr[5] = new RecordStatusDrawable();
            int i10 = 0;
            while (true) {
                StatusDrawable[] statusDrawableArr2 = this.statusDrawables;
                if (i10 >= statusDrawableArr2.length) {
                    break;
                }
                statusDrawableArr2[i10].setIsChat(chat2 != null);
                i10++;
            }
        }
        this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.titleTextView, false, AndroidUtilities.dp(24.0f), 7);
        this.botVerificationDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.titleTextView, false, AndroidUtilities.dp(17.0f), 7);
    }

    private void setTypingAnimation(boolean z) {
        ChatActivity chatActivity = this.parentFragment;
        SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
        if (simpleTextConnectedView == null) {
            return;
        }
        int i = 0;
        StatusDrawable[] statusDrawableArr = this.statusDrawables;
        if (!z) {
            this.currentTypingDrawable = null;
            simpleTextConnectedView.setLeftDrawable((Drawable) null);
            simpleTextConnectedView.replaceTextWithDrawable(null, null);
            while (i < statusDrawableArr.length) {
                StatusDrawable statusDrawable = statusDrawableArr[i];
                if (statusDrawable != null) {
                    statusDrawable.stop();
                }
                i++;
            }
            return;
        }
        try {
            int iIntValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(chatActivity.getDialogId(), chatActivity.threadMessageId).intValue();
            StatusDrawable statusDrawable2 = statusDrawableArr[iIntValue];
            if (statusDrawable2 == null) {
                return;
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (iIntValue == 5) {
                simpleTextConnectedView.replaceTextWithDrawable(statusDrawable2, "**oo**");
                statusDrawableArr[iIntValue].setColor(Theme.getColor(Theme.key_chat_status, resourcesProvider));
                simpleTextConnectedView.setLeftDrawable((Drawable) null);
            } else {
                simpleTextConnectedView.replaceTextWithDrawable(null, null);
                statusDrawableArr[iIntValue].setColor(Theme.getColor(Theme.key_chat_status, resourcesProvider));
                simpleTextConnectedView.setLeftDrawable(statusDrawableArr[iIntValue]);
            }
            this.currentTypingDrawable = statusDrawableArr[iIntValue];
            while (i < statusDrawableArr.length) {
                StatusDrawable statusDrawable3 = statusDrawableArr[i];
                if (statusDrawable3 != null) {
                    if (i == iIntValue) {
                        statusDrawable3.start();
                    } else {
                        statusDrawable3.stop();
                    }
                }
                i++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean canSearch() {
        return false;
    }

    public final void checkAndUpdateAvatar() {
        TLRPC.User user;
        int iDp;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        TLRPC.User currentUser = chatActivity.getCurrentUser();
        TLRPC.Chat chat = chatActivity.currentChat;
        if (chatActivity.chatMode == 3) {
            long savedDialogId = chatActivity.getSavedDialogId();
            if (savedDialogId >= 0) {
                user = chatActivity.getMessagesController().getUser(Long.valueOf(savedDialogId));
                chat = null;
            } else {
                chat = chatActivity.getMessagesController().getChat(Long.valueOf(-savedDialogId));
                user = null;
            }
        } else {
            user = currentUser;
        }
        int i = this.currentAccount;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    avatarDrawable.scaleSize = 1.0f;
                    avatarDrawable.setInfo(i, chat);
                    if (anonymousClass1 != null) {
                        anonymousClass1.setAnimatedEmojiDrawable(null);
                        anonymousClass1.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                        anonymousClass1.onNewImageSet();
                        if (chat.forum) {
                            iDp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(21.0f);
                        }
                        anonymousClass1.setRoundRadius(iDp);
                        return;
                    }
                    return;
                }
                return;
            }
            long topicId = chatActivity.getTopicId();
            if (!ChatObject.canManageMonoForum(i, chat) || topicId == 0) {
                anonymousClass1.setAnimatedEmojiDrawable(null);
                int i2 = ForumUtilities.$r8$clinit;
                TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
                if (chat2 != null) {
                    chat = chat2;
                }
                avatarDrawable.setInfo(i, chat);
                anonymousClass1.imageReceiver.setForUserOrChat(chat2, avatarDrawable);
                anonymousClass1.onNewImageSet();
            } else if (topicId > 0) {
                TLRPC.User user2 = chatActivity.getMessagesController().getUser(Long.valueOf(topicId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, user2);
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.imageReceiver.setForUserOrChat(user2, avatarDrawable);
                anonymousClass1.onNewImageSet();
            } else {
                TLRPC.Chat chat3 = chatActivity.getMessagesController().getChat(Long.valueOf(-topicId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat3);
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.imageReceiver.setForUserOrChat(chat3, avatarDrawable);
                anonymousClass1.onNewImageSet();
            }
            anonymousClass1.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        avatarDrawable.setInfo(i, user);
        if (UserObject.isReplyUser(user)) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(12);
            if (anonymousClass1 != null) {
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.setImage(null, null, avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(21);
            if (anonymousClass1 != null) {
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.setImage(null, null, avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && chatActivity.chatMode == 3) {
            avatarDrawable.scaleSize = 0.8f;
            avatarDrawable.setAvatarType(22);
            if (anonymousClass1 != null) {
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.setImage(null, null, avatarDrawable, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            avatarDrawable.scaleSize = 1.0f;
            if (anonymousClass1 != null) {
                anonymousClass1.setAnimatedEmojiDrawable(null);
                anonymousClass1.imageReceiver.setForUserOrChat(user, avatarDrawable, null, true, 3, false);
                return;
            }
            return;
        }
        avatarDrawable.scaleSize = 0.8f;
        avatarDrawable.setAvatarType(1);
        if (anonymousClass1 != null) {
            anonymousClass1.setAnimatedEmojiDrawable(null);
            anonymousClass1.setImage(null, null, avatarDrawable, user);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
            SimpleTextConnectedView simpleTextConnectedView = this.titleTextView;
            if (simpleTextConnectedView != null) {
                simpleTextConnectedView.invalidate();
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), Theme.PAINT_CLEAR);
                }
                if (z) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), Theme.PAINT_CLEAR);
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
        SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
        return simpleTextConnectedView != null ? simpleTextConnectedView.getTextPaint() : this.animatedSubtitleTextView.getPaint();
    }

    public View getSubtitleTextView() {
        SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
        if (simpleTextConnectedView != null) {
            return simpleTextConnectedView;
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
        SimpleTextConnectedView simpleTextConnectedView = this.titleTextView;
        float fMax = simpleTextConnectedView != null ? Math.max(0.0f, simpleTextConnectedView.getExactWidthIncludeDrawables()) : 0.0f;
        SimpleTextConnectedView simpleTextConnectedView2 = this.subtitleTextView;
        if (simpleTextConnectedView2 != null) {
            fMax = Math.max(fMax, simpleTextConnectedView2.getExactWidthIncludeDrawables());
        }
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        return (int) (fMax + ((anonymousClass1 == null || anonymousClass1.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (chatActivity.chatMode == 3) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.currentConnectionState = ConnectionsManager.getInstance(i).getConnectionState();
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

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (chatActivity.chatMode == 3) {
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
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
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ImageView imageView;
        if (i != 0 || (imageView = this.timeItem) == null) {
            return;
        }
        imageView.setAlpha(f);
        float f3 = 0.85f * f;
        imageView.setScaleX(f3);
        imageView.setScaleY(f3);
        imageView.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
        SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
        if (simpleTextConnectedView != null) {
            sb.append(simpleTextConnectedView.getText());
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        int measuredHeight = (((currentActionBarHeight - anonymousClass1.getMeasuredHeight()) - 2) / 2) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0);
        int iDp = AndroidUtilities.dp(this.glassMode ? 23.66f : 24.0f) + measuredHeight;
        int i5 = this.leftPadding + 1;
        int i6 = measuredHeight + 1;
        anonymousClass1.layout(i5, i6, anonymousClass1.getMeasuredWidth() + i5, anonymousClass1.getMeasuredHeight() + i6);
        int i7 = this.leftPadding;
        if (anonymousClass1.getVisibility() == 0) {
            f = this.glassMode ? 49.66f : 55.0f;
        } else {
            f = this.glassMode ? 13.0f : 1.0f;
        }
        int iDp2 = i7 + AndroidUtilities.dp(f) + this.rightAvatarPadding;
        SimpleTextView simpleTextView = (SimpleTextView) this.titleTextLargerCopyView.get();
        int visibility = getSubtitleTextView().getVisibility();
        SimpleTextConnectedView simpleTextConnectedView = this.titleTextView;
        if (visibility != 8) {
            simpleTextConnectedView.layout(iDp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - simpleTextConnectedView.getPaddingTop(), simpleTextConnectedView.getMeasuredWidth() + iDp2, simpleTextConnectedView.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (simpleTextConnectedView.getTextHeight() + measuredHeight)) - simpleTextConnectedView.getPaddingTop()));
            if (simpleTextView != null) {
                simpleTextView.layout(iDp2, AndroidUtilities.dp(1.66f) + measuredHeight, simpleTextView.getMeasuredWidth() + iDp2, AndroidUtilities.dp(1.66f) + simpleTextView.getTextHeight() + measuredHeight);
            }
        } else {
            simpleTextConnectedView.layout(iDp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - simpleTextConnectedView.getPaddingTop(), simpleTextConnectedView.getMeasuredWidth() + iDp2, simpleTextConnectedView.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (simpleTextConnectedView.getTextHeight() + measuredHeight)) - simpleTextConnectedView.getPaddingTop()));
            if (simpleTextView != null) {
                simpleTextView.layout(iDp2, AndroidUtilities.dp(10.0f) + measuredHeight, simpleTextView.getMeasuredWidth() + iDp2, AndroidUtilities.dp(10.0f) + simpleTextView.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.communityItem;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.leftPadding, AndroidUtilities.dp(27.33f) + measuredHeight, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.leftPadding, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.timeItem;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.leftPadding, measuredHeight - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.leftPadding, imageView2.getMeasuredHeight() + (measuredHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.starBgItem;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.leftPadding, AndroidUtilities.dp(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.leftPadding, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.starFgItem;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.leftPadding, AndroidUtilities.dp(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.leftPadding, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        SimpleTextConnectedView simpleTextConnectedView2 = this.subtitleTextView;
        if (simpleTextConnectedView2 != null) {
            simpleTextConnectedView2.layout(iDp2, iDp, simpleTextConnectedView2.getMeasuredWidth() + iDp2, simpleTextConnectedView2.getTextHeight() + iDp);
        } else {
            AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
            if (animatedTextView != null) {
                animatedTextView.layout(iDp2, iDp, animatedTextView.getMeasuredWidth() + iDp2, animatedTextView.getTextHeight() + iDp);
            }
        }
        SimpleTextView simpleTextView2 = (SimpleTextView) this.subtitleTextLargerCopyView.get();
        if (simpleTextView2 != null) {
            simpleTextView2.layout(iDp2, iDp, simpleTextView2.getMeasuredWidth() + iDp2, simpleTextView2.getTextHeight() + iDp);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        int iDp = size - AndroidUtilities.dp((anonymousClass1.getVisibility() == 0 ? 54 : 0) + 16);
        float f = this.avatarSizeInDp;
        anonymousClass1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f) - 2, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        SimpleTextConnectedView simpleTextConnectedView = this.titleTextView;
        simpleTextConnectedView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
        SimpleTextConnectedView simpleTextConnectedView2 = this.subtitleTextView;
        if (simpleTextConnectedView2 != null) {
            simpleTextConnectedView2.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (animatedTextView != null) {
            animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
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
        AtomicReference atomicReference = this.titleTextLargerCopyView;
        if (i3 != -1 && i3 != size && i3 > size) {
            this.largerWidth = i3;
            View view = (SimpleTextView) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            atomicReference.set(simpleTextView);
            int i4 = Theme.key_actionBarDefaultTitle;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            simpleTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
            simpleTextView.setTextSizePx(AndroidUtilities.dp(this.glassMode ? 17.5f : 18.0f));
            simpleTextView.setGravity(3);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            simpleTextView.setRightDrawable(simpleTextConnectedView.getRightDrawable());
            simpleTextView.setRightDrawable2(simpleTextConnectedView.getRightDrawable2());
            simpleTextView.setRightDrawableOutside(simpleTextConnectedView.getRightDrawableOutside());
            simpleTextView.setLeftDrawable(simpleTextConnectedView.getLeftDrawable());
            simpleTextView.setText(simpleTextConnectedView.getText(), false);
            ViewPropertyAnimator duration = simpleTextView.animate().alpha(0.0f).setDuration(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 0)).start();
            addView(simpleTextView);
            AtomicReference atomicReference2 = this.subtitleTextLargerCopyView;
            View view2 = (SimpleTextView) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
            atomicReference2.set(simpleTextView2);
            int i5 = Theme.key_actionBarDefaultSubtitle;
            simpleTextView2.setTextColor(Theme.getColor(i5, resourcesProvider));
            simpleTextView2.setTag(Integer.valueOf(i5));
            simpleTextView2.setTextSizePx(AndroidUtilities.dp(this.glassMode ? 13.5f : 14.0f));
            simpleTextView2.setGravity(3);
            if (simpleTextConnectedView2 != null) {
                simpleTextView2.setText(simpleTextConnectedView2.getText(), false);
            } else if (animatedTextView != null) {
                simpleTextView2.setText(animatedTextView.getText(), false);
            }
            simpleTextView2.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).withEndAction(new ChatAvatarContainer$$ExternalSyntheticLambda0(this, 1)).start();
            addView(simpleTextView2);
            setClipChildren(false);
        }
        SimpleTextView simpleTextView3 = (SimpleTextView) atomicReference.get();
        if (simpleTextView3 != null) {
            simpleTextView3.measure(OKLCH.m(this.largerWidth, (anonymousClass1.getVisibility() == 0 ? 54 : 0) + 16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.lastWidth = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ButtonBounce buttonBounce = this.bounce;
        ChatAvatarContainer$$ExternalSyntheticLambda0 chatAvatarContainer$$ExternalSyntheticLambda0 = this.onLongClick;
        if (action == 0 && canSearch()) {
            this.pressed = true;
            buttonBounce.setPressed(true);
            AndroidUtilities.cancelRunOnUIThread(chatAvatarContainer$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(chatAvatarContainer$$ExternalSyntheticLambda0, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.pressed) {
            buttonBounce.setPressed(false);
            this.pressed = false;
            if (isClickable()) {
                openProfile(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(chatAvatarContainer$$ExternalSyntheticLambda0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void openProfile(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ChatActivityTopPanelLayout chatActivityTopPanelLayout;
        TLRPC.User user;
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        if (z) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y && anonymousClass1.getImageReceiver().hasNotThumb()) {
                    z3 = z;
                }
            }
            z3 = false;
        } else {
            z3 = z;
        }
        ChatActivity chatActivity = this.parentFragment;
        TLRPC.User currentUser = chatActivity.getCurrentUser();
        TLRPC.Chat chat = chatActivity.currentChat;
        boolean z5 = chat != null && chat.monoforum;
        if (chat != null && chat.monoforum) {
            chat = chatActivity.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat == null) {
                return;
            }
            if (chatActivity.getSendMonoForumPeerId() != 0 && (user = chatActivity.getMessagesController().getUser(Long.valueOf(chatActivity.getSendMonoForumPeerId()))) != null) {
                chat = null;
                currentUser = user;
            }
        }
        ImageReceiver imageReceiver = anonymousClass1.getImageReceiver();
        String imageKey = imageReceiver.getImageKey();
        ImageLoader imageLoader = ImageLoader.getInstance();
        if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
            Drawable drawable = imageReceiver.getDrawable();
            if ((drawable instanceof BitmapDrawable) && !(drawable instanceof AnimatedFileDrawable)) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (chatActivity.isComments) {
            if (chat == null) {
                return;
            }
            chatActivity.presentFragment(ProfileActivity.of(-chat.id), z2);
            return;
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (currentUser == null) {
            boolean z6 = z3;
            if (chat != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.id);
                if (chatActivity.chatMode == 3) {
                    bundle.putLong("topic_id", chatActivity.getSavedDialogId());
                } else if (chatActivity.isTopic) {
                    bundle.putLong("topic_id", chatActivity.threadMessageObject.getId());
                }
                ProfileActivity profileActivity = new ProfileActivity(bundle, sharedMediaPreloader);
                if (!z5) {
                    profileActivity.setChatInfo(chatActivity.chatInfo);
                }
                profileActivity.setPlayProfileAnimation(z6 ? 2 : 1);
                chatActivity.presentFragment(profileActivity, z2);
                return;
            }
            return;
        }
        if (currentUser.id == 489000) {
            return;
        }
        Bundle bundle2 = new Bundle();
        if (UserObject.isUserSelf(currentUser)) {
            int[] iArr = sharedMediaPreloader.lastMediaCount;
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    if (sharedMediaPreloader.hasSavedMessages) {
                        break;
                    }
                    BaseFragment baseFragment = sharedMediaPreloader.parentFragment;
                    if (baseFragment != null) {
                        if (sharedMediaPreloader.dialogId == baseFragment.getUserConfig().getClientUserId() && sharedMediaPreloader.topicId == 0 && baseFragment.getMessagesController().getSavedMessagesController().hasDialogs()) {
                            break;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (iArr[i] > 0) {
                    break;
                } else {
                    i++;
                }
            }
            bundle2.putLong("dialog_id", chatActivity.getDialogId());
            if (chatActivity.chatMode == 3) {
                bundle2.putLong("topic_id", chatActivity.getSavedDialogId());
            }
            MediaActivity mediaActivity = new MediaActivity(bundle2, sharedMediaPreloader);
            mediaActivity.currentChatInfo = chatActivity.chatInfo;
            chatActivity.presentFragment(mediaActivity, z2);
            return;
        }
        if (chatActivity.chatMode == 3) {
            z4 = z3;
            long savedDialogId = chatActivity.getSavedDialogId();
            bundle2.putBoolean("saved", true);
            if (savedDialogId >= 0) {
                bundle2.putLong("user_id", savedDialogId);
            } else {
                bundle2.putLong("chat_id", -savedDialogId);
            }
        } else {
            z4 = z3;
            bundle2.putLong("user_id", currentUser.id);
            if (this.timeItem != null && !z5) {
                bundle2.putLong("dialog_id", chatActivity.getDialogId());
            }
        }
        if (UserObject.isBotForum(currentUser)) {
            bundle2.putLong("topic_id", chatActivity.getTopicId());
        }
        QrActivity.AnonymousClass1 anonymousClass2 = chatActivity.topChatPanelView;
        bundle2.putBoolean("reportSpam", (anonymousClass2 == null || (chatActivityTopPanelLayout = chatActivity.topPanelLayout) == null || !chatActivityTopPanelLayout.isViewVisible(anonymousClass2) || chatActivity.reportSpamButton.getVisibility() == 8) ? false : true);
        bundle2.putInt("actionBarColor", Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider));
        ProfileActivity profileActivity2 = new ProfileActivity(bundle2, sharedMediaPreloader);
        if (!z5) {
            profileActivity2.setUserInfo(chatActivity.userInfo, chatActivity.profileChannelMessageFetcher, chatActivity.birthdayAssetsFetcher);
        }
        profileActivity2.setPlayProfileAnimation(z4 ? 2 : 1);
        chatActivity.presentFragment(profileActivity2, z2);
    }

    public void openSearch() {
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(this.currentAccount, chat);
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        if (anonymousClass1 != null) {
            anonymousClass1.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            anonymousClass1.onNewImageSet();
            if (ChatObject.isForum(chat)) {
                f = ChatObject.hasStories(chat) ? 11.0f : 16.0f;
            } else {
                f = 21.0f;
            }
            anonymousClass1.setRoundRadius(AndroidUtilities.dp(f));
        }
    }

    public void setCommunityItemVisible(boolean z) {
        ImageView imageView = this.communityItem;
        if (imageView != null) {
            imageView.setVisibility((!z || this.avatarImageIsHidden) ? 8 : 0);
        }
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

    public void setStoriesForceState(Integer num) {
        this.storiesForceState = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.lastSubtitle == null) {
            SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
            if (simpleTextConnectedView != null) {
                simpleTextConnectedView.setText(charSequence);
            } else {
                AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
                if (animatedTextView != null) {
                    animatedTextView.setText(charSequence);
                }
            }
        } else {
            this.lastSubtitle = charSequence;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.checkAvatarContainerWidth(true);
        }
    }

    public final void setTime(int i, boolean z) {
        TimerDrawable timerDrawable = this.timerDrawable;
        if (timerDrawable == null) {
            return;
        }
        boolean z2 = this.stars;
        if (i != 0 || this.secretChatTimer) {
            BoolAnimator boolAnimator = this.animatorTimeVisible;
            if (z2) {
                boolAnimator.setValue(false, z);
            } else {
                boolAnimator.setValue(true, z);
                timerDrawable.setTime(i);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        setUserAvatar(user, false);
    }

    public final void updateCurrentConnectionState() {
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
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        AnimatedTextView animatedTextView = this.animatedSubtitleTextView;
        SimpleTextConnectedView simpleTextConnectedView = this.subtitleTextView;
        if (string == null) {
            CharSequence charSequence = this.lastSubtitle;
            if (charSequence != null) {
                if (simpleTextConnectedView != null) {
                    simpleTextConnectedView.setText(charSequence);
                    this.lastSubtitle = null;
                    Integer num = this.overrideSubtitleColor;
                    if (num != null) {
                        simpleTextConnectedView.setTextColor(num.intValue());
                    } else {
                        int i2 = this.lastSubtitleColorKey;
                        if (i2 >= 0) {
                            simpleTextConnectedView.setTextColor(Theme.getColor(i2, resourcesProvider));
                            simpleTextConnectedView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                        }
                    }
                } else if (animatedTextView != null) {
                    animatedTextView.setText(charSequence, !LocaleController.isRTL, true);
                    this.lastSubtitle = null;
                    Integer num2 = this.overrideSubtitleColor;
                    if (num2 != null) {
                        animatedTextView.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.lastSubtitleColorKey;
                        if (i3 >= 0) {
                            animatedTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
                            animatedTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                        }
                    }
                }
            }
        } else if (simpleTextConnectedView != null) {
            if (this.lastSubtitle == null) {
                this.lastSubtitle = simpleTextConnectedView.getText();
            }
            simpleTextConnectedView.setText(string);
            Integer num3 = this.overrideSubtitleColor;
            if (num3 != null) {
                simpleTextConnectedView.setTextColor(num3.intValue());
            } else {
                int i4 = Theme.key_actionBarDefaultSubtitle;
                simpleTextConnectedView.setTextColor(Theme.getColor(i4, resourcesProvider));
                simpleTextConnectedView.setTag(Integer.valueOf(i4));
            }
        } else if (animatedTextView != null) {
            if (this.lastSubtitle == null) {
                this.lastSubtitle = animatedTextView.getText();
            }
            animatedTextView.setText(string, !LocaleController.isRTL, true);
            Integer num4 = this.overrideSubtitleColor;
            if (num4 != null) {
                animatedTextView.setTextColor(num4.intValue());
            } else {
                int i5 = Theme.key_actionBarDefaultSubtitle;
                animatedTextView.setTextColor(Theme.getColor(i5, resourcesProvider));
                animatedTextView.setTag(Integer.valueOf(i5));
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.checkAvatarContainerWidth(true);
        }
    }

    public final void updateOnlineCount() {
        TLRPC.UserStatus userStatus;
        boolean z;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        this.onlineCount = 0;
        TLRPC.ChatFull chatFull = chatActivity.chatInfo;
        if (chatFull == null) {
            return;
        }
        int i = this.currentAccount;
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z || chatFull.participants_count <= 200) {
                return;
            }
            this.onlineCount = chatFull.online_count;
            return;
        }
        for (int i2 = 0; i2 < chatFull.participants.participants.size(); i2++) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(i).getClientUserId()) && user.status.expires > 10000)) {
                this.onlineCount++;
            }
        }
    }

    public final void updateSubtitle(boolean z) {
        long j;
        int i;
        int i2;
        CharSequence printingString;
        CharSequence string;
        int i3;
        TLRPC.User user;
        long j2;
        long j3;
        int i4;
        TLRPC.ChatFull chatFull;
        int i5;
        int size;
        TLRPC.ChatParticipants chatParticipants;
        int i6;
        String shortNumber;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        int i7;
        int topicsCount;
        String string2;
        int i8;
        ActionBar actionBar;
        Theme.ResourcesProvider resourcesProvider;
        SimpleTextConnectedView simpleTextConnectedView;
        AnimatedTextView animatedTextView;
        Integer num;
        Integer num2;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        final int i9 = 1;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        if (chatActivity.chatMode == 6) {
            String strSubstring = chatActivity.businessLink.link;
            BusinessLinksController[] businessLinksControllerArr = BusinessLinksController.Instance;
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            setSubtitle(strSubstring);
            return;
        }
        TLRPC.User currentUser = chatActivity.getCurrentUser();
        TLRPC.Chat chat = chatActivity.currentChat;
        boolean z3 = UserObject.isUserSelf(currentUser) && chatActivity.chatMode == 0 && chatActivity.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.showingSavedMessagesHint || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if ((!UserObject.isUserSelf(currentUser) || z3) && !UserObject.isReplyUser(currentUser)) {
            j = 489000;
            if ((currentUser != null && currentUser.id == 489000) || ((i = chatActivity.chatMode) != 0 && i != 8)) {
            }
            if (z3) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    getSubtitleTextView().setVisibility(0);
                }
                if (!this.showingSavedMessagesHint) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) + 1).apply();
                    this.showingSavedMessagesHint = true;
                }
            }
            i2 = this.currentAccount;
            printingString = MessagesController.getInstance(i2).getPrintingString(chatActivity.getDialogId(), chatActivity.threadMessageId, false);
            if (printingString == null) {
                UserObject.isBotForum(currentUser);
            }
            string = "";
            if (printingString != null) {
                printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            SimpleTextConnectedView simpleTextConnectedView2 = this.titleTextView;
            if (printingString == null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                if (chatActivity.isThreadChat() && simpleTextConnectedView2.getTag() != null) {
                    simpleTextConnectedView2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.titleAnimation;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.titleAnimation = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.titleAnimation = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(simpleTextConnectedView2, (Property<SimpleTextConnectedView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                        this.titleAnimation.addListener(new AnimatorListenerAdapter(this) {
                            public final ChatAvatarContainer this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {
                                switch (i9) {
                                    case 0:
                                        this.this$0.titleAnimation = null;
                                        break;
                                    default:
                                        super.onAnimationCancel(animator);
                                        break;
                                }
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i9) {
                                    case 0:
                                        ChatAvatarContainer chatAvatarContainer = this.this$0;
                                        if (chatAvatarContainer.titleAnimation == animator) {
                                            chatAvatarContainer.getSubtitleTextView().setVisibility(4);
                                            chatAvatarContainer.titleAnimation = null;
                                        }
                                        break;
                                    default:
                                        this.this$0.titleAnimation = null;
                                        break;
                                }
                            }
                        });
                        this.titleAnimation.setDuration(180L);
                        this.titleAnimation.start();
                    } else {
                        simpleTextConnectedView2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i2).getPrintingStringType(chatActivity.getDialogId(), chatActivity.threadMessageId);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    printingString = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                }
                setTypingAnimation(true);
                z2 = true;
            } else {
                if (!chatActivity.isThreadChat() && !chatActivity.isTopic) {
                    if (simpleTextConnectedView2.getTag() != null) {
                        return;
                    }
                    simpleTextConnectedView2.setTag(1);
                    AnimatorSet animatorSet3 = this.titleAnimation;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.titleAnimation = null;
                    }
                    if (!z) {
                        simpleTextConnectedView2.setTranslationY(AndroidUtilities.dp(9.7f));
                        getSubtitleTextView().setAlpha(0.0f);
                        getSubtitleTextView().setVisibility(4);
                        return;
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.titleAnimation = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(simpleTextConnectedView2, (Property<SimpleTextConnectedView, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    AnimatorSet animatorSet5 = this.titleAnimation;
                    final int i10 = false ? 1 : 0;
                    animatorSet5.addListener(new AnimatorListenerAdapter(this) {
                        public final ChatAvatarContainer this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            switch (i10) {
                                case 0:
                                    this.this$0.titleAnimation = null;
                                    break;
                                default:
                                    super.onAnimationCancel(animator);
                                    break;
                            }
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i10) {
                                case 0:
                                    ChatAvatarContainer chatAvatarContainer = this.this$0;
                                    if (chatAvatarContainer.titleAnimation == animator) {
                                        chatAvatarContainer.getSubtitleTextView().setVisibility(4);
                                        chatAvatarContainer.titleAnimation = null;
                                    }
                                    break;
                                default:
                                    this.this$0.titleAnimation = null;
                                    break;
                            }
                        }
                    });
                    this.titleAnimation.setDuration(180L);
                    this.titleAnimation.start();
                    return;
                }
                setTypingAnimation(false);
                i3 = chatActivity.chatMode;
                if (i3 == 8) {
                    if (chatActivity.isSubscriberSuggestions) {
                        string = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (chatActivity.getTopicId() == 0) {
                        topicsCount = chatActivity.getMessagesController().getTopicsController().getTopicsCount(-chatActivity.getDialogId());
                        if (topicsCount > 0) {
                            string2 = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        string = string2;
                    } else {
                        tL_forumTopicFindTopic = MessagesController.getInstance(i2).getTopicsController().findTopic(chat.id, chatActivity.getTopicId());
                        if (tL_forumTopicFindTopic != null) {
                            i7 = tL_forumTopicFindTopic.totalMessagesCount;
                        } else {
                            i7 = 0;
                        }
                        if (i7 > 0) {
                            string = LocaleController.formatPluralString("messages", i7, Integer.valueOf(i7));
                        } else {
                            string = LocaleController.formatString(R.string.TopicProfileStatus, ForumUtilities.getMonoForumTitle(chat, i2, false));
                        }
                    }
                } else if (i3 == 3) {
                    string = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, chatActivity.getMessagesController().getSavedMessagesController().getMessagesCount(chatActivity.getSavedDialogId())), new Object[0]);
                } else if (!chatActivity.isTopic && chat != null) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic2 = MessagesController.getInstance(i2).getTopicsController().findTopic(chat.id, chatActivity.getTopicId());
                    int i11 = tL_forumTopicFindTopic2 != null ? tL_forumTopicFindTopic2.totalMessagesCount - 1 : 0;
                    string = i11 > 0 ? LocaleController.formatPluralString("messages", i11, Integer.valueOf(i11)) : LocaleController.formatString(R.string.TopicProfileStatus, chat.title);
                } else if (chat != null) {
                    chatFull = chatActivity.chatInfo;
                    i5 = this.onlineCount;
                    if (ChatObject.isChannel(chat)) {
                        if (chatFull != null || (i6 = chatFull.participants_count) == 0) {
                            if (chat.megagroup) {
                                if (chatFull == null) {
                                    string = LocaleController.getString(R.string.Loading).toLowerCase();
                                } else if (chat.has_geo) {
                                    string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                                } else if (ChatObject.isPublic(chat)) {
                                    string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                } else {
                                    string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                }
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            }
                        } else if (chat.megagroup) {
                            string = i5 > 1 ? zzkc.m(LocaleController.formatPluralString("Members", i6, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i5, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i6, new Object[0]);
                        } else {
                            int[] iArr = new int[1];
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                int i12 = chatFull.participants_count;
                                iArr[0] = i12;
                                shortNumber = String.valueOf(i12);
                            } else {
                                shortNumber = LocaleController.formatShortNumber(chatFull.participants_count, iArr);
                            }
                            string = chat.megagroup ? LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber) : LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber);
                        }
                    } else if (ChatObject.isKickedFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouWereKicked);
                    } else if (ChatObject.isLeftFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouLeft);
                    } else {
                        size = chat.participants_count;
                        if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                            size = chatParticipants.participants.size();
                        }
                        if (i5 > 1 || size == 0) {
                            string = LocaleController.formatPluralString("Members", size, new Object[0]);
                        } else {
                            string = zzkc.m(LocaleController.formatPluralString("Members", size, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i5, new Object[0]));
                        }
                    }
                } else if (currentUser != null) {
                    user = MessagesController.getInstance(i2).getUser(Long.valueOf(currentUser.id));
                    if (user != null) {
                        currentUser = user;
                    }
                    if (!UserObject.isReplyUser(currentUser)) {
                        j2 = currentUser.id;
                        if (j2 != j) {
                            if (j2 != UserConfig.getInstance(i2).getClientUserId()) {
                                j3 = currentUser.id;
                                if (j3 != 333000 || j3 == 777000 || j3 == 42777) {
                                    string = LocaleController.getString(R.string.ServiceNotifications);
                                } else if (MessagesController.isSupportUser(currentUser)) {
                                    string = LocaleController.getString(R.string.SupportStatus);
                                } else {
                                    boolean z4 = currentUser.bot;
                                    if (z4 && (i4 = currentUser.bot_active_users) != 0) {
                                        string = LocaleController.formatPluralStringComma("BotUsers", i4, ',');
                                    } else if (z4) {
                                        string = LocaleController.getString(R.string.Bot);
                                    } else {
                                        boolean[] zArr = this.isOnline;
                                        zArr[0] = false;
                                        String userStatus = LocaleController.formatUserStatus(i2, currentUser, zArr, this.allowShorterStatus ? this.statusMadeShorter : null);
                                        z2 = zArr[0];
                                        string = userStatus;
                                    }
                                }
                            } else if (z3) {
                                string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                            } else {
                                string = LocaleController.getString(R.string.ChatYourSelf);
                            }
                        }
                    }
                }
                printingString = string;
            }
            if (z2) {
                i8 = Theme.key_chat_status;
            } else {
                i8 = Theme.key_actionBarDefaultSubtitle;
            }
            this.lastSubtitleColorKey = i8;
            if (this.lastSubtitle == null) {
                resourcesProvider = this.resourcesProvider;
                simpleTextConnectedView = this.subtitleTextView;
                if (simpleTextConnectedView != null) {
                    simpleTextConnectedView.setText(printingString);
                    num2 = this.overrideSubtitleColor;
                    if (num2 == null) {
                        simpleTextConnectedView.setTextColor(Theme.getColor(this.lastSubtitleColorKey, resourcesProvider));
                        simpleTextConnectedView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                    } else {
                        simpleTextConnectedView.setTextColor(num2.intValue());
                    }
                } else {
                    animatedTextView = this.animatedSubtitleTextView;
                    animatedTextView.setText(printingString, z, true);
                    num = this.overrideSubtitleColor;
                    if (num == null) {
                        animatedTextView.setTextColor(Theme.getColor(this.lastSubtitleColorKey, resourcesProvider));
                        animatedTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                    } else {
                        animatedTextView.setTextColor(num.intValue());
                    }
                }
            } else {
                this.lastSubtitle = printingString;
            }
            actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.checkAvatarContainerWidth(z);
            }
        }
        j = 489000;
        if (chatActivity.chatMode != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z3) {
            if (getSubtitleTextView().getVisibility() != 0) {
                getSubtitleTextView().setVisibility(0);
            }
            if (!this.showingSavedMessagesHint) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) + 1).apply();
                this.showingSavedMessagesHint = true;
            }
        }
        i2 = this.currentAccount;
        printingString = MessagesController.getInstance(i2).getPrintingString(chatActivity.getDialogId(), chatActivity.threadMessageId, false);
        if (printingString == null) {
            UserObject.isBotForum(currentUser);
        }
        string = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property3 = View.ALPHA;
        Property property4 = View.TRANSLATION_Y;
        SimpleTextConnectedView simpleTextConnectedView3 = this.titleTextView;
        if (printingString == null) {
            if (!chatActivity.isThreadChat()) {
            }
            setTypingAnimation(false);
            i3 = chatActivity.chatMode;
            if (i3 == 8) {
                if (chatActivity.isSubscriberSuggestions) {
                    string = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (chatActivity.getTopicId() == 0) {
                    topicsCount = chatActivity.getMessagesController().getTopicsController().getTopicsCount(-chatActivity.getDialogId());
                    if (topicsCount > 0) {
                        string2 = LocaleController.formatPluralStringComma("Chats", topicsCount);
                    } else {
                        string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    }
                    string = string2;
                } else {
                    tL_forumTopicFindTopic = MessagesController.getInstance(i2).getTopicsController().findTopic(chat.id, chatActivity.getTopicId());
                    if (tL_forumTopicFindTopic != null) {
                        i7 = tL_forumTopicFindTopic.totalMessagesCount;
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        string = LocaleController.formatPluralString("messages", i7, Integer.valueOf(i7));
                    } else {
                        string = LocaleController.formatString(R.string.TopicProfileStatus, ForumUtilities.getMonoForumTitle(chat, i2, false));
                    }
                }
            } else if (i3 == 3) {
                string = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, chatActivity.getMessagesController().getSavedMessagesController().getMessagesCount(chatActivity.getSavedDialogId())), new Object[0]);
            } else if (!chatActivity.isTopic) {
                if (chat != null) {
                    chatFull = chatActivity.chatInfo;
                    i5 = this.onlineCount;
                    if (ChatObject.isChannel(chat)) {
                        if (chatFull != null) {
                            if (chat.megagroup) {
                                if (chatFull == null) {
                                    string = LocaleController.getString(R.string.Loading).toLowerCase();
                                } else if (chat.has_geo) {
                                    string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                                } else if (ChatObject.isPublic(chat)) {
                                    string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                } else {
                                    string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                }
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            }
                        } else if (chat.megagroup) {
                            if (chatFull == null) {
                                string = LocaleController.getString(R.string.Loading).toLowerCase();
                            } else if (chat.has_geo) {
                                string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            }
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        }
                    } else if (ChatObject.isKickedFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouWereKicked);
                    } else if (ChatObject.isLeftFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouLeft);
                    } else {
                        size = chat.participants_count;
                        if (chatFull != null) {
                            size = chatParticipants.participants.size();
                        }
                        if (i5 > 1) {
                            string = LocaleController.formatPluralString("Members", size, new Object[0]);
                        } else {
                            string = LocaleController.formatPluralString("Members", size, new Object[0]);
                        }
                    }
                } else if (currentUser != null) {
                    user = MessagesController.getInstance(i2).getUser(Long.valueOf(currentUser.id));
                    if (user != null) {
                        currentUser = user;
                    }
                    if (!UserObject.isReplyUser(currentUser)) {
                        j2 = currentUser.id;
                        if (j2 != j) {
                            if (j2 != UserConfig.getInstance(i2).getClientUserId()) {
                                j3 = currentUser.id;
                                if (j3 != 333000) {
                                    string = LocaleController.getString(R.string.ServiceNotifications);
                                } else {
                                    string = LocaleController.getString(R.string.ServiceNotifications);
                                }
                            } else if (z3) {
                                string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                            } else {
                                string = LocaleController.getString(R.string.ChatYourSelf);
                            }
                        }
                    }
                }
            } else if (chat != null) {
                chatFull = chatActivity.chatInfo;
                i5 = this.onlineCount;
                if (ChatObject.isChannel(chat)) {
                    if (chatFull != null) {
                        if (chat.megagroup) {
                            if (chatFull == null) {
                                string = LocaleController.getString(R.string.Loading).toLowerCase();
                            } else if (chat.has_geo) {
                                string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            }
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        }
                    } else if (chat.megagroup) {
                        if (chatFull == null) {
                            string = LocaleController.getString(R.string.Loading).toLowerCase();
                        } else if (chat.has_geo) {
                            string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                        }
                    } else if (ChatObject.isPublic(chat)) {
                        string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    } else {
                        string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                    }
                } else if (ChatObject.isKickedFromChat(chat)) {
                    string = LocaleController.getString(R.string.YouWereKicked);
                } else if (ChatObject.isLeftFromChat(chat)) {
                    string = LocaleController.getString(R.string.YouLeft);
                } else {
                    size = chat.participants_count;
                    if (chatFull != null) {
                        size = chatParticipants.participants.size();
                    }
                    if (i5 > 1) {
                        string = LocaleController.formatPluralString("Members", size, new Object[0]);
                    } else {
                        string = LocaleController.formatPluralString("Members", size, new Object[0]);
                    }
                }
            } else if (currentUser != null) {
                user = MessagesController.getInstance(i2).getUser(Long.valueOf(currentUser.id));
                if (user != null) {
                    currentUser = user;
                }
                if (!UserObject.isReplyUser(currentUser)) {
                    j2 = currentUser.id;
                    if (j2 != j) {
                        if (j2 != UserConfig.getInstance(i2).getClientUserId()) {
                            j3 = currentUser.id;
                            if (j3 != 333000) {
                                string = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                string = LocaleController.getString(R.string.ServiceNotifications);
                            }
                        } else if (z3) {
                            string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                        } else {
                            string = LocaleController.getString(R.string.ChatYourSelf);
                        }
                    }
                }
            }
            printingString = string;
        } else {
            if (!chatActivity.isThreadChat()) {
            }
            setTypingAnimation(false);
            i3 = chatActivity.chatMode;
            if (i3 == 8) {
                if (chatActivity.isSubscriberSuggestions) {
                    string = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (chatActivity.getTopicId() == 0) {
                    topicsCount = chatActivity.getMessagesController().getTopicsController().getTopicsCount(-chatActivity.getDialogId());
                    if (topicsCount > 0) {
                        string2 = LocaleController.formatPluralStringComma("Chats", topicsCount);
                    } else {
                        string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    }
                    string = string2;
                } else {
                    tL_forumTopicFindTopic = MessagesController.getInstance(i2).getTopicsController().findTopic(chat.id, chatActivity.getTopicId());
                    if (tL_forumTopicFindTopic != null) {
                        i7 = tL_forumTopicFindTopic.totalMessagesCount;
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        string = LocaleController.formatPluralString("messages", i7, Integer.valueOf(i7));
                    } else {
                        string = LocaleController.formatString(R.string.TopicProfileStatus, ForumUtilities.getMonoForumTitle(chat, i2, false));
                    }
                }
            } else if (i3 == 3) {
                string = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, chatActivity.getMessagesController().getSavedMessagesController().getMessagesCount(chatActivity.getSavedDialogId())), new Object[0]);
            } else if (!chatActivity.isTopic) {
                if (chat != null) {
                    chatFull = chatActivity.chatInfo;
                    i5 = this.onlineCount;
                    if (ChatObject.isChannel(chat)) {
                        if (chatFull != null) {
                            if (chat.megagroup) {
                                if (chatFull == null) {
                                    string = LocaleController.getString(R.string.Loading).toLowerCase();
                                } else if (chat.has_geo) {
                                    string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                                } else if (ChatObject.isPublic(chat)) {
                                    string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                } else {
                                    string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                }
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            }
                        } else if (chat.megagroup) {
                            if (chatFull == null) {
                                string = LocaleController.getString(R.string.Loading).toLowerCase();
                            } else if (chat.has_geo) {
                                string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            }
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        }
                    } else if (ChatObject.isKickedFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouWereKicked);
                    } else if (ChatObject.isLeftFromChat(chat)) {
                        string = LocaleController.getString(R.string.YouLeft);
                    } else {
                        size = chat.participants_count;
                        if (chatFull != null) {
                            size = chatParticipants.participants.size();
                        }
                        if (i5 > 1) {
                            string = LocaleController.formatPluralString("Members", size, new Object[0]);
                        } else {
                            string = LocaleController.formatPluralString("Members", size, new Object[0]);
                        }
                    }
                } else if (currentUser != null) {
                    user = MessagesController.getInstance(i2).getUser(Long.valueOf(currentUser.id));
                    if (user != null) {
                        currentUser = user;
                    }
                    if (!UserObject.isReplyUser(currentUser)) {
                        j2 = currentUser.id;
                        if (j2 != j) {
                            if (j2 != UserConfig.getInstance(i2).getClientUserId()) {
                                j3 = currentUser.id;
                                if (j3 != 333000) {
                                    string = LocaleController.getString(R.string.ServiceNotifications);
                                } else {
                                    string = LocaleController.getString(R.string.ServiceNotifications);
                                }
                            } else if (z3) {
                                string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                            } else {
                                string = LocaleController.getString(R.string.ChatYourSelf);
                            }
                        }
                    }
                }
            } else if (chat != null) {
                chatFull = chatActivity.chatInfo;
                i5 = this.onlineCount;
                if (ChatObject.isChannel(chat)) {
                    if (chatFull != null) {
                        if (chat.megagroup) {
                            if (chatFull == null) {
                                string = LocaleController.getString(R.string.Loading).toLowerCase();
                            } else if (chat.has_geo) {
                                string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                            } else if (ChatObject.isPublic(chat)) {
                                string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                            } else {
                                string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            }
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        }
                    } else if (chat.megagroup) {
                        if (chatFull == null) {
                            string = LocaleController.getString(R.string.Loading).toLowerCase();
                        } else if (chat.has_geo) {
                            string = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                        } else if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                        }
                    } else if (ChatObject.isPublic(chat)) {
                        string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    } else {
                        string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                    }
                } else if (ChatObject.isKickedFromChat(chat)) {
                    string = LocaleController.getString(R.string.YouWereKicked);
                } else if (ChatObject.isLeftFromChat(chat)) {
                    string = LocaleController.getString(R.string.YouLeft);
                } else {
                    size = chat.participants_count;
                    if (chatFull != null) {
                        size = chatParticipants.participants.size();
                    }
                    if (i5 > 1) {
                        string = LocaleController.formatPluralString("Members", size, new Object[0]);
                    } else {
                        string = LocaleController.formatPluralString("Members", size, new Object[0]);
                    }
                }
            } else if (currentUser != null) {
                user = MessagesController.getInstance(i2).getUser(Long.valueOf(currentUser.id));
                if (user != null) {
                    currentUser = user;
                }
                if (!UserObject.isReplyUser(currentUser)) {
                    j2 = currentUser.id;
                    if (j2 != j) {
                        if (j2 != UserConfig.getInstance(i2).getClientUserId()) {
                            j3 = currentUser.id;
                            if (j3 != 333000) {
                                string = LocaleController.getString(R.string.ServiceNotifications);
                            } else {
                                string = LocaleController.getString(R.string.ServiceNotifications);
                            }
                        } else if (z3) {
                            string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false);
                        } else {
                            string = LocaleController.getString(R.string.ChatYourSelf);
                        }
                    }
                }
            }
            printingString = string;
        }
        if (z2) {
            i8 = Theme.key_chat_status;
        } else {
            i8 = Theme.key_actionBarDefaultSubtitle;
        }
        this.lastSubtitleColorKey = i8;
        if (this.lastSubtitle == null) {
            resourcesProvider = this.resourcesProvider;
            simpleTextConnectedView = this.subtitleTextView;
            if (simpleTextConnectedView != null) {
                simpleTextConnectedView.setText(printingString);
                num2 = this.overrideSubtitleColor;
                if (num2 == null) {
                    simpleTextConnectedView.setTextColor(Theme.getColor(this.lastSubtitleColorKey, resourcesProvider));
                    simpleTextConnectedView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                } else {
                    simpleTextConnectedView.setTextColor(num2.intValue());
                }
            } else {
                animatedTextView = this.animatedSubtitleTextView;
                animatedTextView.setText(printingString, z, true);
                num = this.overrideSubtitleColor;
                if (num == null) {
                    animatedTextView.setTextColor(Theme.getColor(this.lastSubtitleColorKey, resourcesProvider));
                    animatedTextView.setTag(Integer.valueOf(this.lastSubtitleColorKey));
                } else {
                    animatedTextView.setTextColor(num.intValue());
                }
            }
        } else {
            this.lastSubtitle = printingString;
        }
        actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.checkAvatarContainerWidth(z);
        }
    }

    public boolean useAnimatedSubtitle() {
        return false;
    }

    public final void setTitle(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.titleTextView.getPaint().getFontMetricsInt(), false);
        }
        this.titleTextView.setText(charSequence);
        this.rightDrawableIsScam = false;
        if (z || z2) {
            this.rightDrawableIsScam = true;
            if (!(this.titleTextView.getRightDrawable() instanceof ScamDrawable)) {
                ScamDrawable scamDrawable = new ScamDrawable(!z ? 1 : 0);
                scamDrawable.setColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, this.resourcesProvider));
                this.titleTextView.setRightDrawable2(scamDrawable);
                this.rightDrawable2ContentDescription = LocaleController.getString(R.string.ScamMessage);
                this.rightDrawableIsScamOrVerified = true;
            }
        } else if (z3) {
            Drawable drawableMutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.verifiedBackground = drawableMutate;
            int color = Theme.getColor(Theme.key_profile_verifiedBackground, this.resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.verifiedCheck = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedCheck, this.resourcesProvider), mode));
            this.titleTextView.setRightDrawable2(new CombinedDrawable(this.verifiedBackground, this.verifiedCheck));
            this.rightDrawableIsScamOrVerified = true;
            this.rightDrawable2ContentDescription = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.titleTextView.getRightDrawable() instanceof ScamDrawable) {
            this.titleTextView.setRightDrawable2(null);
            this.rightDrawableIsScamOrVerified = false;
            this.rightDrawable2ContentDescription = null;
        }
        if (z4 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.titleTextView.getRightDrawable() instanceof AnimatedEmojiDrawable.WrapSizeDrawable) && (((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).drawable instanceof AnimatedEmojiDrawable)) {
                ((AnimatedEmojiDrawable) ((AnimatedEmojiDrawable.WrapSizeDrawable) this.titleTextView.getRightDrawable()).drawable).removeView(this.titleTextView);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.emojiStatusDrawable.set(DialogObject.getEmojiStatusDocumentId(emojiStatus), z5);
            } else if (z4) {
                Drawable drawableMutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.emojiStatusDefaultDrawable = drawableMutate3;
                drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedBackground, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                this.emojiStatusDrawable.set(this.emojiStatusDefaultDrawable, z5);
            } else {
                this.emojiStatusDrawable.set((Drawable) null, z5);
            }
            zzli.m(Theme.key_profile_verifiedBackground, this.resourcesProvider, this.emojiStatusDrawable);
            this.titleTextView.setRightDrawable(this.emojiStatusDrawable);
            this.rightDrawableIsScamOrVerified = false;
            this.rightDrawableContentDescription = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.titleTextView.setRightDrawable((Drawable) null);
            this.rightDrawableContentDescription = null;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.checkAvatarContainerWidth(z5);
        }
    }

    public final void setUserAvatar(TLRPC.User user, boolean z) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(this.currentAccount, user);
        boolean zIsReplyUser = UserObject.isReplyUser(user);
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        if (zIsReplyUser) {
            avatarDrawable.setAvatarType(12);
            avatarDrawable.scaleSize = 0.8f;
            if (anonymousClass1 != null) {
                anonymousClass1.setImage(null, null, avatarDrawable, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            avatarDrawable.setAvatarType(21);
            avatarDrawable.scaleSize = 0.8f;
            if (anonymousClass1 != null) {
                anonymousClass1.setImage(null, null, avatarDrawable, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z) {
            avatarDrawable.scaleSize = 1.0f;
            if (anonymousClass1 != null) {
                anonymousClass1.imageReceiver.setForUserOrChat(user, avatarDrawable);
                anonymousClass1.onNewImageSet();
                return;
            }
            return;
        }
        avatarDrawable.setAvatarType(1);
        avatarDrawable.scaleSize = 0.8f;
        if (anonymousClass1 != null) {
            anonymousClass1.setImage(null, null, avatarDrawable, user);
        }
    }
}
