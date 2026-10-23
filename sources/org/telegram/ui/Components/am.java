package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class am implements Utilities.Callback {
    public final int f24773a = 1;
    public final boolean f24774b;
    public final boolean f24775c;
    public final int d;
    public final nm e;

    public am(fm fmVar, boolean z10, boolean z11, int i10) {
        this.e = fmVar;
        this.f24774b = z10;
        this.f24775c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f24773a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((im) this.e).f27367b.f28366b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.f30722c2.b0(7, true, this.f24774b, this.d, 0, 0L, tiVar.x1(), this.f24775c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24224s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24223r1.clear();
                ChatAttachAlertPhotoLayout.f24225t1.clear();
                hashMap.clear();
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33723u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.u1();
                PhotoViewer.u1().O = false;
                PhotoViewer.u1().f33723u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((fm) this.e).f26376c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f28366b;
                tiVar2.f30793y2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ri riVar = tiVar2.f30722c2;
                boolean z10 = this.f24774b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                riVar.b0(i10, true, this.f24775c, this.d, 0, 0L, tiVar2.x1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24223r1.clear();
                ChatAttachAlertPhotoLayout.f24225t1.clear();
                ChatAttachAlertPhotoLayout.f24224s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.u1();
                PhotoViewer.u1().H0(PhotoViewer.u1().P, false);
                PhotoViewer.u1().f33723u2 = true;
                return;
        }
    }

    public am(im imVar, boolean z10, int i10, boolean z11) {
        this.e = imVar;
        this.f24774b = z10;
        this.d = i10;
        this.f24775c = z11;
    }
}
