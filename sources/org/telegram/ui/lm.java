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
public final class lm implements ViewTreeObserver.OnPreDrawListener {
    public final int f38048a;
    public final Object f38049b;
    public final Object f38050c;

    public lm(int i10, Object obj, Object obj2) {
        this.f38048a = i10;
        this.f38050c = obj;
        this.f38049b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f38048a;
        Object obj = this.f38050c;
        Object obj2 = this.f38049b;
        switch (i10) {
            case 0:
                fo foVar = ((rm) obj).Q;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = u1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = foVar.f35887b3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                u1Var.getTransitionParams().f22061x0 = true;
                u1Var.setAlpha(0.0f);
                u1Var.setTimeAlpha(0.0f);
                u1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - u1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + u1Var.getPaddingTop()) - u1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.r60 cameraContainer = foVar.f35887b3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = foVar.f35887b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(foVar.f35887b3.getPaint(), org.telegram.ui.Components.v6.f29900b, 0), ObjectAnimator.ofFloat(foVar.f35887b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.es.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.es.f24771f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.u60 u60Var = foVar.f35887b3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bi.t(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((ey) obj).f35690b.f42325e0[0].f41980a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((bi.g) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vh.h hVar = (vh.h) obj;
                org.telegram.ui.Components.ac acVar = hVar.W;
                if (acVar != null) {
                    int[] iArr3 = vh.h.f47041d0;
                    acVar.getLocationInWindow(iArr3);
                    float f10 = iArr3[0];
                    float translationY = iArr3[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.ac acVar2 = hVar.W;
                    if (acVar2.top) {
                        f7 = acVar2.getTopOffset();
                    } else {
                        f7 = -acVar2.getBottomOffset();
                    }
                    hVar.f47044a.getLocationInWindow(iArr3);
                    hVar.X = (hVar.W.f23512a.getMeasuredWidth() / 2.0f) + (f10 - iArr3[0]) + hVar.W.f23512a.getLeft();
                    hVar.Y = (hVar.W.f23512a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr3[1]) + hVar.W.f23512a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
