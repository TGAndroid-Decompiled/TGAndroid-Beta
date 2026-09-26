package org.telegram.ui.Components;

import android.view.View;
public final class kl implements q91, d5, nl0 {
    public final int f25751a;
    public final ChatAttachAlertPhotoLayout f25752b;

    public kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25751a = i10;
        this.f25752b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f25751a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25752b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f22120q1;
                wi wiVar = chatAttachAlertPhotoLayout.f27043b;
                wiVar.Y0();
                wiVar.Z1.B1(7, false, z10, i10, 0, 0L, wiVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f22120q1;
                wi wiVar2 = chatAttachAlertPhotoLayout.f27043b;
                wiVar2.Y0();
                wiVar2.Z1.B1(4, true, z10, i10, 0, 0L, wiVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25752b;
        fm fmVar = chatAttachAlertPhotoLayout.P;
        if (fmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            fmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22120q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25752b;
        wi wiVar = chatAttachAlertPhotoLayout.f27043b;
        if (!wiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ui uiVar = wiVar.Z1;
                if (uiVar != null) {
                    uiVar.B1(0, false, true, 0, 0, 0L, wiVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                zl0 zl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                zl0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
