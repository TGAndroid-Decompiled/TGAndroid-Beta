package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gm extends AnimatorListenerAdapter {
    public final int f26615a;
    public final ChatAttachAlertPhotoLayout f26616b;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26615a = i10;
        this.f26616b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26615a) {
            case 0:
                this.f26616b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26616b;
                chatAttachAlertPhotoLayout.f24090f1.unlock();
                chatAttachAlertPhotoLayout.f24085d0 = false;
                om omVar = chatAttachAlertPhotoLayout.P;
                if (omVar != null) {
                    omVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24081b0) {
                    chatAttachAlertPhotoLayout.f28223b.f30526c2.J();
                }
                om omVar2 = chatAttachAlertPhotoLayout.P;
                if (omVar2 != null) {
                    omVar2.setSystemUiVisibility(1028);
                }
                em emVar = chatAttachAlertPhotoLayout.E;
                if (emVar != null) {
                    emVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26616b;
                x91 x91Var = chatAttachAlertPhotoLayout2.f24101l0;
                chatAttachAlertPhotoLayout2.f24090f1.unlock();
                chatAttachAlertPhotoLayout2.f24096i1 = false;
                chatAttachAlertPhotoLayout2.f28223b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24085d0 = false;
                em emVar2 = chatAttachAlertPhotoLayout2.E;
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
                om omVar3 = chatAttachAlertPhotoLayout2.P;
                if (omVar3 != null) {
                    omVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24081b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f24097j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (x91Var != null) {
                    x91Var.setVisibility(8);
                    x91Var.setTag(null);
                }
                em emVar3 = chatAttachAlertPhotoLayout2.f24111r;
                if (emVar3 != null) {
                    emVar3.setVisibility(8);
                }
                om omVar4 = chatAttachAlertPhotoLayout2.P;
                if (omVar4 != null) {
                    omVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
