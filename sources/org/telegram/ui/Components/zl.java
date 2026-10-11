package org.telegram.ui.Components;

import android.view.View;
public final class zl implements ja1, f5, im0 {
    public final int f33565a;
    public final ChatAttachAlertPhotoLayout f33566b;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f33565a = i10;
        this.f33566b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f33565a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33566b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24013q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30161b;
                yiVar.a1();
                yiVar.f33207c2.I1(7, false, z10, i10, 0, 0L, yiVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24013q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30161b;
                yiVar2.a1();
                yiVar2.f33207c2.I1(4, true, z10, i10, 0, 0L, yiVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33566b;
        um umVar = chatAttachAlertPhotoLayout.P;
        if (umVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            umVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33566b;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        if (!yiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                wi wiVar = yiVar.f33207c2;
                if (wiVar != null) {
                    wiVar.I1(0, false, true, 0, 0, 0L, yiVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                um0 um0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                um0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
