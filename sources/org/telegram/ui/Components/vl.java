package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vl extends AnimatorListenerAdapter {
    public final int f28821a;
    public final ChatAttachAlertPhotoLayout f28822b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28821a = i10;
        this.f28822b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28821a) {
            case 0:
                this.f28822b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28822b;
                chatAttachAlertPhotoLayout.f21924f1.unlock();
                chatAttachAlertPhotoLayout.f21919d0 = false;
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f21915b0) {
                    chatAttachAlertPhotoLayout.f26460b.Z1.K0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28822b;
                f91 f91Var = chatAttachAlertPhotoLayout2.f21935l0;
                chatAttachAlertPhotoLayout2.f21924f1.unlock();
                chatAttachAlertPhotoLayout2.f21930i1 = false;
                chatAttachAlertPhotoLayout2.f26460b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f21919d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f21915b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f21931j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (f91Var != null) {
                    f91Var.setVisibility(8);
                    f91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.f21945r;
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
