package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hm extends AnimatorListenerAdapter {
    public final int f29010a;
    public final ChatAttachAlertPhotoLayout f29011b;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29010a = i10;
        this.f29011b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29010a) {
            case 0:
                this.f29011b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29011b;
                chatAttachAlertPhotoLayout.f26029f1.unlock();
                chatAttachAlertPhotoLayout.f26024d0 = false;
                pm pmVar = chatAttachAlertPhotoLayout.P;
                if (pmVar != null) {
                    pmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f26020b0) {
                    chatAttachAlertPhotoLayout.f30213b.f33010c2.R();
                }
                pm pmVar2 = chatAttachAlertPhotoLayout.P;
                if (pmVar2 != null) {
                    pmVar2.setSystemUiVisibility(1028);
                }
                fm fmVar = chatAttachAlertPhotoLayout.E;
                if (fmVar != null) {
                    fmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29011b;
                fc1 fc1Var = chatAttachAlertPhotoLayout2.f26040l0;
                chatAttachAlertPhotoLayout2.f26029f1.unlock();
                chatAttachAlertPhotoLayout2.f26035i1 = false;
                chatAttachAlertPhotoLayout2.f30213b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f26024d0 = false;
                fm fmVar2 = chatAttachAlertPhotoLayout2.E;
                if (fmVar2 != null) {
                    fmVar2.invalidate();
                }
                pm pmVar3 = chatAttachAlertPhotoLayout2.P;
                if (pmVar3 != null) {
                    pmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f26020b0 = false;
                bh.r rVar = chatAttachAlertPhotoLayout2.f26036j0;
                if (rVar != null) {
                    rVar.setVisibility(8);
                }
                if (fc1Var != null) {
                    fc1Var.setVisibility(8);
                    fc1Var.setTag(null);
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.f26050r;
                if (fmVar3 != null) {
                    fmVar3.setVisibility(8);
                }
                pm pmVar4 = chatAttachAlertPhotoLayout2.P;
                if (pmVar4 != null) {
                    pmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
