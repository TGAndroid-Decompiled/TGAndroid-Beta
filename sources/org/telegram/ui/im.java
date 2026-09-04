package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class im implements ViewTreeObserver.OnPreDrawListener {
    public final int f37402a;
    public final Object f37403b;
    public final Object f37404c;

    public im(int i10, Object obj, Object obj2) {
        this.f37402a = i10;
        this.f37404c = obj;
        this.f37403b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        int i10 = this.f37402a;
        Object obj = this.f37404c;
        Object obj2 = this.f37403b;
        switch (i10) {
            case 0:
                co coVar = ((om) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.hk0 cameraRect = coVar.f35201b3.getCameraRect();
                float f10 = imageWidth / cameraRect.f26745c;
                t1Var.getTransitionParams().f22806x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr[1])};
                org.telegram.ui.Components.p50 cameraContainer = coVar.f35201b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f10);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f10);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr[1] - cameraRect.f26744b);
                View buttonsLayout = coVar.f35201b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(coVar.f35201b3.getPaint(), org.telegram.ui.Components.t6.f30536b, 0), ObjectAnimator.ofFloat(coVar.f35201b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr[0] - cameraRect.f26743a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.pr.f29466f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                gl glVar = coVar.f35201b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bi.t(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((zx) obj).f43570b.f41259e0[0].f40858a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((bi.g) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vh.h hVar = (vh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr2 = vh.h.f47879d0;
                    ybVar.getLocationInWindow(iArr2);
                    float f11 = iArr2[0];
                    float translationY = iArr2[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    if (ybVar2.top) {
                        f7 = ybVar2.getTopOffset();
                    } else {
                        f7 = -ybVar2.getBottomOffset();
                    }
                    hVar.f47882a.getLocationInWindow(iArr2);
                    hVar.X = (hVar.W.f32875a.getMeasuredWidth() / 2.0f) + (f11 - iArr2[0]) + hVar.W.f32875a.getLeft();
                    hVar.Y = (hVar.W.f32875a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr2[1]) + hVar.W.f32875a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
