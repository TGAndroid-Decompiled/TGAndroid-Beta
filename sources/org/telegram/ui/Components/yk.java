package org.telegram.ui.Components;

import android.view.View;
public final class yk implements t4, dj0, q71 {
    public final int f40656a;
    public final ChatAttachAlertPhotoLayout f40657b;

    public yk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f40656a = i7;
        this.f40657b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        int i11 = this.f40656a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40657b;
        switch (i11) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f31184q1;
                di diVar = chatAttachAlertPhotoLayout.f38969b;
                diVar.M0();
                diVar.T3.o1(7, false, z9, i7, 0, 0L, diVar.f1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f31184q1;
                di diVar2 = chatAttachAlertPhotoLayout.f38969b;
                diVar2.M0();
                diVar2.T3.o1(4, true, z9, i7, 0, 0L, diVar2.f1(), false, 0L);
                return;
        }
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40657b;
        ql qlVar = chatAttachAlertPhotoLayout.P;
        if (qlVar != null) {
            chatAttachAlertPhotoLayout.B0 = f10;
            qlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31184q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40657b;
        di diVar = chatAttachAlertPhotoLayout.f38969b;
        if (!diVar.N2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                bi biVar = diVar.T3;
                if (biVar != null) {
                    biVar.o1(0, false, true, 0, 0, 0L, diVar.f1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.q5) {
                tj0 tj0Var = chatAttachAlertPhotoLayout.I;
                boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.K = z10;
                tj0Var.d(i7, view, z10);
            }
        }
        return false;
    }
}
