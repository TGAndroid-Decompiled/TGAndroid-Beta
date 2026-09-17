package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class pl implements Utilities.Callback {
    public final int f29416a = 1;
    public final boolean f29417b;
    public final boolean f29418c;
    public final int d;
    public final cm f29419e;

    public pl(ul ulVar, boolean z10, boolean z11, int i10) {
        this.f29419e = ulVar;
        this.f29417b = z10;
        this.f29418c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f29416a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((xl) this.f29419e).f32605b.f28754b;
                if (viVar != null) {
                    viVar.I1 = true;
                }
                viVar.Z1.l0(7, true, this.f29417b, this.d, 0, 0L, viVar.s1(), this.f29418c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23834s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23833r1.clear();
                ChatAttachAlertPhotoLayout.f23835t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33692u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f33692u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ul) this.f29419e).f30920c;
                vi viVar2 = chatAttachAlertPhotoLayout.f28754b;
                viVar2.f31322s2 = true;
                viVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.Z1;
                boolean z10 = this.f29417b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.l0(i10, true, this.f29418c, this.d, 0, 0L, viVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23833r1.clear();
                ChatAttachAlertPhotoLayout.f23835t1.clear();
                ChatAttachAlertPhotoLayout.f23834s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33692u2 = true;
                return;
        }
    }

    public pl(xl xlVar, boolean z10, int i10, boolean z11) {
        this.f29419e = xlVar;
        this.f29417b = z10;
        this.d = i10;
        this.f29418c = z11;
    }
}
