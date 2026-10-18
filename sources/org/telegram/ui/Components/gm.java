package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gm extends AnimatorListenerAdapter {
    public final int f26588a;
    public final ChatAttachAlertPhotoLayout f26589b;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26588a = i10;
        this.f26589b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26588a) {
            case 0:
                this.f26589b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26589b;
                chatAttachAlertPhotoLayout.f24089f1.unlock();
                chatAttachAlertPhotoLayout.f24084d0 = false;
                om omVar = chatAttachAlertPhotoLayout.P;
                if (omVar != null) {
                    omVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24080b0) {
                    chatAttachAlertPhotoLayout.f28238b.f30566c2.J();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26589b;
                w91 w91Var = chatAttachAlertPhotoLayout2.f24100l0;
                chatAttachAlertPhotoLayout2.f24089f1.unlock();
                chatAttachAlertPhotoLayout2.f24095i1 = false;
                chatAttachAlertPhotoLayout2.f28238b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24084d0 = false;
                em emVar2 = chatAttachAlertPhotoLayout2.E;
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
                om omVar3 = chatAttachAlertPhotoLayout2.P;
                if (omVar3 != null) {
                    omVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24080b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f24096j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (w91Var != null) {
                    w91Var.setVisibility(8);
                    w91Var.setTag(null);
                }
                em emVar3 = chatAttachAlertPhotoLayout2.f24110r;
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
