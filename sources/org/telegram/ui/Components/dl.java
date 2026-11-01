package org.telegram.ui.Components;

import android.view.View;
public final class dl implements q4, jk0, s81 {
    public final int f25507a;
    public final ChatAttachAlertPhotoLayout f25508b;

    public dl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25507a = i10;
        this.f25508b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        int i12 = this.f25507a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25508b;
        switch (i12) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                bi biVar = chatAttachAlertPhotoLayout.f30964b;
                biVar.M0();
                biVar.T3.H0(7, false, z10, i10, 0, 0L, biVar.e1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f23846q1;
                bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                biVar2.M0();
                biVar2.T3.H0(4, true, z10, i10, 0, 0L, biVar2.e1(), false, 0L);
                return;
        }
    }

    @Override
    public void c(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25508b;
        yl ylVar = chatAttachAlertPhotoLayout.P;
        if (ylVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            ylVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.u0(true);
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25508b;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        if (!biVar.N2) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ai aiVar = biVar.T3;
                if (aiVar != null) {
                    aiVar.H0(0, false, true, 0, 0, 0L, biVar.e1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.v5) {
                yk0 yk0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.v5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                yk0Var.d(i10, view, z11);
            }
        }
        return false;
    }
}
