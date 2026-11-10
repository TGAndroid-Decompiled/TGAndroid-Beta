package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.ui.PhotoViewer;
public final class el implements org.telegram.messenger.c20 {
    public final int f33286a = 1;
    public final boolean f33287b;
    public final boolean f33288c;
    public final int d;
    public final ol f33289e;

    public el(jl jlVar, boolean z9, boolean z10, int i7) {
        this.f33289e = jlVar;
        this.f33287b = z9;
        this.f33288c = z10;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f33286a) {
            case 0:
                Long l10 = (Long) obj;
                ci ciVar = ((ll) this.f33289e).f35690b.f38656b;
                if (ciVar != null) {
                    ciVar.F3 = true;
                }
                ciVar.W3.o1(7, true, this.f33287b, this.d, 0, 0L, ciVar.f1(), this.f33288c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f31205r1.clear();
                ChatAttachAlertPhotoLayout.f31207t1.clear();
                hashMap.clear();
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().f41523u2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.p1();
                PhotoViewer.p1().O = false;
                PhotoViewer.p1().f41523u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((jl) this.f33289e).f34963c;
                ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                ciVar2.f32650s4 = true;
                ciVar2.F3 = true;
                chatAttachAlertPhotoLayout.d0(false);
                ai aiVar = ciVar2.W3;
                boolean z9 = this.f33287b;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 8;
                }
                aiVar.o1(i7, true, this.f33288c, this.d, 0, 0L, ciVar2.f1(), z9, l11.longValue());
                ChatAttachAlertPhotoLayout.f31205r1.clear();
                ChatAttachAlertPhotoLayout.f31207t1.clear();
                ChatAttachAlertPhotoLayout.f31206s1.clear();
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f31247w.f();
                ciVar2.a(true);
                PhotoViewer.p1();
                PhotoViewer.p1().z0(PhotoViewer.p1().P, false);
                PhotoViewer.p1().f41523u2 = true;
                return;
        }
    }

    public el(ll llVar, boolean z9, int i7, boolean z10) {
        this.f33289e = llVar;
        this.f33287b = z9;
        this.d = i7;
        this.f33288c = z10;
    }
}
