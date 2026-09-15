package org.telegram.ui.Components;

import android.view.View;
public final class il implements d91, b5, bl0 {
    public final int f25046a;
    public final ChatAttachAlertPhotoLayout f25047b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25046a = i10;
        this.f25047b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f25046a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25047b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f21898q1;
                vi viVar = chatAttachAlertPhotoLayout.f26462b;
                viVar.Y0();
                viVar.Z1.B1(7, false, z10, i10, 0, 0L, viVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f21898q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f26462b;
                viVar2.Y0();
                viVar2.Z1.B1(4, true, z10, i10, 0, 0L, viVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25047b;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            dmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25047b;
        vi viVar = chatAttachAlertPhotoLayout.f26462b;
        if (!viVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.Z1;
                if (tiVar != null) {
                    tiVar.B1(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                nl0 nl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                nl0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
