package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

public final class cl implements Utilities.Callback {

    public final int f27478a = 1;

    public final boolean f27479b;

    public final boolean f27480c;
    public final int d;

    public final pl f27481e;

    public cl(hl hlVar, boolean z10, boolean z11, int i10) {
        this.f27481e = hlVar;
        this.f27479b = z10;
        this.f27480c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27478a) {
            case 0:
                Long l10 = (Long) obj;
                gi giVar = ((kl) this.f27481e).f30130b.f34900b;
                if (giVar != null) {
                    giVar.E1 = true;
                }
                giVar.V1.n0(7, true, this.f27479b, this.d, 0, 0L, giVar.s1(), this.f27480c, l10.longValue());
                HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
                map.clear();
                ChatAttachAlertPhotoLayout.f26238n1.clear();
                ChatAttachAlertPhotoLayout.f26240p1.clear();
                map.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35729q2 = true;
                break;
            default:
                hl hlVar = (hl) this.f27481e;
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().K = false;
                PhotoViewer.t1().f35729q2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.f29055c;
                gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                giVar2.f28678o2 = true;
                giVar2.E1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ei eiVar = giVar2.V1;
                boolean z10 = this.f27479b;
                eiVar.n0(z10 ? 4 : 8, true, this.f27480c, this.d, 0, 0L, giVar2.s1(), z10, l11.longValue());
                ChatAttachAlertPhotoLayout.f26238n1.clear();
                ChatAttachAlertPhotoLayout.f26240p1.clear();
                ChatAttachAlertPhotoLayout.f26239o1.clear();
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                giVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().L, false);
                PhotoViewer.t1().f35729q2 = true;
                break;
        }
    }

    public cl(kl klVar, boolean z10, int i10, boolean z11) {
        this.f27481e = klVar;
        this.f27479b = z10;
        this.d = i10;
        this.f27480c = z11;
    }
}
