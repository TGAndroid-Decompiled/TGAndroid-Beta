package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
public final class hl extends AnimatorListenerAdapter {
    public final int f34440a;
    public final ChatAttachAlertPhotoLayout f34441b;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.f34440a = i3;
        this.f34441b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10 = this.f34440a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34441b;
        switch (i10) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.f31298s0;
                pl plVar = chatAttachAlertPhotoLayout.Q;
                if (plVar != null && plVar.isFrontface()) {
                    i3 = 2131230929;
                } else {
                    i3 = 2131230930;
                }
                imageView.setImageResource(i3);
                ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31298s0, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.f31287n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.f31276g1.e();
                chatAttachAlertPhotoLayout.f31271e0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout.Q;
                if (plVar2 != null) {
                    plVar2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f31267c0) {
                    chatAttachAlertPhotoLayout.f38416b.U3.v0();
                }
                pl plVar3 = chatAttachAlertPhotoLayout.Q;
                if (plVar3 != null) {
                    plVar3.setSystemUiVisibility(1028);
                }
                il ilVar = chatAttachAlertPhotoLayout.F;
                if (ilVar != null) {
                    ilVar.invalidate();
                    return;
                }
                return;
            default:
                j71 j71Var = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.f31276g1.e();
                chatAttachAlertPhotoLayout.f31282j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.f31271e0 = false;
                il ilVar2 = chatAttachAlertPhotoLayout.F;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                pl plVar4 = chatAttachAlertPhotoLayout.Q;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.f31267c0 = false;
                ai.o2 o2Var = chatAttachAlertPhotoLayout.f31283k0;
                if (o2Var != null) {
                    o2Var.setVisibility(8);
                }
                if (j71Var != null) {
                    j71Var.setVisibility(8);
                    j71Var.setTag(null);
                }
                il ilVar3 = chatAttachAlertPhotoLayout.f31295r;
                if (ilVar3 != null) {
                    ilVar3.setVisibility(8);
                }
                pl plVar5 = chatAttachAlertPhotoLayout.Q;
                if (plVar5 != null) {
                    plVar5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
