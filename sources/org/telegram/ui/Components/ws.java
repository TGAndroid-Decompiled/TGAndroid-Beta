package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ws implements Runnable {
    public final int f41850a;
    public final xs f41851b;

    public ws(xs xsVar, int i7) {
        this.f41850a = i7;
        this.f41851b = xsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f41850a) {
            case 0:
                xs xsVar = this.f41851b;
                try {
                    i7 = xsVar.f42189x + 0;
                    bitmap = xsVar.f42181b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    xsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == xsVar.f42190y) {
                        if (xsVar.f42181b.getHeight() != i7) {
                        }
                        xsVar.f42181b.eraseColor(0);
                        xsVar.f42182c.save();
                        xsVar.f42182c.translate(0.0f, 0);
                        xsVar.c(xsVar.f42182c);
                        xsVar.f42182c.restore();
                        xsVar.f42181b.prepareToDraw();
                        org.telegram.messenger.g0.g3(xsVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = xsVar.f42181b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                xsVar.f42181b = Bitmap.createBitmap(xsVar.f42190y, i7, Bitmap.Config.ARGB_8888);
                xsVar.f42182c = new Canvas(xsVar.f42181b);
                xsVar.f42181b.eraseColor(0);
                xsVar.f42182c.save();
                xsVar.f42182c.translate(0.0f, 0);
                xsVar.c(xsVar.f42182c);
                xsVar.f42182c.restore();
                xsVar.f42181b.prepareToDraw();
                org.telegram.messenger.g0.g3(xsVar.I);
                return;
            default:
                xs xsVar2 = this.f41851b;
                xsVar2.f42184f = false;
                xsVar2.g();
                if (!xsVar2.f42180a) {
                    xsVar2.j();
                    return;
                } else if (xsVar2.f42188w == xsVar2.K) {
                    xsVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
