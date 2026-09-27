package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xl extends AnimatorListenerAdapter {
    public final int f30434a;
    public final ChatAttachAlertPhotoLayout f30435b;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30434a = i10;
        this.f30435b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30434a) {
            case 0:
                this.f30435b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30435b;
                chatAttachAlertPhotoLayout.f22139f1.unlock();
                chatAttachAlertPhotoLayout.f22134d0 = false;
                fm fmVar = chatAttachAlertPhotoLayout.P;
                if (fmVar != null) {
                    fmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22130b0) {
                    chatAttachAlertPhotoLayout.f27104b.Z1.K0();
                }
                fm fmVar2 = chatAttachAlertPhotoLayout.P;
                if (fmVar2 != null) {
                    fmVar2.setSystemUiVisibility(1028);
                }
                vl vlVar = chatAttachAlertPhotoLayout.E;
                if (vlVar != null) {
                    vlVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30435b;
                s91 s91Var = chatAttachAlertPhotoLayout2.f22150l0;
                chatAttachAlertPhotoLayout2.f22139f1.unlock();
                chatAttachAlertPhotoLayout2.f22145i1 = false;
                chatAttachAlertPhotoLayout2.f27104b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22134d0 = false;
                vl vlVar2 = chatAttachAlertPhotoLayout2.E;
                if (vlVar2 != null) {
                    vlVar2.invalidate();
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.P;
                if (fmVar3 != null) {
                    fmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22130b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f22146j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (s91Var != null) {
                    s91Var.setVisibility(8);
                    s91Var.setTag(null);
                }
                vl vlVar3 = chatAttachAlertPhotoLayout2.f22160r;
                if (vlVar3 != null) {
                    vlVar3.setVisibility(8);
                }
                fm fmVar4 = chatAttachAlertPhotoLayout2.P;
                if (fmVar4 != null) {
                    fmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
