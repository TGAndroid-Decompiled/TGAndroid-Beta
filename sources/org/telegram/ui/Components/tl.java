package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class tl implements org.telegram.messenger.w10 {
    public final int f40070a = 0;
    public final boolean f40071b;
    public final boolean f40072c;
    public final int d;
    public final dm f40073e;

    public tl(yl ylVar, boolean z10, boolean z11, int i7) {
        this.f40073e = ylVar;
        this.f40071b = z10;
        this.f40072c = z11;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f40070a) {
            case 0:
                Long l10 = (Long) obj;
                ti tiVar = ((am) this.f40073e).f33495b.f37135b;
                if (tiVar != null) {
                    tiVar.G3 = true;
                }
                tiVar.X3.y1(7, true, this.f40071b, this.d, 0, 0L, tiVar.g1(), this.f40072c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f32863s1.clear();
                ChatAttachAlertPhotoLayout.f32865u1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43474v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().P = false;
                PhotoViewer.p1().f43474v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yl) this.f40073e).f42515c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f37135b;
                tiVar2.f40019t4 = true;
                tiVar2.G3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ri riVar = tiVar2.X3;
                boolean z10 = this.f40071b;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                riVar.y1(i7, true, this.f40072c, this.d, 0, 0L, tiVar2.g1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f32863s1.clear();
                ChatAttachAlertPhotoLayout.f32865u1.clear();
                ChatAttachAlertPhotoLayout.f32864t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32906w.f();
                tiVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().Q, false);
                PhotoViewer.p1().f43474v2 = true;
                return;
        }
    }

    public tl(am amVar, boolean z10, int i7, boolean z11) {
        this.f40073e = amVar;
        this.f40071b = z10;
        this.d = i7;
        this.f40072c = z11;
    }
}
