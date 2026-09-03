package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sl extends AnimatorListenerAdapter {
    public final int f31081a;
    public final ChatAttachAlertPhotoLayout f31082b;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f31081a = i10;
        this.f31082b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31081a) {
            case 0:
                this.f31082b.f24761j0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31082b;
                chatAttachAlertPhotoLayout.f24748c1.unlock();
                chatAttachAlertPhotoLayout.f24743a0 = false;
                bm bmVar = chatAttachAlertPhotoLayout.M;
                if (bmVar != null) {
                    bmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.f26590b.W1.Q0();
                }
                bm bmVar2 = chatAttachAlertPhotoLayout.M;
                if (bmVar2 != null) {
                    bmVar2.setSystemUiVisibility(1028);
                }
                ql qlVar = chatAttachAlertPhotoLayout.B;
                if (qlVar != null) {
                    qlVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f31082b;
                h91 h91Var = chatAttachAlertPhotoLayout2.f24759i0;
                chatAttachAlertPhotoLayout2.f24748c1.unlock();
                chatAttachAlertPhotoLayout2.f24754f1 = false;
                chatAttachAlertPhotoLayout2.f26590b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24743a0 = false;
                ql qlVar2 = chatAttachAlertPhotoLayout2.B;
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
                bm bmVar3 = chatAttachAlertPhotoLayout2.M;
                if (bmVar3 != null) {
                    bmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.M.invalidate();
                }
                chatAttachAlertPhotoLayout2.V = false;
                eg.s2 s2Var = chatAttachAlertPhotoLayout2.f24755g0;
                if (s2Var != null) {
                    s2Var.setVisibility(8);
                }
                if (h91Var != null) {
                    h91Var.setVisibility(8);
                    h91Var.setTag(null);
                }
                ql qlVar3 = chatAttachAlertPhotoLayout2.f24772r;
                if (qlVar3 != null) {
                    qlVar3.setVisibility(8);
                }
                bm bmVar4 = chatAttachAlertPhotoLayout2.M;
                if (bmVar4 != null) {
                    bmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
