package org.telegram.ui.Components;

import android.view.View;
public final class ml implements z4, qj0, b81 {
    public final int f37551a;
    public final ChatAttachAlertPhotoLayout f37552b;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f37551a = i7;
        this.f37552b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        int i11 = this.f37551a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37552b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f32762r1;
                si siVar = chatAttachAlertPhotoLayout.f36766b;
                siVar.N0();
                siVar.X3.y1(7, false, z10, i7, 0, 0L, siVar.g1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
                si siVar2 = chatAttachAlertPhotoLayout.f36766b;
                siVar2.N0();
                siVar2.X3.y1(4, true, z10, i7, 0, 0L, siVar2.g1(), false, 0L);
                return;
        }
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37552b;
        em emVar = chatAttachAlertPhotoLayout.Q;
        if (emVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            emVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37552b;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        if (!siVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                qi qiVar = siVar.X3;
                if (qiVar != null) {
                    qiVar.y1(0, false, true, 0, 0, 0L, siVar.g1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.r5) {
                gk0 gk0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.r5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                gk0Var.d(i7, view, z11);
            }
        }
        return false;
    }
}
