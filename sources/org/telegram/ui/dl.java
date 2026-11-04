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
public final class dl implements ViewTreeObserver.OnPreDrawListener {
    public final int f44731a;
    public final org.telegram.ui.Cells.q1 f44732b;
    public final fl f44733c;

    public dl(fl flVar, org.telegram.ui.Cells.q1 q1Var, int i3) {
        this.f44731a = i3;
        this.f44733c = flVar;
        this.f44732b = q1Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f10;
        int i3 = this.f44731a;
        org.telegram.ui.Cells.q1 q1Var = this.f44732b;
        float f11 = 0.0f;
        fl flVar = this.f44733c;
        switch (i3) {
            case 0:
                wm wmVar = flVar.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f12 = photoImage.N0;
                RectF cameraRect = wmVar.f51448q3.getCameraRect();
                float width = f12 / cameraRect.width();
                q1Var.getTransitionParams().f30940y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                q1Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - q1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + iArr2[1])};
                org.telegram.ui.Components.m40 cameraContainer = wmVar.f51448q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = wmVar.f51448q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(wmVar.f51448q3.getPaint(), org.telegram.ui.Components.k6.f35323b, 0), ObjectAnimator.ofFloat(wmVar.f51448q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bh.j(16, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                wm wmVar2 = flVar.R;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.vi viVar = q1Var.getMessageObject().L1;
                if (viVar != null) {
                    wmVar2.E6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = photoImage2.N0;
                    if (viVar.h) {
                        f10 = 1.0f;
                    } else {
                        f10 = viVar.f25884c / f13;
                    }
                    q1Var.getTransitionParams().f30940y0 = true;
                    q1Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - q1Var.getTranslationY())};
                    if (wmVar2.f51237a0.y0()) {
                        iArr3[1] = org.telegram.messenger.g0.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    r0 r0Var = new r0("p1", 3);
                    el elVar = new el(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(viVar, r0Var, f10, 1.0f), ObjectAnimator.ofFloat(viVar, new el(this, 1), 0.0f, 1.0f));
                    float f14 = viVar.f25882a;
                    float f15 = iArr3[0];
                    if (!viVar.h) {
                        f11 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(viVar, elVar, f14, f15 + f11), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new org.telegram.ui.Cells.w9(this, 8));
                    animatorSet3.start();
                    el elVar2 = new el(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(viVar, elVar2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
