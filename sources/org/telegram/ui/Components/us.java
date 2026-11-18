package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class us implements Runnable {
    public final int f40409a;
    public final vs f40410b;

    public us(vs vsVar, int i7) {
        this.f40409a = i7;
        this.f40410b = vsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f40409a) {
            case 0:
                vs vsVar = this.f40410b;
                try {
                    i7 = vsVar.f41410x + 0;
                    bitmap = vsVar.f41402b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    vsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vsVar.f41411y) {
                        if (vsVar.f41402b.getHeight() != i7) {
                        }
                        vsVar.f41402b.eraseColor(0);
                        vsVar.f41403c.save();
                        vsVar.f41403c.translate(0.0f, 0);
                        vsVar.c(vsVar.f41403c);
                        vsVar.f41403c.restore();
                        vsVar.f41402b.prepareToDraw();
                        org.telegram.messenger.g0.g3(vsVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = vsVar.f41402b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vsVar.f41402b = Bitmap.createBitmap(vsVar.f41411y, i7, Bitmap.Config.ARGB_8888);
                vsVar.f41403c = new Canvas(vsVar.f41402b);
                vsVar.f41402b.eraseColor(0);
                vsVar.f41403c.save();
                vsVar.f41403c.translate(0.0f, 0);
                vsVar.c(vsVar.f41403c);
                vsVar.f41403c.restore();
                vsVar.f41402b.prepareToDraw();
                org.telegram.messenger.g0.g3(vsVar.I);
                return;
            default:
                vs vsVar2 = this.f40410b;
                vsVar2.f41405f = false;
                vsVar2.g();
                if (!vsVar2.f41401a) {
                    vsVar2.j();
                    return;
                } else if (vsVar2.f41409w == vsVar2.K) {
                    vsVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
