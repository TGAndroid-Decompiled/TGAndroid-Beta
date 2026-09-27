package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class em implements ViewTreeObserver.OnPreDrawListener {
    public final int f33285a;
    public final Object f33286b;
    public final Object f33287c;

    public em(int i10, Object obj, Object obj2) {
        this.f33285a = i10;
        this.f33287c = obj;
        this.f33286b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f33285a;
        Object obj = this.f33287c;
        Object obj2 = this.f33286b;
        switch (i10) {
            case 0:
                xn xnVar = ((km) obj).Q;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = u1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = xnVar.f39705b3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                u1Var.getTransitionParams().f21176x0 = true;
                u1Var.setAlpha(0.0f);
                u1Var.setTimeAlpha(0.0f);
                u1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - u1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + u1Var.getPaddingTop()) - u1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.g60 cameraContainer = xnVar.f39705b3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = xnVar.f39705b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(xnVar.f39705b3.getPaint(), org.telegram.ui.Components.s6.f28173b, 0), ObjectAnimator.ofFloat(xnVar.f39705b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.sr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
                if (j60Var != null) {
                    j60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.z(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((zx) obj).f40604a.f37976e0[0].f37593a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.j) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                uh.h hVar = (uh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr3 = uh.h.f44120d0;
                    ybVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    if (ybVar2.top) {
                        f7 = ybVar2.getTopOffset();
                    } else {
                        f7 = -ybVar2.getBottomOffset();
                    }
                    hVar.f44123a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f30641a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f30641a.getLeft();
                    hVar.Y = (hVar.W.f30641a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f30641a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
