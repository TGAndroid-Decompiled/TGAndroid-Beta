package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class em implements ViewTreeObserver.OnPreDrawListener {
    public final int f32971a;
    public final Object f32972b;
    public final Object f32973c;

    public em(int i10, Object obj, Object obj2) {
        this.f32971a = i10;
        this.f32973c = obj;
        this.f32972b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        int i10 = this.f32971a;
        Object obj = this.f32973c;
        Object obj2 = this.f32972b;
        switch (i10) {
            case 0:
                xn xnVar = ((km) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.ik0 cameraRect = xnVar.f39325b3.getCameraRect();
                float f10 = imageWidth / cameraRect.f24990c;
                t1Var.getTransitionParams().f20890x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr[1])};
                org.telegram.ui.Components.q50 cameraContainer = xnVar.f39325b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f10);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f10);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr[1] - cameraRect.f24989b);
                View buttonsLayout = xnVar.f39325b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(xnVar.f39325b3.getPaint(), org.telegram.ui.Components.s6.f27835b, 0), ObjectAnimator.ofFloat(xnVar.f39325b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.rr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr[0] - cameraRect.f24988a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                dl dlVar = xnVar.f39325b3;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.z(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((wx) obj).f39123b.f36978e0[0].f36629a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.j) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                uh.h hVar = (uh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr2 = uh.h.f43737d0;
                    ybVar.getLocationInWindow(iArr2);
                    float f11 = iArr2[0];
                    float translationY = iArr2[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    if (ybVar2.top) {
                        f7 = ybVar2.getTopOffset();
                    } else {
                        f7 = -ybVar2.getBottomOffset();
                    }
                    hVar.f43740a.getLocationInWindow(iArr2);
                    hVar.X = (hVar.W.f30191a.getMeasuredWidth() / 2.0f) + (f11 - iArr2[0]) + hVar.W.f30191a.getLeft();
                    hVar.Y = (hVar.W.f30191a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr2[1]) + hVar.W.f30191a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
