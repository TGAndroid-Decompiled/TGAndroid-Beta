package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ts implements Runnable {
    public final int f40140a;
    public final us f40141b;

    public ts(us usVar, int i7) {
        this.f40140a = i7;
        this.f40141b = usVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f40140a) {
            case 0:
                us usVar = this.f40141b;
                try {
                    i7 = usVar.f40457x + 0;
                    bitmap = usVar.f40449b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    usVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == usVar.f40458y) {
                        if (usVar.f40449b.getHeight() != i7) {
                        }
                        usVar.f40449b.eraseColor(0);
                        usVar.f40450c.save();
                        usVar.f40450c.translate(0.0f, 0);
                        usVar.c(usVar.f40450c);
                        usVar.f40450c.restore();
                        usVar.f40449b.prepareToDraw();
                        org.telegram.messenger.g0.g3(usVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = usVar.f40449b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                usVar.f40449b = Bitmap.createBitmap(usVar.f40458y, i7, Bitmap.Config.ARGB_8888);
                usVar.f40450c = new Canvas(usVar.f40449b);
                usVar.f40449b.eraseColor(0);
                usVar.f40450c.save();
                usVar.f40450c.translate(0.0f, 0);
                usVar.c(usVar.f40450c);
                usVar.f40450c.restore();
                usVar.f40449b.prepareToDraw();
                org.telegram.messenger.g0.g3(usVar.I);
                return;
            default:
                us usVar2 = this.f40141b;
                usVar2.f40452f = false;
                usVar2.g();
                if (!usVar2.f40448a) {
                    usVar2.j();
                    return;
                } else if (usVar2.f40456w == usVar2.K) {
                    usVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
