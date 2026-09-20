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
public final class fm implements ViewTreeObserver.OnPreDrawListener {
    public final int f33690a;
    public final Object f33691b;
    public final Object f33692c;

    public fm(int i10, Object obj, Object obj2) {
        this.f33690a = i10;
        this.f33692c = obj;
        this.f33691b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f33690a;
        Object obj = this.f33692c;
        Object obj2 = this.f33691b;
        switch (i10) {
            case 0:
                zn znVar = ((lm) obj).Q;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = u1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = znVar.f40258b3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                u1Var.getTransitionParams().f21177x0 = true;
                u1Var.setAlpha(0.0f);
                u1Var.setTimeAlpha(0.0f);
                u1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - u1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + u1Var.getPaddingTop()) - u1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.c60 cameraContainer = znVar.f40258b3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = znVar.f40258b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(znVar.f40258b3.getPaint(), org.telegram.ui.Components.r6.f27780b, 0), ObjectAnimator.ofFloat(znVar.f40258b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.e60 e60Var = znVar.f40258b3;
                if (e60Var != null) {
                    e60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.z(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((zx) obj).f40627b.f38256e0[0].f37904a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.j) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                uh.h hVar = (uh.h) obj;
                org.telegram.ui.Components.xb xbVar = hVar.W;
                if (xbVar != null) {
                    int[] iArr3 = uh.h.f44090d0;
                    xbVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.xb xbVar2 = hVar.W;
                    if (xbVar2.top) {
                        f7 = xbVar2.getTopOffset();
                    } else {
                        f7 = -xbVar2.getBottomOffset();
                    }
                    hVar.f44093a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f30221a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f30221a.getLeft();
                    hVar.Y = (hVar.W.f30221a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f30221a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
