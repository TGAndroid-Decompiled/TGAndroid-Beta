package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public class ReactionsEffectOverlay {
    public static ReactionsEffectOverlay currentOverlay;
    public static ReactionsEffectOverlay currentShortOverlay;
    private static long lastHapticTime;
    private static int uniqPrefix;
    float animateInProgress;
    float animateOutProgress;
    private final int animationType;
    private View cell;
    private final FrameLayout container;
    private final int currentAccount;
    private ViewGroup decorView;
    private float dismissProgress;
    private boolean dismissed;
    private final AnimationView effectImageView;
    private final AnimationView emojiImageView;
    private final AnimationView emojiStaticImageView;
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
    ArrayList avatars = new ArrayList();

    static float access$216(ReactionsEffectOverlay reactionsEffectOverlay, float f) {
        float f2 = reactionsEffectOverlay.dismissProgress + f;
        reactionsEffectOverlay.dismissProgress = f2;
        return f2;
    }

    public ReactionsEffectOverlay(Context context, BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, View view, View view2, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2, boolean z) {
        MessageObject messageObject;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        Context context2;
        View view3;
        ReactionsContainerLayout reactionsContainerLayout2;
        View view4;
        BaseFragment baseFragment2;
        ChatActivity chatActivity;
        float f3;
        float imageX;
        float imageY;
        float f4;
        float f5;
        int i3;
        float imageHeight;
        float x;
        float y;
        int iRound;
        int iSizeForBigReaction;
        float f6;
        int iSizeForAroundReaction;
        int i4;
        int i5;
        FrameLayout frameLayout;
        MessageObject messageObject2;
        AnimationView animationView;
        AnimationView animationView2;
        AnimationView animationView3;
        TLRPC.TL_availableReaction tL_availableReaction;
        int i6;
        int i7;
        int color;
        boolean z2;
        ?? r7;
        int i8;
        Theme.ResourcesProvider resourceProvider;
        int i9;
        int i10;
        int i11;
        TLRPC.Document document;
        ?? r8;
        float f7;
        ChatActivity chatActivity2;
        Random random;
        AvatarParticle avatarParticle;
        float f8;
        int i12;
        float f9;
        float f10;
        float fAbs;
        float fAbs2;
        float f11;
        int i13;
        float f12;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i14 = i;
        this.holderView = null;
        this.isStories = z;
        boolean z3 = view instanceof ChatMessageCell;
        if (z3) {
            messageObject = ((ChatMessageCell) view).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = messageObject.getGroupId();
        } else if (view instanceof ChatActionCell) {
            messageObject = ((ChatActionCell) view).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = 0L;
        } else {
            this.messageId = 0;
            this.groupId = 0L;
            messageObject = null;
        }
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.currentAccount = i14;
        this.cell = view;
        if (z3) {
            reactionButton = ((ChatMessageCell) view).getReactionButton(visibleReaction);
        } else {
            reactionButton = view instanceof ChatActionCell ? ((ChatActionCell) view).getReactionButton(visibleReaction) : null;
        }
        if (z && i2 == 2) {
            view3 = view2;
            reactionsContainerLayout2 = reactionsContainerLayout;
            view4 = view;
            baseFragment2 = baseFragment;
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment2, reactionsContainerLayout2, view4, view3, f, f2, visibleReaction, i14, 1, true);
            context2 = context;
            this.nextReactionOverlay = reactionsEffectOverlay;
            currentShortOverlay = reactionsEffectOverlay;
        } else {
            context2 = context;
            view3 = view2;
            reactionsContainerLayout2 = reactionsContainerLayout;
            view4 = view;
            baseFragment2 = baseFragment;
        }
        ChatActivity chatActivity3 = baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null;
        if (reactionsContainerLayout2 != null) {
            for (int i15 = 0; i15 < reactionsContainerLayout2.recyclerListView.getChildCount(); i15++) {
                if ((reactionsContainerLayout2.recyclerListView.getChildAt(i15) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i15)).currentReaction.equals(this.reaction)) {
                    this.holderView = (ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i15);
                    break;
                }
            }
        }
        if (i2 == 1) {
            Random random2 = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject == 0 || (tL_messageReactions = messageObject.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList == null || chatActivity3 == null || chatActivity3.getDialogId() >= r5) {
                chatActivity = chatActivity3;
                f3 = 0.8f;
            } else {
                f3 = 0.8f;
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    if (this.reaction.equals(arrayList.get(i16).reaction) && arrayList.get(i16).unread) {
                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                        ImageReceiver imageReceiver = new ImageReceiver();
                        random = random2;
                        long peerId = MessageObject.getPeerId(arrayList.get(i16).peer_id);
                        if (peerId < 0) {
                            TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerId));
                            if (chat == null) {
                                chatActivity2 = chatActivity3;
                            } else {
                                avatarDrawable.setInfo(i14, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                avatarParticle = new AvatarParticle(this, null);
                                avatarParticle.imageReceiver = imageReceiver;
                                avatarParticle.fromX = 0.5f;
                                avatarParticle.fromY = 0.5f;
                                avatarParticle.jumpY = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                                avatarParticle.randomScale = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.4f) + 0.8f;
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) (((Math.abs(random.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    chatActivity2 = chatActivity3;
                                } else {
                                    f8 = 0.0f;
                                    i12 = 0;
                                    f9 = 0.0f;
                                    f10 = 0.0f;
                                    while (i12 < 10) {
                                        fAbs = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                        fAbs2 = ((Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f) + 0.2f;
                                        f11 = 2.1474836E9f;
                                        ChatActivity chatActivity4 = chatActivity3;
                                        for (i13 = 0; i13 < this.avatars.size(); i13++) {
                                            float f13 = ((AvatarParticle) this.avatars.get(i13)).toX - fAbs;
                                            float f14 = ((AvatarParticle) this.avatars.get(i13)).toY - fAbs2;
                                            f12 = (f13 * f13) + (f14 * f14);
                                            if (f12 < f11) {
                                                f11 = f12;
                                            }
                                        }
                                        if (f11 > f10) {
                                            f8 = fAbs;
                                            f10 = f11;
                                            f9 = fAbs2;
                                        }
                                        i12++;
                                        chatActivity3 = chatActivity4;
                                    }
                                    chatActivity2 = chatActivity3;
                                    avatarParticle.toX = f8;
                                    avatarParticle.toY = f9;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerId));
                            if (user == null) {
                                chatActivity2 = chatActivity3;
                            } else {
                                avatarDrawable.setInfo(i14, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                                avatarParticle = new AvatarParticle(this, null);
                                avatarParticle.imageReceiver = imageReceiver;
                                avatarParticle.fromX = 0.5f;
                                avatarParticle.fromY = 0.5f;
                                avatarParticle.jumpY = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                                avatarParticle.randomScale = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.4f) + 0.8f;
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) (((Math.abs(random.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    chatActivity2 = chatActivity3;
                                } else {
                                    f8 = 0.0f;
                                    i12 = 0;
                                    f9 = 0.0f;
                                    f10 = 0.0f;
                                    while (i12 < 10) {
                                        fAbs = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                        fAbs2 = ((Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f) + 0.2f;
                                        f11 = 2.1474836E9f;
                                        ChatActivity chatActivity5 = chatActivity3;
                                        while (i13 < this.avatars.size()) {
                                            float f15 = ((AvatarParticle) this.avatars.get(i13)).toX - fAbs;
                                            float f16 = ((AvatarParticle) this.avatars.get(i13)).toY - fAbs2;
                                            f12 = (f15 * f15) + (f16 * f16);
                                            if (f12 < f11) {
                                                f11 = f12;
                                            }
                                        }
                                        if (f11 > f10) {
                                            f8 = fAbs;
                                            f10 = f11;
                                            f9 = fAbs2;
                                        }
                                        i12++;
                                        chatActivity3 = chatActivity5;
                                    }
                                    chatActivity2 = chatActivity3;
                                    avatarParticle.toX = f8;
                                    avatarParticle.toY = f9;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        }
                    } else {
                        chatActivity2 = chatActivity3;
                        random = random2;
                    }
                    i16++;
                    i14 = i;
                    random2 = random;
                    chatActivity3 = chatActivity2;
                }
                chatActivity = chatActivity3;
            }
        } else {
            chatActivity = chatActivity3;
            f3 = 0.8f;
        }
        ReactionsContainerLayout.ReactionHolderView reactionHolderView = this.holderView;
        boolean z4 = (reactionHolderView == null && (f == 0.0f || f2 == 0.0f)) ? false : true;
        if (view3 != null) {
            view3.getLocationOnScreen(this.loc);
            int[] iArr = this.loc;
            x = iArr[0];
            y = iArr[1];
            imageHeight = view3.getWidth() * view3.getScaleX();
            if (view3 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                float f17 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view3).bigReactionSelectedProgress;
                if (f17 > 0.0f) {
                    imageHeight = view3.getWidth() * ((f17 * 2.0f) + 1.0f);
                    x -= (imageHeight - view3.getWidth()) / 2.0f;
                    y -= imageHeight - view3.getWidth();
                }
            }
        } else {
            if (reactionHolderView != null) {
                reactionHolderView.getLocationOnScreen(this.loc);
                x = this.holderView.loopImageView.getX() + this.loc[0];
                y = this.loc[1] + this.holderView.loopImageView.getY();
                imageHeight = this.holderView.getScaleX() * this.holderView.loopImageView.getWidth();
            } else {
                if (reactionButton != 0) {
                    view4.getLocationInWindow(this.loc);
                    float f18 = this.loc[0];
                    ImageReceiver imageReceiver2 = reactionButton.imageReceiver;
                    imageX = f18 + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                    float f19 = this.loc[1];
                    ImageReceiver imageReceiver3 = reactionButton.imageReceiver;
                    imageY = f19 + (imageReceiver3 == null ? 0.0f : imageReceiver3.getImageY());
                    ImageReceiver imageReceiver4 = reactionButton.imageReceiver;
                    if (imageReceiver4 != null) {
                        imageHeight = imageReceiver4.getImageHeight();
                        f5 = imageX;
                        f4 = imageY;
                        i3 = 2;
                    }
                } else {
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.loc);
                        int[] iArr2 = this.loc;
                        float f20 = iArr2[0] + f;
                        f4 = iArr2[1] + f2 + (view4 instanceof ChatMessageCell ? ((ChatMessageCell) view4).starsPriceTopPadding : 0);
                        f5 = f20;
                    } else {
                        imageX = f;
                        imageY = f2;
                    }
                    i3 = 2;
                    imageHeight = 0.0f;
                }
                f5 = imageX;
                f4 = imageY;
                i3 = 2;
                imageHeight = 0.0f;
            }
            if (i2 == i3) {
                if (z || !SharedConfig.deviceIsHigh()) {
                    f7 = 34.0f;
                } else {
                    f7 = 60.0f;
                }
                int iDp = AndroidUtilities.dp(f7);
                iSizeForBigReaction = (int) ((iDp * 2.0f) / AndroidUtilities.density);
                iRound = iDp;
            } else if (i2 == 1) {
                int iDp2 = AndroidUtilities.dp(350.0f);
                Point point = AndroidUtilities.displaySize;
                iRound = Math.round(Math.min(iDp2, Math.min(point.x, point.y)) * f3);
                iSizeForBigReaction = sizeForBigReaction();
            } else if (z) {
                if (SharedConfig.deviceIsHigh()) {
                    f6 = 240.0f;
                } else {
                    f6 = 140.0f;
                }
                int iDp3 = AndroidUtilities.dp(f6);
                if (SharedConfig.deviceIsHigh()) {
                    iSizeForAroundReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                } else {
                    iSizeForAroundReaction = sizeForAroundReaction();
                }
                iSizeForBigReaction = iSizeForAroundReaction;
                iRound = iDp3;
            } else {
                iRound = AndroidUtilities.dp(80.0f);
                iSizeForBigReaction = sizeForAroundReaction();
            }
            float f21 = imageHeight;
            i4 = iRound >> 1;
            i5 = iSizeForBigReaction >> 1;
            float f22 = f21 / i4;
            this.animateInProgress = 0.0f;
            this.animateOutProgress = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.container = frameLayout;
            int i17 = iRound;
            int i18 = iSizeForBigReaction;
            View view5 = view4;
            messageObject2 = messageObject;
            this.windowView = new AnonymousClass1(context2, baseFragment, view5, z, messageObject2, chatActivity, i4, i2, z4, f22, f5, f4, visibleReaction);
            animationView = new AnimationView(context2);
            this.effectImageView = animationView;
            animationView2 = new AnimationView(context2);
            this.emojiImageView = animationView2;
            animationView3 = new AnimationView(context2);
            this.emojiStaticImageView = animationView3;
            if (visibleReaction.emojicon != null) {
                tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
            } else {
                tL_availableReaction = null;
            }
            if (tL_availableReaction == null || visibleReaction.documentId != r5) {
                if (tL_availableReaction != null) {
                    if (i2 == 0) {
                        i6 = i;
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i6, visibleReaction.documentId));
                        i7 = 2;
                    } else {
                        i6 = i;
                        i7 = 2;
                        if (i2 == 2) {
                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i6, visibleReaction.documentId));
                        }
                    }
                    if (i2 != 0 || i2 == 1) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(i7, i6, visibleReaction.documentId);
                        if (messageObject2 != null) {
                            if (messageObject2.shouldDrawWithoutBackground()) {
                                if (messageObject2.isOutOwner()) {
                                    i8 = Theme.key_chat_outReactionButtonBackground;
                                } else {
                                    i8 = Theme.key_chat_inReactionButtonBackground;
                                }
                            } else if (messageObject2.isOutOwner()) {
                                i8 = Theme.key_chat_outReactionButtonTextSelected;
                            } else {
                                i8 = Theme.key_chat_inReactionButtonTextSelected;
                            }
                            if (baseFragment != null) {
                                resourceProvider = baseFragment.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            color = Theme.getColor(i8, resourceProvider);
                        } else {
                            color = -1;
                        }
                        animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        if (i2 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable, z2, !z2));
                        r7 = 0;
                        this.windowView.setClipChildren(false);
                    }
                    animationView2.getImageReceiver().setAutoRepeat(r7);
                    animationView2.getImageReceiver().setAllowStartAnimation(r7);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i2 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r7);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r7, (boolean) r7);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i9 = i17 - i4;
                    i10 = i9 >> 1;
                    i9 = i2 == 1 ? i10 : i9;
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i4;
                    animationView2.getLayoutParams().height = i4;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                    if (i2 != 1 && !z) {
                        if (tL_availableReaction != null) {
                            animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView3);
                        animationView3.getLayoutParams().width = i4;
                        animationView3.getLayoutParams().height = i4;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i10;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i9;
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i17;
                    frameLayout.getLayoutParams().height = i17;
                    int i19 = -i10;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i19;
                    int i20 = -i9;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i20;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i17;
                    animationView.getLayoutParams().height = i17;
                    animationView.getLayoutParams().width = i17;
                    animationView.getLayoutParams().height = i17;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i19;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i20;
                    frameLayout.setPivotX(i9);
                    frameLayout.setPivotY(i10);
                }
                i11 = 2;
                if (i2 != 2) {
                    if ((i2 != 1 && LiteMode.isEnabled(4112)) || i2 == 0) {
                        TLRPC.Document document2 = i2 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                        String filterForAroundAnimation = i2 == 1 ? getFilterForAroundAnimation() : i18 + "_" + i18;
                        ImageReceiver imageReceiver5 = animationView.getImageReceiver();
                        StringBuilder sb = new StringBuilder();
                        int i21 = uniqPrefix;
                        uniqPrefix = i21 + 1;
                        sb.append(i21);
                        sb.append("_");
                        sb.append(this.messageId);
                        sb.append("_");
                        imageReceiver5.setUniqKeyPrefix(sb.toString());
                        animationView.setImage(ImageLocation.getForDocument(document2), filterForAroundAnimation, (ImageLocation) null, (String) null, 0, (Object) null);
                        r8 = 0;
                        animationView.getImageReceiver().setAutoRepeat(0);
                        animationView.getImageReceiver().setAllowStartAnimation(false);
                    }
                    if (animationView.getImageReceiver().getLottieAnimation() != null) {
                        animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r8, (boolean) r8);
                        animationView.getImageReceiver().getLottieAnimation().start();
                    }
                    i11 = 2;
                }
                if (i2 == i11) {
                    if (z) {
                        document = tL_availableReaction.select_animation;
                    } else {
                        document = tL_availableReaction.appear_animation;
                    }
                    ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
                    StringBuilder sb2 = new StringBuilder();
                    int i22 = uniqPrefix;
                    uniqPrefix = i22 + 1;
                    sb2.append(i22);
                    sb2.append("_");
                    sb2.append(this.messageId);
                    sb2.append("_");
                    imageReceiver6.setUniqKeyPrefix(sb2.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document), i5 + "_" + i5, (ImageLocation) null, (String) null, 0, (Object) null);
                } else if (i2 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i23 = uniqPrefix;
                    uniqPrefix = i23 + 1;
                    sb3.append(i23);
                    sb3.append("_");
                    sb3.append(this.messageId);
                    sb3.append("_");
                    imageReceiver7.setUniqKeyPrefix(sb3.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document3), i5 + "_" + i5, (ImageLocation) null, (String) null, 0, (Object) null);
                }
                r7 = 0;
                animationView2.getImageReceiver().setAutoRepeat(r7);
                animationView2.getImageReceiver().setAllowStartAnimation(r7);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i2 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r7);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r7, (boolean) r7);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i9 = i17 - i4;
                i10 = i9 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i4;
                animationView2.getLayoutParams().height = i4;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                if (i2 != 1) {
                    if (tL_availableReaction != null) {
                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView3);
                    animationView3.getLayoutParams().width = i4;
                    animationView3.getLayoutParams().height = i4;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i9;
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i17;
                frameLayout.getLayoutParams().height = i17;
                int i110 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i110;
                int i24 = -i9;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i24;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i17;
                animationView.getLayoutParams().height = i17;
                animationView.getLayoutParams().width = i17;
                animationView.getLayoutParams().height = i17;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i110;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i24;
                frameLayout.setPivotX(i9);
                frameLayout.setPivotY(i10);
            }
            this.dismissed = true;
            return;
        }
        f4 = y;
        f5 = x;
        i3 = 2;
        if (i2 == i3) {
            if (z) {
                f7 = 34.0f;
            } else {
                f7 = 34.0f;
            }
            int iDp4 = AndroidUtilities.dp(f7);
            iSizeForBigReaction = (int) ((iDp4 * 2.0f) / AndroidUtilities.density);
            iRound = iDp4;
        } else if (i2 == 1) {
            int iDp5 = AndroidUtilities.dp(350.0f);
            Point point2 = AndroidUtilities.displaySize;
            iRound = Math.round(Math.min(iDp5, Math.min(point2.x, point2.y)) * f3);
            iSizeForBigReaction = sizeForBigReaction();
        } else if (z) {
            if (SharedConfig.deviceIsHigh()) {
                f6 = 240.0f;
            } else {
                f6 = 140.0f;
            }
            int iDp6 = AndroidUtilities.dp(f6);
            if (SharedConfig.deviceIsHigh()) {
                iSizeForAroundReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
            } else {
                iSizeForAroundReaction = sizeForAroundReaction();
            }
            iSizeForBigReaction = iSizeForAroundReaction;
            iRound = iDp6;
        } else {
            iRound = AndroidUtilities.dp(80.0f);
            iSizeForBigReaction = sizeForAroundReaction();
        }
        float f23 = imageHeight;
        i4 = iRound >> 1;
        i5 = iSizeForBigReaction >> 1;
        float f24 = f23 / i4;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.container = frameLayout;
        int i111 = iRound;
        int i112 = iSizeForBigReaction;
        View view6 = view4;
        messageObject2 = messageObject;
        this.windowView = new AnonymousClass1(context2, baseFragment, view6, z, messageObject2, chatActivity, i4, i2, z4, f24, f5, f4, visibleReaction);
        animationView = new AnimationView(context2);
        this.effectImageView = animationView;
        animationView2 = new AnimationView(context2);
        this.emojiImageView = animationView2;
        animationView3 = new AnimationView(context2);
        this.emojiStaticImageView = animationView3;
        if (visibleReaction.emojicon != null) {
            tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
        }
        if (tL_availableReaction != null) {
            if (i2 == 0) {
                i6 = i;
                animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i6, visibleReaction.documentId));
                i7 = 2;
            } else {
                i6 = i;
                i7 = 2;
                if (i2 == 2) {
                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i6, visibleReaction.documentId));
                }
            }
            if (i2 != 0) {
            }
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i7, i6, visibleReaction.documentId);
            if (messageObject2 != null) {
                if (messageObject2.shouldDrawWithoutBackground()) {
                    if (messageObject2.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonBackground;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonBackground;
                    }
                } else if (messageObject2.isOutOwner()) {
                    i8 = Theme.key_chat_outReactionButtonTextSelected;
                } else {
                    i8 = Theme.key_chat_inReactionButtonTextSelected;
                }
                if (baseFragment != null) {
                    resourceProvider = baseFragment.getResourceProvider();
                } else {
                    resourceProvider = null;
                }
                color = Theme.getColor(i8, resourceProvider);
            } else {
                color = -1;
            }
            animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable2, z2, !z2));
            r7 = 0;
            this.windowView.setClipChildren(false);
            animationView2.getImageReceiver().setAutoRepeat(r7);
            animationView2.getImageReceiver().setAllowStartAnimation(r7);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i2 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r7);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r7, (boolean) r7);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i9 = i111 - i4;
            i10 = i9 >> 1;
            if (i2 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i4;
            animationView2.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
            if (i2 != 1) {
                if (tL_availableReaction != null) {
                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView3);
                animationView3.getLayoutParams().width = i4;
                animationView3.getLayoutParams().height = i4;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i9;
            }
            this.windowView.addView(frameLayout);
            frameLayout.getLayoutParams().width = i111;
            frameLayout.getLayoutParams().height = i111;
            int i113 = -i10;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i113;
            int i25 = -i9;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i25;
            this.windowView.addView(animationView);
            animationView.getLayoutParams().width = i111;
            animationView.getLayoutParams().height = i111;
            animationView.getLayoutParams().width = i111;
            animationView.getLayoutParams().height = i111;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i113;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i25;
            frameLayout.setPivotX(i9);
            frameLayout.setPivotY(i10);
        }
        i11 = 2;
        if (i2 != 2) {
            r8 = i2 != 1 ? 0 : 0;
            if (animationView.getImageReceiver().getLottieAnimation() != null) {
                animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r8, (boolean) r8);
                animationView.getImageReceiver().getLottieAnimation().start();
            }
            i11 = 2;
        }
        if (i2 == i11) {
            if (z) {
                document = tL_availableReaction.select_animation;
            } else {
                document = tL_availableReaction.appear_animation;
            }
            ImageReceiver imageReceiver8 = animationView2.getImageReceiver();
            StringBuilder sb4 = new StringBuilder();
            int i26 = uniqPrefix;
            uniqPrefix = i26 + 1;
            sb4.append(i26);
            sb4.append("_");
            sb4.append(this.messageId);
            sb4.append("_");
            imageReceiver8.setUniqKeyPrefix(sb4.toString());
            animationView2.setImage(ImageLocation.getForDocument(document), i5 + "_" + i5, (ImageLocation) null, (String) null, 0, (Object) null);
        } else if (i2 == 0) {
            TLRPC.Document document4 = tL_availableReaction.activate_animation;
            ImageReceiver imageReceiver9 = animationView2.getImageReceiver();
            StringBuilder sb5 = new StringBuilder();
            int i27 = uniqPrefix;
            uniqPrefix = i27 + 1;
            sb5.append(i27);
            sb5.append("_");
            sb5.append(this.messageId);
            sb5.append("_");
            imageReceiver9.setUniqKeyPrefix(sb5.toString());
            animationView2.setImage(ImageLocation.getForDocument(document4), i5 + "_" + i5, (ImageLocation) null, (String) null, 0, (Object) null);
        }
        r7 = 0;
        animationView2.getImageReceiver().setAutoRepeat(r7);
        animationView2.getImageReceiver().setAllowStartAnimation(r7);
        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
            if (i2 == 2) {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r7);
            } else {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r7, (boolean) r7);
                animationView2.getImageReceiver().getLottieAnimation().start();
            }
        }
        i9 = i111 - i4;
        i10 = i9 >> 1;
        if (i2 == 1) {
        }
        frameLayout.addView(animationView2);
        animationView2.getLayoutParams().width = i4;
        animationView2.getLayoutParams().height = i4;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
        if (i2 != 1) {
            if (tL_availableReaction != null) {
                animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
            }
            frameLayout.addView(animationView3);
            animationView3.getLayoutParams().width = i4;
            animationView3.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i9;
        }
        this.windowView.addView(frameLayout);
        frameLayout.getLayoutParams().width = i111;
        frameLayout.getLayoutParams().height = i111;
        int i114 = -i10;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i114;
        int i28 = -i9;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i28;
        this.windowView.addView(animationView);
        animationView.getLayoutParams().width = i111;
        animationView.getLayoutParams().height = i111;
        animationView.getLayoutParams().width = i111;
        animationView.getLayoutParams().height = i111;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i114;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i28;
        frameLayout.setPivotX(i9);
        frameLayout.setPivotY(i10);
    }

    class AnonymousClass1 extends FrameLayout {
        final int val$animationType;
        final View val$cell;
        final ChatActivity val$chatActivity;
        final int val$emojiSize;
        final BaseFragment val$fragment;
        final boolean val$fromHolder;
        final float val$fromScale;
        final float val$fromX;
        final float val$fromY;
        final boolean val$isStories;
        final MessageObject val$messageObject;
        final ReactionsLayoutInBubble.VisibleReaction val$visibleReaction;

        AnonymousClass1(Context context, BaseFragment baseFragment, View view, boolean z, MessageObject messageObject, ChatActivity chatActivity, int i, int i2, boolean z2, float f, float f2, float f3, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(context);
            this.val$fragment = baseFragment;
            this.val$cell = view;
            this.val$isStories = z;
            this.val$messageObject = messageObject;
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
        protected void dispatchDraw(Canvas canvas) {
            View viewFindCell;
            int iDp;
            float f;
            float measuredWidth;
            float measuredHeight;
            float f2;
            float f3;
            float interpolation;
            float interpolation2;
            float f4;
            float f5;
            ReactionsEffectOverlay reactionsEffectOverlay;
            float f6;
            float f7;
            RLottieDrawable lottieAnimation;
            int i;
            AvatarParticle avatarParticle;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            ReactionsEffectOverlay reactionsEffectOverlay2;
            float f19;
            int i2;
            float f20;
            ReactionsEffectOverlay reactionsEffectOverlay3;
            int i3;
            View view;
            View view2;
            View view3;
            float f21;
            ReactionsLayoutInBubble.ReactionButton reactionButton;
            int paddingTop;
            ChatActivity chatActivity;
            if (ReactionsEffectOverlay.this.dismissed) {
                if (ReactionsEffectOverlay.this.dismissProgress != 1.0f) {
                    ReactionsEffectOverlay.access$216(ReactionsEffectOverlay.this, 0.10666667f);
                    if (ReactionsEffectOverlay.this.dismissProgress > 1.0f) {
                        ReactionsEffectOverlay.this.dismissProgress = 1.0f;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ReactionsEffectOverlay.this.removeCurrentView();
                            }
                        });
                    }
                }
                if (ReactionsEffectOverlay.this.dismissProgress != 1.0f) {
                    setAlpha(1.0f - ReactionsEffectOverlay.this.dismissProgress);
                    super.dispatchDraw(canvas);
                }
                invalidate();
                return;
            }
            ReactionsEffectOverlay reactionsEffectOverlay4 = ReactionsEffectOverlay.this;
            if (reactionsEffectOverlay4.started) {
                if (reactionsEffectOverlay4.holderView != null) {
                    ReactionsEffectOverlay.this.holderView.enterImageView.setAlpha(0.0f);
                    ReactionsEffectOverlay.this.holderView.pressedBackupImageView.setAlpha(0.0f);
                }
                BaseFragment baseFragment = this.val$fragment;
                if (baseFragment instanceof ChatActivity) {
                    viewFindCell = ((ChatActivity) baseFragment).findCell(ReactionsEffectOverlay.this.messageId, false);
                } else {
                    viewFindCell = this.val$cell;
                }
                if (this.val$isStories) {
                    iDp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
                } else {
                    MessageObject messageObject = this.val$messageObject;
                    if (messageObject != null && messageObject.shouldDrawReactionsInLayout()) {
                        iDp = AndroidUtilities.dp(20.0f);
                    } else {
                        iDp = AndroidUtilities.dp(14.0f);
                    }
                }
                float f22 = iDp;
                if (viewFindCell != null) {
                    viewFindCell.getLocationInWindow(ReactionsEffectOverlay.this.loc);
                    ReactionsEffectOverlay reactionsEffectOverlay5 = ReactionsEffectOverlay.this;
                    int[] iArr = reactionsEffectOverlay5.loc;
                    measuredWidth = iArr[0];
                    measuredHeight = iArr[1];
                    if (viewFindCell instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) viewFindCell;
                        reactionButton = chatMessageCell.getReactionButton(reactionsEffectOverlay5.reaction);
                        f = 0.10666667f;
                        if (chatMessageCell.drawPinnedBottom && !chatMessageCell.shouldDrawTimeOnMedia()) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        paddingTop = chatMessageCell.getPaddingTop();
                    } else {
                        f = 0.10666667f;
                        if (viewFindCell instanceof ChatActionCell) {
                            reactionButton = ((ChatActionCell) viewFindCell).getReactionButton(reactionsEffectOverlay5.reaction);
                            paddingTop = viewFindCell.getPaddingTop();
                        } else {
                            if (viewFindCell instanceof GroupCallMessageCell) {
                                measuredWidth += ((GroupCallMessageCell) viewFindCell).getReactionCenterX();
                                measuredHeight += viewFindCell.getMeasuredHeight() / 2.0f;
                            }
                            reactionButton = null;
                        }
                        if (reactionButton != null) {
                            Rect rect = reactionButton.drawingImageRect;
                            measuredWidth += rect.left;
                            measuredHeight += rect.top;
                        }
                        chatActivity = this.val$chatActivity;
                        if (chatActivity != null) {
                            measuredHeight += chatActivity.drawingChatListViewYoffset;
                        }
                        ReactionsEffectOverlay.this.lastDrawnToX = measuredWidth;
                        ReactionsEffectOverlay.this.lastDrawnToY = measuredHeight;
                    }
                    measuredHeight += paddingTop;
                    if (reactionButton != null) {
                        Rect rect2 = reactionButton.drawingImageRect;
                        measuredWidth += rect2.left;
                        measuredHeight += rect2.top;
                    }
                    chatActivity = this.val$chatActivity;
                    if (chatActivity != null) {
                        measuredHeight += chatActivity.drawingChatListViewYoffset;
                    }
                    ReactionsEffectOverlay.this.lastDrawnToX = measuredWidth;
                    ReactionsEffectOverlay.this.lastDrawnToY = measuredHeight;
                } else {
                    f = 0.10666667f;
                    if (!this.val$isStories) {
                        measuredWidth = ReactionsEffectOverlay.this.lastDrawnToX;
                        measuredHeight = ReactionsEffectOverlay.this.lastDrawnToY;
                    } else {
                        float f23 = f22 / 2.0f;
                        measuredWidth = (getMeasuredWidth() / 2.0f) - f23;
                        measuredHeight = (getMeasuredHeight() / 2.0f) - f23;
                    }
                }
                BaseFragment baseFragment2 = this.val$fragment;
                if (baseFragment2 != null && baseFragment2.getParentActivity() != null && this.val$fragment.getFragmentView() != null && this.val$fragment.getFragmentView().getParent() != null && this.val$fragment.getFragmentView().getVisibility() == 0 && this.val$fragment.getFragmentView() != null) {
                    this.val$fragment.getFragmentView().getLocationOnScreen(ReactionsEffectOverlay.this.loc);
                    setAlpha(((View) this.val$fragment.getFragmentView().getParent()).getAlpha());
                } else if (!this.val$isStories && !(viewFindCell instanceof GroupCallMessageCell)) {
                    return;
                }
                if (viewFindCell instanceof GroupCallMessageCell) {
                    f2 = this.val$emojiSize;
                } else {
                    f2 = this.val$emojiSize - f22;
                }
                float f24 = f2 / 2.0f;
                float measuredWidth2 = measuredWidth - f24;
                float f25 = measuredHeight - f24;
                if (this.val$isStories && this.val$animationType == 0) {
                    measuredWidth2 += AndroidUtilities.dp(40.0f);
                }
                if (this.val$animationType != 1 && !this.val$isStories) {
                    int i4 = ReactionsEffectOverlay.this.loc[0];
                    float f26 = i4;
                    if (measuredWidth2 < f26) {
                        measuredWidth2 = f26;
                    }
                    if (this.val$emojiSize + measuredWidth2 > i4 + getMeasuredWidth()) {
                        measuredWidth2 = (ReactionsEffectOverlay.this.loc[0] + getMeasuredWidth()) - this.val$emojiSize;
                    }
                }
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                float interpolation3 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateOutProgress);
                if (this.val$animationType == 2) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(interpolation3);
                    interpolation2 = cubicBezierInterpolator.getInterpolation(interpolation3);
                    f3 = 2.0f;
                } else if (this.val$fromHolder) {
                    f3 = 2.0f;
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                    interpolation2 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                } else {
                    f3 = 2.0f;
                    interpolation = ReactionsEffectOverlay.this.animateInProgress;
                    interpolation2 = interpolation;
                }
                float f27 = 1.0f - interpolation;
                float f28 = (this.val$fromScale * f27) + interpolation;
                float f29 = f22 / this.val$emojiSize;
                if (this.val$animationType == 1) {
                    f28 = 1.0f;
                } else {
                    measuredWidth2 = (measuredWidth2 * interpolation) + (this.val$fromX * f27);
                    f25 = (f25 * interpolation2) + (this.val$fromY * (1.0f - interpolation2));
                }
                ReactionsEffectOverlay.this.effectImageView.setTranslationX(measuredWidth2);
                ReactionsEffectOverlay.this.effectImageView.setTranslationY(f25);
                float f30 = 1.0f - interpolation3;
                ReactionsEffectOverlay.this.effectImageView.setAlpha(f30);
                ReactionsEffectOverlay.this.effectImageView.setScaleX(f28);
                ReactionsEffectOverlay.this.effectImageView.setScaleY(f28);
                int i5 = this.val$animationType;
                if (i5 == 2) {
                    f28 = (this.val$fromScale * f27) + (f29 * interpolation);
                    measuredWidth2 = (this.val$fromX * f27) + (measuredWidth * interpolation);
                    f4 = this.val$fromY * (1.0f - interpolation2);
                    f5 = measuredHeight * interpolation2;
                } else {
                    if (interpolation3 != 0.0f) {
                        f28 = (f28 * f30) + (f29 * interpolation3);
                        measuredWidth2 = (measuredWidth2 * f30) + (measuredWidth * interpolation3);
                        f4 = f25 * f30;
                        f5 = measuredHeight * interpolation3;
                    }
                    if (i5 != 1) {
                        if (!this.val$isStories) {
                            AnimationView animationView = ReactionsEffectOverlay.this.emojiStaticImageView;
                            if (interpolation3 > 0.7f) {
                                f21 = (interpolation3 - 0.7f) / 0.3f;
                            } else {
                                f21 = 0.0f;
                            }
                            animationView.setAlpha(f21);
                        } else {
                            ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                        }
                    }
                    if (this.val$animationType == 0 && this.val$isStories) {
                        ReactionsEffectOverlay.this.emojiImageView.setAlpha(f30);
                    }
                    ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
                    ReactionsEffectOverlay.this.container.setTranslationY(f25);
                    ReactionsEffectOverlay.this.container.setScaleX(f28);
                    ReactionsEffectOverlay.this.container.setScaleY(f28);
                    super.dispatchDraw(canvas);
                    if (this.val$animationType != 1 || ReactionsEffectOverlay.this.emojiImageView.wasPlaying) {
                        reactionsEffectOverlay = ReactionsEffectOverlay.this;
                        f6 = reactionsEffectOverlay.animateInProgress;
                        if (f6 != 1.0f) {
                            if (this.val$fromHolder) {
                                reactionsEffectOverlay.animateInProgress = f6 + 0.045714285f;
                            } else {
                                reactionsEffectOverlay.animateInProgress = f6 + 0.07272727f;
                            }
                            if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                                reactionsEffectOverlay.animateInProgress = 1.0f;
                            }
                        }
                    }
                    if (this.val$animationType == 2 && ((!ReactionsEffectOverlay.this.wasScrolled || this.val$animationType != 0) && (this.val$animationType == 1 || !ReactionsEffectOverlay.this.emojiImageView.wasPlaying || ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation() == null || ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation().isRunning()))) {
                        if (this.val$visibleReaction.documentId != 0) {
                            f7 = 16.0f;
                            if (System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime <= 2000) {
                            }
                            if (!ReactionsEffectOverlay.this.avatars.isEmpty() && ReactionsEffectOverlay.this.effectImageView.wasPlaying) {
                                lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                                i = 0;
                                while (i < ReactionsEffectOverlay.this.avatars.size()) {
                                    avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i);
                                    f8 = avatarParticle.progress;
                                    if (lottieAnimation == null && lottieAnimation.isRunning()) {
                                        float duration = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getDuration();
                                        if (((int) (duration - ((ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getCurrentFrame() / ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getFramesCount()) * duration))) < avatarParticle.leftTime) {
                                            f9 = avatarParticle.outProgress;
                                            if (f9 != 1.0f) {
                                                f10 = f9 + f;
                                                avatarParticle.outProgress = f10;
                                                if (f10 > 1.0f) {
                                                    avatarParticle.outProgress = 1.0f;
                                                    ReactionsEffectOverlay.this.avatars.remove(i);
                                                    i--;
                                                } else {
                                                    if (f8 < 0.5f) {
                                                        f12 = f8 / 0.5f;
                                                        f11 = 1.0f;
                                                    } else {
                                                        f11 = 1.0f;
                                                        f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                                    }
                                                    float f31 = f11 - f8;
                                                    float f32 = (avatarParticle.fromX * f31) + (avatarParticle.toX * f8);
                                                    float f33 = ((avatarParticle.fromY * f31) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                                    float f34 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                                    float x = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f32);
                                                    float y = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f33);
                                                    int iDp2 = AndroidUtilities.dp(f7);
                                                    float f35 = iDp2;
                                                    float f36 = f35 / f3;
                                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x - f36, y - f36, f35, f35);
                                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp2 >> 1);
                                                    canvas.save();
                                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                                    canvas.scale(f34, f34, x, y);
                                                    canvas.rotate(avatarParticle.currentRotation, x, y);
                                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                                    canvas.restore();
                                                    f13 = avatarParticle.progress;
                                                    if (f13 < 1.0f) {
                                                        f18 = f13 + 0.045714285f;
                                                        avatarParticle.progress = f18;
                                                        if (f18 > 1.0f) {
                                                            avatarParticle.progress = 1.0f;
                                                        }
                                                    }
                                                    if (f8 >= 1.0f) {
                                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                                    }
                                                    if (avatarParticle.incrementRotation) {
                                                        float f37 = avatarParticle.currentRotation;
                                                        f16 = avatarParticle.randomRotation;
                                                        f17 = f37 + (f16 / 250.0f);
                                                        avatarParticle.currentRotation = f17;
                                                        if (f17 > f16) {
                                                            avatarParticle.incrementRotation = false;
                                                        }
                                                    } else {
                                                        float f38 = avatarParticle.currentRotation;
                                                        f14 = avatarParticle.randomRotation;
                                                        f15 = f38 - (f14 / 250.0f);
                                                        avatarParticle.currentRotation = f15;
                                                        if (f15 < (-f14)) {
                                                            avatarParticle.incrementRotation = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (f8 < 0.5f) {
                                                    f12 = f8 / 0.5f;
                                                    f11 = 1.0f;
                                                } else {
                                                    f11 = 1.0f;
                                                    f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                                }
                                                float f39 = f11 - f8;
                                                float f310 = (avatarParticle.fromX * f39) + (avatarParticle.toX * f8);
                                                float f311 = ((avatarParticle.fromY * f39) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                                float f312 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                                float x2 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f310);
                                                float y2 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f311);
                                                int iDp3 = AndroidUtilities.dp(f7);
                                                float f313 = iDp3;
                                                float f314 = f313 / f3;
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x2 - f314, y2 - f314, f313, f313);
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp3 >> 1);
                                                canvas.save();
                                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                                canvas.scale(f312, f312, x2, y2);
                                                canvas.rotate(avatarParticle.currentRotation, x2, y2);
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                                canvas.restore();
                                                f13 = avatarParticle.progress;
                                                if (f13 < 1.0f) {
                                                    f18 = f13 + 0.045714285f;
                                                    avatarParticle.progress = f18;
                                                    if (f18 > 1.0f) {
                                                        avatarParticle.progress = 1.0f;
                                                    }
                                                }
                                                if (f8 >= 1.0f) {
                                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                                }
                                                if (avatarParticle.incrementRotation) {
                                                    float f315 = avatarParticle.currentRotation;
                                                    f16 = avatarParticle.randomRotation;
                                                    f17 = f315 + (f16 / 250.0f);
                                                    avatarParticle.currentRotation = f17;
                                                    if (f17 > f16) {
                                                        avatarParticle.incrementRotation = false;
                                                    }
                                                } else {
                                                    float f316 = avatarParticle.currentRotation;
                                                    f14 = avatarParticle.randomRotation;
                                                    f15 = f316 - (f14 / 250.0f);
                                                    avatarParticle.currentRotation = f15;
                                                    if (f15 < (-f14)) {
                                                        avatarParticle.incrementRotation = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (f8 < 0.5f) {
                                                f12 = f8 / 0.5f;
                                                f11 = 1.0f;
                                            } else {
                                                f11 = 1.0f;
                                                f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                            }
                                            float f317 = f11 - f8;
                                            float f318 = (avatarParticle.fromX * f317) + (avatarParticle.toX * f8);
                                            float f319 = ((avatarParticle.fromY * f317) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                            float f3110 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                            float x3 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f318);
                                            float y3 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f319);
                                            int iDp4 = AndroidUtilities.dp(f7);
                                            float f3111 = iDp4;
                                            float f3112 = f3111 / f3;
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x3 - f3112, y3 - f3112, f3111, f3111);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp4 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f3110, f3110, x3, y3);
                                            canvas.rotate(avatarParticle.currentRotation, x3, y3);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f13 = avatarParticle.progress;
                                            if (f13 < 1.0f) {
                                                f18 = f13 + 0.045714285f;
                                                avatarParticle.progress = f18;
                                                if (f18 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f8 >= 1.0f) {
                                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f3113 = avatarParticle.currentRotation;
                                                f16 = avatarParticle.randomRotation;
                                                f17 = f3113 + (f16 / 250.0f);
                                                avatarParticle.currentRotation = f17;
                                                if (f17 > f16) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f3114 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = f3114 - (f14 / 250.0f);
                                                avatarParticle.currentRotation = f15;
                                                if (f15 < (-f14)) {
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                        }
                                    } else {
                                        f9 = avatarParticle.outProgress;
                                        if (f9 != 1.0f) {
                                            f10 = f9 + f;
                                            avatarParticle.outProgress = f10;
                                            if (f10 > 1.0f) {
                                                avatarParticle.outProgress = 1.0f;
                                                ReactionsEffectOverlay.this.avatars.remove(i);
                                                i--;
                                            } else {
                                                if (f8 < 0.5f) {
                                                    f12 = f8 / 0.5f;
                                                    f11 = 1.0f;
                                                } else {
                                                    f11 = 1.0f;
                                                    f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                                }
                                                float f3115 = f11 - f8;
                                                float f3116 = (avatarParticle.fromX * f3115) + (avatarParticle.toX * f8);
                                                float f3117 = ((avatarParticle.fromY * f3115) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                                float f3118 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                                float x4 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f3116);
                                                float y4 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3117);
                                                int iDp5 = AndroidUtilities.dp(f7);
                                                float f3119 = iDp5;
                                                float f31110 = f3119 / f3;
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x4 - f31110, y4 - f31110, f3119, f3119);
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp5 >> 1);
                                                canvas.save();
                                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                                canvas.scale(f3118, f3118, x4, y4);
                                                canvas.rotate(avatarParticle.currentRotation, x4, y4);
                                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                                canvas.restore();
                                                f13 = avatarParticle.progress;
                                                if (f13 < 1.0f) {
                                                    f18 = f13 + 0.045714285f;
                                                    avatarParticle.progress = f18;
                                                    if (f18 > 1.0f) {
                                                        avatarParticle.progress = 1.0f;
                                                    }
                                                }
                                                if (f8 >= 1.0f) {
                                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                                }
                                                if (avatarParticle.incrementRotation) {
                                                    float f31111 = avatarParticle.currentRotation;
                                                    f16 = avatarParticle.randomRotation;
                                                    f17 = f31111 + (f16 / 250.0f);
                                                    avatarParticle.currentRotation = f17;
                                                    if (f17 > f16) {
                                                        avatarParticle.incrementRotation = false;
                                                    }
                                                } else {
                                                    float f31112 = avatarParticle.currentRotation;
                                                    f14 = avatarParticle.randomRotation;
                                                    f15 = f31112 - (f14 / 250.0f);
                                                    avatarParticle.currentRotation = f15;
                                                    if (f15 < (-f14)) {
                                                        avatarParticle.incrementRotation = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (f8 < 0.5f) {
                                                f12 = f8 / 0.5f;
                                                f11 = 1.0f;
                                            } else {
                                                f11 = 1.0f;
                                                f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                            }
                                            float f31113 = f11 - f8;
                                            float f31114 = (avatarParticle.fromX * f31113) + (avatarParticle.toX * f8);
                                            float f31115 = ((avatarParticle.fromY * f31113) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                            float f31116 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                            float x5 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f31114);
                                            float y5 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f31115);
                                            int iDp6 = AndroidUtilities.dp(f7);
                                            float f31117 = iDp6;
                                            float f31118 = f31117 / f3;
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x5 - f31118, y5 - f31118, f31117, f31117);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp6 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f31116, f31116, x5, y5);
                                            canvas.rotate(avatarParticle.currentRotation, x5, y5);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f13 = avatarParticle.progress;
                                            if (f13 < 1.0f) {
                                                f18 = f13 + 0.045714285f;
                                                avatarParticle.progress = f18;
                                                if (f18 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f8 >= 1.0f) {
                                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f31119 = avatarParticle.currentRotation;
                                                f16 = avatarParticle.randomRotation;
                                                f17 = f31119 + (f16 / 250.0f);
                                                avatarParticle.currentRotation = f17;
                                                if (f17 > f16) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f311110 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = f311110 - (f14 / 250.0f);
                                                avatarParticle.currentRotation = f15;
                                                if (f15 < (-f14)) {
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                            invalidate();
                            return;
                        }
                        f7 = 16.0f;
                        if ((this.val$animationType == 1 && ReactionsEffectOverlay.this.effectImageView.wasPlaying && ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation() != null && !ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().isRunning()) || (this.val$visibleReaction.documentId != 0 && System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000)) {
                        }
                        if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                            lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                            i = 0;
                            while (i < ReactionsEffectOverlay.this.avatars.size()) {
                                avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i);
                                f8 = avatarParticle.progress;
                                if (lottieAnimation == null) {
                                    f9 = avatarParticle.outProgress;
                                    if (f9 != 1.0f) {
                                        f10 = f9 + f;
                                        avatarParticle.outProgress = f10;
                                        if (f10 > 1.0f) {
                                            avatarParticle.outProgress = 1.0f;
                                            ReactionsEffectOverlay.this.avatars.remove(i);
                                            i--;
                                        } else {
                                            if (f8 < 0.5f) {
                                                f12 = f8 / 0.5f;
                                                f11 = 1.0f;
                                            } else {
                                                f11 = 1.0f;
                                                f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                            }
                                            float f311111 = f11 - f8;
                                            float f311112 = (avatarParticle.fromX * f311111) + (avatarParticle.toX * f8);
                                            float f311113 = ((avatarParticle.fromY * f311111) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                            float f311114 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                            float x6 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f311112);
                                            float y6 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f311113);
                                            int iDp7 = AndroidUtilities.dp(f7);
                                            float f311115 = iDp7;
                                            float f311116 = f311115 / f3;
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x6 - f311116, y6 - f311116, f311115, f311115);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp7 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f311114, f311114, x6, y6);
                                            canvas.rotate(avatarParticle.currentRotation, x6, y6);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f13 = avatarParticle.progress;
                                            if (f13 < 1.0f) {
                                                f18 = f13 + 0.045714285f;
                                                avatarParticle.progress = f18;
                                                if (f18 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f8 >= 1.0f) {
                                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f311117 = avatarParticle.currentRotation;
                                                f16 = avatarParticle.randomRotation;
                                                f17 = f311117 + (f16 / 250.0f);
                                                avatarParticle.currentRotation = f17;
                                                if (f17 > f16) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f311118 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = f311118 - (f14 / 250.0f);
                                                avatarParticle.currentRotation = f15;
                                                if (f15 < (-f14)) {
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                        }
                                    } else {
                                        if (f8 < 0.5f) {
                                            f12 = f8 / 0.5f;
                                            f11 = 1.0f;
                                        } else {
                                            f11 = 1.0f;
                                            f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                        }
                                        float f311119 = f11 - f8;
                                        float f3111110 = (avatarParticle.fromX * f311119) + (avatarParticle.toX * f8);
                                        float f3111111 = ((avatarParticle.fromY * f311119) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                        float f3111112 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                        float x7 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f3111110);
                                        float y7 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3111111);
                                        int iDp8 = AndroidUtilities.dp(f7);
                                        float f3111113 = iDp8;
                                        float f3111114 = f3111113 / f3;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x7 - f3111114, y7 - f3111114, f3111113, f3111113);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp8 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f3111112, f3111112, x7, y7);
                                        canvas.rotate(avatarParticle.currentRotation, x7, y7);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f8 >= 1.0f) {
                                            avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f3111115 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = f3111115 + (f16 / 250.0f);
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f3111116 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f3111116 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                } else {
                                    f9 = avatarParticle.outProgress;
                                    if (f9 != 1.0f) {
                                        f10 = f9 + f;
                                        avatarParticle.outProgress = f10;
                                        if (f10 > 1.0f) {
                                            avatarParticle.outProgress = 1.0f;
                                            ReactionsEffectOverlay.this.avatars.remove(i);
                                            i--;
                                        } else {
                                            if (f8 < 0.5f) {
                                                f12 = f8 / 0.5f;
                                                f11 = 1.0f;
                                            } else {
                                                f11 = 1.0f;
                                                f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                            }
                                            float f3111117 = f11 - f8;
                                            float f3111118 = (avatarParticle.fromX * f3111117) + (avatarParticle.toX * f8);
                                            float f3111119 = ((avatarParticle.fromY * f3111117) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                            float f31111110 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                            float x8 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f3111118);
                                            float y8 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3111119);
                                            int iDp9 = AndroidUtilities.dp(f7);
                                            float f31111111 = iDp9;
                                            float f31111112 = f31111111 / f3;
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x8 - f31111112, y8 - f31111112, f31111111, f31111111);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp9 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f31111110, f31111110, x8, y8);
                                            canvas.rotate(avatarParticle.currentRotation, x8, y8);
                                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f13 = avatarParticle.progress;
                                            if (f13 < 1.0f) {
                                                f18 = f13 + 0.045714285f;
                                                avatarParticle.progress = f18;
                                                if (f18 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f8 >= 1.0f) {
                                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f31111113 = avatarParticle.currentRotation;
                                                f16 = avatarParticle.randomRotation;
                                                f17 = f31111113 + (f16 / 250.0f);
                                                avatarParticle.currentRotation = f17;
                                                if (f17 > f16) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f31111114 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = f31111114 - (f14 / 250.0f);
                                                avatarParticle.currentRotation = f15;
                                                if (f15 < (-f14)) {
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                        }
                                    } else {
                                        if (f8 < 0.5f) {
                                            f12 = f8 / 0.5f;
                                            f11 = 1.0f;
                                        } else {
                                            f11 = 1.0f;
                                            f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                        }
                                        float f31111115 = f11 - f8;
                                        float f31111116 = (avatarParticle.fromX * f31111115) + (avatarParticle.toX * f8);
                                        float f31111117 = ((avatarParticle.fromY * f31111115) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                        float f31111118 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                        float x9 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f31111116);
                                        float y9 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f31111117);
                                        int iDp10 = AndroidUtilities.dp(f7);
                                        float f31111119 = iDp10;
                                        float f311111110 = f31111119 / f3;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x9 - f311111110, y9 - f311111110, f31111119, f31111119);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp10 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f31111118, f31111118, x9, y9);
                                        canvas.rotate(avatarParticle.currentRotation, x9, y9);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f8 >= 1.0f) {
                                            avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f311111111 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = f311111111 + (f16 / 250.0f);
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f311111112 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f311111112 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                        invalidate();
                        return;
                    }
                    f7 = 16.0f;
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f19 = reactionsEffectOverlay2.animateOutProgress;
                    if (f19 != 1.0f) {
                        i2 = this.val$animationType;
                        if (i2 == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i2 == 2) {
                                f20 = 350.0f;
                            } else {
                                f20 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = f19 + (f7 / f20);
                        }
                        if (reactionsEffectOverlay2.animateOutProgress > 0.7f) {
                            if (!this.val$isStories && i2 == 2) {
                                if (!reactionsEffectOverlay2.isFinished) {
                                    reactionsEffectOverlay2.isFinished = true;
                                    try {
                                        performHapticFeedback(0);
                                    } catch (Exception unused) {
                                    }
                                    ((ViewGroup) getParent()).addView(ReactionsEffectOverlay.this.nextReactionOverlay.windowView);
                                    ReactionsEffectOverlay.this.nextReactionOverlay.isStories = true;
                                    ReactionsEffectOverlay.this.nextReactionOverlay.started = true;
                                    ReactionsEffectOverlay.this.nextReactionOverlay.startTime = System.currentTimeMillis();
                                    ReactionsEffectOverlay.this.nextReactionOverlay.windowView.setTag(R.id.parent_tag, 1);
                                    animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animator) {
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                        }
                                    });
                                }
                            } else {
                                ReactionsEffectOverlay.startShortAnimation();
                            }
                        }
                        reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                        if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 != 0 || i3 == 2) {
                                view = this.val$cell;
                                if (view instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (view instanceof ChatActionCell) {
                                    ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            }
                            ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                            if (this.val$animationType == 1) {
                                ReactionsEffectOverlay.currentShortOverlay = null;
                            } else {
                                ReactionsEffectOverlay.currentOverlay = null;
                            }
                            view2 = this.val$cell;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.val$cell;
                                if ((view3 instanceof ChatMessageCell) && ((ChatMessageCell) view3).getCurrentMessagesGroup() != null && this.val$cell.getParent() != null) {
                                    ((View) this.val$cell.getParent()).invalidate();
                                }
                            }
                            if (this.val$isStories || this.val$animationType != 2) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            }
                        }
                    }
                    if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                        lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                        i = 0;
                        while (i < ReactionsEffectOverlay.this.avatars.size()) {
                            avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i);
                            f8 = avatarParticle.progress;
                            if (lottieAnimation == null) {
                                f9 = avatarParticle.outProgress;
                                if (f9 != 1.0f) {
                                    f10 = f9 + f;
                                    avatarParticle.outProgress = f10;
                                    if (f10 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        ReactionsEffectOverlay.this.avatars.remove(i);
                                        i--;
                                    } else {
                                        if (f8 < 0.5f) {
                                            f12 = f8 / 0.5f;
                                            f11 = 1.0f;
                                        } else {
                                            f11 = 1.0f;
                                            f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                        }
                                        float f311111113 = f11 - f8;
                                        float f311111114 = (avatarParticle.fromX * f311111113) + (avatarParticle.toX * f8);
                                        float f311111115 = ((avatarParticle.fromY * f311111113) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                        float f311111116 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                        float x10 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f311111114);
                                        float y10 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f311111115);
                                        int iDp11 = AndroidUtilities.dp(f7);
                                        float f311111117 = iDp11;
                                        float f311111118 = f311111117 / f3;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x10 - f311111118, y10 - f311111118, f311111117, f311111117);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp11 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f311111116, f311111116, x10, y10);
                                        canvas.rotate(avatarParticle.currentRotation, x10, y10);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f8 >= 1.0f) {
                                            avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f311111119 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = f311111119 + (f16 / 250.0f);
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f3111111110 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f3111111110 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                } else {
                                    if (f8 < 0.5f) {
                                        f12 = f8 / 0.5f;
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 1.0f;
                                        f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f3111111111 = f11 - f8;
                                    float f3111111112 = (avatarParticle.fromX * f3111111111) + (avatarParticle.toX * f8);
                                    float f3111111113 = ((avatarParticle.fromY * f3111111111) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                    float f3111111114 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x11 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f3111111112);
                                    float y11 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3111111113);
                                    int iDp12 = AndroidUtilities.dp(f7);
                                    float f3111111115 = iDp12;
                                    float f3111111116 = f3111111115 / f3;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x11 - f3111111116, y11 - f3111111116, f3111111115, f3111111115);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp12 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f3111111114, f3111111114, x11, y11);
                                    canvas.rotate(avatarParticle.currentRotation, x11, y11);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f3111111117 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = f3111111117 + (f16 / 250.0f);
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f3111111118 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f3111111118 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                f9 = avatarParticle.outProgress;
                                if (f9 != 1.0f) {
                                    f10 = f9 + f;
                                    avatarParticle.outProgress = f10;
                                    if (f10 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        ReactionsEffectOverlay.this.avatars.remove(i);
                                        i--;
                                    } else {
                                        if (f8 < 0.5f) {
                                            f12 = f8 / 0.5f;
                                            f11 = 1.0f;
                                        } else {
                                            f11 = 1.0f;
                                            f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                        }
                                        float f3111111119 = f11 - f8;
                                        float f31111111110 = (avatarParticle.fromX * f3111111119) + (avatarParticle.toX * f8);
                                        float f31111111111 = ((avatarParticle.fromY * f3111111119) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                        float f31111111112 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                        float x12 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f31111111110);
                                        float y12 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f31111111111);
                                        int iDp13 = AndroidUtilities.dp(f7);
                                        float f31111111113 = iDp13;
                                        float f31111111114 = f31111111113 / f3;
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x12 - f31111111114, y12 - f31111111114, f31111111113, f31111111113);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp13 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f31111111112, f31111111112, x12, y12);
                                        canvas.rotate(avatarParticle.currentRotation, x12, y12);
                                        ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f8 >= 1.0f) {
                                            avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f31111111115 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = f31111111115 + (f16 / 250.0f);
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f31111111116 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f31111111116 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                    }
                                } else {
                                    if (f8 < 0.5f) {
                                        f12 = f8 / 0.5f;
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 1.0f;
                                        f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f31111111117 = f11 - f8;
                                    float f31111111118 = (avatarParticle.fromX * f31111111117) + (avatarParticle.toX * f8);
                                    float f31111111119 = ((avatarParticle.fromY * f31111111117) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                    float f311111111110 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x13 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f31111111118);
                                    float y13 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f31111111119);
                                    int iDp14 = AndroidUtilities.dp(f7);
                                    float f311111111111 = iDp14;
                                    float f311111111112 = f311111111111 / f3;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x13 - f311111111112, y13 - f311111111112, f311111111111, f311111111111);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp14 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f311111111110, f311111111110, x13, y13);
                                    canvas.rotate(avatarParticle.currentRotation, x13, y13);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f311111111113 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = f311111111113 + (f16 / 250.0f);
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f311111111114 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f311111111114 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    invalidate();
                    return;
                }
                f25 = f4 + f5;
                if (i5 != 1) {
                    if (!this.val$isStories) {
                        AnimationView animationView2 = ReactionsEffectOverlay.this.emojiStaticImageView;
                        if (interpolation3 > 0.7f) {
                            f21 = (interpolation3 - 0.7f) / 0.3f;
                        } else {
                            f21 = 0.0f;
                        }
                        animationView2.setAlpha(f21);
                    } else {
                        ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                    }
                }
                if (this.val$animationType == 0) {
                    ReactionsEffectOverlay.this.emojiImageView.setAlpha(f30);
                }
                ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
                ReactionsEffectOverlay.this.container.setTranslationY(f25);
                ReactionsEffectOverlay.this.container.setScaleX(f28);
                ReactionsEffectOverlay.this.container.setScaleY(f28);
                super.dispatchDraw(canvas);
                if (this.val$animationType != 1) {
                    reactionsEffectOverlay = ReactionsEffectOverlay.this;
                    f6 = reactionsEffectOverlay.animateInProgress;
                    if (f6 != 1.0f) {
                        if (this.val$fromHolder) {
                            reactionsEffectOverlay.animateInProgress = f6 + 0.045714285f;
                        } else {
                            reactionsEffectOverlay.animateInProgress = f6 + 0.07272727f;
                        }
                        if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                            reactionsEffectOverlay.animateInProgress = 1.0f;
                        }
                    }
                } else {
                    reactionsEffectOverlay = ReactionsEffectOverlay.this;
                    f6 = reactionsEffectOverlay.animateInProgress;
                    if (f6 != 1.0f) {
                        if (this.val$fromHolder) {
                            reactionsEffectOverlay.animateInProgress = f6 + 0.045714285f;
                        } else {
                            reactionsEffectOverlay.animateInProgress = f6 + 0.07272727f;
                        }
                        if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                            reactionsEffectOverlay.animateInProgress = 1.0f;
                        }
                    }
                }
                if (this.val$animationType == 2) {
                    f7 = 16.0f;
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f19 = reactionsEffectOverlay2.animateOutProgress;
                    if (f19 != 1.0f) {
                        i2 = this.val$animationType;
                        if (i2 == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i2 == 2) {
                                f20 = 350.0f;
                            } else {
                                f20 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = f19 + (f7 / f20);
                        }
                        if (reactionsEffectOverlay2.animateOutProgress > 0.7f) {
                            if (!this.val$isStories) {
                                ReactionsEffectOverlay.startShortAnimation();
                            } else {
                                ReactionsEffectOverlay.startShortAnimation();
                            }
                        }
                        reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                        if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 != 0) {
                                view = this.val$cell;
                                if (view instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (view instanceof ChatActionCell) {
                                    ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            } else {
                                view = this.val$cell;
                                if (view instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (view instanceof ChatActionCell) {
                                    ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            }
                            ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                            if (this.val$animationType == 1) {
                                ReactionsEffectOverlay.currentShortOverlay = null;
                            } else {
                                ReactionsEffectOverlay.currentOverlay = null;
                            }
                            view2 = this.val$cell;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.val$cell;
                                if (view3 instanceof ChatMessageCell) {
                                    ((View) this.val$cell.getParent()).invalidate();
                                }
                            }
                            if (this.val$isStories) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            }
                        }
                    }
                } else {
                    f7 = 16.0f;
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f19 = reactionsEffectOverlay2.animateOutProgress;
                    if (f19 != 1.0f) {
                        i2 = this.val$animationType;
                        if (i2 == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i2 == 2) {
                                f20 = 350.0f;
                            } else {
                                f20 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = f19 + (f7 / f20);
                        }
                        if (reactionsEffectOverlay2.animateOutProgress > 0.7f) {
                            if (!this.val$isStories) {
                                ReactionsEffectOverlay.startShortAnimation();
                            } else {
                                ReactionsEffectOverlay.startShortAnimation();
                            }
                        }
                        reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                        if (reactionsEffectOverlay3.animateOutProgress >= 1.0f) {
                            i3 = this.val$animationType;
                            if (i3 != 0) {
                                view = this.val$cell;
                                if (view instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (view instanceof ChatActionCell) {
                                    ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            } else {
                                view = this.val$cell;
                                if (view instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                } else if (view instanceof ChatActionCell) {
                                    ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay3.reaction);
                                }
                            }
                            ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                            if (this.val$animationType == 1) {
                                ReactionsEffectOverlay.currentShortOverlay = null;
                            } else {
                                ReactionsEffectOverlay.currentOverlay = null;
                            }
                            view2 = this.val$cell;
                            if (view2 != null) {
                                view2.invalidate();
                                view3 = this.val$cell;
                                if (view3 instanceof ChatMessageCell) {
                                    ((View) this.val$cell.getParent()).invalidate();
                                }
                            }
                            if (this.val$isStories) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            }
                        }
                    }
                }
                if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                    lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                    i = 0;
                    while (i < ReactionsEffectOverlay.this.avatars.size()) {
                        avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i);
                        f8 = avatarParticle.progress;
                        if (lottieAnimation == null) {
                            f9 = avatarParticle.outProgress;
                            if (f9 != 1.0f) {
                                f10 = f9 + f;
                                avatarParticle.outProgress = f10;
                                if (f10 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i);
                                    i--;
                                } else {
                                    if (f8 < 0.5f) {
                                        f12 = f8 / 0.5f;
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 1.0f;
                                        f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f311111111115 = f11 - f8;
                                    float f311111111116 = (avatarParticle.fromX * f311111111115) + (avatarParticle.toX * f8);
                                    float f311111111117 = ((avatarParticle.fromY * f311111111115) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                    float f311111111118 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x14 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f311111111116);
                                    float y14 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f311111111117);
                                    int iDp15 = AndroidUtilities.dp(f7);
                                    float f311111111119 = iDp15;
                                    float f3111111111110 = f311111111119 / f3;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x14 - f3111111111110, y14 - f3111111111110, f311111111119, f311111111119);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp15 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f311111111118, f311111111118, x14, y14);
                                    canvas.rotate(avatarParticle.currentRotation, x14, y14);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f3111111111111 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = f3111111111111 + (f16 / 250.0f);
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f3111111111112 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f3111111111112 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                if (f8 < 0.5f) {
                                    f12 = f8 / 0.5f;
                                    f11 = 1.0f;
                                } else {
                                    f11 = 1.0f;
                                    f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                }
                                float f3111111111113 = f11 - f8;
                                float f3111111111114 = (avatarParticle.fromX * f3111111111113) + (avatarParticle.toX * f8);
                                float f3111111111115 = ((avatarParticle.fromY * f3111111111113) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                float f3111111111116 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                float x15 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f3111111111114);
                                float y15 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3111111111115);
                                int iDp16 = AndroidUtilities.dp(f7);
                                float f3111111111117 = iDp16;
                                float f3111111111118 = f3111111111117 / f3;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x15 - f3111111111118, y15 - f3111111111118, f3111111111117, f3111111111117);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp16 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f3111111111116, f3111111111116, x15, y15);
                                canvas.rotate(avatarParticle.currentRotation, x15, y15);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f8 >= 1.0f) {
                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f3111111111119 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = f3111111111119 + (f16 / 250.0f);
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f31111111111110 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f31111111111110 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                            }
                        } else {
                            f9 = avatarParticle.outProgress;
                            if (f9 != 1.0f) {
                                f10 = f9 + f;
                                avatarParticle.outProgress = f10;
                                if (f10 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i);
                                    i--;
                                } else {
                                    if (f8 < 0.5f) {
                                        f12 = f8 / 0.5f;
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 1.0f;
                                        f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f31111111111111 = f11 - f8;
                                    float f31111111111112 = (avatarParticle.fromX * f31111111111111) + (avatarParticle.toX * f8);
                                    float f31111111111113 = ((avatarParticle.fromY * f31111111111111) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                    float f31111111111114 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x16 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f31111111111112);
                                    float y16 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f31111111111113);
                                    int iDp17 = AndroidUtilities.dp(f7);
                                    float f31111111111115 = iDp17;
                                    float f31111111111116 = f31111111111115 / f3;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x16 - f31111111111116, y16 - f31111111111116, f31111111111115, f31111111111115);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp17 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f31111111111114, f31111111111114, x16, y16);
                                    canvas.rotate(avatarParticle.currentRotation, x16, y16);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f31111111111117 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = f31111111111117 + (f16 / 250.0f);
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f31111111111118 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f31111111111118 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                }
                            } else {
                                if (f8 < 0.5f) {
                                    f12 = f8 / 0.5f;
                                    f11 = 1.0f;
                                } else {
                                    f11 = 1.0f;
                                    f12 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                }
                                float f31111111111119 = f11 - f8;
                                float f311111111111110 = (avatarParticle.fromX * f31111111111119) + (avatarParticle.toX * f8);
                                float f311111111111111 = ((avatarParticle.fromY * f31111111111119) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f12);
                                float f311111111111112 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                float x17 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f311111111111110);
                                float y17 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f311111111111111);
                                int iDp18 = AndroidUtilities.dp(f7);
                                float f311111111111113 = iDp18;
                                float f311111111111114 = f311111111111113 / f3;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x17 - f311111111111114, y17 - f311111111111114, f311111111111113, f311111111111113);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(iDp18 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f311111111111112, f311111111111112, x17, y17);
                                canvas.rotate(avatarParticle.currentRotation, x17, y17);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f8 >= 1.0f) {
                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f7) / 500.0f;
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f311111111111115 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = f311111111111115 + (f16 / 250.0f);
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f311111111111116 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f311111111111116 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
                invalidate();
                return;
            }
            invalidate();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.onAttachedToWindow();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.onDetachedFromWindow();
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

    public static void show(BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, View view, View view2, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2) {
        boolean z;
        ActionBarPopupWindow actionBarPopupWindow;
        if (view == null || visibleReaction == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                show(baseFragment, null, view, view2, 0.0f, 0.0f, visibleReaction, i, 1);
            }
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(baseFragment.getParentActivity(), baseFragment, reactionsContainerLayout, view, view2, f, f2, visibleReaction, i, i2, false);
            if (i2 == 1) {
                currentShortOverlay = reactionsEffectOverlay;
            } else {
                currentOverlay = reactionsEffectOverlay;
            }
            if (baseFragment instanceof ChatActivity) {
                z = (i2 == 0 || i2 == 2) && (actionBarPopupWindow = ((ChatActivity) baseFragment).scrimPopupWindow) != null && actionBarPopupWindow.isShowing();
            }
            reactionsEffectOverlay.useWindow = z;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = baseFragment.getParentActivity().getWindowManager();
                reactionsEffectOverlay.windowManager = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, reactionsEffectOverlay.windowView, layoutParams);
                reactionsEffectOverlay.windowManager.addView(reactionsEffectOverlay.windowView, layoutParams);
            } else {
                FrameLayout frameLayout = (FrameLayout) baseFragment.getParentActivity().getWindow().getDecorView();
                reactionsEffectOverlay.decorView = frameLayout;
                frameLayout.addView(reactionsEffectOverlay.windowView);
            }
            view.invalidate();
            if (!(view instanceof ChatMessageCell) || ((ChatMessageCell) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
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
            View view = reactionsEffectOverlay2.cell;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay2.reaction);
            } else if (view instanceof ChatActionCell) {
                ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay2.reaction);
            }
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
        View view = currentShortOverlay.cell;
        if (view != null) {
            view.performHapticFeedback(3);
        }
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
        int i2;
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null && ((i2 = reactionsEffectOverlay.animationType) == 2 || i2 == 0)) {
            long j2 = reactionsEffectOverlay.groupId;
            if (((j2 != 0 && j == j2) || i == reactionsEffectOverlay.messageId) && reactionsEffectOverlay.reaction.equals(visibleReaction)) {
                return true;
            }
        }
        return false;
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
        protected void onDraw(Canvas canvas) {
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
        protected void onAttachedToWindow() {
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
        protected void onDetachedFromWindow() {
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
        int iDp = AndroidUtilities.dp(350.0f);
        Point point = AndroidUtilities.displaySize;
        return (int) (Math.round(Math.min(iDp, Math.min(point.x, point.y)) * 0.7f) / AndroidUtilities.density);
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
