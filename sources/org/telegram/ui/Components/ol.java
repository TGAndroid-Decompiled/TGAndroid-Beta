package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class ol extends AnimatorListenerAdapter {
    public final int f29161a;
    public final ChatAttachAlertPhotoLayout f29162b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29161a = i10;
        this.f29162b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11 = this.f29161a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29162b;
        switch (i11) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f23884r0;
                yl ylVar = chatAttachAlertPhotoLayout.P;
                if (ylVar != null && ylVar.isFrontface()) {
                    i10 = 2131230929;
                } else {
                    i10 = 2131230930;
                }
                imageView.setImageResource(i10);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23884r0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f23862f1.e();
                chatAttachAlertPhotoLayout.f23857d0 = false;
                yl ylVar2 = chatAttachAlertPhotoLayout.P;
                if (ylVar2 != null) {
                    ylVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f23853b0) {
                    chatAttachAlertPhotoLayout.f30964b.T3.j0();
                }
                yl ylVar3 = chatAttachAlertPhotoLayout.P;
                if (ylVar3 != null) {
                    ylVar3.setSystemUiVisibility(1028);
                }
                pl plVar = chatAttachAlertPhotoLayout.E;
                if (plVar != null) {
                    plVar.invalidate();
                    return;
                }
                return;
            default:
                t81 t81Var = chatAttachAlertPhotoLayout.f23873l0;
                chatAttachAlertPhotoLayout.f23862f1.e();
                chatAttachAlertPhotoLayout.f23868i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f23857d0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.E;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                yl ylVar4 = chatAttachAlertPhotoLayout.P;
                if (ylVar4 != null) {
                    ylVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.f23853b0 = false;
                jg.l0 l0Var = chatAttachAlertPhotoLayout.f23869j0;
                if (l0Var != null) {
                    l0Var.setVisibility(8);
                }
                if (t81Var != null) {
                    t81Var.setVisibility(8);
                    t81Var.setTag(null);
                }
                pl plVar3 = chatAttachAlertPhotoLayout.f23883r;
                if (plVar3 != null) {
                    plVar3.setVisibility(8);
                }
                yl ylVar5 = chatAttachAlertPhotoLayout.P;
                if (ylVar5 != null) {
                    ylVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
