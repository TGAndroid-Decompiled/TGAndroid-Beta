package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class sl implements Utilities.Callback {
    public final int f30806a = 0;
    public final boolean f30807b;
    public final boolean f30808c;
    public final int d;
    public final fm f30809e;

    public sl(xl xlVar, boolean z10, boolean z11, int i10) {
        this.f30809e = xlVar;
        this.f30807b = z10;
        this.f30808c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f30806a) {
            case 0:
                Long l4 = (Long) obj;
                xi xiVar = ((am) this.f30809e).f24575b.f29648b;
                if (xiVar != null) {
                    xiVar.I1 = true;
                }
                xiVar.Z1.B1(7, true, this.f30807b, this.d, 0, 0L, xiVar.r1(), this.f30808c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24024s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24023r1.clear();
                ChatAttachAlertPhotoLayout.f24025t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34043u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f34043u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((xl) this.f30809e).f32903c;
                xi xiVar2 = chatAttachAlertPhotoLayout.f29648b;
                xiVar2.f32861s2 = true;
                xiVar2.I1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                vi viVar = xiVar2.Z1;
                boolean z10 = this.f30807b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                viVar.B1(i10, true, this.f30808c, this.d, 0, 0L, xiVar2.r1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24023r1.clear();
                ChatAttachAlertPhotoLayout.f24025t1.clear();
                ChatAttachAlertPhotoLayout.f24024s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                xiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34043u2 = true;
                return;
        }
    }

    public sl(am amVar, boolean z10, int i10, boolean z11) {
        this.f30809e = amVar;
        this.f30807b = z10;
        this.d = i10;
        this.f30808c = z11;
    }
}
