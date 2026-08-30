package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class kl implements Utilities.Callback {
    public final int f26309a = 1;
    public final boolean f26310b;
    public final boolean f26311c;
    public final int d;
    public final zl e;

    public kl(ql qlVar, boolean z4, boolean z10, int i10) {
        this.e = qlVar;
        this.f26310b = z4;
        this.f26311c = z10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f26309a) {
            case 0:
                Long l10 = (Long) obj;
                li liVar = ((ul) this.e).f29250b.f24278b;
                if (liVar != null) {
                    liVar.F1 = true;
                }
                liVar.W1.H(7, true, this.f26310b, this.d, 0, 0L, liVar.s1(), this.f26311c, l10.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f22896p1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f22895o1.clear();
                ChatAttachAlertPhotoLayout.f22897q1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f31851r2 = true;
                return;
            default:
                Long l11 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().L = false;
                PhotoViewer.t1().f31851r2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ql) this.e).f28151c;
                li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                liVar2.f26730p2 = true;
                liVar2.F1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ji jiVar = liVar2.W1;
                boolean z4 = this.f26310b;
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                jiVar.H(i10, true, this.f26311c, this.d, 0, 0L, liVar2.s1(), z4, l11.longValue());
                ChatAttachAlertPhotoLayout.f22895o1.clear();
                ChatAttachAlertPhotoLayout.f22897q1.clear();
                ChatAttachAlertPhotoLayout.f22896p1.clear();
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                liVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().M, false);
                PhotoViewer.t1().f31851r2 = true;
                return;
        }
    }

    public kl(ul ulVar, boolean z4, int i10, boolean z10) {
        this.e = ulVar;
        this.f26310b = z4;
        this.d = i10;
        this.f26311c = z10;
    }
}
