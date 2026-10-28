package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public final class bm implements Utilities.Callback {
    public final int f26853a = 1;
    public final boolean f26854b;
    public final boolean f26855c;
    public final int d;
    public final om e;

    public bm(gm gmVar, boolean z10, boolean z11, int i10) {
        this.e = gmVar;
        this.f26854b = z10;
        this.f26855c = z11;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f26853a) {
            case 0:
                Long l4 = (Long) obj;
                ti tiVar = ((jm) this.e).f29694b.f30254b;
                if (tiVar != null) {
                    tiVar.L1 = true;
                }
                tiVar.f32982c2.p0(7, true, this.f26854b, this.d, 0, 0L, tiVar.x1(), this.f26855c, l4.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.f26019s1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.f26018r1.clear();
                ChatAttachAlertPhotoLayout.f26020t1.clear();
                hashMap.clear();
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f35813u2 = true;
                return;
            default:
                Long l10 = (Long) obj;
                PhotoViewer.v1();
                PhotoViewer.v1().O = false;
                PhotoViewer.v1().f35813u2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gm) this.e).f28653c;
                ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                tiVar2.f33053y2 = true;
                tiVar2.L1 = true;
                chatAttachAlertPhotoLayout.b0(false);
                ri riVar = tiVar2.f32982c2;
                boolean z10 = this.f26854b;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                riVar.p0(i10, true, this.f26855c, this.d, 0, 0L, tiVar2.x1(), z10, l10.longValue());
                ChatAttachAlertPhotoLayout.f26018r1.clear();
                ChatAttachAlertPhotoLayout.f26020t1.clear();
                ChatAttachAlertPhotoLayout.f26019s1.clear();
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                tiVar2.dismiss(true);
                PhotoViewer.v1();
                PhotoViewer.v1().H0(PhotoViewer.v1().P, false);
                PhotoViewer.v1().f35813u2 = true;
                return;
        }
    }

    public bm(jm jmVar, boolean z10, int i10, boolean z11) {
        this.e = jmVar;
        this.f26854b = z10;
        this.d = i10;
        this.f26855c = z11;
    }
}
