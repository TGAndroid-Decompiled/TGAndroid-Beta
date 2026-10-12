package org.telegram.ui.Components;

import android.view.View;
public final class bm implements na1, f5, mm0 {
    public final int f24677a;
    public final ChatAttachAlertPhotoLayout f24678b;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f24677a = i10;
        this.f24678b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f24677a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24678b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f23799q1;
                aj ajVar = chatAttachAlertPhotoLayout.f30570b;
                ajVar.a1();
                ajVar.f24329c2.I1(7, false, z10, i10, 0, 0L, ajVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f23799q1;
                aj ajVar2 = chatAttachAlertPhotoLayout.f30570b;
                ajVar2.a1();
                ajVar2.f24329c2.I1(4, true, z10, i10, 0, 0L, ajVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24678b;
        wm wmVar = chatAttachAlertPhotoLayout.P;
        if (wmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            wmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24678b;
        aj ajVar = chatAttachAlertPhotoLayout.f30570b;
        if (!ajVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                yi yiVar = ajVar.f24329c2;
                if (yiVar != null) {
                    yiVar.I1(0, false, true, 0, 0, 0L, ajVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                ym0 ym0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                ym0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
