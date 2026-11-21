package org.telegram.ui.Components;

import android.view.View;
public final class ol implements a5, sj0, e81 {
    public final int f38282a;
    public final ChatAttachAlertPhotoLayout f38283b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f38282a = i7;
        this.f38283b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        int i11 = this.f38282a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38283b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f32795r1;
                ui uiVar = chatAttachAlertPhotoLayout.f37521b;
                uiVar.N0();
                uiVar.X3.y1(7, false, z10, i7, 0, 0L, uiVar.g1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f32795r1;
                ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                uiVar2.N0();
                uiVar2.X3.y1(4, true, z10, i7, 0, 0L, uiVar2.g1(), false, 0L);
                return;
        }
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38283b;
        gm gmVar = chatAttachAlertPhotoLayout.Q;
        if (gmVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            gmVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38283b;
        ui uiVar = chatAttachAlertPhotoLayout.f37521b;
        if (!uiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                si siVar = uiVar.X3;
                if (siVar != null) {
                    siVar.y1(0, false, true, 0, 0, 0L, uiVar.g1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                ik0 ik0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                ik0Var.d(i7, view, z11);
            }
        }
        return false;
    }
}
