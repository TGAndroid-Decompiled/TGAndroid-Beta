package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class rl implements Utilities.Callback {
    public final int f27986a = 1;
    public final boolean f27987b;
    public final boolean f27988c;
    public final int d;
    public final em e;

    public rl(wl wlVar, boolean z10, boolean z11, int i10) {
        this.e = wlVar;
        this.f27987b = z10;
        this.f27988c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27986a) {
            case 0:
                Long l4 = (Long) obj;
                wi wiVar = ((zl) this.e).f30913b.f27076b;
                if (wiVar != null) {
                    wiVar.I1 = true;
                }
                wiVar.Z1.B1(7, true, this.f27987b, this.d, 0, 0L, wiVar.s1(), this.f27988c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22122s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22121r1.clear();
                ChatAttachAlertPhotoLayout.f22123t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31365u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31365u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((wl) this.e).f30022c;
                wi wiVar2 = chatAttachAlertPhotoLayout.f27076b;
                wiVar2.f29984s2 = true;
                wiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ui uiVar = wiVar2.Z1;
                boolean z10 = this.f27987b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                uiVar.B1(i10, true, this.f27988c, this.d, 0, 0L, wiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f22121r1.clear();
                ChatAttachAlertPhotoLayout.f22123t1.clear();
                ChatAttachAlertPhotoLayout.f22122s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                wiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31365u2 = true;
                return;
        }
    }

    public rl(zl zlVar, boolean z10, int i10, boolean z11) {
        this.e = zlVar;
        this.f27987b = z10;
        this.d = i10;
        this.f27988c = z11;
    }
}
