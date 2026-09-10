package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class am extends AnimatorListenerAdapter {
    public final int f21535a;
    public final ChatAttachAlertPhotoLayout f21536b;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f21535a = i10;
        this.f21536b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21535a) {
            case 0:
                this.f21536b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f21536b;
                chatAttachAlertPhotoLayout.f20999f1.unlock();
                chatAttachAlertPhotoLayout.f20994d0 = false;
                im imVar = chatAttachAlertPhotoLayout.P;
                if (imVar != null) {
                    imVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f20990b0) {
                    chatAttachAlertPhotoLayout.f26422b.Z1.K0();
                }
                im imVar2 = chatAttachAlertPhotoLayout.P;
                if (imVar2 != null) {
                    imVar2.setSystemUiVisibility(1028);
                }
                yl ylVar = chatAttachAlertPhotoLayout.E;
                if (ylVar != null) {
                    ylVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f21536b;
                q91 q91Var = chatAttachAlertPhotoLayout2.f21010l0;
                chatAttachAlertPhotoLayout2.f20999f1.unlock();
                chatAttachAlertPhotoLayout2.f21005i1 = false;
                chatAttachAlertPhotoLayout2.f26422b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f20994d0 = false;
                yl ylVar2 = chatAttachAlertPhotoLayout2.E;
                if (ylVar2 != null) {
                    ylVar2.invalidate();
                }
                im imVar3 = chatAttachAlertPhotoLayout2.P;
                if (imVar3 != null) {
                    imVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f20990b0 = false;
                bi.ld ldVar = chatAttachAlertPhotoLayout2.f21006j0;
                if (ldVar != null) {
                    ldVar.setVisibility(8);
                }
                if (q91Var != null) {
                    q91Var.setVisibility(8);
                    q91Var.setTag(null);
                }
                yl ylVar3 = chatAttachAlertPhotoLayout2.f21020r;
                if (ylVar3 != null) {
                    ylVar3.setVisibility(8);
                }
                im imVar4 = chatAttachAlertPhotoLayout2.P;
                if (imVar4 != null) {
                    imVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
