package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class pl extends AnimatorListenerAdapter {
    public final int f38325a;
    public final ChatAttachAlertPhotoLayout f38326b;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f38325a = i7;
        this.f38326b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f38325a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38326b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f32405s0;
                xl xlVar = chatAttachAlertPhotoLayout.Q;
                if (xlVar != null && xlVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32405s0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.f32395n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f32383g1.e();
                chatAttachAlertPhotoLayout.f32378e0 = false;
                xl xlVar2 = chatAttachAlertPhotoLayout.Q;
                if (xlVar2 != null) {
                    xlVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f32374c0) {
                    chatAttachAlertPhotoLayout.f33607b.X3.K0();
                }
                xl xlVar3 = chatAttachAlertPhotoLayout.Q;
                if (xlVar3 != null) {
                    xlVar3.setSystemUiVisibility(1028);
                }
                ql qlVar = chatAttachAlertPhotoLayout.F;
                if (qlVar != null) {
                    qlVar.invalidate();
                    return;
                }
                return;
            default:
                s71 s71Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.f32383g1.e();
                chatAttachAlertPhotoLayout.f32389j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f32378e0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout.F;
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
                xl xlVar4 = chatAttachAlertPhotoLayout.Q;
                if (xlVar4 != null) {
                    xlVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.f32374c0 = false;
                bi.g2 g2Var = chatAttachAlertPhotoLayout.f32390k0;
                if (g2Var != null) {
                    g2Var.setVisibility(8);
                }
                if (s71Var != null) {
                    s71Var.setVisibility(8);
                    s71Var.setTag(null);
                }
                ql qlVar3 = chatAttachAlertPhotoLayout.f32402r;
                if (qlVar3 != null) {
                    qlVar3.setVisibility(8);
                }
                xl xlVar5 = chatAttachAlertPhotoLayout.Q;
                if (xlVar5 != null) {
                    xlVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
