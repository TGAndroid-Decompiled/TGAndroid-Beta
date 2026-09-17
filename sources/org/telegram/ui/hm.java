package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class hm implements ViewTreeObserver.OnPreDrawListener {
    public final int f34302a;
    public final Object f34303b;
    public final Object f34304c;

    public hm(int i10, Object obj, Object obj2) {
        this.f34302a = i10;
        this.f34304c = obj;
        this.f34303b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        int i10 = this.f34302a;
        Object obj = this.f34304c;
        Object obj2 = this.f34303b;
        switch (i10) {
            case 0:
                bo boVar = ((nm) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.ik0 cameraRect = boVar.f32230b3.getCameraRect();
                float f10 = imageWidth / cameraRect.f24952c;
                t1Var.getTransitionParams().f20935x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr[1])};
                org.telegram.ui.Components.p50 cameraContainer = boVar.f32230b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f10);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f10);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr[1] - cameraRect.f24951b);
                View buttonsLayout = boVar.f32230b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(boVar.f32230b3.getPaint(), org.telegram.ui.Components.q6.f27222b, 0), ObjectAnimator.ofFloat(boVar.f32230b3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr[0] - cameraRect.f24950a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                gl glVar = boVar.f32230b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.z(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((cy) obj).f32968b.f39215e0[0].f38522a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.j) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                uh.h hVar = (uh.h) obj;
                org.telegram.ui.Components.wb wbVar = hVar.W;
                if (wbVar != null) {
                    int[] iArr2 = uh.h.f43811d0;
                    wbVar.getLocationInWindow(iArr2);
                    float f11 = iArr2[0];
                    float translationY = iArr2[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.wb wbVar2 = hVar.W;
                    if (wbVar2.top) {
                        f7 = wbVar2.getTopOffset();
                    } else {
                        f7 = -wbVar2.getBottomOffset();
                    }
                    hVar.f43814a.getLocationInWindow(iArr2);
                    hVar.X = (hVar.W.f29622a.getMeasuredWidth() / 2.0f) + (f11 - iArr2[0]) + hVar.W.f29622a.getLeft();
                    hVar.Y = (hVar.W.f29622a.getMeasuredHeight() / 2.0f) + ((translationY + f7) - iArr2[1]) + hVar.W.f29622a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
