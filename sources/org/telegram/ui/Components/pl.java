package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class pl implements Utilities.Callback {
    public final int f29443a = 1;
    public final boolean f29444b;
    public final boolean f29445c;
    public final int d;
    public final cm f29446e;

    public pl(ul ulVar, boolean z10, boolean z11, int i10) {
        this.f29446e = ulVar;
        this.f29444b = z10;
        this.f29445c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f29443a) {
            case 0:
                Long l4 = (Long) obj;
                vi viVar = ((xl) this.f29446e).f32632b.f28781b;
                if (viVar != null) {
                    viVar.I1 = true;
                }
                viVar.Z1.l0(7, true, this.f29444b, this.d, 0, 0L, viVar.s1(), this.f29445c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f23861s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f23860r1.clear();
                ChatAttachAlertPhotoLayout.f23862t1.clear();
                hashMap.clear();
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33719u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.t1();
                PhotoViewer.t1().O = false;
                PhotoViewer.t1().f33719u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ul) this.f29446e).f30947c;
                vi viVar2 = chatAttachAlertPhotoLayout.f28781b;
                viVar2.f31349s2 = true;
                viVar2.I1 = true;
                chatAttachAlertPhotoLayout.a0(false);
                ti tiVar = viVar2.Z1;
                boolean z10 = this.f29444b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                tiVar.l0(i10, true, this.f29445c, this.d, 0, 0L, viVar2.s1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f23860r1.clear();
                ChatAttachAlertPhotoLayout.f23862t1.clear();
                ChatAttachAlertPhotoLayout.f23861s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                viVar2.dismiss(true);
                PhotoViewer.t1();
                PhotoViewer.t1().G0(PhotoViewer.t1().P, false);
                PhotoViewer.t1().f33719u2 = true;
                return;
        }
    }

    public pl(xl xlVar, boolean z10, int i10, boolean z11) {
        this.f29446e = xlVar;
        this.f29444b = z10;
        this.d = i10;
        this.f29445c = z11;
    }
}
