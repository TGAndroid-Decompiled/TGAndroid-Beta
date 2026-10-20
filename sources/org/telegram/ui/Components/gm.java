package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gm extends AnimatorListenerAdapter {
    public final int f26599a;
    public final ChatAttachAlertPhotoLayout f26600b;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26599a = i10;
        this.f26600b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26599a) {
            case 0:
                this.f26600b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26600b;
                chatAttachAlertPhotoLayout.f24093f1.unlock();
                chatAttachAlertPhotoLayout.f24088d0 = false;
                om omVar = chatAttachAlertPhotoLayout.P;
                if (omVar != null) {
                    omVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24084b0) {
                    chatAttachAlertPhotoLayout.f28173b.f30537c2.J();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26600b;
                y91 y91Var = chatAttachAlertPhotoLayout2.f24104l0;
                chatAttachAlertPhotoLayout2.f24093f1.unlock();
                chatAttachAlertPhotoLayout2.f24099i1 = false;
                chatAttachAlertPhotoLayout2.f28173b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24088d0 = false;
                em emVar2 = chatAttachAlertPhotoLayout2.E;
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
                om omVar3 = chatAttachAlertPhotoLayout2.P;
                if (omVar3 != null) {
                    omVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24084b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f24100j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (y91Var != null) {
                    y91Var.setVisibility(8);
                    y91Var.setTag(null);
                }
                em emVar3 = chatAttachAlertPhotoLayout2.f24114r;
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
