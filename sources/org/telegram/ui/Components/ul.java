package org.telegram.ui.Components;

import android.view.View;
public final class ul implements ec1, e5, bm0 {
    public final int f33435a;
    public final ChatAttachAlertPhotoLayout f33436b;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f33435a = i10;
        this.f33436b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        int i12 = this.f33435a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33436b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f26015q1;
                ti tiVar = chatAttachAlertPhotoLayout.f30215b;
                tiVar.e1();
                tiVar.f33013c2.p0(7, false, z10, i10, 0, 0L, tiVar.w1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f26015q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f30215b;
                tiVar2.e1();
                tiVar2.f33013c2.p0(4, true, z10, i10, 0, 0L, tiVar2.w1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33436b;
        pm pmVar = chatAttachAlertPhotoLayout.P;
        if (pmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            pmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean c(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33436b;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.f33013c2;
                if (riVar != null) {
                    riVar.p0(0, false, true, 0, 0, 0L, tiVar.w1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.x5) {
                qm0 qm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.x5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                qm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
