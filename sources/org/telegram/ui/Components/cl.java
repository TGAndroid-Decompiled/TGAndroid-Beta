package org.telegram.ui.Components;

import android.view.View;
public final class cl implements g91, y4, kl0 {
    public final int f24020a;
    public final ChatAttachAlertPhotoLayout f24021b;

    public cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f24020a = i10;
        this.f24021b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        int i12 = this.f24020a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24021b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                li liVar = chatAttachAlertPhotoLayout.f24278b;
                liVar.Y0();
                liVar.W1.H(7, false, z4, i10, 0, 0L, liVar.s1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f22894n1;
                li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                liVar2.Y0();
                liVar2.W1.H(4, true, z4, i10, 0, 0L, liVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24021b;
        am amVar = chatAttachAlertPhotoLayout.M;
        if (amVar != null) {
            chatAttachAlertPhotoLayout.f22940y0 = f10;
            amVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean f(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.f22894n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24021b;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        if (!liVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ji jiVar = liVar.W1;
                if (jiVar != null) {
                    jiVar.H(0, false, true, 0, 0, 0L, liVar.s1(), false, 0L);
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
