package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vl extends AnimatorListenerAdapter {
    public final int f31352a;
    public final ChatAttachAlertPhotoLayout f31353b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f31352a = i10;
        this.f31353b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31352a) {
            case 0:
                this.f31353b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31353b;
                chatAttachAlertPhotoLayout.f23847f1.unlock();
                chatAttachAlertPhotoLayout.f23842d0 = false;
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f23838b0) {
                    chatAttachAlertPhotoLayout.f28753b.Z1.H();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31353b;
                d91 d91Var = chatAttachAlertPhotoLayout2.f23858l0;
                chatAttachAlertPhotoLayout2.f23847f1.unlock();
                chatAttachAlertPhotoLayout2.f23853i1 = false;
                chatAttachAlertPhotoLayout2.f28753b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f23842d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f23838b0 = false;
                ah.y yVar = chatAttachAlertPhotoLayout2.f23854j0;
                if (yVar != null) {
                    yVar.setVisibility(8);
                }
                if (d91Var != null) {
                    d91Var.setVisibility(8);
                    d91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.f23868r;
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
