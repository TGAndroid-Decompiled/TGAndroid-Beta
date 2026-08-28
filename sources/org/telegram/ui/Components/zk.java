package org.telegram.ui.Components;

import android.view.View;
public final class zk implements h81, x4, ok0 {
    public final int f35327a;
    public final ChatAttachAlertPhotoLayout f35328b;

    public zk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.f35327a = i9;
        this.f35328b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        int i11 = this.f35327a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35328b;
        switch (i11) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                ki kiVar = chatAttachAlertPhotoLayout.f27493b;
                kiVar.Y0();
                kiVar.V1.L(7, false, z10, i9, 0, 0L, kiVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
                ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                kiVar2.Y0();
                kiVar2.V1.L(4, true, z10, i9, 0, 0L, kiVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35328b;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (!kiVar.P0) {
            if (i9 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                ii iiVar = kiVar.V1;
                if (iiVar != null) {
                    iiVar.L(0, false, true, 0, 0, 0L, kiVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                yk0 yk0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                yk0Var.d(view, i9, z11);
            }
        }
        return false;
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35328b;
        ul ulVar = chatAttachAlertPhotoLayout.L;
        if (ulVar != null) {
            chatAttachAlertPhotoLayout.f26284x0 = f10;
            ulVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.s0(true);
    }
}
