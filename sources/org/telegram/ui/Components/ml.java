package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class ml implements org.telegram.messenger.z10 {
    public final int f37316a = 1;
    public final boolean f37317b;
    public final boolean f37318c;
    public final int d;
    public final wl f37319e;

    public ml(rl rlVar, boolean z10, boolean z11, int i7) {
        this.f37319e = rlVar;
        this.f37317b = z10;
        this.f37318c = z11;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f37316a) {
            case 0:
                Long l10 = (Long) obj;
                ki kiVar = ((tl) this.f37319e).f39714b.f33607b;
                if (kiVar != null) {
                    kiVar.G3 = true;
                }
                kiVar.X3.y1(7, true, this.f37317b, this.d, 0, 0L, kiVar.f1(), this.f37318c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f32366s1.clear();
                ChatAttachAlertPhotoLayout.f32368u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f42903v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().f42903v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((rl) this.f37319e).f38997c;
                ki kiVar2 = chatAttachAlertPhotoLayout.f33607b;
                kiVar2.f36499t4 = true;
                kiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ii iiVar = kiVar2.X3;
                boolean z10 = this.f37317b;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                iiVar.y1(i7, true, this.f37318c, this.d, 0, 0L, kiVar2.f1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f32366s1.clear();
                ChatAttachAlertPhotoLayout.f32368u1.clear();
                ChatAttachAlertPhotoLayout.f32367t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32409w.f();
                kiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f42903v2 = true;
                return;
        }
    }

    public ml(tl tlVar, boolean z10, int i7, boolean z11) {
        this.f37319e = tlVar;
        this.f37317b = z10;
        this.d = i7;
        this.f37318c = z11;
    }
}
