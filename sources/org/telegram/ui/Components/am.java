package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class am implements Utilities.Callback {
    public final int f24666a = 1;
    public final boolean f24667b;
    public final boolean f24668c;
    public final int d;
    public final nm e;

    public am(fm fmVar, boolean z10, boolean z11, int i10) {
        this.e = fmVar;
        this.f24667b = z10;
        this.f24668c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f24666a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((im) this.e).f27265b.f28245b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.f30573c2.b0(7, true, this.f24667b, this.d, 0, 0L, tiVar.u1(), this.f24668c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24082s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24081r1.clear();
                ChatAttachAlertPhotoLayout.f24083t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33416u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f33416u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((fm) this.e).f26275c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28245b;
                tiVar2.f30632v2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ri riVar = tiVar2.f30573c2;
                boolean z10 = this.f24667b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                riVar.b0(i10, true, this.f24668c, this.d, 0, 0L, tiVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24081r1.clear();
                ChatAttachAlertPhotoLayout.f24083t1.clear();
                ChatAttachAlertPhotoLayout.f24082s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33416u2 = true;
                return;
        }
    }

    public am(im imVar, boolean z10, int i10, boolean z11) {
        this.e = imVar;
        this.f24667b = z10;
        this.d = i10;
        this.f24668c = z11;
    }
}
