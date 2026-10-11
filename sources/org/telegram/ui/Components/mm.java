package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final int f28887a;
    public final ChatAttachAlertPhotoLayout f28888b;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28887a = i10;
        this.f28888b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28887a) {
            case 0:
                this.f28888b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28888b;
                chatAttachAlertPhotoLayout.f24065f1.unlock();
                chatAttachAlertPhotoLayout.f24060d0 = false;
                um umVar = chatAttachAlertPhotoLayout.P;
                if (umVar != null) {
                    umVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24056b0) {
                    chatAttachAlertPhotoLayout.f30245b.f33280c2.P0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28888b;
                ja1 ja1Var = chatAttachAlertPhotoLayout2.f24076l0;
                chatAttachAlertPhotoLayout2.f24065f1.unlock();
                chatAttachAlertPhotoLayout2.f24071i1 = false;
                chatAttachAlertPhotoLayout2.f30245b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24060d0 = false;
                km kmVar2 = chatAttachAlertPhotoLayout2.E;
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
                um umVar3 = chatAttachAlertPhotoLayout2.P;
                if (umVar3 != null) {
                    umVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24056b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f24072j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (ja1Var != null) {
                    ja1Var.setVisibility(8);
                    ja1Var.setTag(null);
                }
                km kmVar3 = chatAttachAlertPhotoLayout2.f24086r;
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
