package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class kl implements org.telegram.messenger.r20 {
    public final int f27891a = 1;
    public final boolean f27892b;
    public final boolean f27893c;
    public final int d;
    public final xl e;

    public kl(ql qlVar, boolean z10, boolean z11, int i10) {
        this.e = qlVar;
        this.f27892b = z10;
        this.f27893c = z11;
        this.d = i10;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        switch (this.f27891a) {
            case 0:
                Long l4 = (Long) obj;
                bi biVar = ((sl) this.e).f30329b.f30964b;
                if (biVar != null) {
                    biVar.C3 = true;
                }
                biVar.T3.H0(7, true, this.f27892b, this.d, 0, 0L, biVar.e1(), this.f27893c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23848s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23847r1.clear();
                ChatAttachAlertPhotoLayout.f23849t1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f33620u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().O = false;
                PhotoViewer.v1().f33620u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ql) this.e).f29750c;
                bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                biVar2.f24802p4 = true;
                biVar2.C3 = true;
                chatAttachAlertPhotoLayout.b0(false);
                ai aiVar = biVar2.T3;
                boolean z10 = this.f27892b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                aiVar.H0(i10, true, this.f27893c, this.d, 0, 0L, biVar2.e1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23847r1.clear();
                ChatAttachAlertPhotoLayout.f23849t1.clear();
                ChatAttachAlertPhotoLayout.f23848s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f23890w.f();
                biVar2.a(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f33620u2 = true;
                return;
        }
    }

    public kl(sl slVar, boolean z10, int i10, boolean z11) {
        this.e = slVar;
        this.f27892b = z10;
        this.d = i10;
        this.f27893c = z11;
    }
}
