package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class ql implements Utilities.Callback {
    public final int f27381a = 1;
    public final boolean f27382b;
    public final boolean f27383c;
    public final int d;
    public final dm e;

    public ql(vl vlVar, boolean z10, boolean z11, int i10) {
        this.e = vlVar;
        this.f27382b = z10;
        this.f27383c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27381a) {
            case 0:
                Long l4 = (Long) obj;
                wi wiVar = ((yl) this.e).f30309b.f26744b;
                if (wiVar != null) {
                    wiVar.I1 = true;
                }
                wiVar.Z1.B1(7, true, this.f27382b, this.d, 0, 0L, wiVar.s1(), this.f27383c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f21871s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f21870r1.clear();
                ChatAttachAlertPhotoLayout.f21872t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31050u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f31050u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vl) this.e).f28768c;
                wi wiVar2 = chatAttachAlertPhotoLayout.f26744b;
                wiVar2.f29707s2 = true;
                wiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ui uiVar = wiVar2.Z1;
                boolean z10 = this.f27382b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                uiVar.B1(i10, true, this.f27383c, this.d, 0, 0L, wiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f21870r1.clear();
                ChatAttachAlertPhotoLayout.f21872t1.clear();
                ChatAttachAlertPhotoLayout.f21871s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                wiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f31050u2 = true;
                return;
        }
    }

    public ql(yl ylVar, boolean z10, int i10, boolean z11) {
        this.e = ylVar;
        this.f27382b = z10;
        this.d = i10;
        this.f27383c = z11;
    }
}
