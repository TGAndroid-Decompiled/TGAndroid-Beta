package org.telegram.ui.Components;

import android.view.View;
public final class cl implements g91, y4, jl0 {
    public final int f23961a;
    public final ChatAttachAlertPhotoLayout f23962b;

    public cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f23961a = i10;
        this.f23962b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        int i12 = this.f23961a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23962b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
                li liVar = chatAttachAlertPhotoLayout.f24282b;
                liVar.Y0();
                liVar.W1.G1(7, false, z4, i10, 0, 0L, liVar.s1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
                li liVar2 = chatAttachAlertPhotoLayout.f24282b;
                liVar2.Y0();
                liVar2.W1.G1(4, true, z4, i10, 0, 0L, liVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23962b;
        zl zlVar = chatAttachAlertPhotoLayout.M;
        if (zlVar != null) {
            chatAttachAlertPhotoLayout.f22913y0 = f10;
            zlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23962b;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        if (!liVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ji jiVar = liVar.W1;
                if (jiVar != null) {
                    jiVar.G1(0, false, true, 0, 0, 0L, liVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                ul0 ul0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                ul0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
