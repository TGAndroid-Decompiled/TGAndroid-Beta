package org.telegram.ui.Components;

import android.view.View;
public final class rl implements ea1, b5, bm0 {
    public final int f30226a;
    public final ChatAttachAlertPhotoLayout f30227b;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30226a = i10;
        this.f30227b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        int i12 = this.f30226a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30227b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24223q1;
                ri riVar = chatAttachAlertPhotoLayout.f27704b;
                riVar.d1();
                riVar.f30138c2.b0(7, false, z10, i10, 0, 0L, riVar.x1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24223q1;
                ri riVar2 = chatAttachAlertPhotoLayout.f27704b;
                riVar2.d1();
                riVar2.f30138c2.b0(4, true, z10, i10, 0, 0L, riVar2.x1(), false, 0L);
                return;
        }
    }

    @Override
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30227b;
        mm mmVar = chatAttachAlertPhotoLayout.P;
        if (mmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            mmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30227b;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        if (!riVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                pi piVar = riVar.f30138c2;
                if (piVar != null) {
                    piVar.b0(0, false, true, 0, 0, 0L, riVar.x1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                nm0 nm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                nm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
