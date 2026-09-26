package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class rl implements Utilities.Callback {
    public final int f27993a = 1;
    public final boolean f27994b;
    public final boolean f27995c;
    public final int d;
    public final em e;

    public rl(wl wlVar, boolean z10, boolean z11, int i10) {
        this.e = wlVar;
        this.f27994b = z10;
        this.f27995c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27993a) {
            case 0:
                Long l4 = (Long) obj;
                wi wiVar = ((zl) this.e).f30915b.f27043b;
                if (wiVar != null) {
                    wiVar.I1 = true;
                }
                wiVar.Z1.B1(7, true, this.f27994b, this.d, 0, 0L, wiVar.s1(), this.f27995c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22122s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22121r1.clear();
                ChatAttachAlertPhotoLayout.f22123t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31364u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31364u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((wl) this.e).f30101c;
                wi wiVar2 = chatAttachAlertPhotoLayout.f27043b;
                wiVar2.f30062s2 = true;
                wiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ui uiVar = wiVar2.Z1;
                boolean z10 = this.f27994b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                uiVar.B1(i10, true, this.f27995c, this.d, 0, 0L, wiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f22121r1.clear();
                ChatAttachAlertPhotoLayout.f22123t1.clear();
                ChatAttachAlertPhotoLayout.f22122s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                wiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31364u2 = true;
                return;
        }
    }

    public rl(zl zlVar, boolean z10, int i10, boolean z11) {
        this.e = zlVar;
        this.f27994b = z10;
        this.d = i10;
        this.f27995c = z11;
    }
}
