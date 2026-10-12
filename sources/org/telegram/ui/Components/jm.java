package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jm extends AnimatorListenerAdapter {
    public final int f26405a;
    public final ChatAttachAlertPhotoLayout f26406b;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26405a = i10;
        this.f26406b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26405a) {
            case 0:
                this.f26406b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26406b;
                chatAttachAlertPhotoLayout.f23034f1.unlock();
                chatAttachAlertPhotoLayout.f23029d0 = false;
                rm rmVar = chatAttachAlertPhotoLayout.P;
                if (rmVar != null) {
                    rmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f23025b0) {
                    chatAttachAlertPhotoLayout.f27671b.f29993c2.H();
                }
                rm rmVar2 = chatAttachAlertPhotoLayout.P;
                if (rmVar2 != null) {
                    rmVar2.setSystemUiVisibility(1028);
                }
                hm hmVar = chatAttachAlertPhotoLayout.E;
                if (hmVar != null) {
                    hmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26406b;
                ea1 ea1Var = chatAttachAlertPhotoLayout2.f23045l0;
                chatAttachAlertPhotoLayout2.f23034f1.unlock();
                chatAttachAlertPhotoLayout2.f23040i1 = false;
                chatAttachAlertPhotoLayout2.f27671b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f23029d0 = false;
                hm hmVar2 = chatAttachAlertPhotoLayout2.E;
                if (hmVar2 != null) {
                    hmVar2.invalidate();
                }
                rm rmVar3 = chatAttachAlertPhotoLayout2.P;
                if (rmVar3 != null) {
                    rmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f23025b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f23041j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (ea1Var != null) {
                    ea1Var.setVisibility(8);
                    ea1Var.setTag(null);
                }
                hm hmVar3 = chatAttachAlertPhotoLayout2.f23055r;
                if (hmVar3 != null) {
                    hmVar3.setVisibility(8);
                }
                rm rmVar4 = chatAttachAlertPhotoLayout2.P;
                if (rmVar4 != null) {
                    rmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
