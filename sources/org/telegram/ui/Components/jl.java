package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class jl implements Utilities.Callback {
    public final int f25979a = 1;
    public final boolean f25980b;
    public final boolean f25981c;
    public final int d;
    public final yl e;

    public jl(pl plVar, boolean z4, boolean z10, int i10) {
        this.e = plVar;
        this.f25980b = z4;
        this.f25981c = z10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f25979a) {
            case 0:
                Long l10 = (Long) obj;
                li liVar = ((tl) this.e).f28995b.f24282b;
                if (liVar != null) {
                    liVar.F1 = true;
                }
                liVar.W1.G1(7, true, this.f25980b, this.d, 0, 0L, liVar.s1(), this.f25981c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22868o1.clear();
                ChatAttachAlertPhotoLayout.f22870q1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f31825r2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().L = false;
                PhotoViewer.t1().f31825r2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((pl) this.e).f27923c;
                li liVar2 = chatAttachAlertPhotoLayout.f24282b;
                liVar2.f26726p2 = true;
                liVar2.F1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ji jiVar = liVar2.W1;
                boolean z4 = this.f25980b;
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                jiVar.G1(i10, true, this.f25981c, this.d, 0, 0L, liVar2.s1(), z4, l11.longValue());
                ChatAttachAlertPhotoLayout.f22868o1.clear();
                ChatAttachAlertPhotoLayout.f22870q1.clear();
                ChatAttachAlertPhotoLayout.f22869p1.clear();
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                liVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f31825r2 = true;
                return;
        }
    }

    public jl(tl tlVar, boolean z4, int i10, boolean z10) {
        this.e = tlVar;
        this.f25980b = z4;
        this.d = i10;
        this.f25981c = z10;
    }
}
