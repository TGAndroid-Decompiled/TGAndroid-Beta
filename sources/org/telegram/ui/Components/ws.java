package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ws implements Runnable {
    public final int f41893a;
    public final xs f41894b;

    public ws(xs xsVar, int i7) {
        this.f41893a = i7;
        this.f41894b = xsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f41893a) {
            case 0:
                xs xsVar = this.f41894b;
                try {
                    i7 = xsVar.f42219x + 0;
                    bitmap = xsVar.f42211b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    xsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == xsVar.f42220y) {
                        if (xsVar.f42211b.getHeight() != i7) {
                        }
                        xsVar.f42211b.eraseColor(0);
                        xsVar.f42212c.save();
                        xsVar.f42212c.translate(0.0f, 0);
                        xsVar.c(xsVar.f42212c);
                        xsVar.f42212c.restore();
                        xsVar.f42211b.prepareToDraw();
                        org.telegram.messenger.g0.g3(xsVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = xsVar.f42211b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                xsVar.f42211b = Bitmap.createBitmap(xsVar.f42220y, i7, Bitmap.Config.ARGB_8888);
                xsVar.f42212c = new Canvas(xsVar.f42211b);
                xsVar.f42211b.eraseColor(0);
                xsVar.f42212c.save();
                xsVar.f42212c.translate(0.0f, 0);
                xsVar.c(xsVar.f42212c);
                xsVar.f42212c.restore();
                xsVar.f42211b.prepareToDraw();
                org.telegram.messenger.g0.g3(xsVar.I);
                return;
            default:
                xs xsVar2 = this.f41894b;
                xsVar2.f42214f = false;
                xsVar2.g();
                if (!xsVar2.f42210a) {
                    xsVar2.j();
                    return;
                } else if (xsVar2.f42218w == xsVar2.K) {
                    xsVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
