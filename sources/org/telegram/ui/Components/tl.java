package org.telegram.ui.Components;

import android.view.View;
public final class tl implements ea1, d5, cm0 {
    public final int f30818a;
    public final ChatAttachAlertPhotoLayout f30819b;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30818a = i10;
        this.f30819b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        int i12 = this.f30818a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30819b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24222q1;
                ti tiVar = chatAttachAlertPhotoLayout.f28366b;
                tiVar.d1();
                tiVar.f30722c2.b0(7, false, z10, i10, 0, 0L, tiVar.x1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24222q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28366b;
                tiVar2.d1();
                tiVar2.f30722c2.b0(4, true, z10, i10, 0, 0L, tiVar2.x1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30819b;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            omVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24222q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30819b;
        ti tiVar = chatAttachAlertPhotoLayout.f28366b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.f30722c2;
                if (riVar != null) {
                    riVar.b0(0, false, true, 0, 0, 0L, tiVar.x1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                om0 om0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                om0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
