package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wl extends AnimatorListenerAdapter {
    public final int f29738a;
    public final ChatAttachAlertPhotoLayout f29739b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29738a = i10;
        this.f29739b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29738a) {
            case 0:
                this.f29739b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29739b;
                chatAttachAlertPhotoLayout.f21885f1.unlock();
                chatAttachAlertPhotoLayout.f21880d0 = false;
                em emVar = chatAttachAlertPhotoLayout.P;
                if (emVar != null) {
                    emVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f21876b0) {
                    chatAttachAlertPhotoLayout.f26744b.Z1.K0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29739b;
                d91 d91Var = chatAttachAlertPhotoLayout2.f21896l0;
                chatAttachAlertPhotoLayout2.f21885f1.unlock();
                chatAttachAlertPhotoLayout2.f21891i1 = false;
                chatAttachAlertPhotoLayout2.f26744b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f21880d0 = false;
                ul ulVar2 = chatAttachAlertPhotoLayout2.E;
                if (ulVar2 != null) {
                    ulVar2.invalidate();
                }
                em emVar3 = chatAttachAlertPhotoLayout2.P;
                if (emVar3 != null) {
                    emVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f21876b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f21892j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (d91Var != null) {
                    d91Var.setVisibility(8);
                    d91Var.setTag(null);
                }
                ul ulVar3 = chatAttachAlertPhotoLayout2.f21906r;
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
