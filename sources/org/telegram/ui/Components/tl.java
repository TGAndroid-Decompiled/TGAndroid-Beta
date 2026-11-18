package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class tl implements org.telegram.messenger.x10 {
    public final int f40039a = 0;
    public final boolean f40040b;
    public final boolean f40041c;
    public final int d;
    public final dm f40042e;

    public tl(yl ylVar, boolean z10, boolean z11, int i7) {
        this.f40042e = ylVar;
        this.f40040b = z10;
        this.f40041c = z11;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f40039a) {
            case 0:
                Long l10 = (Long) obj;
                si siVar = ((am) this.f40042e).f33364b.f36766b;
                if (siVar != null) {
                    siVar.G3 = true;
                }
                siVar.X3.y1(7, true, this.f40040b, this.d, 0, 0L, siVar.g1(), this.f40041c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f32763s1.clear();
                ChatAttachAlertPhotoLayout.f32765u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43348v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().f43348v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yl) this.f40042e).f42518c;
                si siVar2 = chatAttachAlertPhotoLayout.f36766b;
                siVar2.f39722t4 = true;
                siVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                qi qiVar = siVar2.X3;
                boolean z10 = this.f40040b;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                qiVar.y1(i7, true, this.f40041c, this.d, 0, 0L, siVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f32763s1.clear();
                ChatAttachAlertPhotoLayout.f32765u1.clear();
                ChatAttachAlertPhotoLayout.f32764t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32806w.f();
                siVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43348v2 = true;
                return;
        }
    }

    public tl(am amVar, boolean z10, int i7, boolean z11) {
        this.f40042e = amVar;
        this.f40040b = z10;
        this.d = i7;
        this.f40041c = z11;
    }
}
