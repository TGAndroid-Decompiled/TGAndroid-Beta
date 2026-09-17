package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class pl implements Utilities.Callback {
    public final int f27068a = 1;
    public final boolean f27069b;
    public final boolean f27070c;
    public final int d;
    public final cm e;

    public pl(ul ulVar, boolean z10, boolean z11, int i10) {
        this.e = ulVar;
        this.f27069b = z10;
        this.f27070c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27068a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((xl) this.e).f29930b.f26460b;
                if (viVar != null) {
                    viVar.I1 = true;
                }
                viVar.Z1.B1(7, true, this.f27069b, this.d, 0, 0L, viVar.s1(), this.f27070c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f21910s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f21909r1.clear();
                ChatAttachAlertPhotoLayout.f21911t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31092u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31092u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ul) this.e).f28404c;
                vi viVar2 = chatAttachAlertPhotoLayout.f26460b;
                viVar2.f28784s2 = true;
                viVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.Z1;
                boolean z10 = this.f27069b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.B1(i10, true, this.f27070c, this.d, 0, 0L, viVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f21909r1.clear();
                ChatAttachAlertPhotoLayout.f21911t1.clear();
                ChatAttachAlertPhotoLayout.f21910s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31092u2 = true;
                return;
        }
    }

    public pl(xl xlVar, boolean z10, int i10, boolean z11) {
        this.e = xlVar;
        this.f27069b = z10;
        this.d = i10;
        this.f27070c = z11;
    }
}
