package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class il extends AnimatorListenerAdapter {

    public final int f29402a;

    public final ChatAttachAlertPhotoLayout f29403b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29402a = i10;
        this.f29403b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29402a) {
            case 0:
                this.f29403b.f26258i0 = null;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29403b;
                chatAttachAlertPhotoLayout.f26245b1.unlock();
                chatAttachAlertPhotoLayout.W = false;
                ql qlVar = chatAttachAlertPhotoLayout.L;
                if (qlVar != null) {
                    qlVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.f34900b.V1.F();
                }
                ql qlVar2 = chatAttachAlertPhotoLayout.L;
                if (qlVar2 != null) {
                    qlVar2.setSystemUiVisibility(1028);
                }
                gl glVar = chatAttachAlertPhotoLayout.A;
                if (glVar != null) {
                    glVar.invalidate();
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29403b;
                k81 k81Var = chatAttachAlertPhotoLayout2.f26256h0;
                chatAttachAlertPhotoLayout2.f26245b1.unlock();
                chatAttachAlertPhotoLayout2.f26251e1 = false;
                chatAttachAlertPhotoLayout2.f34900b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                gl glVar2 = chatAttachAlertPhotoLayout2.A;
                if (glVar2 != null) {
                    glVar2.invalidate();
                }
                ql qlVar3 = chatAttachAlertPhotoLayout2.L;
                if (qlVar3 != null) {
                    qlVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                ag.p1 p1Var = chatAttachAlertPhotoLayout2.f26252f0;
                if (p1Var != null) {
                    p1Var.setVisibility(8);
                }
                if (k81Var != null) {
                    k81Var.setVisibility(8);
                    k81Var.setTag(null);
                }
                gl glVar3 = chatAttachAlertPhotoLayout2.f26270r;
                if (glVar3 != null) {
                    glVar3.setVisibility(8);
                }
                ql qlVar4 = chatAttachAlertPhotoLayout2.L;
                if (qlVar4 != null) {
                    qlVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                }
                break;
        }
    }
}
