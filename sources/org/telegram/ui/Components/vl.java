package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vl extends AnimatorListenerAdapter {
    public final int f29197a;
    public final ChatAttachAlertPhotoLayout f29198b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29197a = i10;
        this.f29198b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29197a) {
            case 0:
                this.f29198b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29198b;
                chatAttachAlertPhotoLayout.f22151f1.unlock();
                chatAttachAlertPhotoLayout.f22146d0 = false;
                dm dmVar = chatAttachAlertPhotoLayout.P;
                if (dmVar != null) {
                    dmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f22142b0) {
                    chatAttachAlertPhotoLayout.f26786b.Z1.L0();
                }
                dm dmVar2 = chatAttachAlertPhotoLayout.P;
                if (dmVar2 != null) {
                    dmVar2.setSystemUiVisibility(1028);
                }
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (tlVar != null) {
                    tlVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29198b;
                t91 t91Var = chatAttachAlertPhotoLayout2.f22162l0;
                chatAttachAlertPhotoLayout2.f22151f1.unlock();
                chatAttachAlertPhotoLayout2.f22157i1 = false;
                chatAttachAlertPhotoLayout2.f26786b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f22146d0 = false;
                tl tlVar2 = chatAttachAlertPhotoLayout2.E;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                dm dmVar3 = chatAttachAlertPhotoLayout2.P;
                if (dmVar3 != null) {
                    dmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f22142b0 = false;
                ai.f0 f0Var = chatAttachAlertPhotoLayout2.f22158j0;
                if (f0Var != null) {
                    f0Var.setVisibility(8);
                }
                if (t91Var != null) {
                    t91Var.setVisibility(8);
                    t91Var.setTag(null);
                }
                tl tlVar3 = chatAttachAlertPhotoLayout2.f22172r;
                if (tlVar3 != null) {
                    tlVar3.setVisibility(8);
                }
                dm dmVar4 = chatAttachAlertPhotoLayout2.P;
                if (dmVar4 != null) {
                    dmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
