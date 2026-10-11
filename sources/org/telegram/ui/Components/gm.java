package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class gm implements Utilities.Callback {
    public final int f26769a = 1;
    public final boolean f26770b;
    public final boolean f26771c;
    public final int d;
    public final tm f26772e;

    public gm(lm lmVar, boolean z10, boolean z11, int i10) {
        this.f26772e = lmVar;
        this.f26770b = z10;
        this.f26771c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f26769a) {
            case 0:
                Long l4 = (Long) obj;
                yi yiVar = ((om) this.f26772e).f29428b.f30161b;
                if (yiVar != null) {
                    yiVar.L1 = true;
                }
                yiVar.f33207c2.I1(7, true, this.f26770b, this.d, 0, 0L, yiVar.u1(), this.f26771c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f24015s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f24014r1.clear();
                ChatAttachAlertPhotoLayout.f24016t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34074u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f34074u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((lm) this.f26772e).f28363c;
                yi yiVar2 = chatAttachAlertPhotoLayout.f30161b;
                yiVar2.f33267v2 = true;
                yiVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                wi wiVar = yiVar2.f33207c2;
                boolean z10 = this.f26770b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                wiVar.I1(i10, true, this.f26771c, this.d, 0, 0L, yiVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f24014r1.clear();
                ChatAttachAlertPhotoLayout.f24016t1.clear();
                ChatAttachAlertPhotoLayout.f24015s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                yiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f34074u2 = true;
                return;
        }
    }

    public gm(om omVar, boolean z10, int i10, boolean z11) {
        this.f26772e = omVar;
        this.f26770b = z10;
        this.d = i10;
        this.f26771c = z11;
    }
}
