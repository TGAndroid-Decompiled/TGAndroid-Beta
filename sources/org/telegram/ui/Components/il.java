package org.telegram.ui.Components;

import android.view.View;
public final class il implements e91, b5, cl0 {
    public final int f24953a;
    public final ChatAttachAlertPhotoLayout f24954b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f24953a = i10;
        this.f24954b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f24953a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24954b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f21908q1;
                vi viVar = chatAttachAlertPhotoLayout.f26460b;
                viVar.Y0();
                viVar.Z1.B1(7, false, z10, i10, 0, 0L, viVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f21908q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f26460b;
                viVar2.Y0();
                viVar2.Z1.B1(4, true, z10, i10, 0, 0L, viVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24954b;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            dmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f21908q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24954b;
        vi viVar = chatAttachAlertPhotoLayout.f26460b;
        if (!viVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.Z1;
                if (tiVar != null) {
                    tiVar.B1(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                ol0 ol0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                ol0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
