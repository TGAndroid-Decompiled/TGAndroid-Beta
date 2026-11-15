package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ns implements Runnable {
    public final int f37679a;
    public final os f37680b;

    public ns(os osVar, int i7) {
        this.f37679a = i7;
        this.f37680b = osVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f37679a) {
            case 0:
                os osVar = this.f37680b;
                try {
                    i7 = osVar.f38061x + 0;
                    bitmap = osVar.f38053b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    osVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == osVar.f38062y) {
                        if (osVar.f38053b.getHeight() != i7) {
                        }
                        osVar.f38053b.eraseColor(0);
                        osVar.f38054c.save();
                        osVar.f38054c.translate(0.0f, 0);
                        osVar.c(osVar.f38054c);
                        osVar.f38054c.restore();
                        osVar.f38053b.prepareToDraw();
                        org.telegram.messenger.g0.h3(osVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = osVar.f38053b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                osVar.f38053b = Bitmap.createBitmap(osVar.f38062y, i7, Bitmap.Config.ARGB_8888);
                osVar.f38054c = new Canvas(osVar.f38053b);
                osVar.f38053b.eraseColor(0);
                osVar.f38054c.save();
                osVar.f38054c.translate(0.0f, 0);
                osVar.c(osVar.f38054c);
                osVar.f38054c.restore();
                osVar.f38053b.prepareToDraw();
                org.telegram.messenger.g0.h3(osVar.I);
                return;
            default:
                os osVar2 = this.f37680b;
                osVar2.f38056f = false;
                osVar2.g();
                if (!osVar2.f38052a) {
                    osVar2.j();
                    return;
                } else if (osVar2.f38060w == osVar2.K) {
                    osVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
