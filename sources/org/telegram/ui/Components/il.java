package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class il extends AnimatorListenerAdapter {
    public final int f34801a;
    public final ChatAttachAlertPhotoLayout f34802b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f34801a = i7;
        this.f34802b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f34801a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34802b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f31230r0;
                ql qlVar = chatAttachAlertPhotoLayout.P;
                if (qlVar != null && qlVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31230r0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f31209f1.e();
                chatAttachAlertPhotoLayout.f31204d0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout.P;
                if (qlVar2 != null) {
                    qlVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f31200b0) {
                    chatAttachAlertPhotoLayout.f39071b.T3.F0();
                }
                ql qlVar3 = chatAttachAlertPhotoLayout.P;
                if (qlVar3 != null) {
                    qlVar3.setSystemUiVisibility(1028);
                }
                jl jlVar = chatAttachAlertPhotoLayout.E;
                if (jlVar != null) {
                    jlVar.invalidate();
                    return;
                }
                return;
            default:
                s71 s71Var = chatAttachAlertPhotoLayout.f31220l0;
                chatAttachAlertPhotoLayout.f31209f1.e();
                chatAttachAlertPhotoLayout.f31215i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f31204d0 = false;
                jl jlVar2 = chatAttachAlertPhotoLayout.E;
                if (jlVar2 != null) {
                    jlVar2.invalidate();
                }
                ql qlVar4 = chatAttachAlertPhotoLayout.P;
                if (qlVar4 != null) {
                    qlVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.f31200b0 = false;
                bi.e5 e5Var = chatAttachAlertPhotoLayout.f31216j0;
                if (e5Var != null) {
                    e5Var.setVisibility(8);
                }
                if (s71Var != null) {
                    s71Var.setVisibility(8);
                    s71Var.setTag(null);
                }
                jl jlVar3 = chatAttachAlertPhotoLayout.f31229r;
                if (jlVar3 != null) {
                    jlVar3.setVisibility(8);
                }
                ql qlVar5 = chatAttachAlertPhotoLayout.P;
                if (qlVar5 != null) {
                    qlVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
