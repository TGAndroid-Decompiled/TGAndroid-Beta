package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final int f28796a;
    public final ChatAttachAlertPhotoLayout f28797b;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28796a = i10;
        this.f28797b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28796a) {
            case 0:
                this.f28797b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28797b;
                chatAttachAlertPhotoLayout.f24029f1.unlock();
                chatAttachAlertPhotoLayout.f24024d0 = false;
                um umVar = chatAttachAlertPhotoLayout.P;
                if (umVar != null) {
                    umVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24020b0) {
                    chatAttachAlertPhotoLayout.f30161b.f33207c2.P0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28797b;
                ka1 ka1Var = chatAttachAlertPhotoLayout2.f24040l0;
                chatAttachAlertPhotoLayout2.f24029f1.unlock();
                chatAttachAlertPhotoLayout2.f24035i1 = false;
                chatAttachAlertPhotoLayout2.f30161b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24024d0 = false;
                km kmVar2 = chatAttachAlertPhotoLayout2.E;
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
                um umVar3 = chatAttachAlertPhotoLayout2.P;
                if (umVar3 != null) {
                    umVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24020b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f24036j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ka1Var != null) {
                    ka1Var.setVisibility(8);
                    ka1Var.setTag(null);
                }
                km kmVar3 = chatAttachAlertPhotoLayout2.f24050r;
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
