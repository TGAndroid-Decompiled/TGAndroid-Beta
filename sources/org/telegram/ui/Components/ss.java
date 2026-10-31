package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ss implements Runnable {
    public final int f30346a;
    public final ts f30347b;

    public ss(ts tsVar, int i10) {
        this.f30346a = i10;
        this.f30347b = tsVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f30346a) {
            case 0:
                ts tsVar = this.f30347b;
                try {
                    i10 = tsVar.f30686x + 0;
                    bitmap = tsVar.f30679b;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    tsVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == tsVar.f30687y) {
                        if (tsVar.f30679b.getHeight() != i10) {
                        }
                        tsVar.f30679b.eraseColor(0);
                        tsVar.f30680c.save();
                        tsVar.f30680c.translate(0.0f, 0);
                        tsVar.c(tsVar.f30680c);
                        tsVar.f30680c.restore();
                        tsVar.f30679b.prepareToDraw();
                        org.telegram.messenger.i0.g3(tsVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = tsVar.f30679b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                tsVar.f30679b = Bitmap.createBitmap(tsVar.f30687y, i10, Bitmap.Config.ARGB_8888);
                tsVar.f30680c = new Canvas(tsVar.f30679b);
                tsVar.f30679b.eraseColor(0);
                tsVar.f30680c.save();
                tsVar.f30680c.translate(0.0f, 0);
                tsVar.c(tsVar.f30680c);
                tsVar.f30680c.restore();
                tsVar.f30679b.prepareToDraw();
                org.telegram.messenger.i0.g3(tsVar.H);
                return;
            default:
                ts tsVar2 = this.f30347b;
                tsVar2.f30681f = false;
                tsVar2.g();
                if (!tsVar2.f30678a) {
                    tsVar2.j();
                    return;
                } else if (tsVar2.f30685w == tsVar2.J) {
                    tsVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
