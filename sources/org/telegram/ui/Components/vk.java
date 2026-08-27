package org.telegram.ui.Components;

import android.view.View;

public final class vk implements j81, x4, rk0 {

    public final int f33432a;

    public final ChatAttachAlertPhotoLayout f33433b;

    public vk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f33432a = i10;
        this.f33433b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.f33432a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33433b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                gi giVar = chatAttachAlertPhotoLayout.f34900b;
                giVar.Y0();
                giVar.V1.n0(7, false, z10, i10, 0, 0L, giVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                giVar2.Y0();
                giVar2.V1.n0(4, true, z10, i10, 0, 0L, giVar2.s1(), false, 0L);
                break;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33433b;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (!giVar.P0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                ei eiVar = giVar.V1;
                if (eiVar != null) {
                    eiVar.n0(0, false, true, 0, 0, 0L, giVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                bl0 bl0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                bl0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33433b;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        if (qlVar != null) {
            chatAttachAlertPhotoLayout.f26280x0 = f10;
            qlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
