package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class yl extends AnimatorListenerAdapter {
    public final int f42453a;
    public final ChatAttachAlertPhotoLayout f42454b;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f42453a = i7;
        this.f42454b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f42453a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42454b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f32838s0;
                gm gmVar = chatAttachAlertPhotoLayout.Q;
                if (gmVar != null && gmVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32838s0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.f32828n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f32816g1.e();
                chatAttachAlertPhotoLayout.f32811e0 = false;
                gm gmVar2 = chatAttachAlertPhotoLayout.Q;
                if (gmVar2 != null) {
                    gmVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f32807c0) {
                    chatAttachAlertPhotoLayout.f37519b.X3.K0();
                }
                gm gmVar3 = chatAttachAlertPhotoLayout.Q;
                if (gmVar3 != null) {
                    gmVar3.setSystemUiVisibility(1028);
                }
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (zlVar != null) {
                    zlVar.invalidate();
                    return;
                }
                return;
            default:
                f81 f81Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.f32816g1.e();
                chatAttachAlertPhotoLayout.f32822j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f32811e0 = false;
                zl zlVar2 = chatAttachAlertPhotoLayout.F;
                if (zlVar2 != null) {
                    zlVar2.invalidate();
                }
                gm gmVar4 = chatAttachAlertPhotoLayout.Q;
                if (gmVar4 != null) {
                    gmVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.f32807c0 = false;
                bi.e3 e3Var = chatAttachAlertPhotoLayout.f32823k0;
                if (e3Var != null) {
                    e3Var.setVisibility(8);
                }
                if (f81Var != null) {
                    f81Var.setVisibility(8);
                    f81Var.setTag(null);
                }
                zl zlVar3 = chatAttachAlertPhotoLayout.f32835r;
                if (zlVar3 != null) {
                    zlVar3.setVisibility(8);
                }
                gm gmVar5 = chatAttachAlertPhotoLayout.Q;
                if (gmVar5 != null) {
                    gmVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
