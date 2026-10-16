package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class cm implements Utilities.Callback {
    public final int f23802a = 1;
    public final boolean f23803b;
    public final boolean f23804c;
    public final int d;
    public final pm e;

    public cm(hm hmVar, boolean z10, boolean z11, int i10) {
        this.e = hmVar;
        this.f23803b = z10;
        this.f23804c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f23802a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((km) this.e).f26415b.f27360b;
                if (viVar != null) {
                    viVar.L1 = true;
                }
                viVar.f29664c2.b0(7, true, this.f23803b, this.d, 0, 0L, viVar.u1(), this.f23804c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22720s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22719r1.clear();
                ChatAttachAlertPhotoLayout.f22721t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f32071u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f32071u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((hm) this.e).f25360c;
                vi viVar2 = chatAttachAlertPhotoLayout.f27360b;
                viVar2.f29723v2 = true;
                viVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.f29664c2;
                boolean z10 = this.f23803b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.b0(i10, true, this.f23804c, this.d, 0, 0L, viVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f22719r1.clear();
                ChatAttachAlertPhotoLayout.f22721t1.clear();
                ChatAttachAlertPhotoLayout.f22720s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f32071u2 = true;
                return;
        }
    }

    public cm(km kmVar, boolean z10, int i10, boolean z11) {
        this.e = kmVar;
        this.f23803b = z10;
        this.d = i10;
        this.f23804c = z11;
    }
}
