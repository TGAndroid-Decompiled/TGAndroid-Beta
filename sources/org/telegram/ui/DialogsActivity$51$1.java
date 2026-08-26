package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;

public final class DialogsActivity$51$1 implements ViewTreeObserver.OnPreDrawListener {
    public final int $r8$classId;
    public final Object this$1;
    public final Object val$runnable;

    public DialogsActivity$51$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$1 = obj;
        this.val$runnable = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        Object obj = this.this$1;
        Object obj2 = this.val$runnable;
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.this.viewPages[0].listView.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((LinkManager$3$$ExternalSyntheticLambda0) obj2, 100L);
                return false;
            case 1:
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.instance;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.showTemporary(true);
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj2;
                chatMessageCell.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                ChatActivity chatActivity = ChatActivity.this;
                RectOld cameraRect = chatActivity.instantCameraView.getCameraRect();
                float f = imageWidth / cameraRect.width;
                chatMessageCell.getTransitionParams().ignoreAlpha = true;
                chatMessageCell.setAlpha(0.0f);
                chatMessageCell.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.getImageX() - chatMessageCell.getAnimationOffsetX()) + f), (int) (((photoImage.getImageY() + chatMessageCell.getPaddingTop()) - chatMessageCell.getTranslationY()) + f)};
                chatMessageCell.getLocationOnScreen(iArr);
                float f2 = iArr[0];
                float f3 = iArr[1];
                InstantCameraView.InstantViewCameraContainer cameraContainer = chatActivity.instantCameraView.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.SCALE_X, f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.SCALE_Y, f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.y);
                View buttonsLayout = chatActivity.instantCameraView.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(chatActivity.instantCameraView.getPaint(), AnimationProperties.PAINT_ALPHA, 0), ObjectAnimator.ofFloat(chatActivity.instantCameraView.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<InstantCameraView.InstantViewCameraContainer, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.x);
                objectAnimatorOfFloat4.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet2.playTogether(objectAnimatorOfFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                ChatActivity.AnonymousClass62 anonymousClass62 = chatActivity.instantCameraView;
                if (anonymousClass62 != null) {
                    anonymousClass62.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ChatActivity.AnonymousClass74(this, cameraContainer, false, 7));
                animatorSet2.start();
                return true;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) obj;
                Bulletin.LottieLayout lottieLayout = quickShareSelectorDrawable.bulletinLayout;
                if (lottieLayout != null) {
                    int[] iArr2 = QuickShareSelectorDrawable.tmpCords;
                    lottieLayout.getLocationInWindow(iArr2);
                    float f4 = iArr2[0];
                    float translationY = iArr2[1] - quickShareSelectorDrawable.bulletinLayout.getTranslationY();
                    Bulletin.LottieLayout lottieLayout2 = quickShareSelectorDrawable.bulletinLayout;
                    float topOffset = lottieLayout2.top ? lottieLayout2.getTopOffset() : -lottieLayout2.getBottomOffset();
                    quickShareSelectorDrawable.parent.getLocationInWindow(iArr2);
                    float f5 = iArr2[0];
                    float f6 = iArr2[1];
                    quickShareSelectorDrawable.bulletinImageCx = (quickShareSelectorDrawable.bulletinLayout.imageView.getMeasuredWidth() / 2.0f) + (f4 - f5) + quickShareSelectorDrawable.bulletinLayout.imageView.getLeft();
                    quickShareSelectorDrawable.bulletinImageCy = (quickShareSelectorDrawable.bulletinLayout.imageView.getMeasuredHeight() / 2.0f) + ((translationY + topOffset) - f6) + quickShareSelectorDrawable.bulletinLayout.imageView.getTop();
                }
                quickShareSelectorDrawable.closeImpl();
                return true;
        }
    }
}
