package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final int f28847a;
    public final ChatAttachAlertPhotoLayout f28848b;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28847a = i10;
        this.f28848b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28847a) {
            case 0:
                this.f28848b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28848b;
                chatAttachAlertPhotoLayout.f24041f1.unlock();
                chatAttachAlertPhotoLayout.f24036d0 = false;
                um umVar = chatAttachAlertPhotoLayout.P;
                if (umVar != null) {
                    umVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24032b0) {
                    chatAttachAlertPhotoLayout.f30211b.f33226c2.P0();
                }
                um umVar2 = chatAttachAlertPhotoLayout.P;
                if (umVar2 != null) {
                    umVar2.setSystemUiVisibility(1028);
                }
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (kmVar != null) {
                    kmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28848b;
                ka1 ka1Var = chatAttachAlertPhotoLayout2.f24052l0;
                chatAttachAlertPhotoLayout2.f24041f1.unlock();
                chatAttachAlertPhotoLayout2.f24047i1 = false;
                chatAttachAlertPhotoLayout2.f30211b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24036d0 = false;
                km kmVar2 = chatAttachAlertPhotoLayout2.E;
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
                um umVar3 = chatAttachAlertPhotoLayout2.P;
                if (umVar3 != null) {
                    umVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24032b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f24048j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ka1Var != null) {
                    ka1Var.setVisibility(8);
                    ka1Var.setTag(null);
                }
                km kmVar3 = chatAttachAlertPhotoLayout2.f24062r;
                if (kmVar3 != null) {
                    kmVar3.setVisibility(8);
                }
                um umVar4 = chatAttachAlertPhotoLayout2.P;
                if (umVar4 != null) {
                    umVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
