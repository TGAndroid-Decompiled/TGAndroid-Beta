package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ql extends AnimatorListenerAdapter {
    public final int f31982a;
    public final ChatAttachAlertPhotoLayout f31983b;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f31982a = i10;
        this.f31983b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31982a) {
            case 0:
                this.f31983b.f26273i0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31983b;
                chatAttachAlertPhotoLayout.f26260b1.unlock();
                chatAttachAlertPhotoLayout.W = false;
                yl ylVar = chatAttachAlertPhotoLayout.L;
                if (ylVar != null) {
                    ylVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.L.invalidate();
                }
                if (chatAttachAlertPhotoLayout.U) {
                    chatAttachAlertPhotoLayout.f28403b.V1.L0();
                }
                yl ylVar2 = chatAttachAlertPhotoLayout.L;
                if (ylVar2 != null) {
                    ylVar2.setSystemUiVisibility(1028);
                }
                ol olVar = chatAttachAlertPhotoLayout.A;
                if (olVar != null) {
                    olVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31983b;
                u81 u81Var = chatAttachAlertPhotoLayout2.f26271h0;
                chatAttachAlertPhotoLayout2.f26260b1.unlock();
                chatAttachAlertPhotoLayout2.f26266e1 = false;
                chatAttachAlertPhotoLayout2.f28403b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.W = false;
                ol olVar2 = chatAttachAlertPhotoLayout2.A;
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
                yl ylVar3 = chatAttachAlertPhotoLayout2.L;
                if (ylVar3 != null) {
                    ylVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.L.invalidate();
                }
                chatAttachAlertPhotoLayout2.U = false;
                bg.x2 x2Var = chatAttachAlertPhotoLayout2.f26267f0;
                if (x2Var != null) {
                    x2Var.setVisibility(8);
                }
                if (u81Var != null) {
                    u81Var.setVisibility(8);
                    u81Var.setTag(null);
                }
                ol olVar3 = chatAttachAlertPhotoLayout2.f26285r;
                if (olVar3 != null) {
                    olVar3.setVisibility(8);
                }
                yl ylVar4 = chatAttachAlertPhotoLayout2.L;
                if (ylVar4 != null) {
                    ylVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.L.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
