package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
public final class dm implements ViewTreeObserver.OnPreDrawListener {
    public final int f36798a;
    public final org.telegram.ui.Cells.q1 f36799b;
    public final fm f36800c;

    public dm(fm fmVar, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.f36798a = i10;
        this.f36800c = fmVar;
        this.f36799b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f7;
        int i10 = this.f36798a;
        org.telegram.ui.Cells.q1 q1Var = this.f36799b;
        float f10 = 0.0f;
        fm fmVar = this.f36800c;
        switch (i10) {
            case 0:
                un unVar = fmVar.Q;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f11 = photoImage.M0;
                RectF cameraRect = unVar.f42370p3.getCameraRect();
                float width = f11 / cameraRect.width();
                q1Var.getTransitionParams().f23558y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                q1Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.K0 - q1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.L0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.g50 cameraContainer = unVar.f42370p3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = unVar.f42370p3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(unVar.f42370p3.getPaint(), org.telegram.ui.Components.i6.f26888b, 0), ObjectAnimator.ofFloat(unVar.f42370p3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.j50 j50Var = unVar.f42370p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bg.f(12, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                un unVar2 = fmVar.Q;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.fj fjVar = q1Var.getMessageObject().L1;
                if (fjVar != null) {
                    unVar2.D6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f12 = photoImage2.M0;
                    if (fjVar.h) {
                        f7 = 1.0f;
                    } else {
                        f7 = fjVar.f15579c / f12;
                    }
                    q1Var.getTransitionParams().f23558y0 = true;
                    q1Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - q1Var.getTranslationY())};
                    if (unVar2.Z.x0()) {
                        iArr3[1] = org.telegram.messenger.i0.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    s0 s0Var = new s0("p1", 3);
                    em emVar = new em(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(fjVar, s0Var, f7, 1.0f), ObjectAnimator.ofFloat(fjVar, new em(this, 1), 0.0f, 1.0f));
                    float f13 = fjVar.f15577a;
                    float f14 = iArr3[0];
                    if (!fjVar.h) {
                        f10 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(fjVar, emVar, f13, f14 + f10), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new s9(this, 19));
                    animatorSet3.start();
                    em emVar2 = new em(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(fjVar, emVar2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
