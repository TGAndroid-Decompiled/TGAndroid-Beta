package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rl extends AnimatorListenerAdapter {
    public final int f28491a;
    public final ChatAttachAlertPhotoLayout f28492b;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28491a = i10;
        this.f28492b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28491a) {
            case 0:
                this.f28492b.f22917j0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28492b;
                chatAttachAlertPhotoLayout.f22904c1.unlock();
                chatAttachAlertPhotoLayout.f22899a0 = false;
                am amVar = chatAttachAlertPhotoLayout.M;
                if (amVar != null) {
                    amVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.M.invalidate();
                }
                if (chatAttachAlertPhotoLayout.V) {
                    chatAttachAlertPhotoLayout.f24278b.W1.C();
                }
                am amVar2 = chatAttachAlertPhotoLayout.M;
                if (amVar2 != null) {
                    amVar2.setSystemUiVisibility(1028);
                }
                pl plVar = chatAttachAlertPhotoLayout.B;
                if (plVar != null) {
                    plVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f28492b;
                h91 h91Var = chatAttachAlertPhotoLayout2.f22915i0;
                chatAttachAlertPhotoLayout2.f22904c1.unlock();
                chatAttachAlertPhotoLayout2.f22910f1 = false;
                chatAttachAlertPhotoLayout2.f24278b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22899a0 = false;
                pl plVar2 = chatAttachAlertPhotoLayout2.B;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                am amVar3 = chatAttachAlertPhotoLayout2.M;
                if (amVar3 != null) {
                    amVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.M.invalidate();
                }
                chatAttachAlertPhotoLayout2.V = false;
                dg.u2 u2Var = chatAttachAlertPhotoLayout2.f22911g0;
                if (u2Var != null) {
                    u2Var.setVisibility(8);
                }
                if (h91Var != null) {
                    h91Var.setVisibility(8);
                    h91Var.setTag(null);
                }
                pl plVar3 = chatAttachAlertPhotoLayout2.f22928r;
                if (plVar3 != null) {
                    plVar3.setVisibility(8);
                }
                am amVar4 = chatAttachAlertPhotoLayout2.M;
                if (amVar4 != null) {
                    amVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.M.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
