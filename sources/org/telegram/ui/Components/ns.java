package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ns implements Runnable {
    public final int f37690a;
    public final os f37691b;

    public ns(os osVar, int i7) {
        this.f37690a = i7;
        this.f37691b = osVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f37690a) {
            case 0:
                os osVar = this.f37691b;
                try {
                    i7 = osVar.f38063x + 0;
                    bitmap = osVar.f38055b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    osVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == osVar.f38064y) {
                        if (osVar.f38055b.getHeight() != i7) {
                        }
                        osVar.f38055b.eraseColor(0);
                        osVar.f38056c.save();
                        osVar.f38056c.translate(0.0f, 0);
                        osVar.c(osVar.f38056c);
                        osVar.f38056c.restore();
                        osVar.f38055b.prepareToDraw();
                        org.telegram.messenger.g0.h3(osVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = osVar.f38055b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                osVar.f38055b = Bitmap.createBitmap(osVar.f38064y, i7, Bitmap.Config.ARGB_8888);
                osVar.f38056c = new Canvas(osVar.f38055b);
                osVar.f38055b.eraseColor(0);
                osVar.f38056c.save();
                osVar.f38056c.translate(0.0f, 0);
                osVar.c(osVar.f38056c);
                osVar.f38056c.restore();
                osVar.f38055b.prepareToDraw();
                org.telegram.messenger.g0.h3(osVar.I);
                return;
            default:
                os osVar2 = this.f37691b;
                osVar2.f38058f = false;
                osVar2.g();
                if (!osVar2.f38054a) {
                    osVar2.j();
                    return;
                } else if (osVar2.f38062w == osVar2.K) {
                    osVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
