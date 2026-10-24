package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class em extends AnimatorListenerAdapter {
    public final int f26074a;
    public final ChatAttachAlertPhotoLayout f26075b;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26074a = i10;
        this.f26075b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26074a) {
            case 0:
                this.f26075b.m0 = null;
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26075b;
                chatAttachAlertPhotoLayout.f24239f1.unlock();
                chatAttachAlertPhotoLayout.f24234d0 = false;
                mm mmVar = chatAttachAlertPhotoLayout.P;
                if (mmVar != null) {
                    mmVar.invalidateOutline();
                    chatAttachAlertPhotoLayout.P.invalidate();
                }
                if (chatAttachAlertPhotoLayout.f24230b0) {
                    chatAttachAlertPhotoLayout.f27704b.f30138c2.J();
                }
                mm mmVar2 = chatAttachAlertPhotoLayout.P;
                if (mmVar2 != null) {
                    mmVar2.setSystemUiVisibility(1028);
                }
                cm cmVar = chatAttachAlertPhotoLayout.E;
                if (cmVar != null) {
                    cmVar.invalidate();
                    return;
                }
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26075b;
                fa1 fa1Var = chatAttachAlertPhotoLayout2.f24250l0;
                chatAttachAlertPhotoLayout2.f24239f1.unlock();
                chatAttachAlertPhotoLayout2.f24245i1 = false;
                chatAttachAlertPhotoLayout2.f27704b.getWindow().clearFlags(128);
                chatAttachAlertPhotoLayout2.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout2.f24234d0 = false;
                cm cmVar2 = chatAttachAlertPhotoLayout2.E;
                if (cmVar2 != null) {
                    cmVar2.invalidate();
                }
                mm mmVar3 = chatAttachAlertPhotoLayout2.P;
                if (mmVar3 != null) {
                    mmVar3.invalidateOutline();
                    chatAttachAlertPhotoLayout2.P.invalidate();
                }
                chatAttachAlertPhotoLayout2.f24230b0 = false;
                ah.x xVar = chatAttachAlertPhotoLayout2.f24246j0;
                if (xVar != null) {
                    xVar.setVisibility(8);
                }
                if (fa1Var != null) {
                    fa1Var.setVisibility(8);
                    fa1Var.setTag(null);
                }
                cm cmVar3 = chatAttachAlertPhotoLayout2.f24260r;
                if (cmVar3 != null) {
                    cmVar3.setVisibility(8);
                }
                mm mmVar4 = chatAttachAlertPhotoLayout2.P;
                if (mmVar4 != null) {
                    mmVar4.setFpsLimit(30);
                    chatAttachAlertPhotoLayout2.P.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
