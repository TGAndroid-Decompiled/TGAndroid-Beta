package org.telegram.ui.Components;

import android.view.View;
public final class el implements h91, y4, ll0 {
    public final int f26571a;
    public final ChatAttachAlertPhotoLayout f26572b;

    public el(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26571a = i10;
        this.f26572b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        int i12 = this.f26571a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26572b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f24736n1;
                mi miVar = chatAttachAlertPhotoLayout.f26546b;
                miVar.Y0();
                miVar.W1.I1(7, false, z4, i10, 0, 0L, miVar.s1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f24736n1;
                mi miVar2 = chatAttachAlertPhotoLayout.f26546b;
                miVar2.Y0();
                miVar2.W1.I1(4, true, z4, i10, 0, 0L, miVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26572b;
        bm bmVar = chatAttachAlertPhotoLayout.M;
        if (bmVar != null) {
            chatAttachAlertPhotoLayout.f24782y0 = f10;
            bmVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26572b;
        mi miVar = chatAttachAlertPhotoLayout.f26546b;
        if (!miVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ki kiVar = miVar.W1;
                if (kiVar != null) {
                    kiVar.I1(0, false, true, 0, 0, 0L, miVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                wl0 wl0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                wl0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
