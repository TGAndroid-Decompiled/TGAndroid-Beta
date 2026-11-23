package org.telegram.ui.Components;

import android.view.View;
public final class ml implements z4, sj0, f81 {
    public final int f37473a;
    public final ChatAttachAlertPhotoLayout f37474b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f37473a = i7;
        this.f37474b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        int i11 = this.f37473a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37474b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f32862r1;
                ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                tiVar.N0();
                tiVar.X3.y1(7, false, z10, i7, 0, 0L, tiVar.g1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f37135b;
                tiVar2.N0();
                tiVar2.X3.y1(4, true, z10, i7, 0, 0L, tiVar2.g1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37474b;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        if (!tiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                ri riVar = tiVar.X3;
                if (riVar != null) {
                    riVar.y1(0, false, true, 0, 0, 0L, tiVar.g1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.r5) {
                ik0 ik0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.r5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                ik0Var.d(i7, view, z11);
            }
        }
        return false;
    }

    @Override
    public void c(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37474b;
        em emVar = chatAttachAlertPhotoLayout.Q;
        if (emVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            emVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }
}
