package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class dm implements Utilities.Callback {
    public final int f24446a = 1;
    public final boolean f24447b;
    public final boolean f24448c;
    public final int d;
    public final qm e;

    public dm(im imVar, boolean z10, boolean z11, int i10) {
        this.e = imVar;
        this.f24447b = z10;
        this.f24448c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f24446a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((lm) this.e).f27069b.f27671b;
                if (viVar != null) {
                    viVar.L1 = true;
                }
                viVar.f29993c2.g0(7, true, this.f24447b, this.d, 0, 0L, viVar.u1(), this.f24448c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23020s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23019r1.clear();
                ChatAttachAlertPhotoLayout.f23021t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f32369u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f32369u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((im) this.e).f25994c;
                vi viVar2 = chatAttachAlertPhotoLayout.f27671b;
                viVar2.f30052v2 = true;
                viVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.f29993c2;
                boolean z10 = this.f24447b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.g0(i10, true, this.f24448c, this.d, 0, 0L, viVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23019r1.clear();
                ChatAttachAlertPhotoLayout.f23021t1.clear();
                ChatAttachAlertPhotoLayout.f23020s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f32369u2 = true;
                return;
        }
    }

    public dm(lm lmVar, boolean z10, int i10, boolean z11) {
        this.e = lmVar;
        this.f24447b = z10;
        this.d = i10;
        this.f24448c = z11;
    }
}
