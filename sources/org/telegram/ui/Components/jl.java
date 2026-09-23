package org.telegram.ui.Components;

import android.view.View;
public final class jl implements c91, d5, cl0 {
    public final int f25342a;
    public final ChatAttachAlertPhotoLayout f25343b;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f25342a = i10;
        this.f25343b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.f25342a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25343b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f21869q1;
                wi wiVar = chatAttachAlertPhotoLayout.f26744b;
                wiVar.Y0();
                wiVar.Z1.B1(7, false, z10, i10, 0, 0L, wiVar.s1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f21869q1;
                wi wiVar2 = chatAttachAlertPhotoLayout.f26744b;
                wiVar2.Y0();
                wiVar2.Z1.B1(4, true, z10, i10, 0, 0L, wiVar2.s1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25343b;
        em emVar = chatAttachAlertPhotoLayout.P;
        if (emVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            emVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25343b;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        if (!wiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ui uiVar = wiVar.Z1;
                if (uiVar != null) {
                    uiVar.B1(0, false, true, 0, 0, 0L, wiVar.s1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.t5) {
                ol0 ol0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                ol0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
