package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class vl implements org.telegram.messenger.x10 {
    public final int f40865a = 1;
    public final boolean f40866b;
    public final boolean f40867c;
    public final int d;
    public final fm f40868e;

    public vl(am amVar, boolean z10, boolean z11, int i7) {
        this.f40868e = amVar;
        this.f40866b = z10;
        this.f40867c = z11;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f40865a) {
            case 0:
                Long l10 = (Long) obj;
                ui uiVar = ((cm) this.f40868e).f34223b.f37521b;
                if (uiVar != null) {
                    uiVar.G3 = true;
                }
                uiVar.X3.y1(7, true, this.f40866b, this.d, 0, 0L, uiVar.g1(), this.f40867c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32797t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f32796s1.clear();
                ChatAttachAlertPhotoLayout.f32798u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43389v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().f43389v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((am) this.f40868e).f33537c;
                ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                uiVar2.f40438t4 = true;
                uiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                si siVar = uiVar2.X3;
                boolean z10 = this.f40866b;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                siVar.y1(i7, true, this.f40867c, this.d, 0, 0L, uiVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f32796s1.clear();
                ChatAttachAlertPhotoLayout.f32798u1.clear();
                ChatAttachAlertPhotoLayout.f32797t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32839w.f();
                uiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43389v2 = true;
                return;
        }
    }

    public vl(cm cmVar, boolean z10, int i7, boolean z11) {
        this.f40868e = cmVar;
        this.f40866b = z10;
        this.d = i7;
        this.f40867c = z11;
    }
}
