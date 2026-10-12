package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class im implements Utilities.Callback {
    public final int f27219a = 1;
    public final boolean f27220b;
    public final boolean f27221c;
    public final int d;
    public final vm f27222e;

    public im(nm nmVar, boolean z10, boolean z11, int i10) {
        this.f27222e = nmVar;
        this.f27220b = z10;
        this.f27221c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f27219a) {
            case 0:
                Long l4 = (Long) obj;
                aj ajVar = ((qm) this.f27222e).f29865b.f30570b;
                if (ajVar != null) {
                    ajVar.L1 = true;
                }
                ajVar.f24329c2.I1(7, true, this.f27220b, this.d, 0, 0L, ajVar.u1(), this.f27221c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23801s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23800r1.clear();
                ChatAttachAlertPhotoLayout.f23802t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33885u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f33885u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((nm) this.f27222e).f28871c;
                aj ajVar2 = chatAttachAlertPhotoLayout.f30570b;
                ajVar2.f24389v2 = true;
                ajVar2.L1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                yi yiVar = ajVar2.f24329c2;
                boolean z10 = this.f27220b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                yiVar.I1(i10, true, this.f27221c, this.d, 0, 0L, ajVar2.u1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23800r1.clear();
                ChatAttachAlertPhotoLayout.f23802t1.clear();
                ChatAttachAlertPhotoLayout.f23801s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                ajVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33885u2 = true;
                return;
        }
    }

    public im(qm qmVar, boolean z10, int i10, boolean z11) {
        this.f27222e = qmVar;
        this.f27220b = z10;
        this.d = i10;
        this.f27221c = z11;
    }
}
