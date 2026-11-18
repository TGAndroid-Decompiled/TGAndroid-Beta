package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class wl extends AnimatorListenerAdapter {
    public final int f41735a;
    public final ChatAttachAlertPhotoLayout f41736b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f41735a = i7;
        this.f41736b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f41735a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41736b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f32802s0;
                em emVar = chatAttachAlertPhotoLayout.Q;
                if (emVar != null && emVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32802s0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.f32792n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f32780g1.e();
                chatAttachAlertPhotoLayout.f32775e0 = false;
                em emVar2 = chatAttachAlertPhotoLayout.Q;
                if (emVar2 != null) {
                    emVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f32771c0) {
                    chatAttachAlertPhotoLayout.f36766b.X3.K0();
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
                c81 c81Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.f32780g1.e();
                chatAttachAlertPhotoLayout.f32786j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f32775e0 = false;
                xl xlVar2 = chatAttachAlertPhotoLayout.F;
                if (xlVar2 != null) {
                    xlVar2.invalidate();
                }
                em emVar4 = chatAttachAlertPhotoLayout.Q;
                if (emVar4 != null) {
                    emVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.f32771c0 = false;
                bi.a3 a3Var = chatAttachAlertPhotoLayout.f32787k0;
                if (a3Var != null) {
                    a3Var.setVisibility(8);
                }
                if (c81Var != null) {
                    c81Var.setVisibility(8);
                    c81Var.setTag(null);
                }
                xl xlVar3 = chatAttachAlertPhotoLayout.f32799r;
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
