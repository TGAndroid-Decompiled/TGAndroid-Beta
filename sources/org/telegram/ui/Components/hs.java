package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34370a;
    public final is f34371b;

    public hs(is isVar, int i7) {
        this.f34370a = i7;
        this.f34371b = isVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f34370a) {
            case 0:
                is isVar = this.f34371b;
                try {
                    i7 = isVar.f34851x + 0;
                    bitmap = isVar.f34843b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34852y) {
                        if (isVar.f34843b.getHeight() != i7) {
                        }
                        isVar.f34843b.eraseColor(0);
                        isVar.f34844c.save();
                        isVar.f34844c.translate(0.0f, 0);
                        isVar.c(isVar.f34844c);
                        isVar.f34844c.restore();
                        isVar.f34843b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34843b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34843b = Bitmap.createBitmap(isVar.f34852y, i7, Bitmap.Config.ARGB_8888);
                isVar.f34844c = new Canvas(isVar.f34843b);
                isVar.f34843b.eraseColor(0);
                isVar.f34844c.save();
                isVar.f34844c.translate(0.0f, 0);
                isVar.c(isVar.f34844c);
                isVar.f34844c.restore();
                isVar.f34843b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
                return;
            default:
                is isVar2 = this.f34371b;
                isVar2.f34846f = false;
                isVar2.g();
                if (!isVar2.f34842a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34850w == isVar2.J) {
                    isVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
