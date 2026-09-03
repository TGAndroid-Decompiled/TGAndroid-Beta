package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class ll implements Utilities.Callback {
    public final int f28803a = 1;
    public final boolean f28804b;
    public final boolean f28805c;
    public final int d;
    public final am f28806e;

    public ll(rl rlVar, boolean z4, boolean z10, int i10) {
        this.f28806e = rlVar;
        this.f28804b = z4;
        this.f28805c = z10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f28803a) {
            case 0:
                Long l10 = (Long) obj;
                mi miVar = ((vl) this.f28806e).f31904b.f26590b;
                if (miVar != null) {
                    miVar.F1 = true;
                }
                miVar.W1.I1(7, true, this.f28804b, this.d, 0, 0L, miVar.s1(), this.f28805c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24740p1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24739o1.clear();
                ChatAttachAlertPhotoLayout.f24741q1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f34377r2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().L = false;
                PhotoViewer.t1().f34377r2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((rl) this.f28806e).f30807c;
                mi miVar2 = chatAttachAlertPhotoLayout.f26590b;
                miVar2.f29100p2 = true;
                miVar2.F1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ki kiVar = miVar2.W1;
                boolean z4 = this.f28804b;
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                kiVar.I1(i10, true, this.f28805c, this.d, 0, 0L, miVar2.s1(), z4, l11.longValue());
                ChatAttachAlertPhotoLayout.f24739o1.clear();
                ChatAttachAlertPhotoLayout.f24741q1.clear();
                ChatAttachAlertPhotoLayout.f24740p1.clear();
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                miVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f34377r2 = true;
                return;
        }
    }

    public ll(vl vlVar, boolean z4, int i10, boolean z10) {
        this.f28806e = vlVar;
        this.f28804b = z4;
        this.d = i10;
        this.f28805c = z10;
    }
}
