package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class kl implements Utilities.Callback {
    public final int f30092a = 1;
    public final boolean f30093b;
    public final boolean f30094c;
    public final int d;
    public final xl f30095e;

    public kl(pl plVar, boolean z10, boolean z11, int i10) {
        this.f30095e = plVar;
        this.f30093b = z10;
        this.f30094c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f30092a) {
            case 0:
                Long l10 = (Long) obj;
                ni niVar = ((sl) this.f30095e).f32686b.f28403b;
                if (niVar != null) {
                    niVar.E1 = true;
                }
                niVar.V1.B1(7, true, this.f30093b, this.d, 0, 0L, niVar.s1(), this.f30094c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f26253n1.clear();
                ChatAttachAlertPhotoLayout.f26255p1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35793q2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().f35793q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((pl) this.f30095e).f31705c;
                ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                niVar2.f31033o2 = true;
                niVar2.E1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                li liVar = niVar2.V1;
                boolean z10 = this.f30093b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                liVar.B1(i10, true, this.f30094c, this.d, 0, 0L, niVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f26253n1.clear();
                ChatAttachAlertPhotoLayout.f26255p1.clear();
                ChatAttachAlertPhotoLayout.f26254o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                niVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35793q2 = true;
                return;
        }
    }

    public kl(sl slVar, boolean z10, int i10, boolean z11) {
        this.f30095e = slVar;
        this.f30093b = z10;
        this.d = i10;
        this.f30094c = z11;
    }
}
