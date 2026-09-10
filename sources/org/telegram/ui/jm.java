package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class jm implements ViewTreeObserver.OnPreDrawListener {
    public final int f34133a;
    public final Object f34134b;
    public final Object f34135c;

    public jm(int i10, Object obj, Object obj2) {
        this.f34133a = i10;
        this.f34135c = obj;
        this.f34134b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        int i10 = this.f34133a;
        Object obj = this.f34135c;
        Object obj2 = this.f34134b;
        switch (i10) {
            case 0:
                eo eoVar = ((pm) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.rk0 cameraRect = eoVar.f32271b3.getCameraRect();
                float f10 = imageWidth / cameraRect.f26683c;
                t1Var.getTransitionParams().f20016x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr[1])};
                org.telegram.ui.Components.z50 cameraContainer = eoVar.f32271b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f10);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f10);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr[1] - cameraRect.f26682b);
                View buttonsLayout = eoVar.f32271b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(eoVar.f32271b3.getPaint(), org.telegram.ui.Components.r6.f26600b, 0), ObjectAnimator.ofFloat(eoVar.f32271b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr[0] - cameraRect.f26681a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                il ilVar = eoVar.f32271b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bi.u3(12, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((cy) obj).f31787b.f38431e0[0].f37645a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((bi.va) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                th.i iVar = (th.i) obj;
                org.telegram.ui.Components.xb xbVar = iVar.W;
                if (xbVar != null) {
                    int[] iArr2 = th.i.f42225d0;
                    xbVar.getLocationInWindow(iArr2);
                    float f11 = iArr2[0];
                    float translationY = iArr2[1] - iVar.W.getTranslationY();
                    org.telegram.ui.Components.xb xbVar2 = iVar.W;
                    if (xbVar2.top) {
                        f7 = xbVar2.getTopOffset();
                    } else {
                        f7 = -xbVar2.getBottomOffset();
                    }
                    iVar.f42228a.getLocationInWindow(iArr2);
                    iVar.X = (iVar.W.f28999a.getMeasuredWidth() / 2.0f) + (f11 - iArr2[0]) + iVar.W.f28999a.getLeft();
                    iVar.Y = (iVar.W.f28999a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr2[1]) + iVar.W.f28999a.getTop();
                }
                iVar.c();
                return true;
        }
    }
}
