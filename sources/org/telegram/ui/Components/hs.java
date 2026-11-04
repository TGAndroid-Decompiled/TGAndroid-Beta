package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34489a;
    public final is f34490b;

    public hs(is isVar, int i3) {
        this.f34489a = i3;
        this.f34490b = isVar;
    }

    @Override
    public final void run() {
        int i3;
        Bitmap bitmap;
        switch (this.f34489a) {
            case 0:
                is isVar = this.f34490b;
                try {
                    i3 = isVar.f34814x + 0;
                    bitmap = isVar.f34806b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34815y) {
                        if (isVar.f34806b.getHeight() != i3) {
                        }
                        isVar.f34806b.eraseColor(0);
                        isVar.f34807c.save();
                        isVar.f34807c.translate(0.0f, 0);
                        isVar.c(isVar.f34807c);
                        isVar.f34807c.restore();
                        isVar.f34806b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.I);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34806b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34806b = Bitmap.createBitmap(isVar.f34815y, i3, Bitmap.Config.ARGB_8888);
                isVar.f34807c = new Canvas(isVar.f34806b);
                isVar.f34806b.eraseColor(0);
                isVar.f34807c.save();
                isVar.f34807c.translate(0.0f, 0);
                isVar.c(isVar.f34807c);
                isVar.f34807c.restore();
                isVar.f34806b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.I);
                return;
            default:
                is isVar2 = this.f34490b;
                isVar2.f34809f = false;
                isVar2.g();
                if (!isVar2.f34805a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34813w == isVar2.K) {
                    isVar2.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
