package org.telegram.ui.Components.Reactions;

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
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.SelectAnimatedEmojiDialog;

public final class ReactionsEffectOverlay {
    public static ReactionsEffectOverlay currentOverlay;
    public static ReactionsEffectOverlay currentShortOverlay;
    public static long lastHapticTime;
    public static int uniqPrefix;
    public float animateInProgress;
    public float animateOutProgress;
    public final int animationType;
    public final ViewGroup cell;
    public final FrameLayout container;
    public float dismissProgress;
    public boolean dismissed;
    public final AnimationView effectImageView;
    public final AnimationView emojiImageView;
    public final AnimationView emojiStaticImageView;
    public final long groupId;
    public final ReactionsContainerLayout.ReactionHolderView holderView;
    public boolean isFinished;
    public boolean isStories;
    public float lastDrawnToX;
    public float lastDrawnToY;
    public final int messageId;
    public final ReactionsEffectOverlay nextReactionOverlay;
    public final ReactionsLayoutInBubble.VisibleReaction reaction;
    public long startTime;
    public boolean started;
    public boolean useWindow;
    public boolean wasScrolled;
    public WindowManager windowManager;
    public final AnonymousClass1 windowView;
    public final int[] loc = new int[2];
    public final ArrayList avatars = new ArrayList();

    public final class AnonymousClass1 extends FrameLayout {
        public final int val$animationType;
        public final ViewGroup val$cell;
        public final ChatActivity val$chatActivity;
        public final int val$emojiSize;
        public final BaseFragment val$fragment;
        public final boolean val$fromHolder;
        public final float val$fromScale;
        public final float val$fromX;
        public final float val$fromY;
        public final boolean val$isStories;
        public final MessageObject val$messageObject;
        public final ReactionsLayoutInBubble.VisibleReaction val$visibleReaction;

        public AnonymousClass1(Context context, BaseFragment baseFragment, ViewGroup viewGroup, boolean z, MessageObject messageObject, ChatActivity chatActivity, int i, int i2, boolean z2, float f, float f2, float f3, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(context);
            this.val$fragment = baseFragment;
            this.val$cell = viewGroup;
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
        public final void dispatchDraw(Canvas canvas) {
            int iDp;
            float f;
            ReactionsEffectOverlay reactionsEffectOverlay;
            float f2;
            char c;
            float measuredWidth;
            float measuredHeight;
            float f3;
            float interpolation;
            float interpolation2;
            float f4;
            float f5;
            float f6;
            float f7;
            boolean z;
            float f8;
            ArrayList arrayList;
            RLottieDrawable lottieAnimation;
            int i;
            AvatarParticle avatarParticle;
            float f9;
            float f10;
            float f11;
            int i2;
            float f12;
            float fM;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            ReactionsLayoutInBubble.ReactionButton reactionButton;
            ReactionsLayoutInBubble.ReactionButton reactionButton2;
            int paddingTop;
            ChatActivity chatActivity;
            ReactionsEffectOverlay reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
            if (reactionsEffectOverlay2.dismissed) {
                float f19 = reactionsEffectOverlay2.dismissProgress;
                if (f19 != 1.0f) {
                    float f20 = f19 + 0.10666667f;
                    reactionsEffectOverlay2.dismissProgress = f20;
                    if (f20 > 1.0f) {
                        reactionsEffectOverlay2.dismissProgress = 1.0f;
                        final int i3 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                    default:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                }
                            }
                        });
                    }
                }
                float f21 = reactionsEffectOverlay2.dismissProgress;
                if (f21 != 1.0f) {
                    setAlpha(1.0f - f21);
                    super.dispatchDraw(canvas);
                }
                invalidate();
                return;
            }
            if (!reactionsEffectOverlay2.started) {
                invalidate();
                return;
            }
            ReactionsContainerLayout.ReactionHolderView reactionHolderView = reactionsEffectOverlay2.holderView;
            if (reactionHolderView != null) {
                reactionHolderView.enterImageView.setAlpha(0.0f);
                reactionHolderView.pressedBackupImageView.setAlpha(0.0f);
            }
            BaseFragment baseFragment = this.val$fragment;
            boolean z2 = baseFragment instanceof ChatActivity;
            ViewGroup viewGroup = this.val$cell;
            View viewFindCell = z2 ? ((ChatActivity) baseFragment).findCell(reactionsEffectOverlay2.messageId, false) : viewGroup;
            boolean z3 = this.val$isStories;
            if (z3) {
                iDp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
            } else {
                MessageObject messageObject = this.val$messageObject;
                iDp = (messageObject == null || !messageObject.shouldDrawReactionsInLayout()) ? AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(20.0f);
            }
            float f22 = iDp;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = reactionsEffectOverlay2.reaction;
            int[] iArr = reactionsEffectOverlay2.loc;
            if (viewFindCell != null) {
                viewFindCell.getLocationInWindow(iArr);
                f = 20.0f;
                measuredWidth = iArr[0];
                reactionsEffectOverlay = null;
                measuredHeight = iArr[1];
                f2 = 0.0f;
                if (viewFindCell instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) viewFindCell;
                    reactionButton2 = chatMessageCell.getReactionButton(visibleReaction);
                    c = 0;
                    if (chatMessageCell.drawPinnedBottom && !chatMessageCell.shouldDrawTimeOnMedia()) {
                        measuredHeight += AndroidUtilities.dp(2.0f);
                    }
                    paddingTop = chatMessageCell.getPaddingTop();
                } else {
                    c = 0;
                    if (viewFindCell instanceof ChatActionCell) {
                        reactionButton2 = ((ChatActionCell) viewFindCell).getReactionButton(visibleReaction);
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
                    reactionsEffectOverlay2.lastDrawnToX = measuredWidth;
                    reactionsEffectOverlay2.lastDrawnToY = measuredHeight;
                }
                measuredHeight += paddingTop;
                reactionButton = reactionButton2;
                if (reactionButton != null) {
                    Rect rect2 = reactionButton.drawingImageRect;
                    measuredWidth += rect2.left;
                    measuredHeight += rect2.top;
                }
                chatActivity = this.val$chatActivity;
                if (chatActivity != null) {
                    measuredHeight += chatActivity.drawingChatListViewYoffset;
                }
                reactionsEffectOverlay2.lastDrawnToX = measuredWidth;
                reactionsEffectOverlay2.lastDrawnToY = measuredHeight;
            } else {
                f = 20.0f;
                reactionsEffectOverlay = null;
                f2 = 0.0f;
                c = 0;
                if (z3) {
                    float f23 = f22 / 2.0f;
                    measuredWidth = (getMeasuredWidth() / 2.0f) - f23;
                    measuredHeight = (getMeasuredHeight() / 2.0f) - f23;
                } else {
                    measuredWidth = reactionsEffectOverlay2.lastDrawnToX;
                    measuredHeight = reactionsEffectOverlay2.lastDrawnToY;
                }
            }
            if (baseFragment != null && baseFragment.getParentActivity() != null && baseFragment.getFragmentView() != null && baseFragment.getFragmentView().getParent() != null && baseFragment.getFragmentView().getVisibility() == 0 && baseFragment.getFragmentView() != null) {
                baseFragment.getFragmentView().getLocationOnScreen(iArr);
                setAlpha(((View) baseFragment.getFragmentView().getParent()).getAlpha());
            } else if (!z3 && !(viewFindCell instanceof GroupCallMessageCell)) {
                return;
            }
            boolean z4 = viewFindCell instanceof GroupCallMessageCell;
            int i4 = this.val$emojiSize;
            float f24 = (z4 ? i4 : i4 - f22) / 2.0f;
            float measuredWidth2 = measuredWidth - f24;
            float f25 = measuredHeight - f24;
            int i5 = this.val$animationType;
            if (z3 && i5 == 0) {
                f3 = 1.0f;
                measuredWidth2 += AndroidUtilities.dp(40.0f);
            } else {
                f3 = 1.0f;
            }
            if (i5 != 1 && !z3) {
                int i6 = iArr[c];
                float f26 = i6;
                if (measuredWidth2 < f26) {
                    measuredWidth2 = f26;
                }
                if (i4 + measuredWidth2 > getMeasuredWidth() + i6) {
                    measuredWidth2 = (getMeasuredWidth() + iArr[c]) - i4;
                }
            }
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            float interpolation3 = cubicBezierInterpolator.getInterpolation(reactionsEffectOverlay2.animateOutProgress);
            boolean z5 = this.val$fromHolder;
            if (i5 == 2) {
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(interpolation3);
                interpolation2 = cubicBezierInterpolator.getInterpolation(interpolation3);
            } else if (z5) {
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(reactionsEffectOverlay2.animateInProgress);
                interpolation2 = cubicBezierInterpolator.getInterpolation(reactionsEffectOverlay2.animateInProgress);
            } else {
                interpolation = reactionsEffectOverlay2.animateInProgress;
                interpolation2 = interpolation;
            }
            float f27 = f3 - interpolation;
            float f28 = interpolation;
            float f29 = this.val$fromScale * f27;
            float f30 = f29 + f28;
            float f31 = f22 / i4;
            float f32 = this.val$fromY;
            float f33 = this.val$fromX;
            if (i5 == 1) {
                f4 = f25;
                f5 = 1.0f;
            } else {
                measuredWidth2 = (measuredWidth2 * f28) + (f33 * f27);
                f4 = (f25 * interpolation2) + ((f3 - interpolation2) * f32);
                f5 = f30;
            }
            AnimationView animationView = reactionsEffectOverlay2.effectImageView;
            animationView.setTranslationX(measuredWidth2);
            animationView.setTranslationY(f4);
            float f34 = f4;
            float f35 = f3 - interpolation3;
            animationView.setAlpha(f35);
            animationView.setScaleX(f5);
            animationView.setScaleY(f5);
            float f36 = f5;
            if (i5 == 2) {
                f7 = (f31 * f28) + f29;
                measuredWidth2 = (f33 * f27) + (measuredWidth * f28);
                f6 = (measuredHeight * interpolation2) + ((f3 - interpolation2) * f32);
            } else if (interpolation3 != f2) {
                f7 = (f36 * f35) + (f31 * interpolation3);
                measuredWidth2 = (measuredWidth2 * f35) + (measuredWidth * interpolation3);
                f6 = (f34 * f35) + (measuredHeight * interpolation3);
            } else {
                f6 = f34;
                f7 = f36;
            }
            if (i5 != 1) {
                AnimationView animationView2 = reactionsEffectOverlay2.emojiStaticImageView;
                if (z3) {
                    animationView2.setAlpha(1.0f);
                } else {
                    animationView2.setAlpha(interpolation3 > 0.7f ? (interpolation3 - 0.7f) / 0.3f : 0.0f);
                }
            }
            AnimationView animationView3 = reactionsEffectOverlay2.emojiImageView;
            if (i5 == 0 && z3) {
                animationView3.setAlpha(f35);
            }
            FrameLayout frameLayout = reactionsEffectOverlay2.container;
            frameLayout.setTranslationX(measuredWidth2);
            frameLayout.setTranslationY(f6);
            frameLayout.setScaleX(f7);
            frameLayout.setScaleY(f7);
            super.dispatchDraw(canvas);
            if (i5 == 1 || animationView3.wasPlaying) {
                float f37 = reactionsEffectOverlay2.animateInProgress;
                if (f37 != 1.0f) {
                    if (z5) {
                        reactionsEffectOverlay2.animateInProgress = f37 + 0.045714285f;
                    } else {
                        reactionsEffectOverlay2.animateInProgress = f37 + 0.07272727f;
                    }
                    if (reactionsEffectOverlay2.animateInProgress > 1.0f) {
                        reactionsEffectOverlay2.animateInProgress = 1.0f;
                    }
                }
            }
            float f38 = 16.0f;
            if (i5 != 2 && ((!reactionsEffectOverlay2.wasScrolled || i5 != 0) && (i5 == 1 || !animationView3.wasPlaying || animationView3.getImageReceiver().getLottieAnimation() == null || animationView3.getImageReceiver().getLottieAnimation().isRunning()))) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.val$visibleReaction;
                if (visibleReaction2.documentId != 0) {
                    z = z3;
                    f8 = 0.7f;
                    if (System.currentTimeMillis() - reactionsEffectOverlay2.startTime <= 2000) {
                    }
                    arrayList = reactionsEffectOverlay2.avatars;
                    if (!arrayList.isEmpty() && animationView.wasPlaying) {
                        lottieAnimation = animationView.getImageReceiver().getLottieAnimation();
                        i = 0;
                        while (i < arrayList.size()) {
                            avatarParticle = (AvatarParticle) arrayList.get(i);
                            f9 = avatarParticle.progress;
                            if (lottieAnimation == null && lottieAnimation.isRunning()) {
                                float duration = animationView.getImageReceiver().getLottieAnimation().getDuration();
                                if (((int) TextureRenderer$$ExternalSyntheticOutline0.m(animationView.getImageReceiver().getLottieAnimation().getCurrentFrame(), animationView.getImageReceiver().getLottieAnimation().getFramesCount(), duration, duration)) < avatarParticle.leftTime) {
                                    f10 = avatarParticle.outProgress;
                                    if (f10 != 1.0f) {
                                        f11 = f10 + 0.10666667f;
                                        avatarParticle.outProgress = f11;
                                        if (f11 > 1.0f) {
                                            avatarParticle.outProgress = 1.0f;
                                            arrayList.remove(i);
                                            i--;
                                            i2 = 1;
                                        } else {
                                            if (f9 < 0.5f) {
                                                fM = f9 / 0.5f;
                                                f12 = 1.0f;
                                            } else {
                                                f12 = 1.0f;
                                                fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                            }
                                            float f39 = (f12 - f9) * 0.5f;
                                            float f40 = (avatarParticle.toX * f9) + f39;
                                            float f41 = ((avatarParticle.toY * f9) + f39) - (avatarParticle.jumpY * fM);
                                            float f42 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                            float scaleX = (animationView.getScaleX() * animationView.getWidth() * f40) + animationView.getX();
                                            float scaleY = (animationView.getScaleY() * animationView.getHeight() * f41) + animationView.getY();
                                            int iDp2 = AndroidUtilities.dp(f38);
                                            float f43 = iDp2;
                                            float f44 = f43 / 2.0f;
                                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX - f44, scaleY - f44, f43, f43);
                                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp2 >> 1);
                                            canvas.save();
                                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                            canvas.scale(f42, f42, scaleX, scaleY);
                                            canvas.rotate(avatarParticle.currentRotation, scaleX, scaleY);
                                            ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                            canvas.restore();
                                            f13 = avatarParticle.progress;
                                            if (f13 < 1.0f) {
                                                f18 = f13 + 0.045714285f;
                                                avatarParticle.progress = f18;
                                                if (f18 > 1.0f) {
                                                    avatarParticle.progress = 1.0f;
                                                }
                                            }
                                            if (f9 >= 1.0f) {
                                                avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                            }
                                            if (avatarParticle.incrementRotation) {
                                                float f45 = avatarParticle.currentRotation;
                                                f16 = avatarParticle.randomRotation;
                                                f17 = (f16 / 250.0f) + f45;
                                                avatarParticle.currentRotation = f17;
                                                if (f17 > f16) {
                                                    avatarParticle.incrementRotation = false;
                                                }
                                            } else {
                                                float f46 = avatarParticle.currentRotation;
                                                f14 = avatarParticle.randomRotation;
                                                f15 = f46 - (f14 / 250.0f);
                                                avatarParticle.currentRotation = f15;
                                                if (f15 < (-f14)) {
                                                    i2 = 1;
                                                    avatarParticle.incrementRotation = true;
                                                }
                                            }
                                            i2 = 1;
                                        }
                                    } else {
                                        if (f9 < 0.5f) {
                                            fM = f9 / 0.5f;
                                            f12 = 1.0f;
                                        } else {
                                            f12 = 1.0f;
                                            fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                        }
                                        float f310 = (f12 - f9) * 0.5f;
                                        float f47 = (avatarParticle.toX * f9) + f310;
                                        float f48 = ((avatarParticle.toY * f9) + f310) - (avatarParticle.jumpY * fM);
                                        float f49 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                        float scaleX2 = (animationView.getScaleX() * animationView.getWidth() * f47) + animationView.getX();
                                        float scaleY2 = (animationView.getScaleY() * animationView.getHeight() * f48) + animationView.getY();
                                        int iDp3 = AndroidUtilities.dp(f38);
                                        float f410 = iDp3;
                                        float f411 = f410 / 2.0f;
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX2 - f411, scaleY2 - f411, f410, f410);
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp3 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f49, f49, scaleX2, scaleY2);
                                        canvas.rotate(avatarParticle.currentRotation, scaleX2, scaleY2);
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f9 >= 1.0f) {
                                            avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f412 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = (f16 / 250.0f) + f412;
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f413 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f413 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                i2 = 1;
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                        i2 = 1;
                                    }
                                } else {
                                    if (f9 < 0.5f) {
                                        fM = f9 / 0.5f;
                                        f12 = 1.0f;
                                    } else {
                                        f12 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f311 = (f12 - f9) * 0.5f;
                                    float f414 = (avatarParticle.toX * f9) + f311;
                                    float f415 = ((avatarParticle.toY * f9) + f311) - (avatarParticle.jumpY * fM);
                                    float f416 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                    float scaleX3 = (animationView.getScaleX() * animationView.getWidth() * f414) + animationView.getX();
                                    float scaleY3 = (animationView.getScaleY() * animationView.getHeight() * f415) + animationView.getY();
                                    int iDp4 = AndroidUtilities.dp(f38);
                                    float f417 = iDp4;
                                    float f418 = f417 / 2.0f;
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX3 - f418, scaleY3 - f418, f417, f417);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp4 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f416, f416, scaleX3, scaleY3);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX3, scaleY3);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f9 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f419 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = (f16 / 250.0f) + f419;
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f4110 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f4110 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            i2 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i2 = 1;
                                }
                            } else {
                                f10 = avatarParticle.outProgress;
                                if (f10 != 1.0f) {
                                    f11 = f10 + 0.10666667f;
                                    avatarParticle.outProgress = f11;
                                    if (f11 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        arrayList.remove(i);
                                        i--;
                                        i2 = 1;
                                    } else {
                                        if (f9 < 0.5f) {
                                            fM = f9 / 0.5f;
                                            f12 = 1.0f;
                                        } else {
                                            f12 = 1.0f;
                                            fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                        }
                                        float f312 = (f12 - f9) * 0.5f;
                                        float f4111 = (avatarParticle.toX * f9) + f312;
                                        float f4112 = ((avatarParticle.toY * f9) + f312) - (avatarParticle.jumpY * fM);
                                        float f4113 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                        float scaleX4 = (animationView.getScaleX() * animationView.getWidth() * f4111) + animationView.getX();
                                        float scaleY4 = (animationView.getScaleY() * animationView.getHeight() * f4112) + animationView.getY();
                                        int iDp5 = AndroidUtilities.dp(f38);
                                        float f4114 = iDp5;
                                        float f4115 = f4114 / 2.0f;
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX4 - f4115, scaleY4 - f4115, f4114, f4114);
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp5 >> 1);
                                        canvas.save();
                                        canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                        canvas.scale(f4113, f4113, scaleX4, scaleY4);
                                        canvas.rotate(avatarParticle.currentRotation, scaleX4, scaleY4);
                                        ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                        canvas.restore();
                                        f13 = avatarParticle.progress;
                                        if (f13 < 1.0f) {
                                            f18 = f13 + 0.045714285f;
                                            avatarParticle.progress = f18;
                                            if (f18 > 1.0f) {
                                                avatarParticle.progress = 1.0f;
                                            }
                                        }
                                        if (f9 >= 1.0f) {
                                            avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                        }
                                        if (avatarParticle.incrementRotation) {
                                            float f4116 = avatarParticle.currentRotation;
                                            f16 = avatarParticle.randomRotation;
                                            f17 = (f16 / 250.0f) + f4116;
                                            avatarParticle.currentRotation = f17;
                                            if (f17 > f16) {
                                                avatarParticle.incrementRotation = false;
                                            }
                                        } else {
                                            float f4117 = avatarParticle.currentRotation;
                                            f14 = avatarParticle.randomRotation;
                                            f15 = f4117 - (f14 / 250.0f);
                                            avatarParticle.currentRotation = f15;
                                            if (f15 < (-f14)) {
                                                i2 = 1;
                                                avatarParticle.incrementRotation = true;
                                            }
                                        }
                                        i2 = 1;
                                    }
                                } else {
                                    if (f9 < 0.5f) {
                                        fM = f9 / 0.5f;
                                        f12 = 1.0f;
                                    } else {
                                        f12 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f313 = (f12 - f9) * 0.5f;
                                    float f4118 = (avatarParticle.toX * f9) + f313;
                                    float f4119 = ((avatarParticle.toY * f9) + f313) - (avatarParticle.jumpY * fM);
                                    float f41110 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                    float scaleX5 = (animationView.getScaleX() * animationView.getWidth() * f4118) + animationView.getX();
                                    float scaleY5 = (animationView.getScaleY() * animationView.getHeight() * f4119) + animationView.getY();
                                    int iDp6 = AndroidUtilities.dp(f38);
                                    float f41111 = iDp6;
                                    float f41112 = f41111 / 2.0f;
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX5 - f41112, scaleY5 - f41112, f41111, f41111);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp6 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f41110, f41110, scaleX5, scaleY5);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX5, scaleY5);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f9 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f41113 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = (f16 / 250.0f) + f41113;
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f41114 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f41114 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            i2 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i2 = 1;
                                }
                            }
                            i += i2;
                            f38 = 16.0f;
                        }
                    }
                    invalidate();
                }
                z = z3;
                f8 = 0.7f;
                if ((i5 == 1 && animationView.wasPlaying && animationView.getImageReceiver().getLottieAnimation() != null && !animationView.getImageReceiver().getLottieAnimation().isRunning()) || (visibleReaction2.documentId != 0 && System.currentTimeMillis() - reactionsEffectOverlay2.startTime > 2000)) {
                }
                arrayList = reactionsEffectOverlay2.avatars;
                if (!arrayList.isEmpty()) {
                    lottieAnimation = animationView.getImageReceiver().getLottieAnimation();
                    i = 0;
                    while (i < arrayList.size()) {
                        avatarParticle = (AvatarParticle) arrayList.get(i);
                        f9 = avatarParticle.progress;
                        if (lottieAnimation == null) {
                            f10 = avatarParticle.outProgress;
                            if (f10 != 1.0f) {
                                f11 = f10 + 0.10666667f;
                                avatarParticle.outProgress = f11;
                                if (f11 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    arrayList.remove(i);
                                    i--;
                                    i2 = 1;
                                } else {
                                    if (f9 < 0.5f) {
                                        fM = f9 / 0.5f;
                                        f12 = 1.0f;
                                    } else {
                                        f12 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f314 = (f12 - f9) * 0.5f;
                                    float f41115 = (avatarParticle.toX * f9) + f314;
                                    float f41116 = ((avatarParticle.toY * f9) + f314) - (avatarParticle.jumpY * fM);
                                    float f41117 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                    float scaleX6 = (animationView.getScaleX() * animationView.getWidth() * f41115) + animationView.getX();
                                    float scaleY6 = (animationView.getScaleY() * animationView.getHeight() * f41116) + animationView.getY();
                                    int iDp7 = AndroidUtilities.dp(f38);
                                    float f41118 = iDp7;
                                    float f41119 = f41118 / 2.0f;
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX6 - f41119, scaleY6 - f41119, f41118, f41118);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp7 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f41117, f41117, scaleX6, scaleY6);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX6, scaleY6);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f9 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f411110 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = (f16 / 250.0f) + f411110;
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f411111 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f411111 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            i2 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i2 = 1;
                                }
                            } else {
                                if (f9 < 0.5f) {
                                    fM = f9 / 0.5f;
                                    f12 = 1.0f;
                                } else {
                                    f12 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                }
                                float f315 = (f12 - f9) * 0.5f;
                                float f411112 = (avatarParticle.toX * f9) + f315;
                                float f411113 = ((avatarParticle.toY * f9) + f315) - (avatarParticle.jumpY * fM);
                                float f411114 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                float scaleX7 = (animationView.getScaleX() * animationView.getWidth() * f411112) + animationView.getX();
                                float scaleY7 = (animationView.getScaleY() * animationView.getHeight() * f411113) + animationView.getY();
                                int iDp8 = AndroidUtilities.dp(f38);
                                float f411115 = iDp8;
                                float f411116 = f411115 / 2.0f;
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX7 - f411116, scaleY7 - f411116, f411115, f411115);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp8 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f411114, f411114, scaleX7, scaleY7);
                                canvas.rotate(avatarParticle.currentRotation, scaleX7, scaleY7);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f9 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f411117 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = (f16 / 250.0f) + f411117;
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f411118 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f411118 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        i2 = 1;
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i2 = 1;
                            }
                        } else {
                            f10 = avatarParticle.outProgress;
                            if (f10 != 1.0f) {
                                f11 = f10 + 0.10666667f;
                                avatarParticle.outProgress = f11;
                                if (f11 > 1.0f) {
                                    avatarParticle.outProgress = 1.0f;
                                    arrayList.remove(i);
                                    i--;
                                    i2 = 1;
                                } else {
                                    if (f9 < 0.5f) {
                                        fM = f9 / 0.5f;
                                        f12 = 1.0f;
                                    } else {
                                        f12 = 1.0f;
                                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                    }
                                    float f316 = (f12 - f9) * 0.5f;
                                    float f411119 = (avatarParticle.toX * f9) + f316;
                                    float f4111110 = ((avatarParticle.toY * f9) + f316) - (avatarParticle.jumpY * fM);
                                    float f4111111 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                    float scaleX8 = (animationView.getScaleX() * animationView.getWidth() * f411119) + animationView.getX();
                                    float scaleY8 = (animationView.getScaleY() * animationView.getHeight() * f4111110) + animationView.getY();
                                    int iDp9 = AndroidUtilities.dp(f38);
                                    float f4111112 = iDp9;
                                    float f4111113 = f4111112 / 2.0f;
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX8 - f4111113, scaleY8 - f4111113, f4111112, f4111112);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp9 >> 1);
                                    canvas.save();
                                    canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                    canvas.scale(f4111111, f4111111, scaleX8, scaleY8);
                                    canvas.rotate(avatarParticle.currentRotation, scaleX8, scaleY8);
                                    ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                    canvas.restore();
                                    f13 = avatarParticle.progress;
                                    if (f13 < 1.0f) {
                                        f18 = f13 + 0.045714285f;
                                        avatarParticle.progress = f18;
                                        if (f18 > 1.0f) {
                                            avatarParticle.progress = 1.0f;
                                        }
                                    }
                                    if (f9 >= 1.0f) {
                                        avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                    }
                                    if (avatarParticle.incrementRotation) {
                                        float f4111114 = avatarParticle.currentRotation;
                                        f16 = avatarParticle.randomRotation;
                                        f17 = (f16 / 250.0f) + f4111114;
                                        avatarParticle.currentRotation = f17;
                                        if (f17 > f16) {
                                            avatarParticle.incrementRotation = false;
                                        }
                                    } else {
                                        float f4111115 = avatarParticle.currentRotation;
                                        f14 = avatarParticle.randomRotation;
                                        f15 = f4111115 - (f14 / 250.0f);
                                        avatarParticle.currentRotation = f15;
                                        if (f15 < (-f14)) {
                                            i2 = 1;
                                            avatarParticle.incrementRotation = true;
                                        }
                                    }
                                    i2 = 1;
                                }
                            } else {
                                if (f9 < 0.5f) {
                                    fM = f9 / 0.5f;
                                    f12 = 1.0f;
                                } else {
                                    f12 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                }
                                float f317 = (f12 - f9) * 0.5f;
                                float f4111116 = (avatarParticle.toX * f9) + f317;
                                float f4111117 = ((avatarParticle.toY * f9) + f317) - (avatarParticle.jumpY * fM);
                                float f4111118 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                float scaleX9 = (animationView.getScaleX() * animationView.getWidth() * f4111116) + animationView.getX();
                                float scaleY9 = (animationView.getScaleY() * animationView.getHeight() * f4111117) + animationView.getY();
                                int iDp10 = AndroidUtilities.dp(f38);
                                float f4111119 = iDp10;
                                float f41111110 = f4111119 / 2.0f;
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX9 - f41111110, scaleY9 - f41111110, f4111119, f4111119);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp10 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f4111118, f4111118, scaleX9, scaleY9);
                                canvas.rotate(avatarParticle.currentRotation, scaleX9, scaleY9);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f9 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f41111111 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = (f16 / 250.0f) + f41111111;
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f41111112 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f41111112 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        i2 = 1;
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i2 = 1;
                            }
                        }
                        i += i2;
                        f38 = 16.0f;
                    }
                }
                invalidate();
            }
            z = z3;
            f8 = 0.7f;
            float f50 = reactionsEffectOverlay2.animateOutProgress;
            if (f50 != 1.0f) {
                if (i5 == 1) {
                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                } else {
                    reactionsEffectOverlay2.animateOutProgress = (16.0f / (i5 == 2 ? 350.0f : 220.0f)) + f50;
                }
                if (reactionsEffectOverlay2.animateOutProgress > f8) {
                    if (!z || i5 != 2) {
                        ReactionsEffectOverlay.startShortAnimation();
                    } else if (!reactionsEffectOverlay2.isFinished) {
                        reactionsEffectOverlay2.isFinished = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        ReactionsEffectOverlay reactionsEffectOverlay3 = reactionsEffectOverlay2.nextReactionOverlay;
                        viewGroup2.addView(reactionsEffectOverlay3.windowView);
                        reactionsEffectOverlay3.isStories = true;
                        reactionsEffectOverlay3.started = true;
                        reactionsEffectOverlay3.startTime = System.currentTimeMillis();
                        reactionsEffectOverlay3.windowView.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new BaseChartView.AnonymousClass4(this, 13));
                    }
                }
                if (reactionsEffectOverlay2.animateOutProgress >= 1.0f) {
                    if (i5 == 0 || i5 == 2) {
                        if (viewGroup instanceof ChatMessageCell) {
                            ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
                        } else if (viewGroup instanceof ChatActionCell) {
                            ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
                        }
                    }
                    reactionsEffectOverlay2.animateOutProgress = 1.0f;
                    if (i5 == 1) {
                        ReactionsEffectOverlay.currentShortOverlay = reactionsEffectOverlay;
                    } else {
                        ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
                    }
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                        if ((viewGroup instanceof ChatMessageCell) && ((ChatMessageCell) viewGroup).getCurrentMessagesGroup() != null && viewGroup.getParent() != null) {
                            ((View) viewGroup.getParent()).invalidate();
                        }
                    }
                    if (!z || i5 != 2) {
                        final int i7 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final ReactionsEffectOverlay.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                    default:
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            arrayList = reactionsEffectOverlay2.avatars;
            if (!arrayList.isEmpty()) {
                lottieAnimation = animationView.getImageReceiver().getLottieAnimation();
                i = 0;
                while (i < arrayList.size()) {
                    avatarParticle = (AvatarParticle) arrayList.get(i);
                    f9 = avatarParticle.progress;
                    if (lottieAnimation == null) {
                        f10 = avatarParticle.outProgress;
                        if (f10 != 1.0f) {
                            f11 = f10 + 0.10666667f;
                            avatarParticle.outProgress = f11;
                            if (f11 > 1.0f) {
                                avatarParticle.outProgress = 1.0f;
                                arrayList.remove(i);
                                i--;
                                i2 = 1;
                            } else {
                                if (f9 < 0.5f) {
                                    fM = f9 / 0.5f;
                                    f12 = 1.0f;
                                } else {
                                    f12 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                }
                                float f318 = (f12 - f9) * 0.5f;
                                float f41111113 = (avatarParticle.toX * f9) + f318;
                                float f41111114 = ((avatarParticle.toY * f9) + f318) - (avatarParticle.jumpY * fM);
                                float f41111115 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                float scaleX10 = (animationView.getScaleX() * animationView.getWidth() * f41111113) + animationView.getX();
                                float scaleY10 = (animationView.getScaleY() * animationView.getHeight() * f41111114) + animationView.getY();
                                int iDp11 = AndroidUtilities.dp(f38);
                                float f41111116 = iDp11;
                                float f41111117 = f41111116 / 2.0f;
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX10 - f41111117, scaleY10 - f41111117, f41111116, f41111116);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp11 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f41111115, f41111115, scaleX10, scaleY10);
                                canvas.rotate(avatarParticle.currentRotation, scaleX10, scaleY10);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f9 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f41111118 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = (f16 / 250.0f) + f41111118;
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f41111119 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f41111119 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        i2 = 1;
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i2 = 1;
                            }
                        } else {
                            if (f9 < 0.5f) {
                                fM = f9 / 0.5f;
                                f12 = 1.0f;
                            } else {
                                f12 = 1.0f;
                                fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                            }
                            float f319 = (f12 - f9) * 0.5f;
                            float f411111110 = (avatarParticle.toX * f9) + f319;
                            float f411111111 = ((avatarParticle.toY * f9) + f319) - (avatarParticle.jumpY * fM);
                            float f411111112 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                            float scaleX11 = (animationView.getScaleX() * animationView.getWidth() * f411111110) + animationView.getX();
                            float scaleY11 = (animationView.getScaleY() * animationView.getHeight() * f411111111) + animationView.getY();
                            int iDp12 = AndroidUtilities.dp(f38);
                            float f411111113 = iDp12;
                            float f411111114 = f411111113 / 2.0f;
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX11 - f411111114, scaleY11 - f411111114, f411111113, f411111113);
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp12 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                            canvas.scale(f411111112, f411111112, scaleX11, scaleY11);
                            canvas.rotate(avatarParticle.currentRotation, scaleX11, scaleY11);
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                            canvas.restore();
                            f13 = avatarParticle.progress;
                            if (f13 < 1.0f) {
                                f18 = f13 + 0.045714285f;
                                avatarParticle.progress = f18;
                                if (f18 > 1.0f) {
                                    avatarParticle.progress = 1.0f;
                                }
                            }
                            if (f9 >= 1.0f) {
                                avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                            }
                            if (avatarParticle.incrementRotation) {
                                float f411111115 = avatarParticle.currentRotation;
                                f16 = avatarParticle.randomRotation;
                                f17 = (f16 / 250.0f) + f411111115;
                                avatarParticle.currentRotation = f17;
                                if (f17 > f16) {
                                    avatarParticle.incrementRotation = false;
                                }
                            } else {
                                float f411111116 = avatarParticle.currentRotation;
                                f14 = avatarParticle.randomRotation;
                                f15 = f411111116 - (f14 / 250.0f);
                                avatarParticle.currentRotation = f15;
                                if (f15 < (-f14)) {
                                    i2 = 1;
                                    avatarParticle.incrementRotation = true;
                                }
                            }
                            i2 = 1;
                        }
                    } else {
                        f10 = avatarParticle.outProgress;
                        if (f10 != 1.0f) {
                            f11 = f10 + 0.10666667f;
                            avatarParticle.outProgress = f11;
                            if (f11 > 1.0f) {
                                avatarParticle.outProgress = 1.0f;
                                arrayList.remove(i);
                                i--;
                                i2 = 1;
                            } else {
                                if (f9 < 0.5f) {
                                    fM = f9 / 0.5f;
                                    f12 = 1.0f;
                                } else {
                                    f12 = 1.0f;
                                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                                }
                                float f3110 = (f12 - f9) * 0.5f;
                                float f411111117 = (avatarParticle.toX * f9) + f3110;
                                float f411111118 = ((avatarParticle.toY * f9) + f3110) - (avatarParticle.jumpY * fM);
                                float f411111119 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                                float scaleX12 = (animationView.getScaleX() * animationView.getWidth() * f411111117) + animationView.getX();
                                float scaleY12 = (animationView.getScaleY() * animationView.getHeight() * f411111118) + animationView.getY();
                                int iDp13 = AndroidUtilities.dp(f38);
                                float f4111111110 = iDp13;
                                float f4111111111 = f4111111110 / 2.0f;
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX12 - f4111111111, scaleY12 - f4111111111, f4111111110, f4111111110);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp13 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f411111119, f411111119, scaleX12, scaleY12);
                                canvas.rotate(avatarParticle.currentRotation, scaleX12, scaleY12);
                                ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                f13 = avatarParticle.progress;
                                if (f13 < 1.0f) {
                                    f18 = f13 + 0.045714285f;
                                    avatarParticle.progress = f18;
                                    if (f18 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f9 >= 1.0f) {
                                    avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f4111111112 = avatarParticle.currentRotation;
                                    f16 = avatarParticle.randomRotation;
                                    f17 = (f16 / 250.0f) + f4111111112;
                                    avatarParticle.currentRotation = f17;
                                    if (f17 > f16) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f4111111113 = avatarParticle.currentRotation;
                                    f14 = avatarParticle.randomRotation;
                                    f15 = f4111111113 - (f14 / 250.0f);
                                    avatarParticle.currentRotation = f15;
                                    if (f15 < (-f14)) {
                                        i2 = 1;
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i2 = 1;
                            }
                        } else {
                            if (f9 < 0.5f) {
                                fM = f9 / 0.5f;
                                f12 = 1.0f;
                            } else {
                                f12 = 1.0f;
                                fM = ImageReceiver$$ExternalSyntheticOutline1.m(f9, 0.5f, 0.5f, 1.0f);
                            }
                            float f3111 = (f12 - f9) * 0.5f;
                            float f4111111114 = (avatarParticle.toX * f9) + f3111;
                            float f4111111115 = ((avatarParticle.toY * f9) + f3111) - (avatarParticle.jumpY * fM);
                            float f4111111116 = (1.0f - avatarParticle.outProgress) * avatarParticle.randomScale * f9;
                            float scaleX13 = (animationView.getScaleX() * animationView.getWidth() * f4111111114) + animationView.getX();
                            float scaleY13 = (animationView.getScaleY() * animationView.getHeight() * f4111111115) + animationView.getY();
                            int iDp14 = AndroidUtilities.dp(f38);
                            float f4111111117 = iDp14;
                            float f4111111118 = f4111111117 / 2.0f;
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setImageCoords(scaleX13 - f4111111118, scaleY13 - f4111111118, f4111111117, f4111111117);
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.setRoundRadius(iDp14 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, avatarParticle.globalTranslationY);
                            canvas.scale(f4111111116, f4111111116, scaleX13, scaleY13);
                            canvas.rotate(avatarParticle.currentRotation, scaleX13, scaleY13);
                            ((AvatarParticle) arrayList.get(i)).imageReceiver.draw(canvas);
                            canvas.restore();
                            f13 = avatarParticle.progress;
                            if (f13 < 1.0f) {
                                f18 = f13 + 0.045714285f;
                                avatarParticle.progress = f18;
                                if (f18 > 1.0f) {
                                    avatarParticle.progress = 1.0f;
                                }
                            }
                            if (f9 >= 1.0f) {
                                avatarParticle.globalTranslationY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f), 16.0f, 500.0f, avatarParticle.globalTranslationY);
                            }
                            if (avatarParticle.incrementRotation) {
                                float f4111111119 = avatarParticle.currentRotation;
                                f16 = avatarParticle.randomRotation;
                                f17 = (f16 / 250.0f) + f4111111119;
                                avatarParticle.currentRotation = f17;
                                if (f17 > f16) {
                                    avatarParticle.incrementRotation = false;
                                }
                            } else {
                                float f41111111110 = avatarParticle.currentRotation;
                                f14 = avatarParticle.randomRotation;
                                f15 = f41111111110 - (f14 / 250.0f);
                                avatarParticle.currentRotation = f15;
                                if (f15 < (-f14)) {
                                    i2 = 1;
                                    avatarParticle.incrementRotation = true;
                                }
                            }
                            i2 = 1;
                        }
                    }
                    i += i2;
                    f38 = 16.0f;
                }
            }
            invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            int i = 0;
            while (true) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (i >= reactionsEffectOverlay.avatars.size()) {
                    return;
                }
                ((AvatarParticle) reactionsEffectOverlay.avatars.get(i)).imageReceiver.onAttachedToWindow();
                i++;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            int i = 0;
            while (true) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (i >= reactionsEffectOverlay.avatars.size()) {
                    return;
                }
                ((AvatarParticle) reactionsEffectOverlay.avatars.get(i)).imageReceiver.onDetachedFromWindow();
                i++;
            }
        }
    }

    public final class AnimationView extends BackupImageView {
        public AnimatedEmojiDrawable animatedEmojiDrawable;
        public boolean attached;
        public AnimatedEmojiEffect emojiEffect;
        public boolean wasPlaying;

        public AnimationView(Context context) {
            super(context);
            getImageReceiver().setFileLoadingPriority(3);
        }

        @Override
        public final void onAttachedToWindow() {
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
        public final void onDetachedFromWindow() {
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

        @Override
        public final void onDraw(Canvas canvas) {
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
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Rect rect = animatedEmojiEffect.bounds;
                rect.set(0, 0, measuredWidth, measuredHeight);
                ImageReceiver imageReceiver = animatedEmojiEffect.effectImageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                this.emojiEffect.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().isRunning()) {
                this.wasPlaying = true;
            }
            if (!this.wasPlaying && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().isRunning()) {
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
                if (reactionsEffectOverlay.animationType != 2 || reactionsEffectOverlay.isStories) {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                    getImageReceiver().getLottieAnimation().start();
                } else {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                }
            }
            super.onDraw(canvas);
        }
    }

    public final class AvatarParticle {
        public float currentRotation;
        public float globalTranslationY;
        public ImageReceiver imageReceiver;
        public boolean incrementRotation;
        public float jumpY;
        public int leftTime;
        public float outProgress;
        public float progress;
        public float randomRotation;
        public float randomScale;
        public float toX;
        public float toY;
    }

    public ReactionsEffectOverlay(Context context, BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, ViewGroup viewGroup, View view, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2, boolean z) {
        MessageObject messageObject;
        View view2;
        Theme.ResourcesProvider resourcesProvider;
        char c;
        Context context2;
        ReactionsContainerLayout reactionsContainerLayout2;
        int i3;
        ViewGroup viewGroup2;
        BaseFragment baseFragment2;
        ?? r8;
        ?? r20;
        float f3;
        float imageX;
        float imageY;
        float f4;
        float f5;
        int i4;
        float imageHeight;
        float x;
        float y;
        int iRound;
        int iDp;
        float f6;
        float fDp;
        float f7;
        int i5;
        int i6;
        FrameLayout frameLayout;
        AnonymousClass1 anonymousClass1;
        MessageObject messageObject2;
        AnimationView animationView;
        AnimationView animationView2;
        AnimationView animationView3;
        ?? r2;
        int i7;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        AnimationView animationView4;
        MessageObject messageObject3;
        int color;
        boolean z2;
        ?? r10;
        int i8;
        Theme.ResourcesProvider resourceProvider;
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        int i9;
        int i10;
        int i11;
        TLRPC.Document document;
        ?? r11;
        TLRPC.TL_availableReaction tL_availableReaction;
        float f8;
        ?? r12;
        ?? r21;
        AvatarParticle avatarParticle;
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        float f13;
        float fM;
        float fM2;
        float f14;
        int i13;
        float f15;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        ChatActivity chatActivity;
        this.holderView = null;
        this.isStories = z;
        boolean z3 = viewGroup instanceof ChatMessageCell;
        if (z3) {
            messageObject = ((ChatMessageCell) viewGroup).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = messageObject.getGroupId();
        } else if (viewGroup instanceof ChatActionCell) {
            messageObject = ((ChatActionCell) viewGroup).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = 0L;
        } else {
            this.messageId = 0;
            this.groupId = 0L;
            messageObject = null;
        }
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.cell = viewGroup;
        ReactionsLayoutInBubble.ReactionButton reactionButton = z3 ? ((ChatMessageCell) viewGroup).getReactionButton(visibleReaction) : viewGroup instanceof ChatActionCell ? ((ChatActionCell) viewGroup).getReactionButton(visibleReaction) : null;
        if (z && i2 == 2) {
            view2 = view;
            resourcesProvider = null;
            c = 0;
            reactionsContainerLayout2 = reactionsContainerLayout;
            viewGroup2 = viewGroup;
            baseFragment2 = baseFragment;
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment2, reactionsContainerLayout2, viewGroup2, view2, f, f2, visibleReaction, i, 1, true);
            context2 = context;
            i3 = i;
            this.nextReactionOverlay = reactionsEffectOverlay;
            currentShortOverlay = reactionsEffectOverlay;
        } else {
            view2 = view;
            resourcesProvider = null;
            c = 0;
            context2 = context;
            reactionsContainerLayout2 = reactionsContainerLayout;
            i3 = i;
            viewGroup2 = viewGroup;
            baseFragment2 = baseFragment;
        }
        if (baseFragment2 instanceof ChatActivity) {
            chatActivity = (ChatActivity) baseFragment2;
        } else {
            r8 = resourcesProvider;
        }
        if (reactionsContainerLayout2 != null) {
            r8 = chatActivity;
            for (int i14 = 0; i14 < reactionsContainerLayout2.recyclerListView.getChildCount(); i14++) {
                if ((reactionsContainerLayout2.recyclerListView.getChildAt(i14) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i14)).currentReaction.equals(this.reaction)) {
                    this.holderView = (ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i14);
                    break;
                }
            }
        }
        r8 = chatActivity;
        if (i2 == 1) {
            Random random = new Random();
            if (messageObject == 0 || (tL_messageReactions = messageObject.messageOwner.reactions) == null) {
                r12 = resourcesProvider;
            } else {
                arrayList = tL_messageReactions.recent_reactions;
            }
            if (r12 == 0 || r8 == 0 || r8.getDialogId() >= r5) {
                r12 = arrayList;
                r20 = r8;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                int i15 = 0;
                ?? r9 = r8;
                while (i15 < r12.size()) {
                    if (this.reaction.equals(((TLRPC.MessagePeerReaction) r12.get(i15)).reaction) && ((TLRPC.MessagePeerReaction) r12.get(i15)).unread) {
                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                        ImageReceiver imageReceiver = new ImageReceiver();
                        r21 = r9;
                        long peerId = MessageObject.getPeerId(((TLRPC.MessagePeerReaction) r12.get(i15)).peer_id);
                        if (peerId < 0) {
                            TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                avatarDrawable.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                avatarParticle = new AvatarParticle();
                                avatarParticle.imageReceiver = imageReceiver;
                                f9 = 100.0f;
                                avatarParticle.jumpY = zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 0.1f, 0.3f);
                                avatarParticle.randomScale = zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 0.4f, 0.8f);
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 200.0f, 400.0f);
                                f10 = 0.2f;
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.6f, 100.0f, 0.2f);
                                    avatarParticle.toY = (FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100) * 0.4f) / 100.0f;
                                } else {
                                    i12 = 0;
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    while (i12 < 10) {
                                        int i16 = i12;
                                        fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.6f, f9, f10);
                                        fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.4f, f9, f10);
                                        f14 = 2.1474836E9f;
                                        for (i13 = 0; i13 < this.avatars.size(); i13++) {
                                            float f16 = ((AvatarParticle) this.avatars.get(i13)).toX - fM;
                                            float f17 = ((AvatarParticle) this.avatars.get(i13)).toY - fM2;
                                            f15 = (f17 * f17) + (f16 * f16);
                                            if (f15 < f14) {
                                                f14 = f15;
                                            }
                                        }
                                        if (f14 > f11) {
                                            f13 = fM2;
                                            f12 = fM;
                                            f11 = f14;
                                        }
                                        i12 = i16 + 1;
                                        f9 = 100.0f;
                                        f10 = 0.2f;
                                    }
                                    avatarParticle.toX = f12;
                                    avatarParticle.toY = f13;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                avatarDrawable.setInfo(i3, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                                avatarParticle = new AvatarParticle();
                                avatarParticle.imageReceiver = imageReceiver;
                                f9 = 100.0f;
                                avatarParticle.jumpY = zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 0.1f, 0.3f);
                                avatarParticle.randomScale = zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 0.4f, 0.8f);
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) zzir.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 100.0f, 200.0f, 400.0f);
                                f10 = 0.2f;
                                if (this.avatars.isEmpty()) {
                                    avatarParticle.toX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.6f, 100.0f, 0.2f);
                                    avatarParticle.toY = (FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100) * 0.4f) / 100.0f;
                                } else {
                                    i12 = 0;
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    f13 = 0.0f;
                                    while (i12 < 10) {
                                        int i17 = i12;
                                        fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.6f, f9, f10);
                                        fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(FlickerLoadingView$$ExternalSyntheticOutline0.m(random, 100), 0.4f, f9, f10);
                                        f14 = 2.1474836E9f;
                                        while (i13 < this.avatars.size()) {
                                            float f18 = ((AvatarParticle) this.avatars.get(i13)).toX - fM;
                                            float f19 = ((AvatarParticle) this.avatars.get(i13)).toY - fM2;
                                            f15 = (f19 * f19) + (f18 * f18);
                                            if (f15 < f14) {
                                                f14 = f15;
                                            }
                                        }
                                        if (f14 > f11) {
                                            f13 = fM2;
                                            f12 = fM;
                                            f11 = f14;
                                        }
                                        i12 = i17 + 1;
                                        f9 = 100.0f;
                                        f10 = 0.2f;
                                    }
                                    avatarParticle.toX = f12;
                                    avatarParticle.toY = f13;
                                }
                                this.avatars.add(avatarParticle);
                            }
                        }
                    } else {
                        r21 = r9;
                    }
                    i15++;
                    i3 = i;
                    r9 = r21;
                }
                r20 = r9;
            }
        } else {
            r12 = arrayList;
            r20 = r8;
            f3 = 0.0f;
        }
        ReactionsContainerLayout.ReactionHolderView reactionHolderView = this.holderView;
        boolean z4 = (reactionHolderView == null && (f == f3 || f2 == f3)) ? false : true;
        if (view2 == null) {
            if (reactionHolderView != null) {
                reactionHolderView.getLocationOnScreen(this.loc);
                x = this.holderView.loopImageView.getX() + this.loc[c];
                y = this.loc[1] + this.holderView.loopImageView.getY();
                imageHeight = this.holderView.getScaleX() * this.holderView.loopImageView.getWidth();
            } else {
                if (reactionButton != 0) {
                    viewGroup2.getLocationInWindow(this.loc);
                    float f20 = this.loc[c];
                    ImageReceiver imageReceiver2 = reactionButton.imageReceiver;
                    imageX = f20 + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                    float f21 = this.loc[1];
                    ImageReceiver imageReceiver3 = reactionButton.imageReceiver;
                    imageY = f21 + (imageReceiver3 == null ? 0.0f : imageReceiver3.getImageY());
                    ImageReceiver imageReceiver4 = reactionButton.imageReceiver;
                    if (imageReceiver4 != null) {
                        imageHeight = imageReceiver4.getImageHeight();
                        f5 = imageX;
                        f4 = imageY;
                        i4 = 2;
                    }
                } else {
                    if (viewGroup2 != null) {
                        ((View) viewGroup2.getParent()).getLocationInWindow(this.loc);
                        int[] iArr = this.loc;
                        float f22 = iArr[c] + f;
                        f4 = iArr[1] + f2 + (viewGroup2 instanceof ChatMessageCell ? ((ChatMessageCell) viewGroup2).starsPriceTopPadding : 0);
                        f5 = f22;
                    } else {
                        imageX = f;
                        imageY = f2;
                    }
                    i4 = 2;
                    imageHeight = 0.0f;
                }
                f5 = imageX;
                f4 = imageY;
                i4 = 2;
                imageHeight = 0.0f;
            }
            if (i2 == i4) {
                if (z || !SharedConfig.deviceIsHigh()) {
                    f8 = 34.0f;
                } else {
                    f8 = 60.0f;
                }
                int iDp2 = AndroidUtilities.dp(f8);
                iRound = (int) ((iDp2 * 2.0f) / AndroidUtilities.density);
                iDp = iDp2;
            } else if (i2 == 1) {
                int iDp3 = AndroidUtilities.dp(350.0f);
                Point point = AndroidUtilities.displaySize;
                int iRound2 = Math.round(Math.min(iDp3, Math.min(point.x, point.y)) * 0.8f);
                int iDp4 = AndroidUtilities.dp(350.0f);
                Point point2 = AndroidUtilities.displaySize;
                iRound = (int) (Math.round(Math.min(iDp4, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                iDp = iRound2;
            } else if (z) {
                if (SharedConfig.deviceIsHigh()) {
                    f6 = 240.0f;
                } else {
                    f6 = 140.0f;
                }
                iDp = AndroidUtilities.dp(f6);
                if (SharedConfig.deviceIsHigh()) {
                    fDp = AndroidUtilities.dp(80.0f) * 2.0f;
                    f7 = AndroidUtilities.density;
                } else {
                    fDp = AndroidUtilities.dp(40.0f) * 2.0f;
                    f7 = AndroidUtilities.density;
                }
                iRound = (int) (fDp / f7);
            } else {
                int iDp5 = AndroidUtilities.dp(80.0f);
                iRound = (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
                iDp = iDp5;
            }
            int i18 = iDp;
            i5 = i18 >> 1;
            i6 = iRound >> 1;
            float f23 = imageHeight / i5;
            this.animateInProgress = 0.0f;
            this.animateOutProgress = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.container = frameLayout;
            int i19 = iRound;
            ViewGroup viewGroup3 = viewGroup2;
            messageObject2 = messageObject;
            anonymousClass1 = new AnonymousClass1(context2, baseFragment, viewGroup3, z, messageObject2, r20, i5, i2, z4, f23, f5, f4, visibleReaction);
            this.windowView = anonymousClass1;
            animationView = new AnimationView(context2);
            this.effectImageView = animationView;
            animationView2 = new AnimationView(context2);
            this.emojiImageView = animationView2;
            animationView3 = new AnimationView(context2);
            this.emojiStaticImageView = animationView3;
            if (visibleReaction.emojicon != null) {
                tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
            } else {
                r2 = resourcesProvider;
            }
            if (r2 != 0 && visibleReaction.documentId == r5) {
                r2 = tL_availableReaction;
                this.dismissed = true;
                return;
            }
            if (r2 != 0) {
                if (i2 == 0) {
                    i7 = i;
                    if (i2 == 2) {
                        animationView4 = animationView3;
                        messageObject3 = messageObject2;
                        animatedEmojiDrawable = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                        animatedEmojiDrawable.removeView(animationView2);
                        animationView2.animatedEmojiDrawable = animatedEmojiDrawable;
                        if (animationView2.attached) {
                            animatedEmojiDrawable.addView(animationView2);
                        }
                    }
                    if (i2 != 0 || i2 == 1) {
                        AnimatedEmojiDrawable animatedEmojiDrawable3 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                        if (messageObject3 != null) {
                            if (messageObject3.shouldDrawWithoutBackground()) {
                                if (messageObject3.isOutOwner()) {
                                    i8 = Theme.key_chat_outReactionButtonBackground;
                                } else {
                                    i8 = Theme.key_chat_inReactionButtonBackground;
                                }
                            } else if (messageObject3.isOutOwner()) {
                                i8 = Theme.key_chat_outReactionButtonTextSelected;
                            } else {
                                i8 = Theme.key_chat_inReactionButtonTextSelected;
                            }
                            if (baseFragment != null) {
                                resourceProvider = baseFragment.getResourceProvider();
                            } else {
                                resourceProvider = resourcesProvider;
                            }
                            color = Theme.getColor(i8, resourceProvider);
                        } else {
                            color = -1;
                        }
                        animatedEmojiDrawable3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        if (i2 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable3, UserConfig.selectedAccount, z2, !z2);
                        r10 = 0;
                        anonymousClass1.setClipChildren(false);
                    }
                    animationView2.getImageReceiver().setAutoRepeat(r10);
                    animationView2.getImageReceiver().setAllowStartAnimation(r10);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                        if (i2 == 2) {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
                        } else {
                            animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                            animationView2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i9 = i18 - i5;
                    i10 = i9 >> 1;
                    i9 = i2 == 1 ? i10 : i9;
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i5;
                    animationView2.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                    if (i2 != 1 && !z) {
                        if (r2 != 0) {
                            animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
                        }
                        frameLayout.addView(animationView4);
                        animationView4.getLayoutParams().width = i5;
                        animationView4.getLayoutParams().height = i5;
                        ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                        ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                    }
                    anonymousClass1.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i18;
                    frameLayout.getLayoutParams().height = i18;
                    int i20 = -i10;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i20;
                    int i21 = -i9;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i21;
                    anonymousClass1.addView(animationView);
                    animationView.getLayoutParams().width = i18;
                    animationView.getLayoutParams().height = i18;
                    animationView.getLayoutParams().width = i18;
                    animationView.getLayoutParams().height = i18;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i20;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i21;
                    frameLayout.setPivotX(i9);
                    frameLayout.setPivotY(i10);
                }
                i7 = i;
                animatedEmojiDrawable2 = new AnimatedEmojiDrawable(1, i7, visibleReaction.documentId);
                animatedEmojiDrawable2.removeView(animationView2);
                animationView2.animatedEmojiDrawable = animatedEmojiDrawable2;
                if (animationView2.attached) {
                    animatedEmojiDrawable2.addView(animationView2);
                }
                animationView4 = animationView3;
                messageObject3 = messageObject2;
                if (i2 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable4 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i8 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i8 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = resourcesProvider;
                    }
                    color = Theme.getColor(i8, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable4.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable4, UserConfig.selectedAccount, z2, !z2);
                r10 = 0;
                anonymousClass1.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r10);
                animationView2.getImageReceiver().setAllowStartAnimation(r10);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i2 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i9 = i18 - i5;
                i10 = i9 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i5;
                animationView2.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                if (i2 != 1) {
                    if (r2 != 0) {
                        animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
                    }
                    frameLayout.addView(animationView4);
                    animationView4.getLayoutParams().width = i5;
                    animationView4.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                }
                anonymousClass1.addView(frameLayout);
                frameLayout.getLayoutParams().width = i18;
                frameLayout.getLayoutParams().height = i18;
                int i22 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i22;
                int i23 = -i9;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i23;
                anonymousClass1.addView(animationView);
                animationView.getLayoutParams().width = i18;
                animationView.getLayoutParams().height = i18;
                animationView.getLayoutParams().width = i18;
                animationView.getLayoutParams().height = i18;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i22;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i23;
                frameLayout.setPivotX(i9);
                frameLayout.setPivotY(i10);
            }
            i11 = 2;
            if (i2 != 2) {
                if ((i2 != 1 && LiteMode.isEnabled(4112)) || i2 == 0) {
                    TLRPC.Document document2 = i2 == 1 ? r2.around_animation : r2.effect_animation;
                    String filterForAroundAnimation = i2 == 1 ? getFilterForAroundAnimation() : DiffUtil.m(i19, i19, "_");
                    ImageReceiver imageReceiver5 = animationView.getImageReceiver();
                    StringBuilder sb = new StringBuilder();
                    int i24 = uniqPrefix;
                    uniqPrefix = i24 + 1;
                    sb.append(i24);
                    sb.append("_");
                    sb.append(this.messageId);
                    sb.append("_");
                    imageReceiver5.setUniqKeyPrefix(sb.toString());
                    animationView.setImage(ImageLocation.getForDocument(document2), filterForAroundAnimation, (ImageLocation) null, (String) null, 0, (Object) null);
                    r11 = 0;
                    animationView.getImageReceiver().setAutoRepeat(0);
                    animationView.getImageReceiver().setAllowStartAnimation(false);
                }
                if (animationView.getImageReceiver().getLottieAnimation() != null) {
                    animationView.getImageReceiver().getLottieAnimation().setCurrentFrame(r11, r11);
                    animationView.getImageReceiver().getLottieAnimation().start();
                }
                i11 = 2;
            }
            if (i2 == i11) {
                if (z) {
                    document = r2.select_animation;
                } else {
                    document = r2.appear_animation;
                }
                ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
                StringBuilder sb2 = new StringBuilder();
                int i25 = uniqPrefix;
                uniqPrefix = i25 + 1;
                sb2.append(i25);
                sb2.append("_");
                sb2.append(this.messageId);
                sb2.append("_");
                imageReceiver6.setUniqKeyPrefix(sb2.toString());
                animationView2.setImage(ImageLocation.getForDocument(document), DiffUtil.m(i6, i6, "_"), (ImageLocation) null, (String) null, 0, (Object) null);
            } else if (i2 == 0) {
                TLRPC.Document document3 = r2.activate_animation;
                ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
                StringBuilder sb3 = new StringBuilder();
                int i26 = uniqPrefix;
                uniqPrefix = i26 + 1;
                sb3.append(i26);
                sb3.append("_");
                sb3.append(this.messageId);
                sb3.append("_");
                imageReceiver7.setUniqKeyPrefix(sb3.toString());
                animationView2.setImage(ImageLocation.getForDocument(document3), DiffUtil.m(i6, i6, "_"), (ImageLocation) null, (String) null, 0, (Object) null);
            }
            animationView4 = animationView3;
            r10 = 0;
            animationView2.getImageReceiver().setAutoRepeat(r10);
            animationView2.getImageReceiver().setAllowStartAnimation(r10);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i2 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i9 = i18 - i5;
            i10 = i9 >> 1;
            if (i2 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i5;
            animationView2.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
            if (i2 != 1) {
                if (r2 != 0) {
                    animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
                }
                frameLayout.addView(animationView4);
                animationView4.getLayoutParams().width = i5;
                animationView4.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
            }
            anonymousClass1.addView(frameLayout);
            frameLayout.getLayoutParams().width = i18;
            frameLayout.getLayoutParams().height = i18;
            int i27 = -i10;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i27;
            int i28 = -i9;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i28;
            anonymousClass1.addView(animationView);
            animationView.getLayoutParams().width = i18;
            animationView.getLayoutParams().height = i18;
            animationView.getLayoutParams().width = i18;
            animationView.getLayoutParams().height = i18;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i27;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i28;
            frameLayout.setPivotX(i9);
            frameLayout.setPivotY(i10);
        }
        view2.getLocationOnScreen(this.loc);
        int[] iArr2 = this.loc;
        x = iArr2[c];
        y = iArr2[1];
        imageHeight = view2.getScaleX() * view2.getWidth();
        if (view2 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
            float f24 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).bigReactionSelectedProgress;
            if (f24 > f3) {
                imageHeight = view2.getWidth() * ((f24 * 2.0f) + 1.0f);
                x = ImageReceiver$$ExternalSyntheticOutline1.m(imageHeight, view2.getWidth(), 2.0f, x);
                y -= imageHeight - view2.getWidth();
            }
        }
        f4 = y;
        f5 = x;
        i4 = 2;
        if (i2 == i4) {
            if (z) {
                f8 = 34.0f;
            } else {
                f8 = 34.0f;
            }
            int iDp6 = AndroidUtilities.dp(f8);
            iRound = (int) ((iDp6 * 2.0f) / AndroidUtilities.density);
            iDp = iDp6;
        } else if (i2 == 1) {
            int iDp7 = AndroidUtilities.dp(350.0f);
            Point point3 = AndroidUtilities.displaySize;
            int iRound3 = Math.round(Math.min(iDp7, Math.min(point3.x, point3.y)) * 0.8f);
            int iDp8 = AndroidUtilities.dp(350.0f);
            Point point4 = AndroidUtilities.displaySize;
            iRound = (int) (Math.round(Math.min(iDp8, Math.min(point4.x, point4.y)) * 0.7f) / AndroidUtilities.density);
            iDp = iRound3;
        } else if (z) {
            if (SharedConfig.deviceIsHigh()) {
                f6 = 240.0f;
            } else {
                f6 = 140.0f;
            }
            iDp = AndroidUtilities.dp(f6);
            if (SharedConfig.deviceIsHigh()) {
                fDp = AndroidUtilities.dp(80.0f) * 2.0f;
                f7 = AndroidUtilities.density;
            } else {
                fDp = AndroidUtilities.dp(40.0f) * 2.0f;
                f7 = AndroidUtilities.density;
            }
            iRound = (int) (fDp / f7);
        } else {
            int iDp9 = AndroidUtilities.dp(80.0f);
            iRound = (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
            iDp = iDp9;
        }
        int i110 = iDp;
        i5 = i110 >> 1;
        i6 = iRound >> 1;
        float f25 = imageHeight / i5;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.container = frameLayout;
        int i111 = iRound;
        ViewGroup viewGroup4 = viewGroup2;
        messageObject2 = messageObject;
        anonymousClass1 = new AnonymousClass1(context2, baseFragment, viewGroup4, z, messageObject2, r20, i5, i2, z4, f25, f5, f4, visibleReaction);
        this.windowView = anonymousClass1;
        animationView = new AnimationView(context2);
        this.effectImageView = animationView;
        animationView2 = new AnimationView(context2);
        this.emojiImageView = animationView2;
        animationView3 = new AnimationView(context2);
        this.emojiStaticImageView = animationView3;
        if (visibleReaction.emojicon != null) {
            tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon);
        } else {
            r2 = resourcesProvider;
        }
        if (r2 != 0) {
        }
        if (r2 != 0) {
            if (i2 == 0) {
                i7 = i;
                if (i2 == 2) {
                    animationView4 = animationView3;
                    messageObject3 = messageObject2;
                    animatedEmojiDrawable = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                    animatedEmojiDrawable.removeView(animationView2);
                    animationView2.animatedEmojiDrawable = animatedEmojiDrawable;
                    if (animationView2.attached) {
                        animatedEmojiDrawable.addView(animationView2);
                    }
                }
                if (i2 != 0) {
                }
                AnimatedEmojiDrawable animatedEmojiDrawable5 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
                if (messageObject3 != null) {
                    if (messageObject3.shouldDrawWithoutBackground()) {
                        if (messageObject3.isOutOwner()) {
                            i8 = Theme.key_chat_outReactionButtonBackground;
                        } else {
                            i8 = Theme.key_chat_inReactionButtonBackground;
                        }
                    } else if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonTextSelected;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonTextSelected;
                    }
                    if (baseFragment != null) {
                        resourceProvider = baseFragment.getResourceProvider();
                    } else {
                        resourceProvider = resourcesProvider;
                    }
                    color = Theme.getColor(i8, resourceProvider);
                } else {
                    color = -1;
                }
                animatedEmojiDrawable5.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable5, UserConfig.selectedAccount, z2, !z2);
                r10 = 0;
                anonymousClass1.setClipChildren(false);
                animationView2.getImageReceiver().setAutoRepeat(r10);
                animationView2.getImageReceiver().setAllowStartAnimation(r10);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    if (i2 == 2) {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
                    } else {
                        animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                        animationView2.getImageReceiver().getLottieAnimation().start();
                    }
                }
                i9 = i110 - i5;
                i10 = i9 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i5;
                animationView2.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
                if (i2 != 1) {
                    if (r2 != 0) {
                        animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
                    }
                    frameLayout.addView(animationView4);
                    animationView4.getLayoutParams().width = i5;
                    animationView4.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                    ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
                }
                anonymousClass1.addView(frameLayout);
                frameLayout.getLayoutParams().width = i110;
                frameLayout.getLayoutParams().height = i110;
                int i29 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i29;
                int i210 = -i9;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i210;
                anonymousClass1.addView(animationView);
                animationView.getLayoutParams().width = i110;
                animationView.getLayoutParams().height = i110;
                animationView.getLayoutParams().width = i110;
                animationView.getLayoutParams().height = i110;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i29;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i210;
                frameLayout.setPivotX(i9);
                frameLayout.setPivotY(i10);
            }
            i7 = i;
            animatedEmojiDrawable2 = new AnimatedEmojiDrawable(1, i7, visibleReaction.documentId);
            animatedEmojiDrawable2.removeView(animationView2);
            animationView2.animatedEmojiDrawable = animatedEmojiDrawable2;
            if (animationView2.attached) {
                animatedEmojiDrawable2.addView(animationView2);
            }
            animationView4 = animationView3;
            messageObject3 = messageObject2;
            if (i2 != 0) {
            }
            AnimatedEmojiDrawable animatedEmojiDrawable6 = new AnimatedEmojiDrawable(2, i7, visibleReaction.documentId);
            if (messageObject3 != null) {
                if (messageObject3.shouldDrawWithoutBackground()) {
                    if (messageObject3.isOutOwner()) {
                        i8 = Theme.key_chat_outReactionButtonBackground;
                    } else {
                        i8 = Theme.key_chat_inReactionButtonBackground;
                    }
                } else if (messageObject3.isOutOwner()) {
                    i8 = Theme.key_chat_outReactionButtonTextSelected;
                } else {
                    i8 = Theme.key_chat_inReactionButtonTextSelected;
                }
                if (baseFragment != null) {
                    resourceProvider = baseFragment.getResourceProvider();
                } else {
                    resourceProvider = resourcesProvider;
                }
                color = Theme.getColor(i8, resourceProvider);
            } else {
                color = -1;
            }
            animatedEmojiDrawable6.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            animationView.emojiEffect = new AnimatedEmojiEffect(animatedEmojiDrawable6, UserConfig.selectedAccount, z2, !z2);
            r10 = 0;
            anonymousClass1.setClipChildren(false);
            animationView2.getImageReceiver().setAutoRepeat(r10);
            animationView2.getImageReceiver().setAllowStartAnimation(r10);
            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                if (i2 == 2) {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
                } else {
                    animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                    animationView2.getImageReceiver().getLottieAnimation().start();
                }
            }
            i9 = i110 - i5;
            i10 = i9 >> 1;
            if (i2 == 1) {
            }
            frameLayout.addView(animationView2);
            animationView2.getLayoutParams().width = i5;
            animationView2.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
            if (i2 != 1) {
                if (r2 != 0) {
                    animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
                }
                frameLayout.addView(animationView4);
                animationView4.getLayoutParams().width = i5;
                animationView4.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
                ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
            }
            anonymousClass1.addView(frameLayout);
            frameLayout.getLayoutParams().width = i110;
            frameLayout.getLayoutParams().height = i110;
            int i211 = -i10;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i211;
            int i212 = -i9;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i212;
            anonymousClass1.addView(animationView);
            animationView.getLayoutParams().width = i110;
            animationView.getLayoutParams().height = i110;
            animationView.getLayoutParams().width = i110;
            animationView.getLayoutParams().height = i110;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i211;
            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i212;
            frameLayout.setPivotX(i9);
            frameLayout.setPivotY(i10);
        }
        i11 = 2;
        if (i2 != 2) {
            r11 = i2 != 1 ? 0 : 0;
            if (animationView.getImageReceiver().getLottieAnimation() != null) {
                animationView.getImageReceiver().getLottieAnimation().setCurrentFrame(r11, r11);
                animationView.getImageReceiver().getLottieAnimation().start();
            }
            i11 = 2;
        }
        if (i2 == i11) {
            if (z) {
                document = r2.select_animation;
            } else {
                document = r2.appear_animation;
            }
            ImageReceiver imageReceiver8 = animationView2.getImageReceiver();
            StringBuilder sb4 = new StringBuilder();
            int i213 = uniqPrefix;
            uniqPrefix = i213 + 1;
            sb4.append(i213);
            sb4.append("_");
            sb4.append(this.messageId);
            sb4.append("_");
            imageReceiver8.setUniqKeyPrefix(sb4.toString());
            animationView2.setImage(ImageLocation.getForDocument(document), DiffUtil.m(i6, i6, "_"), (ImageLocation) null, (String) null, 0, (Object) null);
        } else if (i2 == 0) {
            TLRPC.Document document4 = r2.activate_animation;
            ImageReceiver imageReceiver9 = animationView2.getImageReceiver();
            StringBuilder sb5 = new StringBuilder();
            int i214 = uniqPrefix;
            uniqPrefix = i214 + 1;
            sb5.append(i214);
            sb5.append("_");
            sb5.append(this.messageId);
            sb5.append("_");
            imageReceiver9.setUniqKeyPrefix(sb5.toString());
            animationView2.setImage(ImageLocation.getForDocument(document4), DiffUtil.m(i6, i6, "_"), (ImageLocation) null, (String) null, 0, (Object) null);
        }
        animationView4 = animationView3;
        r10 = 0;
        animationView2.getImageReceiver().setAutoRepeat(r10);
        animationView2.getImageReceiver().setAllowStartAnimation(r10);
        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
            if (i2 == 2) {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, r10);
            } else {
                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(r10, r10);
                animationView2.getImageReceiver().getLottieAnimation().start();
            }
        }
        i9 = i110 - i5;
        i10 = i9 >> 1;
        if (i2 == 1) {
        }
        frameLayout.addView(animationView2);
        animationView2.getLayoutParams().width = i5;
        animationView2.getLayoutParams().height = i5;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i10;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i9;
        if (i2 != 1) {
            if (r2 != 0) {
                animationView4.getImageReceiver().setImage(ImageLocation.getForDocument(r2.center_icon), "40_40_lastreactframe", null, "webp", r2, 1);
            }
            frameLayout.addView(animationView4);
            animationView4.getLayoutParams().width = i5;
            animationView4.getLayoutParams().height = i5;
            ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).topMargin = i10;
            ((FrameLayout.LayoutParams) animationView4.getLayoutParams()).leftMargin = i9;
        }
        anonymousClass1.addView(frameLayout);
        frameLayout.getLayoutParams().width = i110;
        frameLayout.getLayoutParams().height = i110;
        int i215 = -i10;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i215;
        int i216 = -i9;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i216;
        anonymousClass1.addView(animationView);
        animationView.getLayoutParams().width = i110;
        animationView.getLayoutParams().height = i110;
        animationView.getLayoutParams().width = i110;
        animationView.getLayoutParams().height = i110;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i215;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i216;
        frameLayout.setPivotX(i9);
        frameLayout.setPivotY(i10);
    }

    public static String getFilterForAroundAnimation() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density));
        sb.append("_");
        return Fragment$$ExternalSyntheticOutline0.m((int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density), "_nolimit_pcache", sb);
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

    public static void show(BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, BaseCell baseCell, View view, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2) {
        boolean z;
        ActionBarPopupWindow actionBarPopupWindow;
        if (baseCell == null || visibleReaction == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                show(baseFragment, null, baseCell, view, 0.0f, 0.0f, visibleReaction, i, 1);
            }
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(baseFragment.getParentActivity(), baseFragment, reactionsContainerLayout, baseCell, view, f, f2, visibleReaction, i, i2, false);
            if (i2 == 1) {
                currentShortOverlay = reactionsEffectOverlay;
            } else {
                currentOverlay = reactionsEffectOverlay;
            }
            if (baseFragment instanceof ChatActivity) {
                z = (i2 == 0 || i2 == 2) && (actionBarPopupWindow = ((ChatActivity) baseFragment).scrimPopupWindow) != null && actionBarPopupWindow.isShowing();
            }
            reactionsEffectOverlay.useWindow = z;
            AnonymousClass1 anonymousClass1 = reactionsEffectOverlay.windowView;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = baseFragment.getParentActivity().getWindowManager();
                reactionsEffectOverlay.windowManager = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, anonymousClass1, layoutParams);
                reactionsEffectOverlay.windowManager.addView(anonymousClass1, layoutParams);
            } else {
                ((FrameLayout) baseFragment.getParentActivity().getWindow().getDecorView()).addView(anonymousClass1);
            }
            baseCell.invalidate();
            if (!(baseCell instanceof ChatMessageCell) || ((ChatMessageCell) baseCell).getCurrentMessagesGroup() == null || baseCell.getParent() == null) {
                return;
            }
            ((View) baseCell.getParent()).invalidate();
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
            ViewGroup viewGroup = reactionsEffectOverlay2.cell;
            boolean z = viewGroup instanceof ChatMessageCell;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = reactionsEffectOverlay2.reaction;
            if (z) {
                ((ChatMessageCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
            } else if (viewGroup instanceof ChatActionCell) {
                ((ChatActionCell) viewGroup).reactionsLayoutInBubble.animateReaction(visibleReaction);
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
        ViewGroup viewGroup = currentShortOverlay.cell;
        if (viewGroup != null) {
            viewGroup.performHapticFeedback(3);
        }
    }

    public final void removeCurrentView() {
        try {
            boolean z = this.useWindow;
            AnonymousClass1 anonymousClass1 = this.windowView;
            if (z) {
                this.windowManager.removeView(anonymousClass1);
            } else {
                AndroidUtilities.removeFromParent(anonymousClass1);
            }
        } catch (Exception unused) {
        }
    }
}
