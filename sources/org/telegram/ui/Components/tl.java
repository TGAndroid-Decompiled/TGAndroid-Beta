package org.telegram.ui.Components;

import android.view.View;
public final class tl implements v91, e5, yl0 {
    public final int f30653a;
    public final ChatAttachAlertPhotoLayout f30654b;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.f30653a = i10;
        this.f30654b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        int i12 = this.f30653a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30654b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.f24073q1;
                ti tiVar = chatAttachAlertPhotoLayout.f28238b;
                tiVar.a1();
                tiVar.f30566c2.b0(7, false, z10, i10, 0, 0L, tiVar.u1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f24073q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28238b;
                tiVar2.a1();
                tiVar2.f30566c2.b0(4, true, z10, i10, 0, 0L, tiVar2.u1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24073q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30654b;
        ti tiVar = chatAttachAlertPhotoLayout.f28238b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.f30566c2;
                if (riVar != null) {
                    riVar.b0(0, false, true, 0, 0, 0L, tiVar.u1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.s5) {
                km0 km0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                km0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30654b;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            omVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
