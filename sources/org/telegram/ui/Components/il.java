package org.telegram.ui.Components;

import android.view.View;
public final class il implements s91, c5, ol0 {
    public final int f25151a;
    public final ChatAttachAlertPhotoLayout f25152b;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25151a = i10;
        this.f25152b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f25151a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25152b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f22135q1;
                vi viVar = chatAttachAlertPhotoLayout.f26786b;
                viVar.Y0();
                viVar.Z1.C1(7, false, z10, i10, 0, 0L, viVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f22135q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f26786b;
                viVar2.Y0();
                viVar2.Z1.C1(4, true, z10, i10, 0, 0L, viVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25152b;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            dmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25152b;
        vi viVar = chatAttachAlertPhotoLayout.f26786b;
        if (!viVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.Z1;
                if (tiVar != null) {
                    tiVar.C1(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.u5) {
                am0 am0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.u5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                am0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
