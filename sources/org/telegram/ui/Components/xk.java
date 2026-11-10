package org.telegram.ui.Components;

import android.view.View;
public final class xk implements s4, dj0, q71 {
    public final int f40321a;
    public final ChatAttachAlertPhotoLayout f40322b;

    public xk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f40321a = i7;
        this.f40322b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        int i11 = this.f40321a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40322b;
        switch (i11) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
                ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                ciVar.M0();
                ciVar.W3.o1(7, false, z9, i7, 0, 0L, ciVar.f1(), false, 0L);
                return;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.f31204q1;
                ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                ciVar2.M0();
                ciVar2.W3.o1(4, true, z9, i7, 0, 0L, ciVar2.f1(), false, 0L);
                return;
        }
    }

    @Override
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40322b;
        pl plVar = chatAttachAlertPhotoLayout.P;
        if (plVar != null) {
            chatAttachAlertPhotoLayout.B0 = f10;
            plVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override
    public boolean c(int i7, View view) {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40322b;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        if (!ciVar.Q2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ai aiVar = ciVar.W3;
                if (aiVar != null) {
                    aiVar.o1(0, false, true, 0, 0, 0L, ciVar.f1(), false, 0L);
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
