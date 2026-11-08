package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34334a;
    public final is f34335b;

    public hs(is isVar, int i7) {
        this.f34334a = i7;
        this.f34335b = isVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f34334a) {
            case 0:
                is isVar = this.f34335b;
                try {
                    i7 = isVar.f34811x + 0;
                    bitmap = isVar.f34803b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34812y) {
                        if (isVar.f34803b.getHeight() != i7) {
                        }
                        isVar.f34803b.eraseColor(0);
                        isVar.f34804c.save();
                        isVar.f34804c.translate(0.0f, 0);
                        isVar.c(isVar.f34804c);
                        isVar.f34804c.restore();
                        isVar.f34803b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34803b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34803b = Bitmap.createBitmap(isVar.f34812y, i7, Bitmap.Config.ARGB_8888);
                isVar.f34804c = new Canvas(isVar.f34803b);
                isVar.f34803b.eraseColor(0);
                isVar.f34804c.save();
                isVar.f34804c.translate(0.0f, 0);
                isVar.c(isVar.f34804c);
                isVar.f34804c.restore();
                isVar.f34803b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
                return;
            default:
                is isVar2 = this.f34335b;
                isVar2.f34806f = false;
                isVar2.g();
                if (!isVar2.f34802a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34810w == isVar2.J) {
                    isVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
