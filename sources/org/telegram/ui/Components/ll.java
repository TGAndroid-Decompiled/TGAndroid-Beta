package org.telegram.ui.Components;

import android.view.View;
public final class ll implements aa1, d5, ol0 {
    public final int f28397a;
    public final ChatAttachAlertPhotoLayout f28398b;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f28397a = i10;
        this.f28398b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        int i12 = this.f28397a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28398b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24022q1;
                xi xiVar = chatAttachAlertPhotoLayout.f29648b;
                xiVar.Z0();
                xiVar.Z1.B1(7, false, z10, i10, 0, 0L, xiVar.r1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24022q1;
                xi xiVar2 = chatAttachAlertPhotoLayout.f29648b;
                xiVar2.Z0();
                xiVar2.Z1.B1(4, true, z10, i10, 0, 0L, xiVar2.r1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28398b;
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (gmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            gmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24022q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28398b;
        xi xiVar = chatAttachAlertPhotoLayout.f29648b;
        if (!xiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                vi viVar = xiVar.Z1;
                if (viVar != null) {
                    viVar.B1(0, false, true, 0, 0, 0L, xiVar.r1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                dm0 dm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                dm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
