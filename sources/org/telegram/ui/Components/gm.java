package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gm extends AnimatorListenerAdapter {
    public final int f26617a;
    public final ChatAttachAlertPhotoLayout f26618b;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26617a = i10;
        this.f26618b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26617a) {
            case 0:
                this.f26618b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26618b;
                chatAttachAlertPhotoLayout.f24092f1.unlock();
                chatAttachAlertPhotoLayout.f24087d0 = false;
                om omVar = chatAttachAlertPhotoLayout.P;
                if (omVar != null) {
                    omVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24083b0) {
                    chatAttachAlertPhotoLayout.f28225b.f30528c2.J();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26618b;
                x91 x91Var = chatAttachAlertPhotoLayout2.f24103l0;
                chatAttachAlertPhotoLayout2.f24092f1.unlock();
                chatAttachAlertPhotoLayout2.f24098i1 = false;
                chatAttachAlertPhotoLayout2.f28225b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24087d0 = false;
                em emVar2 = chatAttachAlertPhotoLayout2.E;
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
                om omVar3 = chatAttachAlertPhotoLayout2.P;
                if (omVar3 != null) {
                    omVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24083b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f24099j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (x91Var != null) {
                    x91Var.setVisibility(8);
                    x91Var.setTag(null);
                }
                em emVar3 = chatAttachAlertPhotoLayout2.f24113r;
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
