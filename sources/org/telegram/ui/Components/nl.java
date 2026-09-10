package org.telegram.ui.Components;

import android.view.View;
public final class nl implements p91, c5, ll0 {
    public final int f25550a;
    public final ChatAttachAlertPhotoLayout f25551b;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25550a = i10;
        this.f25551b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.f25550a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25551b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f20983q1;
                yi yiVar = chatAttachAlertPhotoLayout.f26422b;
                yiVar.Y0();
                yiVar.Z1.A1(7, false, z10, i10, 0, 0L, yiVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f20983q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.f26422b;
                yiVar2.Y0();
                yiVar2.Z1.A1(4, true, z10, i10, 0, 0L, yiVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25551b;
        im imVar = chatAttachAlertPhotoLayout.P;
        if (imVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            imVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25551b;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        if (!yiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                wi wiVar = yiVar.Z1;
                if (wiVar != null) {
                    wiVar.A1(0, false, true, 0, 0, 0L, yiVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                xl0 xl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                xl0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
