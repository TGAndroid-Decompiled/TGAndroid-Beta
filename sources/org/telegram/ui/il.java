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
public final class il implements ViewTreeObserver.OnPreDrawListener {
    public final int f48747a;
    public final org.telegram.ui.Cells.q1 f48748b;
    public final kl f48749c;

    public il(kl klVar, org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.f48747a = i7;
        this.f48749c = klVar;
        this.f48748b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f10;
        int i7 = this.f48747a;
        org.telegram.ui.Cells.q1 q1Var = this.f48748b;
        float f11 = 0.0f;
        kl klVar = this.f48749c;
        switch (i7) {
            case 0:
                bn bnVar = klVar.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f12 = photoImage.N0;
                RectF cameraRect = bnVar.f46144q3.getCameraRect();
                float width = f12 / cameraRect.width();
                q1Var.getTransitionParams().f32399y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                q1Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - q1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.b50 cameraContainer = bnVar.f46144q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = bnVar.f46144q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(bnVar.f46144q3.getPaint(), org.telegram.ui.Components.q6.f38712b, 0), ObjectAnimator.ofFloat(bnVar.f46144q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.lr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.e50 e50Var = bnVar.f46144q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ah.l(17, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                bn bnVar2 = klVar.R;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.bj bjVar = q1Var.getMessageObject().N1;
                if (bjVar != null) {
                    bnVar2.F6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = photoImage2.N0;
                    if (bjVar.h) {
                        f10 = 1.0f;
                    } else {
                        f10 = bjVar.f23084c / f13;
                    }
                    q1Var.getTransitionParams().f32399y0 = true;
                    q1Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - q1Var.getTranslationY())};
                    if (bnVar2.f45932a0.V0()) {
                        iArr3[1] = org.telegram.messenger.g0.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    q0 q0Var = new q0("p1", 3);
                    jl jlVar = new jl(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(bjVar, q0Var, f10, 1.0f), ObjectAnimator.ofFloat(bjVar, new jl(this, 1), 0.0f, 1.0f));
                    float f14 = bjVar.f23082a;
                    float f15 = iArr3[0];
                    if (!bjVar.h) {
                        f11 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(bjVar, jlVar, f14, f15 + f11), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.lr.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new org.telegram.ui.Cells.x9(this, 8));
                    animatorSet3.start();
                    jl jlVar2 = new jl(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(bjVar, jlVar2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
