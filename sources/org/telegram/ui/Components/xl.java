package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xl extends AnimatorListenerAdapter {
    public final int f30368a;
    public final ChatAttachAlertPhotoLayout f30369b;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30368a = i10;
        this.f30369b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30368a) {
            case 0:
                this.f30369b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30369b;
                chatAttachAlertPhotoLayout.f22136f1.unlock();
                chatAttachAlertPhotoLayout.f22131d0 = false;
                fm fmVar = chatAttachAlertPhotoLayout.P;
                if (fmVar != null) {
                    fmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22127b0) {
                    chatAttachAlertPhotoLayout.f27043b.Z1.K0();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30369b;
                r91 r91Var = chatAttachAlertPhotoLayout2.f22147l0;
                chatAttachAlertPhotoLayout2.f22136f1.unlock();
                chatAttachAlertPhotoLayout2.f22142i1 = false;
                chatAttachAlertPhotoLayout2.f27043b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22131d0 = false;
                vl vlVar2 = chatAttachAlertPhotoLayout2.E;
                if (vlVar2 != null) {
                    vlVar2.invalidate();
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.P;
                if (fmVar3 != null) {
                    fmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22127b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f22143j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (r91Var != null) {
                    r91Var.setVisibility(8);
                    r91Var.setTag(null);
                }
                vl vlVar3 = chatAttachAlertPhotoLayout2.f22157r;
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
