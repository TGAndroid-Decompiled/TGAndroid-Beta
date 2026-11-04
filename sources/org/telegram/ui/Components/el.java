package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class el implements org.telegram.messenger.u10 {
    public final int f33412a = 1;
    public final boolean f33413b;
    public final boolean f33414c;
    public final int d;
    public final ol f33415e;

    public el(jl jlVar, boolean z10, boolean z11, int i3) {
        this.f33415e = jlVar;
        this.f33413b = z10;
        this.f33414c = z11;
        this.d = i3;
    }

    @Override
    public final void a(Object obj) {
        int i3;
        switch (this.f33412a) {
            case 0:
                Long l10 = (Long) obj;
                bi biVar = ((ll) this.f33415e).f35787b.f38416b;
                if (biVar != null) {
                    biVar.D3 = true;
                }
                biVar.U3.o1(7, true, this.f33413b, this.d, 0, 0L, biVar.f1(), this.f33414c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f31259s1.clear();
                ChatAttachAlertPhotoLayout.f31261u1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().Q, false);
                PhotoViewer.v1().f41560v2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().P = false;
                PhotoViewer.v1().f41560v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((jl) this.f33415e).f35100c;
                bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                biVar2.f32265q4 = true;
                biVar2.D3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                zh zhVar = biVar2.U3;
                boolean z10 = this.f33413b;
                if (z10) {
                    i3 = 4;
                } else {
                    i3 = 8;
                }
                zhVar.o1(i3, true, this.f33414c, this.d, 0, 0L, biVar2.f1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f31259s1.clear();
                ChatAttachAlertPhotoLayout.f31261u1.clear();
                ChatAttachAlertPhotoLayout.f31260t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f31302w.f();
                biVar2.a(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().Q, false);
                PhotoViewer.v1().f41560v2 = true;
                return;
        }
    }

    public el(ll llVar, boolean z10, int i3, boolean z11) {
        this.f33415e = llVar;
        this.f33413b = z10;
        this.d = i3;
        this.f33414c = z11;
    }
}
