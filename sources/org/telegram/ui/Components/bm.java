package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class bm implements Utilities.Callback {
    public final int f26903a = 1;
    public final boolean f26904b;
    public final boolean f26905c;
    public final int d;
    public final om e;

    public bm(gm gmVar, boolean z10, boolean z11, int i10) {
        this.e = gmVar;
        this.f26904b = z10;
        this.f26905c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f26903a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((jm) this.e).f29674b.f30215b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.f33013c2.p0(7, true, this.f26904b, this.d, 0, 0L, tiVar.w1(), this.f26905c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26017s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f26016r1.clear();
                ChatAttachAlertPhotoLayout.f26018t1.clear();
                hashMap.clear();
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f35789u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.u1();
                PhotoViewer.u1().O = false;
                PhotoViewer.u1().f35789u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gm) this.e).f28601c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f30215b;
                tiVar2.f33084y2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ri riVar = tiVar2.f33013c2;
                boolean z10 = this.f26904b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                riVar.p0(i10, true, this.f26905c, this.d, 0, 0L, tiVar2.w1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f26016r1.clear();
                ChatAttachAlertPhotoLayout.f26018t1.clear();
                ChatAttachAlertPhotoLayout.f26017s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f35789u2 = true;
                return;
        }
    }

    public bm(jm jmVar, boolean z10, int i10, boolean z11) {
        this.e = jmVar;
        this.f26904b = z10;
        this.d = i10;
        this.f26905c = z11;
    }
}
