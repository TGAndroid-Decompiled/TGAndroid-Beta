package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class gs implements Runnable {
    public final int f33971a;
    public final hs f33972b;

    public gs(hs hsVar, int i7) {
        this.f33971a = i7;
        this.f33972b = hsVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f33971a) {
            case 0:
                hs hsVar = this.f33972b;
                try {
                    i7 = hsVar.f34451x + 0;
                    bitmap = hsVar.f34443b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    hsVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == hsVar.f34452y) {
                        if (hsVar.f34443b.getHeight() != i7) {
                        }
                        hsVar.f34443b.eraseColor(0);
                        hsVar.f34444c.save();
                        hsVar.f34444c.translate(0.0f, 0);
                        hsVar.c(hsVar.f34444c);
                        hsVar.f34444c.restore();
                        hsVar.f34443b.prepareToDraw();
                        org.telegram.messenger.g0.h3(hsVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = hsVar.f34443b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                hsVar.f34443b = Bitmap.createBitmap(hsVar.f34452y, i7, Bitmap.Config.ARGB_8888);
                hsVar.f34444c = new Canvas(hsVar.f34443b);
                hsVar.f34443b.eraseColor(0);
                hsVar.f34444c.save();
                hsVar.f34444c.translate(0.0f, 0);
                hsVar.c(hsVar.f34444c);
                hsVar.f34444c.restore();
                hsVar.f34443b.prepareToDraw();
                org.telegram.messenger.g0.h3(hsVar.H);
                return;
            default:
                hs hsVar2 = this.f33972b;
                hsVar2.f34446f = false;
                hsVar2.g();
                if (!hsVar2.f34442a) {
                    hsVar2.j();
                    return;
                } else if (hsVar2.f34450w == hsVar2.J) {
                    hsVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
