package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class hl extends AnimatorListenerAdapter {
    public final int f34401a;
    public final ChatAttachAlertPhotoLayout f34402b;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f34401a = i7;
        this.f34402b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10 = this.f34401a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34402b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f31241r0;
                pl plVar = chatAttachAlertPhotoLayout.P;
                if (plVar != null && plVar.isFrontface()) {
                    i7 = 2131230929;
                } else {
                    i7 = 2131230930;
                }
                imageView.setImageResource(i7);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31241r0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.m0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f31220f1.e();
                chatAttachAlertPhotoLayout.f31215d0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.P;
                if (plVar2 != null) {
                    plVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f31211b0) {
                    chatAttachAlertPhotoLayout.f38656b.W3.F0();
                }
                pl plVar3 = chatAttachAlertPhotoLayout.P;
                if (plVar3 != null) {
                    plVar3.setSystemUiVisibility(1028);
                }
                il ilVar = chatAttachAlertPhotoLayout.E;
                if (ilVar != null) {
                    ilVar.invalidate();
                    return;
                }
                return;
            default:
                r71 r71Var = chatAttachAlertPhotoLayout.f31231l0;
                chatAttachAlertPhotoLayout.f31220f1.e();
                chatAttachAlertPhotoLayout.f31226i1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f31215d0 = false;
                il ilVar2 = chatAttachAlertPhotoLayout.E;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                pl plVar4 = chatAttachAlertPhotoLayout.P;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                chatAttachAlertPhotoLayout.f31211b0 = false;
                bi.e5 e5Var = chatAttachAlertPhotoLayout.f31227j0;
                if (e5Var != null) {
                    e5Var.setVisibility(8);
                }
                if (r71Var != null) {
                    r71Var.setVisibility(8);
                    r71Var.setTag(null);
                }
                il ilVar3 = chatAttachAlertPhotoLayout.f31240r;
                if (ilVar3 != null) {
                    ilVar3.setVisibility(8);
                }
                pl plVar5 = chatAttachAlertPhotoLayout.P;
                if (plVar5 != null) {
                    plVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
