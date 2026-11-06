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
public final class hl implements ViewTreeObserver.OnPreDrawListener {
    public final int f46382a;
    public final org.telegram.ui.Cells.q1 f46383b;
    public final jl f46384c;

    public hl(jl jlVar, org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.f46382a = i7;
        this.f46384c = jlVar;
        this.f46383b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f10;
        int i7 = this.f46382a;
        org.telegram.ui.Cells.q1 q1Var = this.f46383b;
        float f11 = 0.0f;
        jl jlVar = this.f46384c;
        switch (i7) {
            case 0:
                an anVar = jlVar.Q;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f12 = photoImage.M0;
                RectF cameraRect = anVar.f43887p3.getCameraRect();
                float width = f12 / cameraRect.width();
                q1Var.getTransitionParams().f30862y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                q1Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.K0 - q1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.L0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.q40 cameraContainer = anVar.f43887p3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = anVar.f43887p3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(anVar.f43887p3.getPaint(), org.telegram.ui.Components.m6.f35936b, 0), ObjectAnimator.ofFloat(anVar.f43887p3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f40310f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.t40 t40Var = anVar.f43887p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ah.l(17, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                an anVar2 = jlVar.Q;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.ej ejVar = q1Var.getMessageObject().L1;
                if (ejVar != null) {
                    anVar2.D6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = photoImage2.M0;
                    if (ejVar.h) {
                        f10 = 1.0f;
                    } else {
                        f10 = ejVar.f22215c / f13;
                    }
                    q1Var.getTransitionParams().f30862y0 = true;
                    q1Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - q1Var.getTranslationY())};
                    if (anVar2.Z.z0()) {
                        iArr3[1] = org.telegram.messenger.g0.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    q0 q0Var = new q0("p1", 3);
                    il ilVar = new il(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(ejVar, q0Var, f10, 1.0f), ObjectAnimator.ofFloat(ejVar, new il(this, 1), 0.0f, 1.0f));
                    float f14 = ejVar.f22213a;
                    float f15 = iArr3[0];
                    if (!ejVar.h) {
                        f11 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(ejVar, ilVar, f14, f15 + f11), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new va(this, 7));
                    animatorSet3.start();
                    il ilVar2 = new il(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(ejVar, ilVar2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
