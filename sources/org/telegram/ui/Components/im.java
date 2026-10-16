package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class im extends AnimatorListenerAdapter {
    public final int f25656a;
    public final ChatAttachAlertPhotoLayout f25657b;

    public im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25656a = i10;
        this.f25657b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25656a) {
            case 0:
                this.f25657b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25657b;
                chatAttachAlertPhotoLayout.f22734f1.unlock();
                chatAttachAlertPhotoLayout.f22729d0 = false;
                qm qmVar = chatAttachAlertPhotoLayout.P;
                if (qmVar != null) {
                    qmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22725b0) {
                    chatAttachAlertPhotoLayout.f27360b.f29664c2.F();
                }
                qm qmVar2 = chatAttachAlertPhotoLayout.P;
                if (qmVar2 != null) {
                    qmVar2.setSystemUiVisibility(1028);
                }
                gm gmVar = chatAttachAlertPhotoLayout.E;
                if (gmVar != null) {
                    gmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f25657b;
                fa1 fa1Var = chatAttachAlertPhotoLayout2.f22745l0;
                chatAttachAlertPhotoLayout2.f22734f1.unlock();
                chatAttachAlertPhotoLayout2.f22740i1 = false;
                chatAttachAlertPhotoLayout2.f27360b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22729d0 = false;
                gm gmVar2 = chatAttachAlertPhotoLayout2.E;
                if (gmVar2 != null) {
                    gmVar2.invalidate();
                }
                qm qmVar3 = chatAttachAlertPhotoLayout2.P;
                if (qmVar3 != null) {
                    qmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22725b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f22741j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (fa1Var != null) {
                    fa1Var.setVisibility(8);
                    fa1Var.setTag(null);
                }
                gm gmVar3 = chatAttachAlertPhotoLayout2.f22755r;
                if (gmVar3 != null) {
                    gmVar3.setVisibility(8);
                }
                qm qmVar4 = chatAttachAlertPhotoLayout2.P;
                if (qmVar4 != null) {
                    qmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
