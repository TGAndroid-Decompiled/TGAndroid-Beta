package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ql extends AnimatorListenerAdapter {
    public final int f28210a;
    public final ChatAttachAlertPhotoLayout f28211b;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28210a = i10;
        this.f28211b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28210a) {
            case 0:
                this.f28211b.f22890j0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28211b;
                chatAttachAlertPhotoLayout.f22877c1.unlock();
                chatAttachAlertPhotoLayout.f22872a0 = false;
                zl zlVar = chatAttachAlertPhotoLayout.M;
                if (zlVar != null) {
                    zlVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.f24282b.W1.Q0();
                }
                zl zlVar2 = chatAttachAlertPhotoLayout.M;
                if (zlVar2 != null) {
                    zlVar2.setSystemUiVisibility(1028);
                }
                ol olVar = chatAttachAlertPhotoLayout.B;
                if (olVar != null) {
                    olVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28211b;
                h91 h91Var = chatAttachAlertPhotoLayout2.f22888i0;
                chatAttachAlertPhotoLayout2.f22877c1.unlock();
                chatAttachAlertPhotoLayout2.f22883f1 = false;
                chatAttachAlertPhotoLayout2.f24282b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22872a0 = false;
                ol olVar2 = chatAttachAlertPhotoLayout2.B;
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
                zl zlVar3 = chatAttachAlertPhotoLayout2.M;
                if (zlVar3 != null) {
                    zlVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.M.invalidate();
                }
                chatAttachAlertPhotoLayout2.V = false;
                dg.u2 u2Var = chatAttachAlertPhotoLayout2.f22884g0;
                if (u2Var != null) {
                    u2Var.setVisibility(8);
                }
                if (h91Var != null) {
                    h91Var.setVisibility(8);
                    h91Var.setTag(null);
                }
                ol olVar3 = chatAttachAlertPhotoLayout2.f22901r;
                if (olVar3 != null) {
                    olVar3.setVisibility(8);
                }
                zl zlVar4 = chatAttachAlertPhotoLayout2.M;
                if (zlVar4 != null) {
                    zlVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
