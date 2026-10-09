package org.telegram.ui.Components;

import android.view.View;
public final class zl implements ia1, f5, gm0 {
    public final int f33595a;
    public final ChatAttachAlertPhotoLayout f33596b;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f33595a = i10;
        this.f33596b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f33595a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33596b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24021q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30173b;
                yiVar.a1();
                yiVar.f33219c2.I1(7, false, z10, i10, 0, 0L, yiVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24021q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30173b;
                yiVar2.a1();
                yiVar2.f33219c2.I1(4, true, z10, i10, 0, 0L, yiVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33596b;
        um umVar = chatAttachAlertPhotoLayout.P;
        if (umVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            umVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33596b;
        yi yiVar = chatAttachAlertPhotoLayout.f30173b;
        if (!yiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                wi wiVar = yiVar.f33219c2;
                if (wiVar != null) {
                    wiVar.I1(0, false, true, 0, 0, 0L, yiVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                sm0 sm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                sm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
