package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class yl implements Utilities.Callback {
    public final int f32975a = 1;
    public final boolean f32976b;
    public final boolean f32977c;
    public final int d;
    public final lm e;

    public yl(dm dmVar, boolean z10, boolean z11, int i10) {
        this.e = dmVar;
        this.f32976b = z10;
        this.f32977c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f32975a) {
            case 0:
                Long l4 = (Long) obj;
                ri riVar = ((gm) this.e).f26727b.f27704b;
                if (riVar != null) {
                    riVar.L1 = true;
                }
                riVar.f30138c2.b0(7, true, this.f32976b, this.d, 0, 0L, riVar.x1(), this.f32977c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24224r1.clear();
                ChatAttachAlertPhotoLayout.f24226t1.clear();
                hashMap.clear();
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33725u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.u1();
                PhotoViewer.u1().O = false;
                PhotoViewer.u1().f33725u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((dm) this.e).f25790c;
                ri riVar2 = chatAttachAlertPhotoLayout.f27704b;
                riVar2.f30209y2 = true;
                riVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                pi piVar = riVar2.f30138c2;
                boolean z10 = this.f32976b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                piVar.b0(i10, true, this.f32977c, this.d, 0, 0L, riVar2.x1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24224r1.clear();
                ChatAttachAlertPhotoLayout.f24226t1.clear();
                ChatAttachAlertPhotoLayout.f24225s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                riVar2.dismiss(true);
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33725u2 = true;
                return;
        }
    }

    public yl(gm gmVar, boolean z10, int i10, boolean z11) {
        this.e = gmVar;
        this.f32976b = z10;
        this.d = i10;
        this.f32977c = z11;
    }
}
