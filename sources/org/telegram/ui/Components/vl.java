package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vl extends AnimatorListenerAdapter {
    public final int f28820a;
    public final ChatAttachAlertPhotoLayout f28821b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28820a = i10;
        this.f28821b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28820a) {
            case 0:
                this.f28821b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28821b;
                chatAttachAlertPhotoLayout.f21911f1.unlock();
                chatAttachAlertPhotoLayout.f21906d0 = false;
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f21902b0) {
                    chatAttachAlertPhotoLayout.f26461b.Z1.K0();
                }
                dm dmVar2 = chatAttachAlertPhotoLayout.P;
                if (dmVar2 != null) {
                    dmVar2.setSystemUiVisibility(1028);
                }
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar != null) {
                    tlVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28821b;
                e91 e91Var = chatAttachAlertPhotoLayout2.f21922l0;
                chatAttachAlertPhotoLayout2.f21911f1.unlock();
                chatAttachAlertPhotoLayout2.f21917i1 = false;
                chatAttachAlertPhotoLayout2.f26461b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f21906d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f21902b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f21918j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (e91Var != null) {
                    e91Var.setVisibility(8);
                    e91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.f21932r;
                if (tlVar3 != null) {
                    tlVar3.setVisibility(8);
                }
                dm dmVar4 = chatAttachAlertPhotoLayout2.P;
                if (dmVar4 != null) {
                    dmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
