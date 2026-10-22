package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class am implements Utilities.Callback {
    public final int f24670a = 1;
    public final boolean f24671b;
    public final boolean f24672c;
    public final int d;
    public final nm e;

    public am(fm fmVar, boolean z10, boolean z11, int i10) {
        this.e = fmVar;
        this.f24671b = z10;
        this.f24672c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f24670a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((im) this.e).f27302b.f28176b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.f30541c2.b0(7, true, this.f24671b, this.d, 0, 0L, tiVar.u1(), this.f24672c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24082s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24081r1.clear();
                ChatAttachAlertPhotoLayout.f24083t1.clear();
                hashMap.clear();
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33425u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.u1();
                PhotoViewer.u1().O = false;
                PhotoViewer.u1().f33425u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((fm) this.e).f26279c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28176b;
                tiVar2.f30600v2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ri riVar = tiVar2.f30541c2;
                boolean z10 = this.f24671b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                riVar.b0(i10, true, this.f24672c, this.d, 0, 0L, tiVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24081r1.clear();
                ChatAttachAlertPhotoLayout.f24083t1.clear();
                ChatAttachAlertPhotoLayout.f24082s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33425u2 = true;
                return;
        }
    }

    public am(im imVar, boolean z10, int i10, boolean z11) {
        this.e = imVar;
        this.f24671b = z10;
        this.d = i10;
        this.f24672c = z11;
    }
}
