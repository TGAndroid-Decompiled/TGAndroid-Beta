package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ws implements Runnable {
    public final int f41886a;
    public final xs f41887b;

    public ws(xs xsVar, int i7) {
        this.f41886a = i7;
        this.f41887b = xsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f41886a) {
            case 0:
                xs xsVar = this.f41887b;
                try {
                    i7 = xsVar.f42211x + 0;
                    bitmap = xsVar.f42203b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    xsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == xsVar.f42212y) {
                        if (xsVar.f42203b.getHeight() != i7) {
                        }
                        xsVar.f42203b.eraseColor(0);
                        xsVar.f42204c.save();
                        xsVar.f42204c.translate(0.0f, 0);
                        xsVar.c(xsVar.f42204c);
                        xsVar.f42204c.restore();
                        xsVar.f42203b.prepareToDraw();
                        org.telegram.messenger.g0.g3(xsVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = xsVar.f42203b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                xsVar.f42203b = Bitmap.createBitmap(xsVar.f42212y, i7, Bitmap.Config.ARGB_8888);
                xsVar.f42204c = new Canvas(xsVar.f42203b);
                xsVar.f42203b.eraseColor(0);
                xsVar.f42204c.save();
                xsVar.f42204c.translate(0.0f, 0);
                xsVar.c(xsVar.f42204c);
                xsVar.f42204c.restore();
                xsVar.f42203b.prepareToDraw();
                org.telegram.messenger.g0.g3(xsVar.I);
                return;
            default:
                xs xsVar2 = this.f41887b;
                xsVar2.f42206f = false;
                xsVar2.g();
                if (!xsVar2.f42202a) {
                    xsVar2.j();
                    return;
                } else if (xsVar2.f42210w == xsVar2.K) {
                    xsVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
