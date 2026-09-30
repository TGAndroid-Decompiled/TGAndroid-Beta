package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class sl implements Utilities.Callback {
    public final int f28281a = 0;
    public final boolean f28282b;
    public final boolean f28283c;
    public final int d;
    public final fm e;

    public sl(xl xlVar, boolean z10, boolean z11, int i10) {
        this.e = xlVar;
        this.f28282b = z10;
        this.f28283c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f28281a) {
            case 0:
                Long l4 = (Long) obj;
                xi xiVar = ((am) this.e).f22659b.f27362b;
                if (xiVar != null) {
                    xiVar.I1 = true;
                }
                xiVar.Z1.B1(7, true, this.f28282b, this.d, 0, 0L, xiVar.s1(), this.f28283c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22144s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22143r1.clear();
                ChatAttachAlertPhotoLayout.f22145t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31439u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31439u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((xl) this.e).f30350c;
                xi xiVar2 = chatAttachAlertPhotoLayout.f27362b;
                xiVar2.f30312s2 = true;
                xiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                vi viVar = xiVar2.Z1;
                boolean z10 = this.f28282b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                viVar.B1(i10, true, this.f28283c, this.d, 0, 0L, xiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f22143r1.clear();
                ChatAttachAlertPhotoLayout.f22145t1.clear();
                ChatAttachAlertPhotoLayout.f22144s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                xiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31439u2 = true;
                return;
        }
    }

    public sl(am amVar, boolean z10, int i10, boolean z11) {
        this.e = amVar;
        this.f28282b = z10;
        this.d = i10;
        this.f28283c = z11;
    }
}
