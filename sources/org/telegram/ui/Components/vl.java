package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class vl implements org.telegram.messenger.y10 {
    public final int f40866a = 1;
    public final boolean f40867b;
    public final boolean f40868c;
    public final int d;
    public final fm f40869e;

    public vl(am amVar, boolean z10, boolean z11, int i7) {
        this.f40869e = amVar;
        this.f40867b = z10;
        this.f40868c = z11;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f40866a) {
            case 0:
                Long l10 = (Long) obj;
                ui uiVar = ((cm) this.f40869e).f34217b.f37519b;
                if (uiVar != null) {
                    uiVar.G3 = true;
                }
                uiVar.X3.y1(7, true, this.f40867b, this.d, 0, 0L, uiVar.g1(), this.f40868c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f32799s1.clear();
                ChatAttachAlertPhotoLayout.f32801u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43393v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().f43393v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((am) this.f40869e).f33550c;
                ui uiVar2 = chatAttachAlertPhotoLayout.f37519b;
                uiVar2.f40430t4 = true;
                uiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                si siVar = uiVar2.X3;
                boolean z10 = this.f40867b;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                siVar.y1(i7, true, this.f40868c, this.d, 0, 0L, uiVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f32799s1.clear();
                ChatAttachAlertPhotoLayout.f32801u1.clear();
                ChatAttachAlertPhotoLayout.f32800t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32842w.f();
                uiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43393v2 = true;
                return;
        }
    }

    public vl(cm cmVar, boolean z10, int i7, boolean z11) {
        this.f40869e = cmVar;
        this.f40867b = z10;
        this.d = i7;
        this.f40868c = z11;
    }
}
