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
        MessageObject messageObject2;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        ReactionsLayoutInBubble.ReactionButton reactionButton2;
        ChatActivity chatActivity;
        float f3;
        MessageObject messageObject3;
        ReactionsContainerLayout.ReactionHolderView reactionHolderView;
        boolean z2;
        ReactionsLayoutInBubble.ReactionButton reactionButton3;
        float f4;
        float f5;
        int i3;
        float f6;
        float f7;
        float imageHeight;
        ImageReceiver imageReceiver;
        float imageX;
        ImageReceiver imageReceiver2;
        float imageY;
        ImageReceiver imageReceiver3;
        int i4;
        int iRound;
        int iSizeForBigReaction;
        int i5;
        int i6;
        float f8;
        int i7;
        int i8;
        FrameLayout frameLayout;
        MessageObject messageObject4;
        AnimationView animationView;
        AnimationView animationView2;
        AnimationView animationView3;
        TLRPC.TL_availableReaction tL_availableReaction;
        int i9;
        int i10;
        int i11;
        int i12;
        int color;
        boolean z3;
        ?? r3;
        int i13;
        Theme.ResourcesProvider resourceProvider;
        int i14;
        int i15;
        int i16;
        TLRPC.Document document;
        ?? r14;
        float f9;
        float width;
        float width2;
        float f10;
        Random random;
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        int i17;
        Random random2;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i18;
        this.holderView = null;
        this.isStories = z;
        boolean z4 = view instanceof ChatMessageCell;
        if (z4) {
            messageObject2 = ((ChatMessageCell) view).getMessageObject();
            this.messageId = messageObject2.getId();
            this.groupId = messageObject2.getGroupId();
        } else {
            if (view instanceof ChatActionCell) {
                messageObject2 = ((ChatActionCell) view).getMessageObject();
                this.messageId = messageObject2.getId();
                this.groupId = 0L;
            } else {
                this.messageId = 0;
                this.groupId = 0L;
                messageObject = null;
            }
            this.reaction = visibleReaction;
            this.animationType = i2;
            this.currentAccount = i;
            this.cell = view;
            if (z4) {
                reactionButton2 = ((ChatMessageCell) view).getReactionButton(visibleReaction);
            } else {
                if (view instanceof ChatActionCell) {
                    reactionButton2 = ((ChatActionCell) view).getReactionButton(visibleReaction);
                } else {
                    reactionButton = null;
                }
                if (!z && i2 == 2) {
                    ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment, reactionsContainerLayout, view, view2, f, f2, visibleReaction, i, 1, true);
                    this.nextReactionOverlay = reactionsEffectOverlay;
                    currentShortOverlay = reactionsEffectOverlay;
                }
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                } else {
                    chatActivity = null;
                }
                if (reactionsContainerLayout != null) {
                    for (i18 = 0; i18 < reactionsContainerLayout.recyclerListView.getChildCount(); i18++) {
                        if (!(reactionsContainerLayout.recyclerListView.getChildAt(i18) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout.recyclerListView.getChildAt(i18)).currentReaction.equals(this.reaction)) {
                            this.holderView = (ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout.recyclerListView.getChildAt(i18);
                            break;
                        }
                    }
                }
                f3 = 0.8f;
                if (i2 == 1) {
                    random = new Random();
                    messageObject3 = messageObject;
                    if (messageObject3 != null || (tL_messageReactions = messageObject3.messageOwner.reactions) == null) {
                        arrayList = null;
                    } else {
                        arrayList = tL_messageReactions.recent_reactions;
                    }
                    if (arrayList != null && chatActivity != null && chatActivity.getDialogId() < r2) {
                        i17 = 0;
                        while (i17 < arrayList.size()) {
                            if (this.reaction.equals(arrayList.get(i17).reaction) || !arrayList.get(i17).unread) {
                                random2 = random;
                                arrayList2 = arrayList;
                            } else {
                                AvatarDrawable avatarDrawable = new AvatarDrawable();
                                ImageReceiver imageReceiver4 = new ImageReceiver();
                                long peerId = MessageObject.getPeerId(arrayList.get(i17).peer_id);
                                if (peerId < 0) {
                                    TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerId));
                                    if (chat != null) {
                                        avatarDrawable.setInfo(i, chat);
                                        imageReceiver4.setForUserOrChat(chat, avatarDrawable);
                                    }
                                    random2 = random;
                                    arrayList2 = arrayList;
                                } else {
                                    TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerId));
                                    if (user == null) {
                                        random2 = random;
                                        arrayList2 = arrayList;
                                    } else {
                                        avatarDrawable.setInfo(i, user);
                                        imageReceiver4.setForUserOrChat(user, avatarDrawable);
                                    }
                                }
                                AvatarParticle avatarParticle = new AvatarParticle(this, null);
                                avatarParticle.imageReceiver = imageReceiver4;
                                avatarParticle.fromX = 0.5f;
                                avatarParticle.fromY = 0.5f;
                                float f11 = 100.0f;
                                avatarParticle.jumpY = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                                avatarParticle.randomScale = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.4f) + f3;
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) (((Math.abs(random.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    random2 = random;
                                    arrayList2 = arrayList;
                                } else {
                                    float f12 = 0.0f;
                                    int i19 = 0;
                                    float f13 = 0.0f;
                                    float f14 = 0.0f;
                                    while (i19 < 10) {
                                        float fAbs = ((Math.abs(random.nextInt() % 100) * 0.6f) / f11) + 0.2f;
                                        float fAbs2 = ((Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f) + 0.2f;
                                        float f15 = 2.1474836E9f;
                                        Random random3 = random;
                                        ArrayList<TLRPC.MessagePeerReaction> arrayList3 = arrayList;
                                        int i20 = 0;
                                        while (i20 < this.avatars.size()) {
                                            float f16 = ((AvatarParticle) this.avatars.get(i20)).toX - fAbs;
                                            float f17 = fAbs;
                                            float f18 = ((AvatarParticle) this.avatars.get(i20)).toY - fAbs2;
                                            float f19 = (f16 * f16) + (f18 * f18);
                                            if (f19 < f15) {
                                                f15 = f19;
                                            }
                                            i20++;
                                            fAbs = f17;
                                        }
                                        float f20 = fAbs;
                                        if (f15 > f14) {
                                            f12 = fAbs2;
                                            f14 = f15;
                                            f13 = f20;
                                        }
                                        i19++;
                                        random = random3;
                                        arrayList = arrayList3;
                                        f11 = 100.0f;
                                    }
                                    random2 = random;
                                    arrayList2 = arrayList;
                                    avatarParticle.toX = f13;
                                    avatarParticle.toY = f12;
                                }
                                this.avatars.add(avatarParticle);
                            }
                            i17++;
                            random = random2;
                            arrayList = arrayList2;
                            f3 = 0.8f;
                        }
                    }
                } else {
                    messageObject3 = messageObject;
                }
                reactionHolderView = this.holderView;
                if (reactionHolderView == null || !(f == 0.0f || f2 == 0.0f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (r10 != 0) {
                    r10.getLocationOnScreen(this.loc);
                    int[] iArr = this.loc;
                    width = iArr[0];
                    width2 = iArr[1];
                    imageHeight = view2.getWidth() * view2.getScaleX();
                    if (r10 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        f10 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
                        if (f10 > 0.0f) {
                            imageHeight = view2.getWidth() * ((f10 * 2.0f) + 1.0f);
                            width -= (imageHeight - view2.getWidth()) / 2.0f;
                            width2 -= imageHeight - view2.getWidth();
                        }
                    }
                    f6 = width2;
                    f7 = width;
                } else if (reactionHolderView != null) {
                    reactionHolderView.getLocationOnScreen(this.loc);
                    float x = this.loc[0] + this.holderView.loopImageView.getX();
                    float y = this.loc[1] + this.holderView.loopImageView.getY();
                    imageHeight = this.holderView.loopImageView.getWidth() * this.holderView.getScaleX();
                    f7 = x;
                    f6 = y;
                } else {
                    reactionButton3 = reactionButton;
                    if (reactionButton3 != null) {
                        view.getLocationInWindow(this.loc);
                        float f21 = this.loc[0];
                        imageReceiver = reactionButton3.imageReceiver;
                        if (imageReceiver == null) {
                            imageX = 0.0f;
                        } else {
                            imageX = imageReceiver.getImageX();
                        }
                        f4 = f21 + imageX;
                        float f22 = this.loc[1];
                        imageReceiver2 = reactionButton3.imageReceiver;
                        if (imageReceiver2 == null) {
                            imageY = 0.0f;
                        } else {
                            imageY = imageReceiver2.getImageY();
                        }
                        f5 = f22 + imageY;
                        imageReceiver3 = reactionButton3.imageReceiver;
                        if (imageReceiver3 == null) {
                            f7 = f4;
                            f6 = f5;
                            i4 = 2;
                            imageHeight = imageReceiver3.getImageHeight();
                        }
                        if (i2 == i4) {
                            if (z || !SharedConfig.deviceIsHigh()) {
                                f9 = 34.0f;
                            } else {
                                f9 = 60.0f;
                            }
                            int iDp = AndroidUtilities.dp(f9);
                            i5 = iDp;
                            i6 = (int) ((iDp * 2.0f) / AndroidUtilities.density);
                        } else {
                            if (i2 == 1) {
                                if (z) {
                                    if (SharedConfig.deviceIsHigh()) {
                                        f8 = 240.0f;
                                    } else {
                                        f8 = 140.0f;
                                    }
                                    int iDp2 = AndroidUtilities.dp(f8);
                                    if (SharedConfig.deviceIsHigh()) {
                                        iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                                    } else {
                                        iSizeForBigReaction = sizeForAroundReaction();
                                    }
                                    i5 = iDp2;
                                } else {
                                    iRound = AndroidUtilities.dp(80.0f);
                                    iSizeForBigReaction = sizeForAroundReaction();
                                }
                                i6 = iSizeForBigReaction;
                            } else {
                                int iDp3 = AndroidUtilities.dp(350.0f);
                                Point point = AndroidUtilities.displaySize;
                                iRound = Math.round(Math.min(iDp3, Math.min(point.x, point.y)) * 0.8f);
                                iSizeForBigReaction = sizeForBigReaction();
                            }
                            i5 = iRound;
                            i6 = iSizeForBigReaction;
                        }
                        i7 = i5 >> 1;
                        i8 = i6 >> 1;
                        this.animateInProgress = 0.0f;
                        this.animateOutProgress = 0.0f;
                        frameLayout = new FrameLayout(context);
                        this.container = frameLayout;
                        int i21 = i6;
                        int i22 = i5;
                        messageObject4 = messageObject3;
                        this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
                        animationView = new AnimationView(context);
                        this.effectImageView = animationView;
                        animationView2 = new AnimationView(context);
                        this.emojiImageView = animationView2;
                        animationView3 = new AnimationView(context);
                        this.emojiStaticImageView = animationView3;
                        if (visibleReaction.emojicon != null) {
                            tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
                        } else {
                            tL_availableReaction = null;
                        }
                        if (tL_availableReaction == null || visibleReaction.documentId != r2) {
                            if (tL_availableReaction != null) {
                                i9 = i2;
                                if (i9 == 0) {
                                    i10 = i;
                                    i12 = 1;
                                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                                    i11 = 2;
                                } else {
                                    i10 = i;
                                    i11 = 2;
                                    i12 = 1;
                                    if (i9 == 2) {
                                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                                    }
                                }
                                if (i9 != 0 || i9 == i12) {
                                    AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                                    if (messageObject4 != null) {
                                        if (messageObject4.shouldDrawWithoutBackground()) {
                                            if (messageObject4.isOutOwner()) {
                                                i13 = Theme.key_chat_outReactionButtonBackground;
                                            } else {
                                                i13 = Theme.key_chat_inReactionButtonBackground;
                                            }
                                        } else if (messageObject4.isOutOwner()) {
                                            i13 = Theme.key_chat_outReactionButtonTextSelected;
                                        } else {
                                            i13 = Theme.key_chat_inReactionButtonTextSelected;
                                        }
                                        if (baseFragment != null) {
                                            resourceProvider = baseFragment.getResourceProvider();
                                        } else {
                                            resourceProvider = null;
                                        }
                                        color = Theme.getColor(i13, resourceProvider);
                                    } else {
                                        color = -1;
                                    }
                                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                                    if (i9 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable, z3, !z3));
                                    r3 = 0;
                                    this.windowView.setClipChildren(false);
                                }
                                animationView2.getImageReceiver().setAutoRepeat(r3);
                                animationView2.getImageReceiver().setAllowStartAnimation(r3);
                                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                                    if (i9 == 2) {
                                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                                    } else {
                                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                                        animationView2.getImageReceiver().getLottieAnimation().start();
                                    }
                                }
                                i14 = i22 - i7;
                                i15 = i14 >> 1;
                                i14 = i9 == 1 ? i15 : i14;
                                frameLayout.addView(animationView2);
                                animationView2.getLayoutParams().width = i7;
                                animationView2.getLayoutParams().height = i7;
                                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                                if (i9 != 1 && !z) {
                                    if (tL_availableReaction != null) {
                                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                                    }
                                    frameLayout.addView(animationView3);
                                    animationView3.getLayoutParams().width = i7;
                                    animationView3.getLayoutParams().height = i7;
                                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                                }
                                this.windowView.addView(frameLayout);
                                frameLayout.getLayoutParams().width = i22;
                                frameLayout.getLayoutParams().height = i22;
                                int i23 = -i15;
                                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i23;
                                int i24 = -i14;
                                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i24;
                                this.windowView.addView(animationView);
                                animationView.getLayoutParams().width = i22;
                                animationView.getLayoutParams().height = i22;
                                animationView.getLayoutParams().width = i22;
                                animationView.getLayoutParams().height = i22;
                                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i23;
                                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i24;
                                frameLayout.setPivotX(i14);
                                frameLayout.setPivotY(i15);
                            }
                            i9 = i2;
                            i16 = 2;
                            if (i9 == 2) {
                                if ((i9 != 1 && LiteMode.isEnabled(4112)) || i9 == 0) {
                                    TLRPC.Document document2 = i9 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                    String filterForAroundAnimation = i9 == 1 ? getFilterForAroundAnimation() : i21 + "_" + i21;
                                    ImageReceiver imageReceiver5 = animationView.getImageReceiver();
                                    StringBuilder sb = new StringBuilder();
                                    int i25 = uniqPrefix;
                                    uniqPrefix = i25 + 1;
                                    sb.append(i25);
                                    sb.append("_");
                                    sb.append(this.messageId);
                                    sb.append("_");
                                    imageReceiver5.setUniqKeyPrefix(sb.toString());
                                    animationView.setImage(ImageLocation.getForDocument(document2), filterForAroundAnimation, (ImageLocation) null, (String) null, 0, (Object) null);
                                    r14 = 0;
                                    animationView.getImageReceiver().setAutoRepeat(0);
                                    animationView.getImageReceiver().setAllowStartAnimation(false);
                                }
                                if (animationView.getImageReceiver().getLottieAnimation() != null) {
                                    animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                                    animationView.getImageReceiver().getLottieAnimation().start();
                                }
                                i16 = 2;
                            }
                            if (i9 == i16) {
                                if (z) {
                                    document = tL_availableReaction.select_animation;
                                } else {
                                    document = tL_availableReaction.appear_animation;
                                }
                                ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
                                StringBuilder sb2 = new StringBuilder();
                                int i26 = uniqPrefix;
                                uniqPrefix = i26 + 1;
                                sb2.append(i26);
                                sb2.append("_");
                                sb2.append(this.messageId);
                                sb2.append("_");
                                imageReceiver6.setUniqKeyPrefix(sb2.toString());
                                animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                            } else if (i9 == 0) {
                                TLRPC.Document document3 = tL_availableReaction.activate_animation;
                                ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
                                StringBuilder sb3 = new StringBuilder();
                                int i27 = uniqPrefix;
                                uniqPrefix = i27 + 1;
                                sb3.append(i27);
                                sb3.append("_");
                                sb3.append(this.messageId);
                                sb3.append("_");
                                imageReceiver7.setUniqKeyPrefix(sb3.toString());
                                animationView2.setImage(ImageLocation.getForDocument(document3), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                            }
                            r3 = 0;
                            animationView2.getImageReceiver().setAutoRepeat(r3);
                            animationView2.getImageReceiver().setAllowStartAnimation(r3);
                            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                                if (i9 == 2) {
                                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                                } else {
                                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                                    animationView2.getImageReceiver().getLottieAnimation().start();
                                }
                            }
                            i14 = i22 - i7;
                            i15 = i14 >> 1;
                            if (i9 == 1) {
                            }
                            frameLayout.addView(animationView2);
                            animationView2.getLayoutParams().width = i7;
                            animationView2.getLayoutParams().height = i7;
                            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                            if (i9 != 1) {
                                if (tL_availableReaction != null) {
                                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                                }
                                frameLayout.addView(animationView3);
                                animationView3.getLayoutParams().width = i7;
                                animationView3.getLayoutParams().height = i7;
                                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                            }
                            this.windowView.addView(frameLayout);
                            frameLayout.getLayoutParams().width = i22;
                            frameLayout.getLayoutParams().height = i22;
                            int i28 = -i15;
                            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i28;
                            int i29 = -i14;
                            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i29;
                            this.windowView.addView(animationView);
                            animationView.getLayoutParams().width = i22;
                            animationView.getLayoutParams().height = i22;
                            animationView.getLayoutParams().width = i22;
                            animationView.getLayoutParams().height = i22;
                            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i28;
                            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i29;
                            frameLayout.setPivotX(i14);
                            frameLayout.setPivotY(i15);
                        }
                        this.dismissed = true;
                        return;
                    }
                    if (view != null) {
                        ((View) view.getParent()).getLocationInWindow(this.loc);
                        int[] iArr2 = this.loc;
                        float f23 = iArr2[0] + f;
                        float f24 = iArr2[1] + f2;
                        if (view instanceof ChatMessageCell) {
                            i3 = ((ChatMessageCell) view).starsPriceTopPadding;
                        } else {
                            i3 = 0;
                        }
                        f6 = f24 + i3;
                        f7 = f23;
                    } else {
                        f4 = f;
                        f5 = f2;
                    }
                    imageHeight = 0.0f;
                    f7 = f4;
                    f6 = f5;
                    imageHeight = 0.0f;
                }
                i4 = 2;
                if (i2 == i4) {
                    if (z) {
                        f9 = 34.0f;
                    } else {
                        f9 = 34.0f;
                    }
                    int iDp4 = AndroidUtilities.dp(f9);
                    i5 = iDp4;
                    i6 = (int) ((iDp4 * 2.0f) / AndroidUtilities.density);
                } else {
                    if (i2 == 1) {
                        if (z) {
                            if (SharedConfig.deviceIsHigh()) {
                                f8 = 240.0f;
                            } else {
                                f8 = 140.0f;
                            }
                            int iDp5 = AndroidUtilities.dp(f8);
                            if (SharedConfig.deviceIsHigh()) {
                                iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                            } else {
                                iSizeForBigReaction = sizeForAroundReaction();
                            }
                            i5 = iDp5;
                        } else {
                            iRound = AndroidUtilities.dp(80.0f);
                            iSizeForBigReaction = sizeForAroundReaction();
                        }
                        i6 = iSizeForBigReaction;
                    } else {
                        int iDp6 = AndroidUtilities.dp(350.0f);
                        Point point2 = AndroidUtilities.displaySize;
                        iRound = Math.round(Math.min(iDp6, Math.min(point2.x, point2.y)) * 0.8f);
                        iSizeForBigReaction = sizeForBigReaction();
                    }
                    i5 = iRound;
                    i6 = iSizeForBigReaction;
                }
                i7 = i5 >> 1;
                i8 = i6 >> 1;
                this.animateInProgress = 0.0f;
                this.animateOutProgress = 0.0f;
                frameLayout = new FrameLayout(context);
                this.container = frameLayout;
                int i210 = i6;
                int i211 = i5;
                messageObject4 = messageObject3;
                this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
                animationView = new AnimationView(context);
                this.effectImageView = animationView;
                animationView2 = new AnimationView(context);
                this.emojiImageView = animationView2;
                animationView3 = new AnimationView(context);
                this.emojiStaticImageView = animationView3;
                if (visibleReaction.emojicon != null) {
                    tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
                } else {
                    tL_availableReaction = null;
                }
                if (tL_availableReaction == null) {
                }
                if (tL_availableReaction != null) {
                    i9 = i2;
                    if (i9 == 0) {
                        i10 = i;
                        i12 = 1;
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                        i11 = 2;
                    } else {
                        i10 = i;
                        i11 = 2;
                        i12 = 1;
                        if (i9 == 2) {
                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                        }
                    }
                    if (i9 != 0) {
                    }
                    AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                    if (messageObject4 != null) {
                        if (messageObject4.shouldDrawWithoutBackground()) {
                            if (messageObject4.isOutOwner()) {
                                i13 = Theme.key_chat_outReactionButtonBackground;
                            } else {
                                i13 = Theme.key_chat_inReactionButtonBackground;
                            }
                        } else if (messageObject4.isOutOwner()) {
                            i13 = Theme.key_chat_outReactionButtonTextSelected;
                        } else {
                            i13 = Theme.key_chat_inReactionButtonTextSelected;
                        }
                        if (baseFragment != null) {
                            resourceProvider = baseFragment.getResourceProvider();
                        } else {
                            resourceProvider = null;
                        }
                        color = Theme.getColor(i13, resourceProvider);
                    } else {
                        color = -1;
                    }
                    animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    if (i9 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable2, z3, !z3));
                    r3 = 0;
                    this.windowView.setClipChildren(false);
                    animationView2.getImageReceiver().setAutoRepeat(r3);
                    animationView2.getImageReceiver().setAllowStartAnimation(r3);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i9 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i14 = i211 - i7;
                    i15 = i14 >> 1;
                    if (i9 == 1) {
                    }
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i7;
                    animationView2.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                    if (i9 != 1) {
                        if (tL_availableReaction != null) {
                            animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView3);
                        animationView3.getLayoutParams().width = i7;
                        animationView3.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i211;
                    frameLayout.getLayoutParams().height = i211;
                    int i212 = -i15;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i212;
                    int i213 = -i14;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i213;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i211;
                    animationView.getLayoutParams().height = i211;
                    animationView.getLayoutParams().width = i211;
                    animationView.getLayoutParams().height = i211;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i212;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i213;
                    frameLayout.setPivotX(i14);
                    frameLayout.setPivotY(i15);
                }
                i9 = i2;
                i16 = 2;
                if (i9 == 2) {
                    r14 = i9 != 1 ? 0 : 0;
                    if (animationView.getImageReceiver().getLottieAnimation() != null) {
                        animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                        animationView.getImageReceiver().getLottieAnimation().start();
                    }
                    i16 = 2;
                }
                if (i9 == i16) {
                    if (z) {
                        document = tL_availableReaction.select_animation;
                    } else {
                        document = tL_availableReaction.appear_animation;
                    }
                    ImageReceiver imageReceiver8 = animationView2.getImageReceiver();
                    StringBuilder sb4 = new StringBuilder();
                    int i214 = uniqPrefix;
                    uniqPrefix = i214 + 1;
                    sb4.append(i214);
                    sb4.append("_");
                    sb4.append(this.messageId);
                    sb4.append("_");
                    imageReceiver8.setUniqKeyPrefix(sb4.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                } else if (i9 == 0) {
                    TLRPC.Document document4 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver9 = animationView2.getImageReceiver();
                    StringBuilder sb5 = new StringBuilder();
                    int i215 = uniqPrefix;
                    uniqPrefix = i215 + 1;
                    sb5.append(i215);
                    sb5.append("_");
                    sb5.append(this.messageId);
                    sb5.append("_");
                    imageReceiver9.setUniqKeyPrefix(sb5.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document4), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                }
                r3 = 0;
                animationView2.getImageReceiver().setAutoRepeat(r3);
                animationView2.getImageReceiver().setAllowStartAnimation(r3);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i9 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i14 = i211 - i7;
                i15 = i14 >> 1;
                if (i9 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i7;
                animationView2.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                if (i9 != 1) {
                    if (tL_availableReaction != null) {
                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView3);
                    animationView3.getLayoutParams().width = i7;
                    animationView3.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i211;
                frameLayout.getLayoutParams().height = i211;
                int i216 = -i15;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i216;
                int i217 = -i14;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i217;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i211;
                animationView.getLayoutParams().height = i211;
                animationView.getLayoutParams().width = i211;
                animationView.getLayoutParams().height = i211;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i216;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i217;
                frameLayout.setPivotX(i14);
                frameLayout.setPivotY(i15);
            }
            reactionButton = reactionButton2;
            if (!z) {
            }
            if (baseFragment instanceof ChatActivity) {
                chatActivity = (ChatActivity) baseFragment;
            } else {
                chatActivity = null;
            }
            if (reactionsContainerLayout != null) {
                while (i18 < reactionsContainerLayout.recyclerListView.getChildCount()) {
                    if (!(reactionsContainerLayout.recyclerListView.getChildAt(i18) instanceof ReactionsContainerLayout.ReactionHolderView)) {
                    }
                }
            }
            f3 = 0.8f;
            if (i2 == 1) {
                random = new Random();
                messageObject3 = messageObject;
                if (messageObject3 != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    i17 = 0;
                    while (i17 < arrayList.size()) {
                        if (this.reaction.equals(arrayList.get(i17).reaction)) {
                            random2 = random;
                            arrayList2 = arrayList;
                        } else {
                            random2 = random;
                            arrayList2 = arrayList;
                        }
                        i17++;
                        random = random2;
                        arrayList = arrayList2;
                        f3 = 0.8f;
                    }
                }
            } else {
                messageObject3 = messageObject;
            }
            reactionHolderView = this.holderView;
            if (reactionHolderView == null) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (r10 != 0) {
                r10.getLocationOnScreen(this.loc);
                int[] iArr3 = this.loc;
                width = iArr3[0];
                width2 = iArr3[1];
                imageHeight = view2.getWidth() * view2.getScaleX();
                if (r10 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                    f10 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
                    if (f10 > 0.0f) {
                        imageHeight = view2.getWidth() * ((f10 * 2.0f) + 1.0f);
                        width -= (imageHeight - view2.getWidth()) / 2.0f;
                        width2 -= imageHeight - view2.getWidth();
                    }
                }
                f6 = width2;
                f7 = width;
            } else if (reactionHolderView != null) {
                reactionHolderView.getLocationOnScreen(this.loc);
                float x2 = this.loc[0] + this.holderView.loopImageView.getX();
                float y2 = this.loc[1] + this.holderView.loopImageView.getY();
                imageHeight = this.holderView.loopImageView.getWidth() * this.holderView.getScaleX();
                f7 = x2;
                f6 = y2;
            } else {
                reactionButton3 = reactionButton;
                if (reactionButton3 != null) {
                    view.getLocationInWindow(this.loc);
                    float f25 = this.loc[0];
                    imageReceiver = reactionButton3.imageReceiver;
                    if (imageReceiver == null) {
                        imageX = 0.0f;
                    } else {
                        imageX = imageReceiver.getImageX();
                    }
                    f4 = f25 + imageX;
                    float f26 = this.loc[1];
                    imageReceiver2 = reactionButton3.imageReceiver;
                    if (imageReceiver2 == null) {
                        imageY = 0.0f;
                    } else {
                        imageY = imageReceiver2.getImageY();
                    }
                    f5 = f26 + imageY;
                    imageReceiver3 = reactionButton3.imageReceiver;
                    if (imageReceiver3 == null) {
                        f7 = f4;
                        f6 = f5;
                        i4 = 2;
                        imageHeight = imageReceiver3.getImageHeight();
                    }
                    if (i2 == i4) {
                        if (z) {
                            f9 = 34.0f;
                        } else {
                            f9 = 34.0f;
                        }
                        int iDp7 = AndroidUtilities.dp(f9);
                        i5 = iDp7;
                        i6 = (int) ((iDp7 * 2.0f) / AndroidUtilities.density);
                    } else {
                        if (i2 == 1) {
                            if (z) {
                                if (SharedConfig.deviceIsHigh()) {
                                    f8 = 240.0f;
                                } else {
                                    f8 = 140.0f;
                                }
                                int iDp8 = AndroidUtilities.dp(f8);
                                if (SharedConfig.deviceIsHigh()) {
                                    iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                                } else {
                                    iSizeForBigReaction = sizeForAroundReaction();
                                }
                                i5 = iDp8;
                            } else {
                                iRound = AndroidUtilities.dp(80.0f);
                                iSizeForBigReaction = sizeForAroundReaction();
                            }
                            i6 = iSizeForBigReaction;
                        } else {
                            int iDp9 = AndroidUtilities.dp(350.0f);
                            Point point3 = AndroidUtilities.displaySize;
                            iRound = Math.round(Math.min(iDp9, Math.min(point3.x, point3.y)) * 0.8f);
                            iSizeForBigReaction = sizeForBigReaction();
                        }
                        i5 = iRound;
                        i6 = iSizeForBigReaction;
                    }
                    i7 = i5 >> 1;
                    i8 = i6 >> 1;
                    this.animateInProgress = 0.0f;
                    this.animateOutProgress = 0.0f;
                    frameLayout = new FrameLayout(context);
                    this.container = frameLayout;
                    int i218 = i6;
                    int i219 = i5;
                    messageObject4 = messageObject3;
                    this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
                    animationView = new AnimationView(context);
                    this.effectImageView = animationView;
                    animationView2 = new AnimationView(context);
                    this.emojiImageView = animationView2;
                    animationView3 = new AnimationView(context);
                    this.emojiStaticImageView = animationView3;
                    if (visibleReaction.emojicon != null) {
                        tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
                    } else {
                        tL_availableReaction = null;
                    }
                    if (tL_availableReaction == null) {
                    }
                    if (tL_availableReaction != null) {
                        i9 = i2;
                        if (i9 == 0) {
                            i10 = i;
                            i12 = 1;
                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                            i11 = 2;
                        } else {
                            i10 = i;
                            i11 = 2;
                            i12 = 1;
                            if (i9 == 2) {
                                animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                            }
                        }
                        if (i9 != 0) {
                        }
                        AnimatedEmojiDrawable animatedEmojiDrawable3 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                        if (messageObject4 != null) {
                            if (messageObject4.shouldDrawWithoutBackground()) {
                                if (messageObject4.isOutOwner()) {
                                    i13 = Theme.key_chat_outReactionButtonBackground;
                                } else {
                                    i13 = Theme.key_chat_inReactionButtonBackground;
                                }
                            } else if (messageObject4.isOutOwner()) {
                                i13 = Theme.key_chat_outReactionButtonTextSelected;
                            } else {
                                i13 = Theme.key_chat_inReactionButtonTextSelected;
                            }
                            if (baseFragment != null) {
                                resourceProvider = baseFragment.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            color = Theme.getColor(i13, resourceProvider);
                        } else {
                            color = -1;
                        }
                        animatedEmojiDrawable3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        if (i9 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable3, z3, !z3));
                        r3 = 0;
                        this.windowView.setClipChildren(false);
                        animationView2.getImageReceiver().setAutoRepeat(r3);
                        animationView2.getImageReceiver().setAllowStartAnimation(r3);
                        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                            if (i9 == 2) {
                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                            } else {
                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                                animationView2.getImageReceiver().getLottieAnimation().start();
                            }
                        }
                        i14 = i219 - i7;
                        i15 = i14 >> 1;
                        if (i9 == 1) {
                        }
                        frameLayout.addView(animationView2);
                        animationView2.getLayoutParams().width = i7;
                        animationView2.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                        if (i9 != 1) {
                            if (tL_availableReaction != null) {
                                animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                            }
                            frameLayout.addView(animationView3);
                            animationView3.getLayoutParams().width = i7;
                            animationView3.getLayoutParams().height = i7;
                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                        }
                        this.windowView.addView(frameLayout);
                        frameLayout.getLayoutParams().width = i219;
                        frameLayout.getLayoutParams().height = i219;
                        int i2110 = -i15;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2110;
                        int i2111 = -i14;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2111;
                        this.windowView.addView(animationView);
                        animationView.getLayoutParams().width = i219;
                        animationView.getLayoutParams().height = i219;
                        animationView.getLayoutParams().width = i219;
                        animationView.getLayoutParams().height = i219;
                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2110;
                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2111;
                        frameLayout.setPivotX(i14);
                        frameLayout.setPivotY(i15);
                    }
                    i9 = i2;
                    i16 = 2;
                    if (i9 == 2) {
                        if (i9 != 1) {
                        }
                        if (animationView.getImageReceiver().getLottieAnimation() != null) {
                            animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                            animationView.getImageReceiver().getLottieAnimation().start();
                        }
                        i16 = 2;
                    }
                    if (i9 == i16) {
                        if (z) {
                            document = tL_availableReaction.select_animation;
                        } else {
                            document = tL_availableReaction.appear_animation;
                        }
                        ImageReceiver imageReceiver10 = animationView2.getImageReceiver();
                        StringBuilder sb6 = new StringBuilder();
                        int i2112 = uniqPrefix;
                        uniqPrefix = i2112 + 1;
                        sb6.append(i2112);
                        sb6.append("_");
                        sb6.append(this.messageId);
                        sb6.append("_");
                        imageReceiver10.setUniqKeyPrefix(sb6.toString());
                        animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                    } else if (i9 == 0) {
                        TLRPC.Document document5 = tL_availableReaction.activate_animation;
                        ImageReceiver imageReceiver11 = animationView2.getImageReceiver();
                        StringBuilder sb7 = new StringBuilder();
                        int i2113 = uniqPrefix;
                        uniqPrefix = i2113 + 1;
                        sb7.append(i2113);
                        sb7.append("_");
                        sb7.append(this.messageId);
                        sb7.append("_");
                        imageReceiver11.setUniqKeyPrefix(sb7.toString());
                        animationView2.setImage(ImageLocation.getForDocument(document5), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                    }
                    r3 = 0;
                    animationView2.getImageReceiver().setAutoRepeat(r3);
                    animationView2.getImageReceiver().setAllowStartAnimation(r3);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i9 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i14 = i219 - i7;
                    i15 = i14 >> 1;
                    if (i9 == 1) {
                    }
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i7;
                    animationView2.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                    if (i9 != 1) {
                        if (tL_availableReaction != null) {
                            animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView3);
                        animationView3.getLayoutParams().width = i7;
                        animationView3.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i219;
                    frameLayout.getLayoutParams().height = i219;
                    int i2114 = -i15;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2114;
                    int i2115 = -i14;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2115;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i219;
                    animationView.getLayoutParams().height = i219;
                    animationView.getLayoutParams().width = i219;
                    animationView.getLayoutParams().height = i219;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2114;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2115;
                    frameLayout.setPivotX(i14);
                    frameLayout.setPivotY(i15);
                }
                if (view != null) {
                    ((View) view.getParent()).getLocationInWindow(this.loc);
                    int[] iArr4 = this.loc;
                    float f27 = iArr4[0] + f;
                    float f28 = iArr4[1] + f2;
                    if (view instanceof ChatMessageCell) {
                        i3 = ((ChatMessageCell) view).starsPriceTopPadding;
                    } else {
                        i3 = 0;
                    }
                    f6 = f28 + i3;
                    f7 = f27;
                } else {
                    f4 = f;
                    f5 = f2;
                }
                imageHeight = 0.0f;
                f7 = f4;
                f6 = f5;
                imageHeight = 0.0f;
            }
            i4 = 2;
            if (i2 == i4) {
                if (z) {
                    f9 = 34.0f;
                } else {
                    f9 = 34.0f;
                }
                int iDp10 = AndroidUtilities.dp(f9);
                i5 = iDp10;
                i6 = (int) ((iDp10 * 2.0f) / AndroidUtilities.density);
            } else {
                if (i2 == 1) {
                    if (z) {
                        if (SharedConfig.deviceIsHigh()) {
                            f8 = 240.0f;
                        } else {
                            f8 = 140.0f;
                        }
                        int iDp11 = AndroidUtilities.dp(f8);
                        if (SharedConfig.deviceIsHigh()) {
                            iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                        } else {
                            iSizeForBigReaction = sizeForAroundReaction();
                        }
                        i5 = iDp11;
                    } else {
                        iRound = AndroidUtilities.dp(80.0f);
                        iSizeForBigReaction = sizeForAroundReaction();
                    }
                    i6 = iSizeForBigReaction;
                } else {
                    int iDp12 = AndroidUtilities.dp(350.0f);
                    Point point4 = AndroidUtilities.displaySize;
                    iRound = Math.round(Math.min(iDp12, Math.min(point4.x, point4.y)) * 0.8f);
                    iSizeForBigReaction = sizeForBigReaction();
                }
                i5 = iRound;
                i6 = iSizeForBigReaction;
            }
            i7 = i5 >> 1;
            i8 = i6 >> 1;
            this.animateInProgress = 0.0f;
            this.animateOutProgress = 0.0f;
            frameLayout = new FrameLayout(context);
            this.container = frameLayout;
            int i2116 = i6;
            int i2117 = i5;
            messageObject4 = messageObject3;
            this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
            animationView = new AnimationView(context);
            this.effectImageView = animationView;
            animationView2 = new AnimationView(context);
            this.emojiImageView = animationView2;
            animationView3 = new AnimationView(context);
            this.emojiStaticImageView = animationView3;
            if (visibleReaction.emojicon != null) {
                tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
            } else {
                tL_availableReaction = null;
            }
            if (tL_availableReaction == null) {
            }
            if (tL_availableReaction != null) {
                i9 = i2;
                if (i9 == 0) {
                    i10 = i;
                    i12 = 1;
                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                    i11 = 2;
                } else {
                    i10 = i;
                    i11 = 2;
                    i12 = 1;
                    if (i9 == 2) {
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                    }
                }
                if (i9 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable4 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                if (messageObject4 != null) {
                    if (messageObject4.shouldDrawWithoutBackground()) {
                        if (messageObject4.isOutOwner()) {
                            i13 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i13 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject4.isOutOwner()) {
                        i13 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i13 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    color = Theme.getColor(i13, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable4.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i9 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable4, z3, !z3));
                r3 = 0;
                this.windowView.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r3);
                animationView2.getImageReceiver().setAllowStartAnimation(r3);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i9 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i14 = i2117 - i7;
                i15 = i14 >> 1;
                if (i9 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i7;
                animationView2.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                if (i9 != 1) {
                    if (tL_availableReaction != null) {
                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView3);
                    animationView3.getLayoutParams().width = i7;
                    animationView3.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i2117;
                frameLayout.getLayoutParams().height = i2117;
                int i2118 = -i15;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2118;
                int i2119 = -i14;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2119;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i2117;
                animationView.getLayoutParams().height = i2117;
                animationView.getLayoutParams().width = i2117;
                animationView.getLayoutParams().height = i2117;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2118;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2119;
                frameLayout.setPivotX(i14);
                frameLayout.setPivotY(i15);
            }
            i9 = i2;
            i16 = 2;
            if (i9 == 2) {
                if (i9 != 1) {
                }
                if (animationView.getImageReceiver().getLottieAnimation() != null) {
                    animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                    animationView.getImageReceiver().getLottieAnimation().start();
                }
                i16 = 2;
            }
            if (i9 == i16) {
                if (z) {
                    document = tL_availableReaction.select_animation;
                } else {
                    document = tL_availableReaction.appear_animation;
                }
                ImageReceiver imageReceiver12 = animationView2.getImageReceiver();
                StringBuilder sb8 = new StringBuilder();
                int i21110 = uniqPrefix;
                uniqPrefix = i21110 + 1;
                sb8.append(i21110);
                sb8.append("_");
                sb8.append(this.messageId);
                sb8.append("_");
                imageReceiver12.setUniqKeyPrefix(sb8.toString());
                animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
            } else if (i9 == 0) {
                TLRPC.Document document6 = tL_availableReaction.activate_animation;
                ImageReceiver imageReceiver13 = animationView2.getImageReceiver();
                StringBuilder sb9 = new StringBuilder();
                int i21111 = uniqPrefix;
                uniqPrefix = i21111 + 1;
                sb9.append(i21111);
                sb9.append("_");
                sb9.append(this.messageId);
                sb9.append("_");
                imageReceiver13.setUniqKeyPrefix(sb9.toString());
                animationView2.setImage(ImageLocation.getForDocument(document6), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
            }
            r3 = 0;
            animationView2.getImageReceiver().setAutoRepeat(r3);
            animationView2.getImageReceiver().setAllowStartAnimation(r3);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i9 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i14 = i2117 - i7;
            i15 = i14 >> 1;
            if (i9 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i7;
            animationView2.getLayoutParams().height = i7;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
            if (i9 != 1) {
                if (tL_availableReaction != null) {
                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView3);
                animationView3.getLayoutParams().width = i7;
                animationView3.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
            }
            this.windowView.addView(frameLayout);
            frameLayout.getLayoutParams().width = i2117;
            frameLayout.getLayoutParams().height = i2117;
            int i21112 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i21112;
            int i21113 = -i14;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21113;
            this.windowView.addView(animationView);
            animationView.getLayoutParams().width = i2117;
            animationView.getLayoutParams().height = i2117;
            animationView.getLayoutParams().width = i2117;
            animationView.getLayoutParams().height = i2117;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i21112;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21113;
            frameLayout.setPivotX(i14);
            frameLayout.setPivotY(i15);
        }
        messageObject = messageObject2;
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.currentAccount = i;
        this.cell = view;
        if (z4) {
            reactionButton2 = ((ChatMessageCell) view).getReactionButton(visibleReaction);
        } else {
            if (view instanceof ChatActionCell) {
                reactionButton2 = ((ChatActionCell) view).getReactionButton(visibleReaction);
            } else {
                reactionButton = null;
            }
            if (!z) {
            }
            if (baseFragment instanceof ChatActivity) {
                chatActivity = (ChatActivity) baseFragment;
            } else {
                chatActivity = null;
            }
            if (reactionsContainerLayout != null) {
                while (i18 < reactionsContainerLayout.recyclerListView.getChildCount()) {
                    if (!(reactionsContainerLayout.recyclerListView.getChildAt(i18) instanceof ReactionsContainerLayout.ReactionHolderView)) {
                    }
                }
            }
            f3 = 0.8f;
            if (i2 == 1) {
                random = new Random();
                messageObject3 = messageObject;
                if (messageObject3 != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    i17 = 0;
                    while (i17 < arrayList.size()) {
                        if (this.reaction.equals(arrayList.get(i17).reaction)) {
                            random2 = random;
                            arrayList2 = arrayList;
                        } else {
                            random2 = random;
                            arrayList2 = arrayList;
                        }
                        i17++;
                        random = random2;
                        arrayList = arrayList2;
                        f3 = 0.8f;
                    }
                }
            } else {
                messageObject3 = messageObject;
            }
            reactionHolderView = this.holderView;
            if (reactionHolderView == null) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (r10 != 0) {
                r10.getLocationOnScreen(this.loc);
                int[] iArr5 = this.loc;
                width = iArr5[0];
                width2 = iArr5[1];
                imageHeight = view2.getWidth() * view2.getScaleX();
                if (r10 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                    f10 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
                    if (f10 > 0.0f) {
                        imageHeight = view2.getWidth() * ((f10 * 2.0f) + 1.0f);
                        width -= (imageHeight - view2.getWidth()) / 2.0f;
                        width2 -= imageHeight - view2.getWidth();
                    }
                }
                f6 = width2;
                f7 = width;
            } else if (reactionHolderView != null) {
                reactionHolderView.getLocationOnScreen(this.loc);
                float x3 = this.loc[0] + this.holderView.loopImageView.getX();
                float y3 = this.loc[1] + this.holderView.loopImageView.getY();
                imageHeight = this.holderView.loopImageView.getWidth() * this.holderView.getScaleX();
                f7 = x3;
                f6 = y3;
            } else {
                reactionButton3 = reactionButton;
                if (reactionButton3 != null) {
                    view.getLocationInWindow(this.loc);
                    float f29 = this.loc[0];
                    imageReceiver = reactionButton3.imageReceiver;
                    if (imageReceiver == null) {
                        imageX = 0.0f;
                    } else {
                        imageX = imageReceiver.getImageX();
                    }
                    f4 = f29 + imageX;
                    float f210 = this.loc[1];
                    imageReceiver2 = reactionButton3.imageReceiver;
                    if (imageReceiver2 == null) {
                        imageY = 0.0f;
                    } else {
                        imageY = imageReceiver2.getImageY();
                    }
                    f5 = f210 + imageY;
                    imageReceiver3 = reactionButton3.imageReceiver;
                    if (imageReceiver3 == null) {
                        f7 = f4;
                        f6 = f5;
                        i4 = 2;
                        imageHeight = imageReceiver3.getImageHeight();
                    }
                    if (i2 == i4) {
                        if (z) {
                            f9 = 34.0f;
                        } else {
                            f9 = 34.0f;
                        }
                        int iDp13 = AndroidUtilities.dp(f9);
                        i5 = iDp13;
                        i6 = (int) ((iDp13 * 2.0f) / AndroidUtilities.density);
                    } else {
                        if (i2 == 1) {
                            if (z) {
                                if (SharedConfig.deviceIsHigh()) {
                                    f8 = 240.0f;
                                } else {
                                    f8 = 140.0f;
                                }
                                int iDp14 = AndroidUtilities.dp(f8);
                                if (SharedConfig.deviceIsHigh()) {
                                    iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                                } else {
                                    iSizeForBigReaction = sizeForAroundReaction();
                                }
                                i5 = iDp14;
                            } else {
                                iRound = AndroidUtilities.dp(80.0f);
                                iSizeForBigReaction = sizeForAroundReaction();
                            }
                            i6 = iSizeForBigReaction;
                        } else {
                            int iDp15 = AndroidUtilities.dp(350.0f);
                            Point point5 = AndroidUtilities.displaySize;
                            iRound = Math.round(Math.min(iDp15, Math.min(point5.x, point5.y)) * 0.8f);
                            iSizeForBigReaction = sizeForBigReaction();
                        }
                        i5 = iRound;
                        i6 = iSizeForBigReaction;
                    }
                    i7 = i5 >> 1;
                    i8 = i6 >> 1;
                    this.animateInProgress = 0.0f;
                    this.animateOutProgress = 0.0f;
                    frameLayout = new FrameLayout(context);
                    this.container = frameLayout;
                    int i21114 = i6;
                    int i21115 = i5;
                    messageObject4 = messageObject3;
                    this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
                    animationView = new AnimationView(context);
                    this.effectImageView = animationView;
                    animationView2 = new AnimationView(context);
                    this.emojiImageView = animationView2;
                    animationView3 = new AnimationView(context);
                    this.emojiStaticImageView = animationView3;
                    if (visibleReaction.emojicon != null) {
                        tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
                    } else {
                        tL_availableReaction = null;
                    }
                    if (tL_availableReaction == null) {
                    }
                    if (tL_availableReaction != null) {
                        i9 = i2;
                        if (i9 == 0) {
                            i10 = i;
                            i12 = 1;
                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                            i11 = 2;
                        } else {
                            i10 = i;
                            i11 = 2;
                            i12 = 1;
                            if (i9 == 2) {
                                animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                            }
                        }
                        if (i9 != 0) {
                        }
                        AnimatedEmojiDrawable animatedEmojiDrawable5 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                        if (messageObject4 != null) {
                            if (messageObject4.shouldDrawWithoutBackground()) {
                                if (messageObject4.isOutOwner()) {
                                    i13 = Theme.key_chat_outReactionButtonBackground;
                                } else {
                                    i13 = Theme.key_chat_inReactionButtonBackground;
                                }
                            } else if (messageObject4.isOutOwner()) {
                                i13 = Theme.key_chat_outReactionButtonTextSelected;
                            } else {
                                i13 = Theme.key_chat_inReactionButtonTextSelected;
                            }
                            if (baseFragment != null) {
                                resourceProvider = baseFragment.getResourceProvider();
                            } else {
                                resourceProvider = null;
                            }
                            color = Theme.getColor(i13, resourceProvider);
                        } else {
                            color = -1;
                        }
                        animatedEmojiDrawable5.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        if (i9 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable5, z3, !z3));
                        r3 = 0;
                        this.windowView.setClipChildren(false);
                        animationView2.getImageReceiver().setAutoRepeat(r3);
                        animationView2.getImageReceiver().setAllowStartAnimation(r3);
                        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                            if (i9 == 2) {
                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                            } else {
                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                                animationView2.getImageReceiver().getLottieAnimation().start();
                            }
                        }
                        i14 = i21115 - i7;
                        i15 = i14 >> 1;
                        if (i9 == 1) {
                        }
                        frameLayout.addView(animationView2);
                        animationView2.getLayoutParams().width = i7;
                        animationView2.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                        if (i9 != 1) {
                            if (tL_availableReaction != null) {
                                animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                            }
                            frameLayout.addView(animationView3);
                            animationView3.getLayoutParams().width = i7;
                            animationView3.getLayoutParams().height = i7;
                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                        }
                        this.windowView.addView(frameLayout);
                        frameLayout.getLayoutParams().width = i21115;
                        frameLayout.getLayoutParams().height = i21115;
                        int i21116 = -i15;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i21116;
                        int i21117 = -i14;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21117;
                        this.windowView.addView(animationView);
                        animationView.getLayoutParams().width = i21115;
                        animationView.getLayoutParams().height = i21115;
                        animationView.getLayoutParams().width = i21115;
                        animationView.getLayoutParams().height = i21115;
                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i21116;
                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21117;
                        frameLayout.setPivotX(i14);
                        frameLayout.setPivotY(i15);
                    }
                    i9 = i2;
                    i16 = 2;
                    if (i9 == 2) {
                        if (i9 != 1) {
                        }
                        if (animationView.getImageReceiver().getLottieAnimation() != null) {
                            animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                            animationView.getImageReceiver().getLottieAnimation().start();
                        }
                        i16 = 2;
                    }
                    if (i9 == i16) {
                        if (z) {
                            document = tL_availableReaction.select_animation;
                        } else {
                            document = tL_availableReaction.appear_animation;
                        }
                        ImageReceiver imageReceiver14 = animationView2.getImageReceiver();
                        StringBuilder sb10 = new StringBuilder();
                        int i21118 = uniqPrefix;
                        uniqPrefix = i21118 + 1;
                        sb10.append(i21118);
                        sb10.append("_");
                        sb10.append(this.messageId);
                        sb10.append("_");
                        imageReceiver14.setUniqKeyPrefix(sb10.toString());
                        animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                    } else if (i9 == 0) {
                        TLRPC.Document document7 = tL_availableReaction.activate_animation;
                        ImageReceiver imageReceiver15 = animationView2.getImageReceiver();
                        StringBuilder sb11 = new StringBuilder();
                        int i21119 = uniqPrefix;
                        uniqPrefix = i21119 + 1;
                        sb11.append(i21119);
                        sb11.append("_");
                        sb11.append(this.messageId);
                        sb11.append("_");
                        imageReceiver15.setUniqKeyPrefix(sb11.toString());
                        animationView2.setImage(ImageLocation.getForDocument(document7), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                    }
                    r3 = 0;
                    animationView2.getImageReceiver().setAutoRepeat(r3);
                    animationView2.getImageReceiver().setAllowStartAnimation(r3);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i9 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i14 = i21115 - i7;
                    i15 = i14 >> 1;
                    if (i9 == 1) {
                    }
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i7;
                    animationView2.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                    if (i9 != 1) {
                        if (tL_availableReaction != null) {
                            animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView3);
                        animationView3.getLayoutParams().width = i7;
                        animationView3.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i21115;
                    frameLayout.getLayoutParams().height = i21115;
                    int i211110 = -i15;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i211110;
                    int i211111 = -i14;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i211111;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i21115;
                    animationView.getLayoutParams().height = i21115;
                    animationView.getLayoutParams().width = i21115;
                    animationView.getLayoutParams().height = i21115;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i211110;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i211111;
                    frameLayout.setPivotX(i14);
                    frameLayout.setPivotY(i15);
                }
                if (view != null) {
                    ((View) view.getParent()).getLocationInWindow(this.loc);
                    int[] iArr6 = this.loc;
                    float f211 = iArr6[0] + f;
                    float f212 = iArr6[1] + f2;
                    if (view instanceof ChatMessageCell) {
                        i3 = ((ChatMessageCell) view).starsPriceTopPadding;
                    } else {
                        i3 = 0;
                    }
                    f6 = f212 + i3;
                    f7 = f211;
                } else {
                    f4 = f;
                    f5 = f2;
                }
                imageHeight = 0.0f;
                f7 = f4;
                f6 = f5;
                imageHeight = 0.0f;
            }
            i4 = 2;
            if (i2 == i4) {
                if (z) {
                    f9 = 34.0f;
                } else {
                    f9 = 34.0f;
                }
                int iDp16 = AndroidUtilities.dp(f9);
                i5 = iDp16;
                i6 = (int) ((iDp16 * 2.0f) / AndroidUtilities.density);
            } else {
                if (i2 == 1) {
                    if (z) {
                        if (SharedConfig.deviceIsHigh()) {
                            f8 = 240.0f;
                        } else {
                            f8 = 140.0f;
                        }
                        int iDp17 = AndroidUtilities.dp(f8);
                        if (SharedConfig.deviceIsHigh()) {
                            iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                        } else {
                            iSizeForBigReaction = sizeForAroundReaction();
                        }
                        i5 = iDp17;
                    } else {
                        iRound = AndroidUtilities.dp(80.0f);
                        iSizeForBigReaction = sizeForAroundReaction();
                    }
                    i6 = iSizeForBigReaction;
                } else {
                    int iDp18 = AndroidUtilities.dp(350.0f);
                    Point point6 = AndroidUtilities.displaySize;
                    iRound = Math.round(Math.min(iDp18, Math.min(point6.x, point6.y)) * 0.8f);
                    iSizeForBigReaction = sizeForBigReaction();
                }
                i5 = iRound;
                i6 = iSizeForBigReaction;
            }
            i7 = i5 >> 1;
            i8 = i6 >> 1;
            this.animateInProgress = 0.0f;
            this.animateOutProgress = 0.0f;
            frameLayout = new FrameLayout(context);
            this.container = frameLayout;
            int i211112 = i6;
            int i211113 = i5;
            messageObject4 = messageObject3;
            this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
            animationView = new AnimationView(context);
            this.effectImageView = animationView;
            animationView2 = new AnimationView(context);
            this.emojiImageView = animationView2;
            animationView3 = new AnimationView(context);
            this.emojiStaticImageView = animationView3;
            if (visibleReaction.emojicon != null) {
                tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
            } else {
                tL_availableReaction = null;
            }
            if (tL_availableReaction == null) {
            }
            if (tL_availableReaction != null) {
                i9 = i2;
                if (i9 == 0) {
                    i10 = i;
                    i12 = 1;
                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                    i11 = 2;
                } else {
                    i10 = i;
                    i11 = 2;
                    i12 = 1;
                    if (i9 == 2) {
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                    }
                }
                if (i9 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable6 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                if (messageObject4 != null) {
                    if (messageObject4.shouldDrawWithoutBackground()) {
                        if (messageObject4.isOutOwner()) {
                            i13 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i13 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject4.isOutOwner()) {
                        i13 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i13 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = null;
                    }
                    color = Theme.getColor(i13, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable6.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i9 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable6, z3, !z3));
                r3 = 0;
                this.windowView.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r3);
                animationView2.getImageReceiver().setAllowStartAnimation(r3);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i9 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i14 = i211113 - i7;
                i15 = i14 >> 1;
                if (i9 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i7;
                animationView2.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                if (i9 != 1) {
                    if (tL_availableReaction != null) {
                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView3);
                    animationView3.getLayoutParams().width = i7;
                    animationView3.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i211113;
                frameLayout.getLayoutParams().height = i211113;
                int i211114 = -i15;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i211114;
                int i211115 = -i14;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i211115;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i211113;
                animationView.getLayoutParams().height = i211113;
                animationView.getLayoutParams().width = i211113;
                animationView.getLayoutParams().height = i211113;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i211114;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i211115;
                frameLayout.setPivotX(i14);
                frameLayout.setPivotY(i15);
            }
            i9 = i2;
            i16 = 2;
            if (i9 == 2) {
                if (i9 != 1) {
                }
                if (animationView.getImageReceiver().getLottieAnimation() != null) {
                    animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                    animationView.getImageReceiver().getLottieAnimation().start();
                }
                i16 = 2;
            }
            if (i9 == i16) {
                if (z) {
                    document = tL_availableReaction.select_animation;
                } else {
                    document = tL_availableReaction.appear_animation;
                }
                ImageReceiver imageReceiver16 = animationView2.getImageReceiver();
                StringBuilder sb12 = new StringBuilder();
                int i211116 = uniqPrefix;
                uniqPrefix = i211116 + 1;
                sb12.append(i211116);
                sb12.append("_");
                sb12.append(this.messageId);
                sb12.append("_");
                imageReceiver16.setUniqKeyPrefix(sb12.toString());
                animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
            } else if (i9 == 0) {
                TLRPC.Document document8 = tL_availableReaction.activate_animation;
                ImageReceiver imageReceiver17 = animationView2.getImageReceiver();
                StringBuilder sb13 = new StringBuilder();
                int i211117 = uniqPrefix;
                uniqPrefix = i211117 + 1;
                sb13.append(i211117);
                sb13.append("_");
                sb13.append(this.messageId);
                sb13.append("_");
                imageReceiver17.setUniqKeyPrefix(sb13.toString());
                animationView2.setImage(ImageLocation.getForDocument(document8), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
            }
            r3 = 0;
            animationView2.getImageReceiver().setAutoRepeat(r3);
            animationView2.getImageReceiver().setAllowStartAnimation(r3);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i9 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i14 = i211113 - i7;
            i15 = i14 >> 1;
            if (i9 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i7;
            animationView2.getLayoutParams().height = i7;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
            if (i9 != 1) {
                if (tL_availableReaction != null) {
                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView3);
                animationView3.getLayoutParams().width = i7;
                animationView3.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
            }
            this.windowView.addView(frameLayout);
            frameLayout.getLayoutParams().width = i211113;
            frameLayout.getLayoutParams().height = i211113;
            int i211118 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i211118;
            int i211119 = -i14;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i211119;
            this.windowView.addView(animationView);
            animationView.getLayoutParams().width = i211113;
            animationView.getLayoutParams().height = i211113;
            animationView.getLayoutParams().width = i211113;
            animationView.getLayoutParams().height = i211113;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i211118;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i211119;
            frameLayout.setPivotX(i14);
            frameLayout.setPivotY(i15);
        }
        reactionButton = reactionButton2;
        if (!z) {
        }
        if (baseFragment instanceof ChatActivity) {
            chatActivity = (ChatActivity) baseFragment;
        } else {
            chatActivity = null;
        }
        if (reactionsContainerLayout != null) {
            while (i18 < reactionsContainerLayout.recyclerListView.getChildCount()) {
                if (!(reactionsContainerLayout.recyclerListView.getChildAt(i18) instanceof ReactionsContainerLayout.ReactionHolderView)) {
                }
            }
        }
        f3 = 0.8f;
        if (i2 == 1) {
            random = new Random();
            messageObject3 = messageObject;
            if (messageObject3 != null) {
                arrayList = null;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                i17 = 0;
                while (i17 < arrayList.size()) {
                    if (this.reaction.equals(arrayList.get(i17).reaction)) {
                        random2 = random;
                        arrayList2 = arrayList;
                    } else {
                        random2 = random;
                        arrayList2 = arrayList;
                    }
                    i17++;
                    random = random2;
                    arrayList = arrayList2;
                    f3 = 0.8f;
                }
            }
        } else {
            messageObject3 = messageObject;
        }
        reactionHolderView = this.holderView;
        if (reactionHolderView == null) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (r10 != 0) {
            r10.getLocationOnScreen(this.loc);
            int[] iArr7 = this.loc;
            width = iArr7[0];
            width2 = iArr7[1];
            imageHeight = view2.getWidth() * view2.getScaleX();
            if (r10 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                f10 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
                if (f10 > 0.0f) {
                    imageHeight = view2.getWidth() * ((f10 * 2.0f) + 1.0f);
                    width -= (imageHeight - view2.getWidth()) / 2.0f;
                    width2 -= imageHeight - view2.getWidth();
                }
            }
            f6 = width2;
            f7 = width;
        } else if (reactionHolderView != null) {
            reactionHolderView.getLocationOnScreen(this.loc);
            float x4 = this.loc[0] + this.holderView.loopImageView.getX();
            float y4 = this.loc[1] + this.holderView.loopImageView.getY();
            imageHeight = this.holderView.loopImageView.getWidth() * this.holderView.getScaleX();
            f7 = x4;
            f6 = y4;
        } else {
            reactionButton3 = reactionButton;
            if (reactionButton3 != null) {
                view.getLocationInWindow(this.loc);
                float f213 = this.loc[0];
                imageReceiver = reactionButton3.imageReceiver;
                if (imageReceiver == null) {
                    imageX = 0.0f;
                } else {
                    imageX = imageReceiver.getImageX();
                }
                f4 = f213 + imageX;
                float f214 = this.loc[1];
                imageReceiver2 = reactionButton3.imageReceiver;
                if (imageReceiver2 == null) {
                    imageY = 0.0f;
                } else {
                    imageY = imageReceiver2.getImageY();
                }
                f5 = f214 + imageY;
                imageReceiver3 = reactionButton3.imageReceiver;
                if (imageReceiver3 == null) {
                    f7 = f4;
                    f6 = f5;
                    i4 = 2;
                    imageHeight = imageReceiver3.getImageHeight();
                }
                if (i2 == i4) {
                    if (z) {
                        f9 = 34.0f;
                    } else {
                        f9 = 34.0f;
                    }
                    int iDp19 = AndroidUtilities.dp(f9);
                    i5 = iDp19;
                    i6 = (int) ((iDp19 * 2.0f) / AndroidUtilities.density);
                } else {
                    if (i2 == 1) {
                        if (z) {
                            if (SharedConfig.deviceIsHigh()) {
                                f8 = 240.0f;
                            } else {
                                f8 = 140.0f;
                            }
                            int iDp110 = AndroidUtilities.dp(f8);
                            if (SharedConfig.deviceIsHigh()) {
                                iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                            } else {
                                iSizeForBigReaction = sizeForAroundReaction();
                            }
                            i5 = iDp110;
                        } else {
                            iRound = AndroidUtilities.dp(80.0f);
                            iSizeForBigReaction = sizeForAroundReaction();
                        }
                        i6 = iSizeForBigReaction;
                    } else {
                        int iDp111 = AndroidUtilities.dp(350.0f);
                        Point point7 = AndroidUtilities.displaySize;
                        iRound = Math.round(Math.min(iDp111, Math.min(point7.x, point7.y)) * 0.8f);
                        iSizeForBigReaction = sizeForBigReaction();
                    }
                    i5 = iRound;
                    i6 = iSizeForBigReaction;
                }
                i7 = i5 >> 1;
                i8 = i6 >> 1;
                this.animateInProgress = 0.0f;
                this.animateOutProgress = 0.0f;
                frameLayout = new FrameLayout(context);
                this.container = frameLayout;
                int i2111110 = i6;
                int i2111111 = i5;
                messageObject4 = messageObject3;
                this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
                animationView = new AnimationView(context);
                this.effectImageView = animationView;
                animationView2 = new AnimationView(context);
                this.emojiImageView = animationView2;
                animationView3 = new AnimationView(context);
                this.emojiStaticImageView = animationView3;
                if (visibleReaction.emojicon != null) {
                    tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
                } else {
                    tL_availableReaction = null;
                }
                if (tL_availableReaction == null) {
                }
                if (tL_availableReaction != null) {
                    i9 = i2;
                    if (i9 == 0) {
                        i10 = i;
                        i12 = 1;
                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                        i11 = 2;
                    } else {
                        i10 = i;
                        i11 = 2;
                        i12 = 1;
                        if (i9 == 2) {
                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                        }
                    }
                    if (i9 != 0) {
                    }
                    AnimatedEmojiDrawable animatedEmojiDrawable7 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
                    if (messageObject4 != null) {
                        if (messageObject4.shouldDrawWithoutBackground()) {
                            if (messageObject4.isOutOwner()) {
                                i13 = Theme.key_chat_outReactionButtonBackground;
                            } else {
                                i13 = Theme.key_chat_inReactionButtonBackground;
                            }
                        } else if (messageObject4.isOutOwner()) {
                            i13 = Theme.key_chat_outReactionButtonTextSelected;
                        } else {
                            i13 = Theme.key_chat_inReactionButtonTextSelected;
                        }
                        if (baseFragment != null) {
                            resourceProvider = baseFragment.getResourceProvider();
                        } else {
                            resourceProvider = null;
                        }
                        color = Theme.getColor(i13, resourceProvider);
                    } else {
                        color = -1;
                    }
                    animatedEmojiDrawable7.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    if (i9 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable7, z3, !z3));
                    r3 = 0;
                    this.windowView.setClipChildren(false);
                    animationView2.getImageReceiver().setAutoRepeat(r3);
                    animationView2.getImageReceiver().setAllowStartAnimation(r3);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i9 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i14 = i2111111 - i7;
                    i15 = i14 >> 1;
                    if (i9 == 1) {
                    }
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i7;
                    animationView2.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                    if (i9 != 1) {
                        if (tL_availableReaction != null) {
                            animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(animationView3);
                        animationView3.getLayoutParams().width = i7;
                        animationView3.getLayoutParams().height = i7;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                        ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i2111111;
                    frameLayout.getLayoutParams().height = i2111111;
                    int i2111112 = -i15;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2111112;
                    int i2111113 = -i14;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2111113;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i2111111;
                    animationView.getLayoutParams().height = i2111111;
                    animationView.getLayoutParams().width = i2111111;
                    animationView.getLayoutParams().height = i2111111;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2111112;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2111113;
                    frameLayout.setPivotX(i14);
                    frameLayout.setPivotY(i15);
                }
                i9 = i2;
                i16 = 2;
                if (i9 == 2) {
                    if (i9 != 1) {
                    }
                    if (animationView.getImageReceiver().getLottieAnimation() != null) {
                        animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                        animationView.getImageReceiver().getLottieAnimation().start();
                    }
                    i16 = 2;
                }
                if (i9 == i16) {
                    if (z) {
                        document = tL_availableReaction.select_animation;
                    } else {
                        document = tL_availableReaction.appear_animation;
                    }
                    ImageReceiver imageReceiver18 = animationView2.getImageReceiver();
                    StringBuilder sb14 = new StringBuilder();
                    int i2111114 = uniqPrefix;
                    uniqPrefix = i2111114 + 1;
                    sb14.append(i2111114);
                    sb14.append("_");
                    sb14.append(this.messageId);
                    sb14.append("_");
                    imageReceiver18.setUniqKeyPrefix(sb14.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                } else if (i9 == 0) {
                    TLRPC.Document document9 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver19 = animationView2.getImageReceiver();
                    StringBuilder sb15 = new StringBuilder();
                    int i2111115 = uniqPrefix;
                    uniqPrefix = i2111115 + 1;
                    sb15.append(i2111115);
                    sb15.append("_");
                    sb15.append(this.messageId);
                    sb15.append("_");
                    imageReceiver19.setUniqKeyPrefix(sb15.toString());
                    animationView2.setImage(ImageLocation.getForDocument(document9), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
                }
                r3 = 0;
                animationView2.getImageReceiver().setAutoRepeat(r3);
                animationView2.getImageReceiver().setAllowStartAnimation(r3);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i9 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i14 = i2111111 - i7;
                i15 = i14 >> 1;
                if (i9 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i7;
                animationView2.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
                if (i9 != 1) {
                    if (tL_availableReaction != null) {
                        animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                    }
                    frameLayout.addView(animationView3);
                    animationView3.getLayoutParams().width = i7;
                    animationView3.getLayoutParams().height = i7;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i2111111;
                frameLayout.getLayoutParams().height = i2111111;
                int i2111116 = -i15;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2111116;
                int i2111117 = -i14;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2111117;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i2111111;
                animationView.getLayoutParams().height = i2111111;
                animationView.getLayoutParams().width = i2111111;
                animationView.getLayoutParams().height = i2111111;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2111116;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2111117;
                frameLayout.setPivotX(i14);
                frameLayout.setPivotY(i15);
            }
            if (view != null) {
                ((View) view.getParent()).getLocationInWindow(this.loc);
                int[] iArr8 = this.loc;
                float f215 = iArr8[0] + f;
                float f216 = iArr8[1] + f2;
                if (view instanceof ChatMessageCell) {
                    i3 = ((ChatMessageCell) view).starsPriceTopPadding;
                } else {
                    i3 = 0;
                }
                f6 = f216 + i3;
                f7 = f215;
            } else {
                f4 = f;
                f5 = f2;
            }
            imageHeight = 0.0f;
            f7 = f4;
            f6 = f5;
            imageHeight = 0.0f;
        }
        i4 = 2;
        if (i2 == i4) {
            if (z) {
                f9 = 34.0f;
            } else {
                f9 = 34.0f;
            }
            int iDp112 = AndroidUtilities.dp(f9);
            i5 = iDp112;
            i6 = (int) ((iDp112 * 2.0f) / AndroidUtilities.density);
        } else {
            if (i2 == 1) {
                if (z) {
                    if (SharedConfig.deviceIsHigh()) {
                        f8 = 240.0f;
                    } else {
                        f8 = 140.0f;
                    }
                    int iDp113 = AndroidUtilities.dp(f8);
                    if (SharedConfig.deviceIsHigh()) {
                        iSizeForBigReaction = (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density);
                    } else {
                        iSizeForBigReaction = sizeForAroundReaction();
                    }
                    i5 = iDp113;
                } else {
                    iRound = AndroidUtilities.dp(80.0f);
                    iSizeForBigReaction = sizeForAroundReaction();
                }
                i6 = iSizeForBigReaction;
            } else {
                int iDp114 = AndroidUtilities.dp(350.0f);
                Point point8 = AndroidUtilities.displaySize;
                iRound = Math.round(Math.min(iDp114, Math.min(point8.x, point8.y)) * 0.8f);
                iSizeForBigReaction = sizeForBigReaction();
            }
            i5 = iRound;
            i6 = iSizeForBigReaction;
        }
        i7 = i5 >> 1;
        i8 = i6 >> 1;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        int i2111118 = i6;
        int i2111119 = i5;
        messageObject4 = messageObject3;
        this.windowView = new AnonymousClass1(context, baseFragment, view, z, messageObject3, chatActivity, i7, i2, z2, imageHeight / i7, f7, f6, visibleReaction);
        animationView = new AnimationView(context);
        this.effectImageView = animationView;
        animationView2 = new AnimationView(context);
        this.emojiImageView = animationView2;
        animationView3 = new AnimationView(context);
        this.emojiStaticImageView = animationView3;
        if (visibleReaction.emojicon != null) {
            tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
        }
        if (tL_availableReaction != null) {
            i9 = i2;
            if (i9 == 0) {
                i10 = i;
                i12 = 1;
                animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i10, visibleReaction.documentId));
                i11 = 2;
            } else {
                i10 = i;
                i11 = 2;
                i12 = 1;
                if (i9 == 2) {
                    animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i10, visibleReaction.documentId));
                }
            }
            if (i9 != 0) {
            }
            AnimatedEmojiDrawable animatedEmojiDrawable8 = new AnimatedEmojiDrawable(i11, i10, visibleReaction.documentId);
            if (messageObject4 != null) {
                if (messageObject4.shouldDrawWithoutBackground()) {
                    if (messageObject4.isOutOwner()) {
                        i13 = Theme.key_chat_outReactionButtonBackground;
                    } else {
                        i13 = Theme.key_chat_inReactionButtonBackground;
                    }
                } else if (messageObject4.isOutOwner()) {
                    i13 = Theme.key_chat_outReactionButtonTextSelected;
                } else {
                    i13 = Theme.key_chat_inReactionButtonTextSelected;
                }
                if (baseFragment != null) {
                    resourceProvider = baseFragment.getResourceProvider();
                } else {
                    resourceProvider = null;
                }
                color = Theme.getColor(i13, resourceProvider);
            } else {
                color = -1;
            }
            animatedEmojiDrawable8.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (i9 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable8, z3, !z3));
            r3 = 0;
            this.windowView.setClipChildren(false);
            animationView2.getImageReceiver().setAutoRepeat(r3);
            animationView2.getImageReceiver().setAllowStartAnimation(r3);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i9 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i14 = i2111119 - i7;
            i15 = i14 >> 1;
            if (i9 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i7;
            animationView2.getLayoutParams().height = i7;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
            if (i9 != 1) {
                if (tL_availableReaction != null) {
                    animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(animationView3);
                animationView3.getLayoutParams().width = i7;
                animationView3.getLayoutParams().height = i7;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
                ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
            }
            this.windowView.addView(frameLayout);
            frameLayout.getLayoutParams().width = i2111119;
            frameLayout.getLayoutParams().height = i2111119;
            int i21111110 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i21111110;
            int i21111111 = -i14;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21111111;
            this.windowView.addView(animationView);
            animationView.getLayoutParams().width = i2111119;
            animationView.getLayoutParams().height = i2111119;
            animationView.getLayoutParams().width = i2111119;
            animationView.getLayoutParams().height = i2111119;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i21111110;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21111111;
            frameLayout.setPivotX(i14);
            frameLayout.setPivotY(i15);
        }
        i9 = i2;
        i16 = 2;
        if (i9 == 2) {
            if (i9 != 1) {
            }
            if (animationView.getImageReceiver().getLottieAnimation() != null) {
                animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r14, (boolean) r14);
                animationView.getImageReceiver().getLottieAnimation().start();
            }
            i16 = 2;
        }
        if (i9 == i16) {
            if (z) {
                document = tL_availableReaction.select_animation;
            } else {
                document = tL_availableReaction.appear_animation;
            }
            ImageReceiver imageReceiver110 = animationView2.getImageReceiver();
            StringBuilder sb16 = new StringBuilder();
            int i21111112 = uniqPrefix;
            uniqPrefix = i21111112 + 1;
            sb16.append(i21111112);
            sb16.append("_");
            sb16.append(this.messageId);
            sb16.append("_");
            imageReceiver110.setUniqKeyPrefix(sb16.toString());
            animationView2.setImage(ImageLocation.getForDocument(document), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
        } else if (i9 == 0) {
            TLRPC.Document document10 = tL_availableReaction.activate_animation;
            ImageReceiver imageReceiver111 = animationView2.getImageReceiver();
            StringBuilder sb17 = new StringBuilder();
            int i21111113 = uniqPrefix;
            uniqPrefix = i21111113 + 1;
            sb17.append(i21111113);
            sb17.append("_");
            sb17.append(this.messageId);
            sb17.append("_");
            imageReceiver111.setUniqKeyPrefix(sb17.toString());
            animationView2.setImage(ImageLocation.getForDocument(document10), i8 + "_" + i8, (ImageLocation) null, (String) null, 0, (Object) null);
        }
        r3 = 0;
        animationView2.getImageReceiver().setAutoRepeat(r3);
        animationView2.getImageReceiver().setAllowStartAnimation(r3);
        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
            if (i9 == 2) {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r3);
            } else {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r3, (boolean) r3);
                animationView2.getImageReceiver().getLottieAnimation().start();
            }
        }
        i14 = i2111119 - i7;
        i15 = i14 >> 1;
        if (i9 == 1) {
        }
        frameLayout.addView(animationView2);
        animationView2.getLayoutParams().width = i7;
        animationView2.getLayoutParams().height = i7;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i15;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i14;
        if (i9 != 1) {
            if (tL_availableReaction != null) {
                animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
            }
            frameLayout.addView(animationView3);
            animationView3.getLayoutParams().width = i7;
            animationView3.getLayoutParams().height = i7;
            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i15;
            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i14;
        }
        this.windowView.addView(frameLayout);
        frameLayout.getLayoutParams().width = i2111119;
        frameLayout.getLayoutParams().height = i2111119;
        int i21111114 = -i15;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i21111114;
        int i21111115 = -i14;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21111115;
        this.windowView.addView(animationView);
        animationView.getLayoutParams().width = i2111119;
        animationView.getLayoutParams().height = i2111119;
        animationView.getLayoutParams().width = i2111119;
        animationView.getLayoutParams().height = i2111119;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i21111114;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21111115;
        frameLayout.setPivotX(i14);
        frameLayout.setPivotY(i15);
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
            float measuredWidth;
            float measuredHeight;
            float f;
            float interpolation;
            float interpolation2;
            float f2;
            float f3;
            ReactionsEffectOverlay reactionsEffectOverlay;
            float f4;
            float f5;
            ReactionsEffectOverlay reactionsEffectOverlay2;
            float f6;
            int i;
            float f7;
            ReactionsEffectOverlay reactionsEffectOverlay3;
            int i2;
            View view;
            View view2;
            View view3;
            RLottieDrawable lottieAnimation;
            int i3;
            AvatarParticle avatarParticle;
            float f8;
            float f9;
            float f10;
            int i4;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
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
                                this.f$0.lambda$dispatchDraw$0();
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
                float f19 = iDp;
                if (viewFindCell != null) {
                    viewFindCell.getLocationInWindow(ReactionsEffectOverlay.this.loc);
                    ReactionsEffectOverlay reactionsEffectOverlay5 = ReactionsEffectOverlay.this;
                    int[] iArr = reactionsEffectOverlay5.loc;
                    measuredWidth = iArr[0];
                    measuredHeight = iArr[1];
                    if (viewFindCell instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) viewFindCell;
                        reactionButton = chatMessageCell.getReactionButton(reactionsEffectOverlay5.reaction);
                        if (chatMessageCell.drawPinnedBottom && !chatMessageCell.shouldDrawTimeOnMedia()) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        paddingTop = chatMessageCell.getPaddingTop();
                    } else {
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
                } else if (!this.val$isStories) {
                    measuredWidth = ReactionsEffectOverlay.this.lastDrawnToX;
                    measuredHeight = ReactionsEffectOverlay.this.lastDrawnToY;
                } else {
                    float f20 = f19 / 2.0f;
                    measuredWidth = (getMeasuredWidth() / 2.0f) - f20;
                    measuredHeight = (getMeasuredHeight() / 2.0f) - f20;
                }
                BaseFragment baseFragment2 = this.val$fragment;
                if (baseFragment2 != null && baseFragment2.getParentActivity() != null && this.val$fragment.getFragmentView() != null && this.val$fragment.getFragmentView().getParent() != null && this.val$fragment.getFragmentView().getVisibility() == 0 && this.val$fragment.getFragmentView() != null) {
                    this.val$fragment.getFragmentView().getLocationOnScreen(ReactionsEffectOverlay.this.loc);
                    setAlpha(((View) this.val$fragment.getFragmentView().getParent()).getAlpha());
                } else if (!this.val$isStories && !(viewFindCell instanceof GroupCallMessageCell)) {
                    return;
                }
                if (viewFindCell instanceof GroupCallMessageCell) {
                    f = this.val$emojiSize;
                } else {
                    f = this.val$emojiSize - f19;
                }
                float f21 = f / 2.0f;
                float measuredWidth2 = measuredWidth - f21;
                float f22 = measuredHeight - f21;
                if (this.val$isStories && this.val$animationType == 0) {
                    measuredWidth2 += AndroidUtilities.dp(40.0f);
                }
                if (this.val$animationType != 1 && !this.val$isStories) {
                    int i5 = ReactionsEffectOverlay.this.loc[0];
                    float f23 = i5;
                    if (measuredWidth2 < f23) {
                        measuredWidth2 = f23;
                    }
                    if (this.val$emojiSize + measuredWidth2 > i5 + getMeasuredWidth()) {
                        measuredWidth2 = (ReactionsEffectOverlay.this.loc[0] + getMeasuredWidth()) - this.val$emojiSize;
                    }
                }
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                float interpolation3 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateOutProgress);
                if (this.val$animationType == 2) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(interpolation3);
                    interpolation2 = cubicBezierInterpolator.getInterpolation(interpolation3);
                } else if (this.val$fromHolder) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                    interpolation2 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                } else {
                    interpolation = ReactionsEffectOverlay.this.animateInProgress;
                    interpolation2 = interpolation;
                }
                float f24 = 1.0f - interpolation;
                float f25 = (this.val$fromScale * f24) + interpolation;
                float f26 = f19 / this.val$emojiSize;
                if (this.val$animationType == 1) {
                    f25 = 1.0f;
                } else {
                    measuredWidth2 = (measuredWidth2 * interpolation) + (this.val$fromX * f24);
                    f22 = (f22 * interpolation2) + (this.val$fromY * (1.0f - interpolation2));
                }
                ReactionsEffectOverlay.this.effectImageView.setTranslationX(measuredWidth2);
                ReactionsEffectOverlay.this.effectImageView.setTranslationY(f22);
                float f27 = 1.0f - interpolation3;
                ReactionsEffectOverlay.this.effectImageView.setAlpha(f27);
                ReactionsEffectOverlay.this.effectImageView.setScaleX(f25);
                ReactionsEffectOverlay.this.effectImageView.setScaleY(f25);
                int i6 = this.val$animationType;
                if (i6 == 2) {
                    f25 = (this.val$fromScale * f24) + (f26 * interpolation);
                    measuredWidth2 = (this.val$fromX * f24) + (measuredWidth * interpolation);
                    f2 = this.val$fromY * (1.0f - interpolation2);
                    f3 = measuredHeight * interpolation2;
                } else {
                    if (interpolation3 != 0.0f) {
                        f25 = (f25 * f27) + (f26 * interpolation3);
                        measuredWidth2 = (measuredWidth2 * f27) + (measuredWidth * interpolation3);
                        f2 = f22 * f27;
                        f3 = measuredHeight * interpolation3;
                    }
                    if (i6 != 1) {
                        if (!this.val$isStories) {
                            AnimationView animationView = ReactionsEffectOverlay.this.emojiStaticImageView;
                            if (interpolation3 > 0.7f) {
                                f18 = (interpolation3 - 0.7f) / 0.3f;
                            } else {
                                f18 = 0.0f;
                            }
                            animationView.setAlpha(f18);
                        } else {
                            ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                        }
                    }
                    if (this.val$animationType == 0 && this.val$isStories) {
                        ReactionsEffectOverlay.this.emojiImageView.setAlpha(f27);
                    }
                    ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
                    ReactionsEffectOverlay.this.container.setTranslationY(f22);
                    ReactionsEffectOverlay.this.container.setScaleX(f25);
                    ReactionsEffectOverlay.this.container.setScaleY(f25);
                    super.dispatchDraw(canvas);
                    if (this.val$animationType != 1 || ReactionsEffectOverlay.this.emojiImageView.wasPlaying) {
                        reactionsEffectOverlay = ReactionsEffectOverlay.this;
                        f4 = reactionsEffectOverlay.animateInProgress;
                        if (f4 != 1.0f) {
                            if (this.val$fromHolder) {
                                reactionsEffectOverlay.animateInProgress = f4 + 0.045714285f;
                            } else {
                                reactionsEffectOverlay.animateInProgress = f4 + 0.07272727f;
                            }
                            if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                                reactionsEffectOverlay.animateInProgress = 1.0f;
                            }
                        }
                    }
                    f5 = 16.0f;
                    if (this.val$animationType != 2 || ((ReactionsEffectOverlay.this.wasScrolled && this.val$animationType == 0) || ((this.val$animationType != 1 && ReactionsEffectOverlay.this.emojiImageView.wasPlaying && ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation() != null && !ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation().isRunning()) || ((this.val$visibleReaction.documentId != 0 && System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000) || ((this.val$animationType == 1 && ReactionsEffectOverlay.this.effectImageView.wasPlaying && ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation() != null && !ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().isRunning()) || (this.val$visibleReaction.documentId != 0 && System.currentTimeMillis() - ReactionsEffectOverlay.this.startTime > 2000)))))) {
                        reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                        f6 = reactionsEffectOverlay2.animateOutProgress;
                        if (f6 != 1.0f) {
                            i = this.val$animationType;
                            if (i == 1) {
                                reactionsEffectOverlay2.animateOutProgress = 1.0f;
                            } else {
                                if (i == 2) {
                                    f7 = 350.0f;
                                } else {
                                    f7 = 220.0f;
                                }
                                reactionsEffectOverlay2.animateOutProgress = f6 + (16.0f / f7);
                            }
                            if (reactionsEffectOverlay2.animateOutProgress > 0.7f) {
                                if (!this.val$isStories && i == 2) {
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
                                i2 = this.val$animationType;
                                if (i2 != 0 || i2 == 2) {
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
                                            this.f$0.lambda$dispatchDraw$1();
                                        }
                                    });
                                }
                            }
                        }
                    }
                    if (!ReactionsEffectOverlay.this.avatars.isEmpty() && ReactionsEffectOverlay.this.effectImageView.wasPlaying) {
                        lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                        i3 = 0;
                        while (i3 < ReactionsEffectOverlay.this.avatars.size()) {
                            avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3);
                            f8 = avatarParticle.progress;
                            if (lottieAnimation == null && lottieAnimation.isRunning()) {
                                float duration = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getDuration();
                                if (((int) (duration - ((ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getCurrentFrame() / ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getFramesCount()) * duration))) < avatarParticle.leftTime) {
                                    f9 = avatarParticle.outProgress;
                                    if (f9 != 1.0f) {
                                        f10 = f9 + 0.10666667f;
                                        avatarParticle.outProgress = f10;
                                        if (f10 > 1.0f) {
                                            avatarParticle.outProgress = 1.0f;
                                            ReactionsEffectOverlay.this.avatars.remove(i3);
                                            i3--;
                                            i4 = 1;
                                        }
                                    }
                                    if (f8 < 0.5f) {
                                        f11 = f8 / 0.5f;
                                    } else {
                                        f11 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f28 = 1.0f - f8;
                                    float f29 = (avatarParticle.fromX * f28) + (avatarParticle.toX * f8);
                                    float f30 = ((avatarParticle.fromY * f28) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f11);
                                    float f31 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f29);
                                    float y = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f30);
                                    int iDp2 = AndroidUtilities.dp(f5);
                                    float f32 = iDp2;
                                    float f33 = f32 / 2.0f;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setImageCoords(x - f33, y - f33, f32, f32);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setRoundRadius(iDp2 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f31, f31, x, y);
                                    canvas.rotate(avatarParticle.currentRotation, x, y);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f12 = avatarParticle.progress;
                                    if (f12 < 1.0f) {
                                        f17 = f12 + 0.045714285f;
                                        avatarParticle.progress = f17;
                                        if (f17 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * 16.0f) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f34 = avatarParticle.currentRotation;
                                        f15 = avatarParticle.randomRotation;
                                        f16 = f34 + (f15 / 250.0f);
                                        avatarParticle.currentRotation = f16;
                                        if (f16 > f15) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f35 = avatarParticle.currentRotation;
                                        f13 = avatarParticle.randomRotation;
                                        f14 = f35 - (f13 / 250.0f);
                                        avatarParticle.currentRotation = f14;
                                        if (f14 < (-f13)) {
                                            i4 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i4 = 1;
                                } else {
                                    if (f8 < 0.5f) {
                                        f11 = f8 / 0.5f;
                                    } else {
                                        f11 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                    }
                                    float f210 = 1.0f - f8;
                                    float f211 = (avatarParticle.fromX * f210) + (avatarParticle.toX * f8);
                                    float f36 = ((avatarParticle.fromY * f210) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f11);
                                    float f37 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                    float x2 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f211);
                                    float y2 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f36);
                                    int iDp3 = AndroidUtilities.dp(f5);
                                    float f38 = iDp3;
                                    float f39 = f38 / 2.0f;
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setImageCoords(x2 - f39, y2 - f39, f38, f38);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setRoundRadius(iDp3 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f37, f37, x2, y2);
                                    canvas.rotate(avatarParticle.currentRotation, x2, y2);
                                    ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f12 = avatarParticle.progress;
                                    if (f12 < 1.0f) {
                                        f17 = f12 + 0.045714285f;
                                        avatarParticle.progress = f17;
                                        if (f17 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f8 >= 1.0f) {
                                        avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * 16.0f) / 500.0f;
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f310 = avatarParticle.currentRotation;
                                        f15 = avatarParticle.randomRotation;
                                        f16 = f310 + (f15 / 250.0f);
                                        avatarParticle.currentRotation = f16;
                                        if (f16 > f15) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f311 = avatarParticle.currentRotation;
                                        f13 = avatarParticle.randomRotation;
                                        f14 = f311 - (f13 / 250.0f);
                                        avatarParticle.currentRotation = f14;
                                        if (f14 < (-f13)) {
                                            i4 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i4 = 1;
                                }
                            } else {
                                f9 = avatarParticle.outProgress;
                                if (f9 != 1.0f) {
                                    f10 = f9 + 0.10666667f;
                                    avatarParticle.outProgress = f10;
                                    if (f10 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        ReactionsEffectOverlay.this.avatars.remove(i3);
                                        i3--;
                                        i4 = 1;
                                    }
                                }
                                if (f8 < 0.5f) {
                                    f11 = f8 / 0.5f;
                                } else {
                                    f11 = 1.0f - ((f8 - 0.5f) / 0.5f);
                                }
                                float f212 = 1.0f - f8;
                                float f213 = (avatarParticle.fromX * f212) + (avatarParticle.toX * f8);
                                float f312 = ((avatarParticle.fromY * f212) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f11);
                                float f313 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                                float x3 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f213);
                                float y3 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f312);
                                int iDp4 = AndroidUtilities.dp(f5);
                                float f314 = iDp4;
                                float f315 = f314 / 2.0f;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setImageCoords(x3 - f315, y3 - f315, f314, f314);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setRoundRadius(iDp4 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f313, f313, x3, y3);
                                canvas.rotate(avatarParticle.currentRotation, x3, y3);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f12 = avatarParticle.progress;
                                if (f12 < 1.0f) {
                                    f17 = f12 + 0.045714285f;
                                    avatarParticle.progress = f17;
                                    if (f17 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f8 >= 1.0f) {
                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * 16.0f) / 500.0f;
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f316 = avatarParticle.currentRotation;
                                    f15 = avatarParticle.randomRotation;
                                    f16 = f316 + (f15 / 250.0f);
                                    avatarParticle.currentRotation = f16;
                                    if (f16 > f15) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f317 = avatarParticle.currentRotation;
                                    f13 = avatarParticle.randomRotation;
                                    f14 = f317 - (f13 / 250.0f);
                                    avatarParticle.currentRotation = f14;
                                    if (f14 < (-f13)) {
                                        i4 = 1;
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i4 = 1;
                            }
                            i3 += i4;
                            f5 = 16.0f;
                        }
                    }
                    invalidate();
                    return;
                }
                f22 = f2 + f3;
                if (i6 != 1) {
                    if (!this.val$isStories) {
                        AnimationView animationView2 = ReactionsEffectOverlay.this.emojiStaticImageView;
                        if (interpolation3 > 0.7f) {
                            f18 = (interpolation3 - 0.7f) / 0.3f;
                        } else {
                            f18 = 0.0f;
                        }
                        animationView2.setAlpha(f18);
                    } else {
                        ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                    }
                }
                if (this.val$animationType == 0) {
                    ReactionsEffectOverlay.this.emojiImageView.setAlpha(f27);
                }
                ReactionsEffectOverlay.this.container.setTranslationX(measuredWidth2);
                ReactionsEffectOverlay.this.container.setTranslationY(f22);
                ReactionsEffectOverlay.this.container.setScaleX(f25);
                ReactionsEffectOverlay.this.container.setScaleY(f25);
                super.dispatchDraw(canvas);
                if (this.val$animationType != 1) {
                    reactionsEffectOverlay = ReactionsEffectOverlay.this;
                    f4 = reactionsEffectOverlay.animateInProgress;
                    if (f4 != 1.0f) {
                        if (this.val$fromHolder) {
                            reactionsEffectOverlay.animateInProgress = f4 + 0.045714285f;
                        } else {
                            reactionsEffectOverlay.animateInProgress = f4 + 0.07272727f;
                        }
                        if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                            reactionsEffectOverlay.animateInProgress = 1.0f;
                        }
                    }
                } else {
                    reactionsEffectOverlay = ReactionsEffectOverlay.this;
                    f4 = reactionsEffectOverlay.animateInProgress;
                    if (f4 != 1.0f) {
                        if (this.val$fromHolder) {
                            reactionsEffectOverlay.animateInProgress = f4 + 0.045714285f;
                        } else {
                            reactionsEffectOverlay.animateInProgress = f4 + 0.07272727f;
                        }
                        if (reactionsEffectOverlay.animateInProgress > 1.0f) {
                            reactionsEffectOverlay.animateInProgress = 1.0f;
                        }
                    }
                }
                f5 = 16.0f;
                if (this.val$animationType != 2) {
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f6 = reactionsEffectOverlay2.animateOutProgress;
                    if (f6 != 1.0f) {
                        i = this.val$animationType;
                        if (i == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i == 2) {
                                f7 = 350.0f;
                            } else {
                                f7 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = f6 + (16.0f / f7);
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
                            i2 = this.val$animationType;
                            if (i2 != 0) {
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
                                        this.f$0.lambda$dispatchDraw$1();
                                    }
                                });
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$dispatchDraw$1();
                                    }
                                });
                            }
                        }
                    }
                } else {
                    reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    f6 = reactionsEffectOverlay2.animateOutProgress;
                    if (f6 != 1.0f) {
                        i = this.val$animationType;
                        if (i == 1) {
                            reactionsEffectOverlay2.animateOutProgress = 1.0f;
                        } else {
                            if (i == 2) {
                                f7 = 350.0f;
                            } else {
                                f7 = 220.0f;
                            }
                            reactionsEffectOverlay2.animateOutProgress = f6 + (16.0f / f7);
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
                            i2 = this.val$animationType;
                            if (i2 != 0) {
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
                                        this.f$0.lambda$dispatchDraw$1();
                                    }
                                });
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$dispatchDraw$1();
                                    }
                                });
                            }
                        }
                    }
                }
                if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                    lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                    i3 = 0;
                    while (i3 < ReactionsEffectOverlay.this.avatars.size()) {
                        avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3);
                        f8 = avatarParticle.progress;
                        if (lottieAnimation == null) {
                            f9 = avatarParticle.outProgress;
                            if (f9 != 1.0f) {
                                f10 = f9 + 0.10666667f;
                                avatarParticle.outProgress = f10;
                                if (f10 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i3);
                                    i3--;
                                    i4 = 1;
                                }
                            }
                            if (f8 < 0.5f) {
                                f11 = f8 / 0.5f;
                            } else {
                                f11 = 1.0f - ((f8 - 0.5f) / 0.5f);
                            }
                            float f214 = 1.0f - f8;
                            float f215 = (avatarParticle.fromX * f214) + (avatarParticle.toX * f8);
                            float f318 = ((avatarParticle.fromY * f214) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f11);
                            float f319 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                            float x4 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f215);
                            float y4 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f318);
                            int iDp5 = AndroidUtilities.dp(f5);
                            float f3110 = iDp5;
                            float f3111 = f3110 / 2.0f;
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setImageCoords(x4 - f3111, y4 - f3111, f3110, f3110);
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setRoundRadius(iDp5 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                            canvas.scale(f319, f319, x4, y4);
                            canvas.rotate(avatarParticle.currentRotation, x4, y4);
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.draw(canvas);
                            canvas.restore();
                            f12 = avatarParticle.progress;
                            if (f12 < 1.0f) {
                                f17 = f12 + 0.045714285f;
                                avatarParticle.progress = f17;
                                if (f17 > 1.0f) {
                                    avatarParticle.progress = 1.0f;
                                }
                            }
                            if (f8 >= 1.0f) {
                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * 16.0f) / 500.0f;
                            }
                            if (avatarParticle.incrementRotation) {
                                float f3112 = avatarParticle.currentRotation;
                                f15 = avatarParticle.randomRotation;
                                f16 = f3112 + (f15 / 250.0f);
                                avatarParticle.currentRotation = f16;
                                if (f16 > f15) {
                                    avatarParticle.incrementRotation = false;
                                }
                            } else {
                                float f3113 = avatarParticle.currentRotation;
                                f13 = avatarParticle.randomRotation;
                                f14 = f3113 - (f13 / 250.0f);
                                avatarParticle.currentRotation = f14;
                                if (f14 < (-f13)) {
                                    i4 = 1;
                                    avatarParticle.incrementRotation = true;
                                }
                            }
                            i4 = 1;
                        } else {
                            f9 = avatarParticle.outProgress;
                            if (f9 != 1.0f) {
                                f10 = f9 + 0.10666667f;
                                avatarParticle.outProgress = f10;
                                if (f10 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    ReactionsEffectOverlay.this.avatars.remove(i3);
                                    i3--;
                                    i4 = 1;
                                }
                            }
                            if (f8 < 0.5f) {
                                f11 = f8 / 0.5f;
                            } else {
                                f11 = 1.0f - ((f8 - 0.5f) / 0.5f);
                            }
                            float f216 = 1.0f - f8;
                            float f217 = (avatarParticle.fromX * f216) + (avatarParticle.toX * f8);
                            float f3114 = ((avatarParticle.fromY * f216) + (avatarParticle.toY * f8)) - (avatarParticle.jumpY * f11);
                            float f3115 = avatarParticle.randomScale * f8 * (1.0f - avatarParticle.outProgress);
                            float x5 = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f217);
                            float y5 = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f3114);
                            int iDp6 = AndroidUtilities.dp(f5);
                            float f3116 = iDp6;
                            float f3117 = f3116 / 2.0f;
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setImageCoords(x5 - f3117, y5 - f3117, f3116, f3116);
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.setRoundRadius(iDp6 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                            canvas.scale(f3115, f3115, x5, y5);
                            canvas.rotate(avatarParticle.currentRotation, x5, y5);
                            ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i3)).imageReceiver.draw(canvas);
                            canvas.restore();
                            f12 = avatarParticle.progress;
                            if (f12 < 1.0f) {
                                f17 = f12 + 0.045714285f;
                                avatarParticle.progress = f17;
                                if (f17 > 1.0f) {
                                    avatarParticle.progress = 1.0f;
                                }
                            }
                            if (f8 >= 1.0f) {
                                avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * 16.0f) / 500.0f;
                            }
                            if (avatarParticle.incrementRotation) {
                                float f3118 = avatarParticle.currentRotation;
                                f15 = avatarParticle.randomRotation;
                                f16 = f3118 + (f15 / 250.0f);
                                avatarParticle.currentRotation = f16;
                                if (f16 > f15) {
                                    avatarParticle.incrementRotation = false;
                                }
                            } else {
                                float f3119 = avatarParticle.currentRotation;
                                f13 = avatarParticle.randomRotation;
                                f14 = f3119 - (f13 / 250.0f);
                                avatarParticle.currentRotation = f14;
                                if (f14 < (-f13)) {
                                    i4 = 1;
                                    avatarParticle.incrementRotation = true;
                                }
                            }
                            i4 = 1;
                        }
                        i3 += i4;
                        f5 = 16.0f;
                    }
                }
                invalidate();
                return;
            }
            invalidate();
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
        ReactionsEffectOverlay reactionsEffectOverlay;
        boolean z;
        ActionBarPopupWindow actionBarPopupWindow;
        if (view == null || visibleReaction == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                show(baseFragment, null, view, view2, 0.0f, 0.0f, visibleReaction, i, 1);
            }
            ReactionsEffectOverlay reactionsEffectOverlay2 = new ReactionsEffectOverlay(baseFragment.getParentActivity(), baseFragment, reactionsContainerLayout, view, view2, f, f2, visibleReaction, i, i2, false);
            if (i2 == 1) {
                reactionsEffectOverlay = reactionsEffectOverlay2;
                currentShortOverlay = reactionsEffectOverlay;
            } else {
                reactionsEffectOverlay = reactionsEffectOverlay2;
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
