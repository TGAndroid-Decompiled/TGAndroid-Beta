package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vl extends AnimatorListenerAdapter {
    public final int f29102a;
    public final ChatAttachAlertPhotoLayout f29103b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29102a = i10;
        this.f29103b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29102a) {
            case 0:
                this.f29103b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29103b;
                chatAttachAlertPhotoLayout.f22100f1.unlock();
                chatAttachAlertPhotoLayout.f22095d0 = false;
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22091b0) {
                    chatAttachAlertPhotoLayout.f26688b.Z1.K0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29103b;
                s91 s91Var = chatAttachAlertPhotoLayout2.f22111l0;
                chatAttachAlertPhotoLayout2.f22100f1.unlock();
                chatAttachAlertPhotoLayout2.f22106i1 = false;
                chatAttachAlertPhotoLayout2.f26688b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22095d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22091b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f22107j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (s91Var != null) {
                    s91Var.setVisibility(8);
                    s91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.f22121r;
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
