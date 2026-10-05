package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yl extends AnimatorListenerAdapter {
    public final int f33295a;
    public final ChatAttachAlertPhotoLayout f33296b;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f33295a = i10;
        this.f33296b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33295a) {
            case 0:
                this.f33296b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33296b;
                chatAttachAlertPhotoLayout.f24041f1.unlock();
                chatAttachAlertPhotoLayout.f24036d0 = false;
                gm gmVar = chatAttachAlertPhotoLayout.P;
                if (gmVar != null) {
                    gmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24032b0) {
                    chatAttachAlertPhotoLayout.f29741b.Z1.K0();
                }
                gm gmVar2 = chatAttachAlertPhotoLayout.P;
                if (gmVar2 != null) {
                    gmVar2.setSystemUiVisibility(1028);
                }
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (wlVar != null) {
                    wlVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f33296b;
                ca1 ca1Var = chatAttachAlertPhotoLayout2.f24052l0;
                chatAttachAlertPhotoLayout2.f24041f1.unlock();
                chatAttachAlertPhotoLayout2.f24047i1 = false;
                chatAttachAlertPhotoLayout2.f29741b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24036d0 = false;
                wl wlVar2 = chatAttachAlertPhotoLayout2.E;
                if (wlVar2 != null) {
                    wlVar2.invalidate();
                }
                gm gmVar3 = chatAttachAlertPhotoLayout2.P;
                if (gmVar3 != null) {
                    gmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24032b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f24048j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ca1Var != null) {
                    ca1Var.setVisibility(8);
                    ca1Var.setTag(null);
                }
                wl wlVar3 = chatAttachAlertPhotoLayout2.f24062r;
                if (wlVar3 != null) {
                    wlVar3.setVisibility(8);
                }
                gm gmVar4 = chatAttachAlertPhotoLayout2.P;
                if (gmVar4 != null) {
                    gmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
