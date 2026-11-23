package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ws implements Runnable {
    public final int f41887a;
    public final xs f41888b;

    public ws(xs xsVar, int i7) {
        this.f41887a = i7;
        this.f41888b = xsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f41887a) {
            case 0:
                xs xsVar = this.f41888b;
                try {
                    i7 = xsVar.f42212x + 0;
                    bitmap = xsVar.f42204b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    xsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == xsVar.f42213y) {
                        if (xsVar.f42204b.getHeight() != i7) {
                        }
                        xsVar.f42204b.eraseColor(0);
                        xsVar.f42205c.save();
                        xsVar.f42205c.translate(0.0f, 0);
                        xsVar.c(xsVar.f42205c);
                        xsVar.f42205c.restore();
                        xsVar.f42204b.prepareToDraw();
                        org.telegram.messenger.g0.g3(xsVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = xsVar.f42204b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                xsVar.f42204b = Bitmap.createBitmap(xsVar.f42213y, i7, Bitmap.Config.ARGB_8888);
                xsVar.f42205c = new Canvas(xsVar.f42204b);
                xsVar.f42204b.eraseColor(0);
                xsVar.f42205c.save();
                xsVar.f42205c.translate(0.0f, 0);
                xsVar.c(xsVar.f42205c);
                xsVar.f42205c.restore();
                xsVar.f42204b.prepareToDraw();
                org.telegram.messenger.g0.g3(xsVar.I);
                return;
            default:
                xs xsVar2 = this.f41888b;
                xsVar2.f42207f = false;
                xsVar2.g();
                if (!xsVar2.f42203a) {
                    xsVar2.j();
                    return;
                } else if (xsVar2.f42211w == xsVar2.K) {
                    xsVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
