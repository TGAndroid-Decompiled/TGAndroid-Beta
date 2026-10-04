package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class sl implements Utilities.Callback {
    public final int f30799a = 0;
    public final boolean f30800b;
    public final boolean f30801c;
    public final int d;
    public final fm f30802e;

    public sl(xl xlVar, boolean z10, boolean z11, int i10) {
        this.f30802e = xlVar;
        this.f30800b = z10;
        this.f30801c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f30799a) {
            case 0:
                Long l4 = (Long) obj;
                xi xiVar = ((am) this.f30802e).f24570b.f29642b;
                if (xiVar != null) {
                    xiVar.I1 = true;
                }
                xiVar.Z1.B1(7, true, this.f30800b, this.d, 0, 0L, xiVar.p1(), this.f30801c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24019s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24018r1.clear();
                ChatAttachAlertPhotoLayout.f24020t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34036u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f34036u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((xl) this.f30802e).f32896c;
                xi xiVar2 = chatAttachAlertPhotoLayout.f29642b;
                xiVar2.f32854s2 = true;
                xiVar2.I1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                vi viVar = xiVar2.Z1;
                boolean z10 = this.f30800b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                viVar.B1(i10, true, this.f30801c, this.d, 0, 0L, xiVar2.p1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24018r1.clear();
                ChatAttachAlertPhotoLayout.f24020t1.clear();
                ChatAttachAlertPhotoLayout.f24019s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                xiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34036u2 = true;
                return;
        }
    }

    public sl(am amVar, boolean z10, int i10, boolean z11) {
        this.f30802e = amVar;
        this.f30800b = z10;
        this.d = i10;
        this.f30801c = z11;
    }
}
