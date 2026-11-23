package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class wl extends AnimatorListenerAdapter {
    public final int f41678a;
    public final ChatAttachAlertPhotoLayout f41679b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f41678a = i7;
        this.f41679b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f41678a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41679b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f32902s0;
                em emVar = chatAttachAlertPhotoLayout.Q;
                if (emVar != null && emVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32902s0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.f32892n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f32880g1.e();
                chatAttachAlertPhotoLayout.f32875e0 = false;
                em emVar2 = chatAttachAlertPhotoLayout.Q;
                if (emVar2 != null) {
                    emVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f32871c0) {
                    chatAttachAlertPhotoLayout.f37135b.X3.B0();
                }
                em emVar3 = chatAttachAlertPhotoLayout.Q;
                if (emVar3 != null) {
                    emVar3.setSystemUiVisibility(1028);
                }
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar != null) {
                    xlVar.invalidate();
                    return;
                }
                return;
            default:
                g81 g81Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.f32880g1.e();
                chatAttachAlertPhotoLayout.f32886j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f32875e0 = false;
                xl xlVar2 = chatAttachAlertPhotoLayout.F;
                if (xlVar2 != null) {
                    xlVar2.invalidate();
                }
                em emVar4 = chatAttachAlertPhotoLayout.Q;
                if (emVar4 != null) {
                    emVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.f32871c0 = false;
                bi.g3 g3Var = chatAttachAlertPhotoLayout.f32887k0;
                if (g3Var != null) {
                    g3Var.setVisibility(8);
                }
                if (g81Var != null) {
                    g81Var.setVisibility(8);
                    g81Var.setTag(null);
                }
                xl xlVar3 = chatAttachAlertPhotoLayout.f32899r;
                if (xlVar3 != null) {
                    xlVar3.setVisibility(8);
                }
                em emVar5 = chatAttachAlertPhotoLayout.Q;
                if (emVar5 != null) {
                    emVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
