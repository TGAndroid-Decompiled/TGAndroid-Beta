package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class kl implements org.telegram.messenger.q20 {
    public final int f27815a = 1;
    public final boolean f27816b;
    public final boolean f27817c;
    public final int d;
    public final xl e;

    public kl(ql qlVar, boolean z10, boolean z11, int i10) {
        this.e = qlVar;
        this.f27816b = z10;
        this.f27817c = z11;
        this.d = i10;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        switch (this.f27815a) {
            case 0:
                Long l4 = (Long) obj;
                bi biVar = ((sl) this.e).f30262b.f30947b;
                if (biVar != null) {
                    biVar.C3 = true;
                }
                biVar.T3.H0(7, true, this.f27816b, this.d, 0, 0L, biVar.e1(), this.f27817c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23846r1.clear();
                ChatAttachAlertPhotoLayout.f23848t1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f33613u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().O = false;
                PhotoViewer.v1().f33613u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ql) this.e).f29675c;
                bi biVar2 = chatAttachAlertPhotoLayout.f30947b;
                biVar2.f24711p4 = true;
                biVar2.C3 = true;
                chatAttachAlertPhotoLayout.b0(false);
                ai aiVar = biVar2.T3;
                boolean z10 = this.f27816b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                aiVar.H0(i10, true, this.f27817c, this.d, 0, 0L, biVar2.e1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23846r1.clear();
                ChatAttachAlertPhotoLayout.f23848t1.clear();
                ChatAttachAlertPhotoLayout.f23847s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f23889w.f();
                biVar2.a(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f33613u2 = true;
                return;
        }
    }

    public kl(sl slVar, boolean z10, int i10, boolean z11) {
        this.e = slVar;
        this.f27816b = z10;
        this.d = i10;
        this.f27817c = z11;
    }
}
