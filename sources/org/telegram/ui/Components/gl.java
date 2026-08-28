package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class gl implements Utilities.Callback {
    public final int f28788a = 1;
    public final boolean f28789b;
    public final boolean f28790c;
    public final int d;
    public final tl f28791e;

    public gl(ll llVar, boolean z10, boolean z11, int i9) {
        this.f28791e = llVar;
        this.f28789b = z10;
        this.f28790c = z11;
        this.d = i9;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        switch (this.f28788a) {
            case 0:
                Long l10 = (Long) obj;
                ki kiVar = ((ol) this.f28791e).f31408b.f27493b;
                if (kiVar != null) {
                    kiVar.E1 = true;
                }
                kiVar.V1.L(7, true, this.f28789b, this.d, 0, 0L, kiVar.s1(), this.f28790c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f26242n1.clear();
                ChatAttachAlertPhotoLayout.f26244p1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().F0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35725q2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().f35725q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ll) this.f28791e).f30469c;
                ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                kiVar2.f30142o2 = true;
                kiVar2.E1 = true;
                chatAttachAlertPhotoLayout.Z(false);
                ii iiVar = kiVar2.V1;
                boolean z10 = this.f28789b;
                if (z10) {
                    i9 = 4;
                } else {
                    i9 = 8;
                }
                iiVar.L(i9, true, this.f28790c, this.d, 0, 0L, kiVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f26242n1.clear();
                ChatAttachAlertPhotoLayout.f26244p1.clear();
                ChatAttachAlertPhotoLayout.f26243o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                kiVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().F0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35725q2 = true;
                return;
        }
    }

    public gl(ol olVar, boolean z10, int i9, boolean z11) {
        this.f28791e = olVar;
        this.f28789b = z10;
        this.d = i9;
        this.f28790c = z11;
    }
}
