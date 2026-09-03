package org.telegram.ui.Components;

import android.view.View;
public final class el implements g91, y4, kl0 {
    public final int f26615a;
    public final ChatAttachAlertPhotoLayout f26616b;

    public el(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f26615a = i10;
        this.f26616b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        int i12 = this.f26615a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26616b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
                mi miVar = chatAttachAlertPhotoLayout.f26590b;
                miVar.Y0();
                miVar.W1.I1(7, false, z4, i10, 0, 0L, miVar.s1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f24738n1;
                mi miVar2 = chatAttachAlertPhotoLayout.f26590b;
                miVar2.Y0();
                miVar2.W1.I1(4, true, z4, i10, 0, 0L, miVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26616b;
        bm bmVar = chatAttachAlertPhotoLayout.M;
        if (bmVar != null) {
            chatAttachAlertPhotoLayout.f24784y0 = f10;
            bmVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26616b;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        if (!miVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ki kiVar = miVar.W1;
                if (kiVar != null) {
                    kiVar.I1(0, false, true, 0, 0, 0L, miVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                vl0 vl0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                vl0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
