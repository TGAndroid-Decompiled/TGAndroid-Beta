package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class sl implements Utilities.Callback {
    public final int f30800a = 0;
    public final boolean f30801b;
    public final boolean f30802c;
    public final int d;
    public final fm f30803e;

    public sl(xl xlVar, boolean z10, boolean z11, int i10) {
        this.f30803e = xlVar;
        this.f30801b = z10;
        this.f30802c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f30800a) {
            case 0:
                Long l4 = (Long) obj;
                xi xiVar = ((am) this.f30803e).f24571b.f29643b;
                if (xiVar != null) {
                    xiVar.I1 = true;
                }
                xiVar.Z1.B1(7, true, this.f30801b, this.d, 0, 0L, xiVar.p1(), this.f30802c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24020s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24019r1.clear();
                ChatAttachAlertPhotoLayout.f24021t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34037u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f34037u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((xl) this.f30803e).f32897c;
                xi xiVar2 = chatAttachAlertPhotoLayout.f29643b;
                xiVar2.f32855s2 = true;
                xiVar2.I1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                vi viVar = xiVar2.Z1;
                boolean z10 = this.f30801b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                viVar.B1(i10, true, this.f30802c, this.d, 0, 0L, xiVar2.p1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24019r1.clear();
                ChatAttachAlertPhotoLayout.f24021t1.clear();
                ChatAttachAlertPhotoLayout.f24020s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                xiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34037u2 = true;
                return;
        }
    }

    public sl(am amVar, boolean z10, int i10, boolean z11) {
        this.f30803e = amVar;
        this.f30801b = z10;
        this.d = i10;
        this.f30802c = z11;
    }
}
