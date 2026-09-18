package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class pl implements Utilities.Callback {
    public final int f27071a = 1;
    public final boolean f27072b;
    public final boolean f27073c;
    public final int d;
    public final cm e;

    public pl(ul ulVar, boolean z10, boolean z11, int i10) {
        this.e = ulVar;
        this.f27072b = z10;
        this.f27073c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27071a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((xl) this.e).f29933b.f26463b;
                if (viVar != null) {
                    viVar.I1 = true;
                }
                viVar.Z1.B1(7, true, this.f27072b, this.d, 0, 0L, viVar.s1(), this.f27073c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f21913s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f21912r1.clear();
                ChatAttachAlertPhotoLayout.f21914t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31096u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31096u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ul) this.e).f28407c;
                vi viVar2 = chatAttachAlertPhotoLayout.f26463b;
                viVar2.f28787s2 = true;
                viVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.Z1;
                boolean z10 = this.f27072b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.B1(i10, true, this.f27073c, this.d, 0, 0L, viVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f21912r1.clear();
                ChatAttachAlertPhotoLayout.f21914t1.clear();
                ChatAttachAlertPhotoLayout.f21913s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31096u2 = true;
                return;
        }
    }

    public pl(xl xlVar, boolean z10, int i10, boolean z11) {
        this.e = xlVar;
        this.f27072b = z10;
        this.d = i10;
        this.f27073c = z11;
    }
}
