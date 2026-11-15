package org.telegram.ui.Components;

import android.view.View;
public final class fl implements r4, ij0, r71 {
    public final int f34625a;
    public final ChatAttachAlertPhotoLayout f34626b;

    public fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.f34625a = i7;
        this.f34626b = chatAttachAlertPhotoLayout;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        int i11 = this.f34625a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34626b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                kiVar.M0();
                kiVar.X3.y1(7, false, z10, i7, 0, 0L, kiVar.f1(), false, 0L);
                return;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                kiVar2.M0();
                kiVar2.X3.y1(4, true, z10, i7, 0, 0L, kiVar2.f1(), false, 0L);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34626b;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        if (!kiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                ii iiVar = kiVar.X3;
                if (iiVar != null) {
                    iiVar.y1(0, false, true, 0, 0, 0L, kiVar.f1(), false, 0L);
                }
                return true;
            } else if (view instanceof org.telegram.ui.Cells.q5) {
                yj0 yj0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                yj0Var.d(i7, view, z11);
            }
        }
        return false;
    }

    @Override
    public void c(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34626b;
        xl xlVar = chatAttachAlertPhotoLayout.Q;
        if (xlVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            xlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }
}
