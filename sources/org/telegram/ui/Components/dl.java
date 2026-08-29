package org.telegram.ui.Components;

import android.view.View;
public final class dl implements t81, b5, bl0 {
    public final int f27805a;
    public final ChatAttachAlertPhotoLayout f27806b;

    public dl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f27805a = i10;
        this.f27806b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.f27805a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27806b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                ni niVar = chatAttachAlertPhotoLayout.f28403b;
                niVar.Y0();
                niVar.V1.B1(7, false, z10, i10, 0, 0L, niVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                niVar2.Y0();
                niVar2.V1.B1(4, true, z10, i10, 0, 0L, niVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27806b;
        yl ylVar = chatAttachAlertPhotoLayout.L;
        if (ylVar != null) {
            chatAttachAlertPhotoLayout.f26295x0 = f9;
            ylVar.setZoom(f9);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean c(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27806b;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (!niVar.P0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                li liVar = niVar.V1;
                if (liVar != null) {
                    liVar.B1(0, false, true, 0, 0, 0L, niVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.r5) {
                ll0 ll0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.r5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                ll0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
