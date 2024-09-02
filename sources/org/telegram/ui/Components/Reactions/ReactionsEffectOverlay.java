package org.telegram.ui.Components.Reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public class ReactionsEffectOverlay {

    @SuppressLint({"StaticFieldLeak"})
    public static ReactionsEffectOverlay currentOverlay;

    @SuppressLint({"StaticFieldLeak"})
    public static ReactionsEffectOverlay currentShortOverlay;
    private static long lastHapticTime;
    private static int uniqPrefix;
    float animateInProgress;
    float animateOutProgress;
    private final int animationType;
    private ChatMessageCell cell;
    private final FrameLayout container;
    private final int currentAccount;
    private ViewGroup decorView;
    private float dismissProgress;
    private boolean dismissed;
    private final AnimationView effectImageView;
    private final AnimationView emojiImageView;
    private final AnimationView emojiStaticImageView;
    private final BaseFragment fragment;
    private final long groupId;
    private ReactionsContainerLayout.ReactionHolderView holderView;
    boolean isFinished;
    public boolean isStories;
    private float lastDrawnToX;
    private float lastDrawnToY;
    private final int messageId;
    private ReactionsEffectOverlay nextReactionOverlay;
    private final ReactionsLayoutInBubble.VisibleReaction reaction;
    public long startTime;
    public boolean started;
    private boolean useWindow;
    private boolean wasScrolled;
    private WindowManager windowManager;
    public FrameLayout windowView;
    int[] loc = new int[2];
    private SelectAnimatedEmojiDialog.ImageViewEmoji holderView2 = null;
    ArrayList<AvatarParticle> avatars = new ArrayList<>();

    static float access$216(ReactionsEffectOverlay reactionsEffectOverlay, float f) {
        float f2 = reactionsEffectOverlay.dismissProgress + f;
        reactionsEffectOverlay.dismissProgress = f2;
        return f2;
    }

    public ReactionsEffectOverlay(Context context, BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, ChatMessageCell chatMessageCell, View view, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2, boolean z) {
        long j;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        ChatMessageCell chatMessageCell2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int round;
        int sizeForBigReaction;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r15;
        int i7;
        int i8;
        int i9;
        boolean z2;
        String str;
        Random random;
        this.holderView = null;
        this.fragment = baseFragment;
        this.isStories = z;
        if (chatMessageCell != null) {
            this.messageId = chatMessageCell.getMessageObject().getId();
            this.groupId = chatMessageCell.getMessageObject().getGroupId();
        } else {
            this.messageId = 0;
            this.groupId = 0L;
        }
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.currentAccount = i;
        this.cell = chatMessageCell;
        ReactionsLayoutInBubble.ReactionButton reactionButton2 = chatMessageCell != null ? chatMessageCell.getReactionButton(visibleReaction) : null;
        if (z && i2 == 2) {
            j = 0;
            reactionButton = reactionButton2;
            chatMessageCell2 = chatMessageCell;
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment, reactionsContainerLayout, chatMessageCell, view, f, f2, visibleReaction, i, 1, true);
            this.nextReactionOverlay = reactionsEffectOverlay;
            currentShortOverlay = reactionsEffectOverlay;
        } else {
            j = 0;
            reactionButton = reactionButton2;
            chatMessageCell2 = chatMessageCell;
        }
        ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        if (reactionsContainerLayout != null) {
            int i10 = 0;
            while (true) {
                if (i10 < reactionsContainerLayout.recyclerListView.getChildCount()) {
                    if ((reactionsContainerLayout.recyclerListView.getChildAt(i10) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout.recyclerListView.getChildAt(i10)).currentReaction.equals(this.reaction)) {
                        this.holderView = (ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout.recyclerListView.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        float f8 = 0.8f;
        if (i2 == 1) {
            Random random2 = new Random();
            ArrayList<TLRPC$MessagePeerReaction> arrayList = (chatMessageCell2 == null || chatMessageCell.getMessageObject().messageOwner.reactions == null) ? null : chatMessageCell.getMessageObject().messageOwner.reactions.recent_reactions;
            if (arrayList != null && chatActivity != null && chatActivity.getDialogId() < j) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (this.reaction.equals(arrayList.get(i11).reaction) && arrayList.get(i11).unread) {
                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i11).peer_id);
                        if (peerId < j) {
                            TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                avatarDrawable.setInfo(i, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                            }
                        } else {
                            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                avatarDrawable.setInfo(i, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                            }
                            random = random2;
                            i11++;
                            random2 = random;
                            f8 = 0.8f;
                        }
                        AvatarParticle avatarParticle = new AvatarParticle(this, null);
                        avatarParticle.imageReceiver = imageReceiver;
                        avatarParticle.fromX = 0.5f;
                        avatarParticle.fromY = 0.5f;
                        float f9 = 100.0f;
                        avatarParticle.jumpY = ((Math.abs(random2.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                        float f10 = 0.4f;
                        avatarParticle.randomScale = ((Math.abs(random2.nextInt() % 100) / 100.0f) * 0.4f) + f8;
                        avatarParticle.randomRotation = (Math.abs(random2.nextInt() % 100) * 60) / 100.0f;
                        avatarParticle.leftTime = (int) (((Math.abs(random2.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                        if (this.avatars.isEmpty()) {
                            avatarParticle.toX = ((Math.abs(random2.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                            avatarParticle.toY = (Math.abs(random2.nextInt() % 100) * 0.4f) / 100.0f;
                            random = random2;
                        } else {
                            float f11 = 0.0f;
                            int i12 = 0;
                            float f12 = 0.0f;
                            float f13 = 0.0f;
                            while (i12 < 10) {
                                float abs = ((Math.abs(random2.nextInt() % 100) * 0.6f) / f9) + 0.2f;
                                float abs2 = ((Math.abs(random2.nextInt() % 100) * f10) / 100.0f) + 0.2f;
                                float f14 = 2.1474836E9f;
                                Random random3 = random2;
                                int i13 = 0;
                                while (i13 < this.avatars.size()) {
                                    float f15 = this.avatars.get(i13).toX - abs;
                                    float f16 = abs;
                                    float f17 = this.avatars.get(i13).toY - abs2;
                                    float f18 = (f15 * f15) + (f17 * f17);
                                    if (f18 < f14) {
                                        f14 = f18;
                                    }
                                    i13++;
                                    abs = f16;
                                }
                                float f19 = abs;
                                if (f14 > f13) {
                                    f11 = abs2;
                                    f13 = f14;
                                    f12 = f19;
                                }
                                i12++;
                                random2 = random3;
                                f9 = 100.0f;
                                f10 = 0.4f;
                            }
                            random = random2;
                            avatarParticle.toX = f12;
                            avatarParticle.toY = f11;
                        }
                        this.avatars.add(avatarParticle);
                        i11++;
                        random2 = random;
                        f8 = 0.8f;
                    }
                    random = random2;
                    i11++;
                    random2 = random;
                    f8 = 0.8f;
                }
            }
        }
        ReactionsContainerLayout.ReactionHolderView reactionHolderView = this.holderView;
        boolean z3 = (reactionHolderView == null && (f == 0.0f || f2 == 0.0f)) ? false : true;
        if (view != null) {
            view.getLocationOnScreen(this.loc);
            int[] iArr = this.loc;
            float f20 = iArr[0];
            float f21 = iArr[1];
            f7 = view.getWidth() * view.getScaleX();
            if (view instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                float f22 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view).bigReactionSelectedProgress;
                if (f22 > 0.0f) {
                    f7 = view.getWidth() * ((f22 * 2.0f) + 1.0f);
                    f20 -= (f7 - view.getWidth()) / 2.0f;
                    f21 -= f7 - view.getWidth();
                }
            }
            f5 = f21;
            f6 = f20;
        } else if (reactionHolderView != null) {
            reactionHolderView.getLocationOnScreen(this.loc);
            f6 = this.loc[0] + this.holderView.loopImageView.getX();
            f5 = this.loc[1] + this.holderView.loopImageView.getY();
            f7 = this.holderView.loopImageView.getWidth() * this.holderView.getScaleX();
        } else {
            ReactionsLayoutInBubble.ReactionButton reactionButton3 = reactionButton;
            if (reactionButton3 != null) {
                chatMessageCell2.getLocationInWindow(this.loc);
                float f23 = this.loc[0];
                ImageReceiver imageReceiver2 = reactionButton3.imageReceiver;
                f3 = f23 + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                float f24 = this.loc[1];
                ImageReceiver imageReceiver3 = reactionButton3.imageReceiver;
                f4 = f24 + (imageReceiver3 == null ? 0.0f : imageReceiver3.getImageY());
                ImageReceiver imageReceiver4 = reactionButton3.imageReceiver;
                if (imageReceiver4 != null) {
                    f7 = imageReceiver4.getImageHeight();
                    f6 = f3;
                    f5 = f4;
                }
            } else if (chatMessageCell2 != null) {
                ((View) chatMessageCell.getParent()).getLocationInWindow(this.loc);
                int[] iArr2 = this.loc;
                f5 = iArr2[1] + f2;
                f6 = iArr2[0] + f;
                f7 = 0.0f;
            } else {
                f3 = f;
                f4 = f2;
            }
            f6 = f3;
            f5 = f4;
            f7 = 0.0f;
        }
        if (i2 == 2) {
            int dp = AndroidUtilities.dp((z && SharedConfig.deviceIsHigh()) ? 60.0f : 34.0f);
            i3 = dp;
            i4 = (int) ((dp * 2.0f) / AndroidUtilities.density);
        } else {
            if (i2 != 1) {
                int dp2 = AndroidUtilities.dp(350.0f);
                Point point = AndroidUtilities.displaySize;
                round = Math.round(Math.min(dp2, Math.min(point.x, point.y)) * 0.8f);
                sizeForBigReaction = sizeForBigReaction();
            } else if (z) {
                int dp3 = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 240.0f : 140.0f);
                i4 = SharedConfig.deviceIsHigh() ? (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density) : sizeForAroundReaction();
                i3 = dp3;
            } else {
                round = AndroidUtilities.dp(80.0f);
                sizeForBigReaction = sizeForAroundReaction();
            }
            i3 = round;
            i4 = sizeForBigReaction;
        }
        int i14 = i3 >> 1;
        int i15 = i4 >> 1;
        float f25 = f7 / i14;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        int i16 = i4;
        int i17 = i3;
        this.windowView = new AnonymousClass1(context, baseFragment, chatMessageCell, z, chatActivity, i14, i2, z3, f25, f6, f5, visibleReaction);
        AnimationView animationView = new AnimationView(context);
        this.effectImageView = animationView;
        AnimationView animationView2 = new AnimationView(context);
        this.emojiImageView = animationView2;
        AnimationView animationView3 = new AnimationView(context);
        this.emojiStaticImageView = animationView3;
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction = visibleReaction.emojicon != null ? MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon) : null;
        if (tLRPC$TL_availableReaction != null || visibleReaction.documentId != j) {
            if (tLRPC$TL_availableReaction != null) {
                i5 = i2;
                i6 = 2;
                if (i5 != 2) {
                    if ((i5 == 1 && LiteMode.isEnabled(4112)) || i5 == 0) {
                        TLRPC$Document tLRPC$Document = i5 == 1 ? tLRPC$TL_availableReaction.around_animation : tLRPC$TL_availableReaction.effect_animation;
                        if (i5 == 1) {
                            str = getFilterForAroundAnimation();
                        } else {
                            str = i16 + "_" + i16;
                        }
                        String str2 = str;
                        ImageReceiver imageReceiver5 = animationView.getImageReceiver();
                        StringBuilder sb = new StringBuilder();
                        int i18 = uniqPrefix;
                        uniqPrefix = i18 + 1;
                        sb.append(i18);
                        sb.append("_");
                        sb.append(this.messageId);
                        sb.append("_");
                        imageReceiver5.setUniqKeyPrefix(sb.toString());
                        animationView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, (ImageLocation) null, (String) null, 0, (Object) null);
                        z2 = false;
                        animationView.getImageReceiver().setAutoRepeat(0);
                        animationView.getImageReceiver().setAllowStartAnimation(false);
                    } else {
                        z2 = false;
                    }
                    r15 = z2;
                    if (animationView.getImageReceiver().getLottieAnimation() != null) {
                        animationView.getImageReceiver().getLottieAnimation().setCurrentFrame(z2 ? 1 : 0, z2);
                        animationView.getImageReceiver().getLottieAnimation().start();
                        r15 = z2;
                    }
                } else {
                    r15 = 0;
                }
                if (i5 == 2) {
                    TLRPC$Document tLRPC$Document2 = z ? tLRPC$TL_availableReaction.select_animation : tLRPC$TL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
                    StringBuilder sb2 = new StringBuilder();
                    int i19 = uniqPrefix;
                    uniqPrefix = i19 + 1;
                    sb2.append(i19);
                    sb2.append("_");
                    sb2.append(this.messageId);
                    sb2.append("_");
                    imageReceiver6.setUniqKeyPrefix(sb2.toString());
                    animationView2.setImage(ImageLocation.getForDocument(tLRPC$Document2), i15 + "_" + i15, (ImageLocation) null, (String) null, 0, (Object) null);
                } else if (i5 == 0) {
                    TLRPC$Document tLRPC$Document3 = tLRPC$TL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i20 = uniqPrefix;
                    uniqPrefix = i20 + 1;
                    sb3.append(i20);
                    sb3.append("_");
                    sb3.append(this.messageId);
                    sb3.append("_");
                    imageReceiver7.setUniqKeyPrefix(sb3.toString());
                    animationView2.setImage(ImageLocation.getForDocument(tLRPC$Document3), i15 + "_" + i15, (ImageLocation) null, (String) null, 0, (Object) null);
                }
            } else {
                i5 = i2;
                i6 = 2;
                r15 = 0;
                r15 = 0;
                if (i5 == 0) {
                    i7 = i;
                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i7, visibleReaction.documentId));
                } else {
                    i7 = i;
                    if (i5 == 2) {
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId));
                    }
                }
                if (i5 == 0 || i5 == 1) {
                    AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                    if (chatMessageCell != null) {
                        if (chatMessageCell.getMessageObject().shouldDrawWithoutBackground()) {
                            i9 = chatMessageCell.getMessageObject().isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground;
                        } else {
                            i9 = chatMessageCell.getMessageObject().isOutOwner() ? Theme.key_chat_outReactionButtonTextSelected : Theme.key_chat_inReactionButtonTextSelected;
                        }
                        i8 = Theme.getColor(i9, baseFragment != null ? baseFragment.getResourceProvider() : null);
                    } else {
                        i8 = -1;
                    }
                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
                    boolean z4 = i5 == 0;
                    animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable, z4, !z4));
                    this.windowView.setClipChildren(false);
                }
            }
            animationView2.getImageReceiver().setAutoRepeat(r15);
            animationView2.getImageReceiver().setAllowStartAnimation(r15);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i5 == i6) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r15);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r15, r15);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            int i21 = i17 - i14;
            int i22 = i21 >> 1;
            i21 = i5 == 1 ? i22 : i21;
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i14;
            animationView2.getLayoutParams().height = i14;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i22;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i21;
            if (i5 != 1 && !z) {
                if (tLRPC$TL_availableReaction != null) {
                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tLRPC$TL_availableReaction, 1);
                }
                frameLayout.addView(animationView3);
                animationView3.getLayoutParams().width = i14;
                animationView3.getLayoutParams().height = i14;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i22;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i21;
            }
            this.windowView.addView(frameLayout);
            frameLayout.getLayoutParams().width = i17;
            frameLayout.getLayoutParams().height = i17;
            int i23 = -i22;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i23;
            int i24 = -i21;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i24;
            this.windowView.addView(animationView);
            animationView.getLayoutParams().width = i17;
            animationView.getLayoutParams().height = i17;
            animationView.getLayoutParams().width = i17;
            animationView.getLayoutParams().height = i17;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i23;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i24;
            frameLayout.setPivotX(i21);
            frameLayout.setPivotY(i22);
            return;
        }
        this.dismissed = true;
    }

    public class AnonymousClass1 extends FrameLayout {
        final int val$animationType;
        final ChatMessageCell val$cell;
        final ChatActivity val$chatActivity;
        final int val$emojiSize;
        final BaseFragment val$fragment;
        final boolean val$fromHolder;
        final float val$fromScale;
        final float val$fromX;
        final float val$fromY;
        final boolean val$isStories;
        final ReactionsLayoutInBubble.VisibleReaction val$visibleReaction;

        AnonymousClass1(Context context, BaseFragment baseFragment, ChatMessageCell chatMessageCell, boolean z, ChatActivity chatActivity, int i, int i2, boolean z2, float f, float f2, float f3, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(context);
            this.val$fragment = baseFragment;
            this.val$cell = chatMessageCell;
            this.val$isStories = z;
            this.val$chatActivity = chatActivity;
            this.val$emojiSize = i;
            this.val$animationType = i2;
            this.val$fromHolder = z2;
            this.val$fromScale = f;
            this.val$fromX = f2;
            this.val$fromY = f3;
            this.val$visibleReaction = visibleReaction;
        }

        @Override
        protected void dispatchDraw(android.graphics.Canvas r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsEffectOverlay.AnonymousClass1.dispatchDraw(android.graphics.Canvas):void");
        }

        public void lambda$dispatchDraw$0() {
            ReactionsEffectOverlay.this.removeCurrentView();
        }

        public void lambda$dispatchDraw$1() {
            ReactionsEffectOverlay.this.removeCurrentView();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ReactionsEffectOverlay.this.avatars.get(i).imageReceiver.onAttachedToWindow();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ReactionsEffectOverlay.this.avatars.get(i).imageReceiver.onDetachedFromWindow();
            }
        }
    }

    public static String getFilterForAroundAnimation() {
        return sizeForAroundReaction() + "_" + sizeForAroundReaction() + "_nolimit_pcache";
    }

    public void removeCurrentView() {
        try {
            if (this.useWindow) {
                this.windowManager.removeView(this.windowView);
            } else {
                AndroidUtilities.removeFromParent(this.windowView);
            }
        } catch (Exception unused) {
        }
    }

    public static void show(org.telegram.ui.ActionBar.BaseFragment r17, org.telegram.ui.Components.ReactionsContainerLayout r18, org.telegram.ui.Cells.ChatMessageCell r19, android.view.View r20, float r21, float r22, org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble.VisibleReaction r23, int r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsEffectOverlay.show(org.telegram.ui.ActionBar.BaseFragment, org.telegram.ui.Components.ReactionsContainerLayout, org.telegram.ui.Cells.ChatMessageCell, android.view.View, float, float, org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$VisibleReaction, int, int):void");
    }

    public static void startAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.started = true;
            reactionsEffectOverlay.startTime = System.currentTimeMillis();
            if (currentOverlay.animationType != 0 || System.currentTimeMillis() - lastHapticTime <= 200) {
                return;
            }
            lastHapticTime = System.currentTimeMillis();
            currentOverlay.cell.performHapticFeedback(3);
            return;
        }
        startShortAnimation();
        ReactionsEffectOverlay reactionsEffectOverlay2 = currentShortOverlay;
        if (reactionsEffectOverlay2 != null) {
            reactionsEffectOverlay2.cell.reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay2.reaction);
        }
    }

    public static void startShortAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentShortOverlay;
        if (reactionsEffectOverlay == null || reactionsEffectOverlay.started) {
            return;
        }
        reactionsEffectOverlay.started = true;
        reactionsEffectOverlay.startTime = System.currentTimeMillis();
        if (currentShortOverlay.animationType != 1 || System.currentTimeMillis() - lastHapticTime <= 200) {
            return;
        }
        lastHapticTime = System.currentTimeMillis();
        currentShortOverlay.cell.performHapticFeedback(3);
    }

    public static void removeCurrent(boolean z) {
        int i = 0;
        while (i < 2) {
            ReactionsEffectOverlay reactionsEffectOverlay = i == 0 ? currentOverlay : currentShortOverlay;
            if (reactionsEffectOverlay != null) {
                if (z) {
                    reactionsEffectOverlay.removeCurrentView();
                } else {
                    reactionsEffectOverlay.dismissed = true;
                }
            }
            i++;
        }
        currentShortOverlay = null;
        currentOverlay = null;
    }

    public static boolean isPlaying(int i, long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay == null) {
            return false;
        }
        int i2 = reactionsEffectOverlay.animationType;
        if (i2 != 2 && i2 != 0) {
            return false;
        }
        long j2 = reactionsEffectOverlay.groupId;
        return ((j2 != 0 && j == j2) || i == reactionsEffectOverlay.messageId) && reactionsEffectOverlay.reaction.equals(visibleReaction);
    }

    private class AnimationView extends BackupImageView {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        boolean attached;
        AnimatedEmojiEffect emojiEffect;
        boolean wasPlaying;

        public AnimationView(Context context) {
            super(context);
            getImageReceiver().setFileLoadingPriority(3);
        }

        @Override
        public void onDraw(Canvas canvas) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.animatedEmojiDrawable.setAlpha(255);
                this.animatedEmojiDrawable.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.emojiEffect.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().isRunning()) {
                this.wasPlaying = true;
            }
            if (!this.wasPlaying && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().isRunning()) {
                if (ReactionsEffectOverlay.this.animationType == 2 && !ReactionsEffectOverlay.this.isStories) {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                } else {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                    getImageReceiver().getLottieAnimation().start();
                }
            }
            super.onDraw(canvas);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.setView(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.removeView(this);
            }
        }

        public void setAnimatedReactionDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            if (!this.attached || animatedEmojiDrawable == null) {
                return;
            }
            animatedEmojiDrawable.addView(this);
        }

        public void setAnimatedEmojiEffect(AnimatedEmojiEffect animatedEmojiEffect) {
            this.emojiEffect = animatedEmojiEffect;
        }
    }

    public static void onScrolled(int i) {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.lastDrawnToY -= i;
            if (i != 0) {
                reactionsEffectOverlay.wasScrolled = true;
            }
        }
    }

    public static int sizeForBigReaction() {
        int dp = AndroidUtilities.dp(350.0f);
        Point point = AndroidUtilities.displaySize;
        return (int) (Math.round(Math.min(dp, Math.min(point.x, point.y)) * 0.7f) / AndroidUtilities.density);
    }

    public static int sizeForAroundReaction() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void dismissAll() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.dismissed = true;
        }
        ReactionsEffectOverlay reactionsEffectOverlay2 = currentShortOverlay;
        if (reactionsEffectOverlay2 != null) {
            reactionsEffectOverlay2.dismissed = true;
        }
    }

    private class AvatarParticle {
        float currentRotation;
        float fromX;
        float fromY;
        float globalTranslationY;
        ImageReceiver imageReceiver;
        boolean incrementRotation;
        float jumpY;
        public int leftTime;
        float outProgress;
        float progress;
        float randomRotation;
        float randomScale;
        float toX;
        float toY;

        private AvatarParticle() {
        }

        AvatarParticle(ReactionsEffectOverlay reactionsEffectOverlay, AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
