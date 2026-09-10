package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class ul implements Utilities.Callback {
    public final int f27694a = 0;
    public final boolean f27695b;
    public final boolean f27696c;
    public final int d;
    public final hm e;

    public ul(zl zlVar, boolean z10, boolean z11, int i10) {
        this.e = zlVar;
        this.f27695b = z10;
        this.f27696c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27694a) {
            case 0:
                Long l4 = (Long) obj;
                yi yiVar = ((cm) this.e).f22179b.f26422b;
                if (yiVar != null) {
                    yiVar.I1 = true;
                }
                yiVar.Z1.A1(7, true, this.f27695b, this.d, 0, 0L, yiVar.s1(), this.f27696c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f20984r1.clear();
                ChatAttachAlertPhotoLayout.f20986t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f30191u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f30191u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((zl) this.e).f29718c;
                yi yiVar2 = chatAttachAlertPhotoLayout.f26422b;
                yiVar2.f29408s2 = true;
                yiVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                wi wiVar = yiVar2.Z1;
                boolean z10 = this.f27695b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                wiVar.A1(i10, true, this.f27696c, this.d, 0, 0L, yiVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f20984r1.clear();
                ChatAttachAlertPhotoLayout.f20986t1.clear();
                ChatAttachAlertPhotoLayout.f20985s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                yiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f30191u2 = true;
                return;
        }
    }

    public ul(cm cmVar, boolean z10, int i10, boolean z11) {
        this.e = cmVar;
        this.f27695b = z10;
        this.d = i10;
        this.f27696c = z11;
    }
}
