package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wl extends AnimatorListenerAdapter {
    public final int f30083a;
    public final ChatAttachAlertPhotoLayout f30084b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30083a = i10;
        this.f30084b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30083a) {
            case 0:
                this.f30084b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30084b;
                chatAttachAlertPhotoLayout.f22136f1.unlock();
                chatAttachAlertPhotoLayout.f22131d0 = false;
                em emVar = chatAttachAlertPhotoLayout.P;
                if (emVar != null) {
                    emVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22127b0) {
                    chatAttachAlertPhotoLayout.f27087b.Z1.K0();
                }
                em emVar2 = chatAttachAlertPhotoLayout.P;
                if (emVar2 != null) {
                    emVar2.setSystemUiVisibility(1028);
                }
                ul ulVar = chatAttachAlertPhotoLayout.E;
                if (ulVar != null) {
                    ulVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30084b;
                q91 q91Var = chatAttachAlertPhotoLayout2.f22147l0;
                chatAttachAlertPhotoLayout2.f22136f1.unlock();
                chatAttachAlertPhotoLayout2.f22142i1 = false;
                chatAttachAlertPhotoLayout2.f27087b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22131d0 = false;
                ul ulVar2 = chatAttachAlertPhotoLayout2.E;
                if (ulVar2 != null) {
                    ulVar2.invalidate();
                }
                em emVar3 = chatAttachAlertPhotoLayout2.P;
                if (emVar3 != null) {
                    emVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22127b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f22143j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (q91Var != null) {
                    q91Var.setVisibility(8);
                    q91Var.setTag(null);
                }
                ul ulVar3 = chatAttachAlertPhotoLayout2.f22157r;
                if (ulVar3 != null) {
                    ulVar3.setVisibility(8);
                }
                em emVar4 = chatAttachAlertPhotoLayout2.P;
                if (emVar4 != null) {
                    emVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
