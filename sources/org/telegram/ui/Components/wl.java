package org.telegram.ui.Components;

import android.view.View;
public final class wl implements da1, f5, cm0 {
    public final int f30910a;
    public final ChatAttachAlertPhotoLayout f30911b;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30910a = i10;
        this.f30911b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f30910a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30911b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f23018q1;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                viVar.a1();
                viVar.f29993c2.g0(7, false, z10, i10, 0, 0L, viVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f23018q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f27671b;
                viVar2.a1();
                viVar2.f29993c2.g0(4, true, z10, i10, 0, 0L, viVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30911b;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        if (!viVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.f29993c2;
                if (tiVar != null) {
                    tiVar.g0(0, false, true, 0, 0, 0L, viVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                om0 om0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                om0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30911b;
        rm rmVar = chatAttachAlertPhotoLayout.P;
        if (rmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            rmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
