package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final int f29246a;
    public final ChatAttachAlertPhotoLayout f29247b;

    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29246a = i10;
        this.f29247b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29246a) {
            case 0:
                this.f29247b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29247b;
                chatAttachAlertPhotoLayout.f23814f1.unlock();
                chatAttachAlertPhotoLayout.f23809d0 = false;
                wm wmVar = chatAttachAlertPhotoLayout.P;
                if (wmVar != null) {
                    wmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f23805b0) {
                    chatAttachAlertPhotoLayout.f30574b.f24333c2.P0();
                }
                wm wmVar2 = chatAttachAlertPhotoLayout.P;
                if (wmVar2 != null) {
                    wmVar2.setSystemUiVisibility(1028);
                }
                mm mmVar = chatAttachAlertPhotoLayout.E;
                if (mmVar != null) {
                    mmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29247b;
                oa1 oa1Var = chatAttachAlertPhotoLayout2.f23825l0;
                chatAttachAlertPhotoLayout2.f23814f1.unlock();
                chatAttachAlertPhotoLayout2.f23820i1 = false;
                chatAttachAlertPhotoLayout2.f30574b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f23809d0 = false;
                mm mmVar2 = chatAttachAlertPhotoLayout2.E;
                if (mmVar2 != null) {
                    mmVar2.invalidate();
                }
                wm wmVar3 = chatAttachAlertPhotoLayout2.P;
                if (wmVar3 != null) {
                    wmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f23805b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f23821j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (oa1Var != null) {
                    oa1Var.setVisibility(8);
                    oa1Var.setTag(null);
                }
                mm mmVar3 = chatAttachAlertPhotoLayout2.f23835r;
                if (mmVar3 != null) {
                    mmVar3.setVisibility(8);
                }
                wm wmVar4 = chatAttachAlertPhotoLayout2.P;
                if (wmVar4 != null) {
                    wmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
