package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class fl implements org.telegram.messenger.c20 {
    public final int f33565a = 1;
    public final boolean f33566b;
    public final boolean f33567c;
    public final int d;
    public final pl f33568e;

    public fl(kl klVar, boolean z9, boolean z10, int i7) {
        this.f33568e = klVar;
        this.f33566b = z9;
        this.f33567c = z10;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f33565a) {
            case 0:
                Long l10 = (Long) obj;
                di diVar = ((ml) this.f33568e).f35969b.f38969b;
                if (diVar != null) {
                    diVar.C3 = true;
                }
                diVar.T3.o1(7, true, this.f33566b, this.d, 0, 0L, diVar.f1(), this.f33567c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31186s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f31185r1.clear();
                ChatAttachAlertPhotoLayout.f31187t1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().f41521u2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().O = false;
                PhotoViewer.p1().f41521u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((kl) this.f33568e).f35327c;
                di diVar2 = chatAttachAlertPhotoLayout.f38969b;
                diVar2.f32974p4 = true;
                diVar2.C3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                bi biVar = diVar2.T3;
                boolean z9 = this.f33566b;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                biVar.o1(i7, true, this.f33567c, this.d, 0, 0L, diVar2.f1(), z9, l11.longValue());
                ChatAttachAlertPhotoLayout.f31185r1.clear();
                ChatAttachAlertPhotoLayout.f31187t1.clear();
                ChatAttachAlertPhotoLayout.f31186s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f31227w.f();
                diVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().f41521u2 = true;
                return;
        }
    }

    public fl(ml mlVar, boolean z9, int i7, boolean z10) {
        this.f33568e = mlVar;
        this.f33566b = z9;
        this.d = i7;
        this.f33567c = z10;
    }
}
