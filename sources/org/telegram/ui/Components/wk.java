package org.telegram.ui.Components;

import android.view.View;
public final class wk implements r4, hj0, i71 {
    public final int f40021a;
    public final ChatAttachAlertPhotoLayout f40022b;

    public wk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.f40021a = i3;
        this.f40022b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        int i11 = this.f40021a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40022b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                bi biVar = chatAttachAlertPhotoLayout.f38416b;
                biVar.M0();
                biVar.U3.o1(7, false, z10, i3, 0, 0L, biVar.f1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                biVar2.M0();
                biVar2.U3.o1(4, true, z10, i3, 0, 0L, biVar2.f1(), false, 0L);
                return;
        }
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40022b;
        pl plVar = chatAttachAlertPhotoLayout.Q;
        if (plVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            plVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public boolean f(int i3, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40022b;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        if (!biVar.O2) {
            if (i3 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                zh zhVar = biVar.U3;
                if (zhVar != null) {
                    zhVar.o1(0, false, true, 0, 0, 0L, biVar.f1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.q5) {
                xj0 xj0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                xj0Var.d(i3, view, z11);
            }
        }
        return false;
    }
}
