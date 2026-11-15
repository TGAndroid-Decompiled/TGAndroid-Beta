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
    public final int f47736a;
    public final org.telegram.ui.Cells.q1 f47737b;
    public final jl f47738c;

    public hl(jl jlVar, org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.f47736a = i7;
        this.f47738c = jlVar;
        this.f47737b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f10;
        int i7 = this.f47736a;
        org.telegram.ui.Cells.q1 q1Var = this.f47737b;
        float f11 = 0.0f;
        jl jlVar = this.f47738c;
        switch (i7) {
            case 0:
                an anVar = jlVar.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f12 = photoImage.N0;
                RectF cameraRect = anVar.f45329q3.getCameraRect();
                float width = f12 / cameraRect.width();
                q1Var.getTransitionParams().f32016y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                q1Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - q1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.t40 cameraContainer = anVar.f45329q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = anVar.f45329q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(anVar.f45329q3.getPaint(), org.telegram.ui.Components.k6.f36298b, 0), ObjectAnimator.ofFloat(anVar.f45329q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.er.f34420f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.w40 w40Var = anVar.f45329q3;
                if (w40Var != null) {
                    w40Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ah.l(17, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                an anVar2 = jlVar.R;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.cj cjVar = q1Var.getMessageObject().N1;
                if (cjVar != null) {
                    anVar2.E6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = photoImage2.N0;
                    if (cjVar.h) {
                        f10 = 1.0f;
                    } else {
                        f10 = cjVar.f22887c / f13;
                    }
                    q1Var.getTransitionParams().f32016y0 = true;
                    q1Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - q1Var.getTranslationY())};
                    if (anVar2.f45118a0.N0()) {
                        iArr3[1] = org.telegram.messenger.g0.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    q0 q0Var = new q0("p1", 3);
                    il ilVar = new il(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(cjVar, q0Var, f10, 1.0f), ObjectAnimator.ofFloat(cjVar, new il(this, 1), 0.0f, 1.0f));
                    float f14 = cjVar.f22885a;
                    float f15 = iArr3[0];
                    if (!cjVar.h) {
                        f11 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(cjVar, ilVar, f14, f15 + f11), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.er.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new org.telegram.ui.Cells.w9(this, 8));
                    animatorSet3.start();
                    il ilVar2 = new il(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(cjVar, ilVar2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
