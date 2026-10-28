package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hm extends AnimatorListenerAdapter {
    public final int f29023a;
    public final ChatAttachAlertPhotoLayout f29024b;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29023a = i10;
        this.f29024b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29023a) {
            case 0:
                this.f29024b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29024b;
                chatAttachAlertPhotoLayout.f26033f1.unlock();
                chatAttachAlertPhotoLayout.f26028d0 = false;
                pm pmVar = chatAttachAlertPhotoLayout.P;
                if (pmVar != null) {
                    pmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f26024b0) {
                    chatAttachAlertPhotoLayout.f30254b.f32982c2.R();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29024b;
                kc1 kc1Var = chatAttachAlertPhotoLayout2.f26044l0;
                chatAttachAlertPhotoLayout2.f26033f1.unlock();
                chatAttachAlertPhotoLayout2.f26039i1 = false;
                chatAttachAlertPhotoLayout2.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f26028d0 = false;
                fm fmVar2 = chatAttachAlertPhotoLayout2.E;
                if (fmVar2 != null) {
                    fmVar2.invalidate();
                }
                pm pmVar3 = chatAttachAlertPhotoLayout2.P;
                if (pmVar3 != null) {
                    pmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f26024b0 = false;
                bh.r rVar = chatAttachAlertPhotoLayout2.f26040j0;
                if (rVar != null) {
                    rVar.setVisibility(8);
                }
                if (kc1Var != null) {
                    kc1Var.setVisibility(8);
                    kc1Var.setTag(null);
                }
                fm fmVar3 = chatAttachAlertPhotoLayout2.f26054r;
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
