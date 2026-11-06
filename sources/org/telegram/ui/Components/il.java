package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class il extends AnimatorListenerAdapter {
    public final int f34695a;
    public final ChatAttachAlertPhotoLayout f34696b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f34695a = i7;
        this.f34696b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f34695a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34696b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f31220r0;
                ql qlVar = chatAttachAlertPhotoLayout.P;
                if (qlVar != null && qlVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31220r0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f31199f1.e();
                chatAttachAlertPhotoLayout.f31194d0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout.P;
                if (qlVar2 != null) {
                    qlVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f31190b0) {
                    chatAttachAlertPhotoLayout.f38948b.T3.F0();
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
                q71 q71Var = chatAttachAlertPhotoLayout.f31210l0;
                chatAttachAlertPhotoLayout.f31199f1.e();
                chatAttachAlertPhotoLayout.f31205i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f31194d0 = false;
                jl jlVar2 = chatAttachAlertPhotoLayout.E;
                if (jlVar2 != null) {
                    jlVar2.invalidate();
                }
                ql qlVar4 = chatAttachAlertPhotoLayout.P;
                if (qlVar4 != null) {
                    qlVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.f31190b0 = false;
                bi.e5 e5Var = chatAttachAlertPhotoLayout.f31206j0;
                if (e5Var != null) {
                    e5Var.setVisibility(8);
                }
                if (q71Var != null) {
                    q71Var.setVisibility(8);
                    q71Var.setTag(null);
                }
                jl jlVar3 = chatAttachAlertPhotoLayout.f31219r;
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
