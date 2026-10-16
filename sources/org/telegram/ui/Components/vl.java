package org.telegram.ui.Components;

import android.view.View;
public final class vl implements ea1, f5, cm0 {
    public final int f29749a;
    public final ChatAttachAlertPhotoLayout f29750b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f29749a = i10;
        this.f29750b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f29749a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f22718q1;
                vi viVar = chatAttachAlertPhotoLayout.f27360b;
                viVar.a1();
                viVar.f29664c2.b0(7, false, z10, i10, 0, 0L, viVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f22718q1;
                vi viVar2 = chatAttachAlertPhotoLayout.f27360b;
                viVar2.a1();
                viVar2.f29664c2.b0(4, true, z10, i10, 0, 0L, viVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750b;
        vi viVar = chatAttachAlertPhotoLayout.f27360b;
        if (!viVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.f29664c2;
                if (tiVar != null) {
                    tiVar.b0(0, false, true, 0, 0, 0L, viVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                om0 om0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                om0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750b;
        qm qmVar = chatAttachAlertPhotoLayout.P;
        if (qmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            qmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
