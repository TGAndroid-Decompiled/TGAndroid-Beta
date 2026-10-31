package org.telegram.ui.Components;

import android.view.View;
public final class dl implements q4, ik0, r81 {
    public final int f25436a;
    public final ChatAttachAlertPhotoLayout f25437b;

    public dl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25436a = i10;
        this.f25437b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        int i12 = this.f25436a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25437b;
        switch (i12) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f23845q1;
                bi biVar = chatAttachAlertPhotoLayout.f30947b;
                biVar.M0();
                biVar.T3.H0(7, false, z10, i10, 0, 0L, biVar.e1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f23845q1;
                bi biVar2 = chatAttachAlertPhotoLayout.f30947b;
                biVar2.M0();
                biVar2.T3.H0(4, true, z10, i10, 0, 0L, biVar2.e1(), false, 0L);
                return;
        }
    }

    @Override
    public void c(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25437b;
        yl ylVar = chatAttachAlertPhotoLayout.P;
        if (ylVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            ylVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.u0(true);
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25437b;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        if (!biVar.N2) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ai aiVar = biVar.T3;
                if (aiVar != null) {
                    aiVar.H0(0, false, true, 0, 0, 0L, biVar.e1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.v5) {
                xk0 xk0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.v5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                xk0Var.d(i10, view, z11);
            }
        }
        return false;
    }
}
