package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34397a;
    public final is f34398b;

    public hs(is isVar, int i7) {
        this.f34397a = i7;
        this.f34398b = isVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f34397a) {
            case 0:
                is isVar = this.f34398b;
                try {
                    i7 = isVar.f34767x + 0;
                    bitmap = isVar.f34759b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34768y) {
                        if (isVar.f34759b.getHeight() != i7) {
                        }
                        isVar.f34759b.eraseColor(0);
                        isVar.f34760c.save();
                        isVar.f34760c.translate(0.0f, 0);
                        isVar.c(isVar.f34760c);
                        isVar.f34760c.restore();
                        isVar.f34759b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34759b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34759b = Bitmap.createBitmap(isVar.f34768y, i7, Bitmap.Config.ARGB_8888);
                isVar.f34760c = new Canvas(isVar.f34759b);
                isVar.f34759b.eraseColor(0);
                isVar.f34760c.save();
                isVar.f34760c.translate(0.0f, 0);
                isVar.c(isVar.f34760c);
                isVar.f34760c.restore();
                isVar.f34759b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
                return;
            default:
                is isVar2 = this.f34398b;
                isVar2.f34762f = false;
                isVar2.g();
                if (!isVar2.f34758a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34766w == isVar2.J) {
                    isVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
