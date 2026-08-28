package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ml extends AnimatorListenerAdapter {
    public final int f30883a;
    public final ChatAttachAlertPhotoLayout f30884b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.f30883a = i9;
        this.f30884b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30883a) {
            case 0:
                this.f30884b.f26262i0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30884b;
                chatAttachAlertPhotoLayout.f26249b1.unlock();
                chatAttachAlertPhotoLayout.W = false;
                ul ulVar = chatAttachAlertPhotoLayout.L;
                if (ulVar != null) {
                    ulVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.f27493b.V1.u();
                }
                ul ulVar2 = chatAttachAlertPhotoLayout.L;
                if (ulVar2 != null) {
                    ulVar2.setSystemUiVisibility(1028);
                }
                kl klVar = chatAttachAlertPhotoLayout.A;
                if (klVar != null) {
                    klVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30884b;
                i81 i81Var = chatAttachAlertPhotoLayout2.f26260h0;
                chatAttachAlertPhotoLayout2.f26249b1.unlock();
                chatAttachAlertPhotoLayout2.f26255e1 = false;
                chatAttachAlertPhotoLayout2.f27493b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                kl klVar2 = chatAttachAlertPhotoLayout2.A;
                if (klVar2 != null) {
                    klVar2.invalidate();
                }
                ul ulVar3 = chatAttachAlertPhotoLayout2.L;
                if (ulVar3 != null) {
                    ulVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                fh.d2 d2Var = chatAttachAlertPhotoLayout2.f26256f0;
                if (d2Var != null) {
                    d2Var.setVisibility(8);
                }
                if (i81Var != null) {
                    i81Var.setVisibility(8);
                    i81Var.setTag(null);
                }
                kl klVar3 = chatAttachAlertPhotoLayout2.f26274r;
                if (klVar3 != null) {
                    klVar3.setVisibility(8);
                }
                ul ulVar4 = chatAttachAlertPhotoLayout2.L;
                if (ulVar4 != null) {
                    ulVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
