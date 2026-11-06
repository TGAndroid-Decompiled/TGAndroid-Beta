package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34409a;
    public final is f34410b;

    public hs(is isVar, int i7) {
        this.f34409a = i7;
        this.f34410b = isVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f34409a) {
            case 0:
                is isVar = this.f34410b;
                try {
                    i7 = isVar.f34774x + 0;
                    bitmap = isVar.f34766b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34775y) {
                        if (isVar.f34766b.getHeight() != i7) {
                        }
                        isVar.f34766b.eraseColor(0);
                        isVar.f34767c.save();
                        isVar.f34767c.translate(0.0f, 0);
                        isVar.c(isVar.f34767c);
                        isVar.f34767c.restore();
                        isVar.f34766b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34766b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34766b = Bitmap.createBitmap(isVar.f34775y, i7, Bitmap.Config.ARGB_8888);
                isVar.f34767c = new Canvas(isVar.f34766b);
                isVar.f34766b.eraseColor(0);
                isVar.f34767c.save();
                isVar.f34767c.translate(0.0f, 0);
                isVar.c(isVar.f34767c);
                isVar.f34767c.restore();
                isVar.f34766b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
                return;
            default:
                is isVar2 = this.f34410b;
                isVar2.f34769f = false;
                isVar2.g();
                if (!isVar2.f34765a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34773w == isVar2.J) {
                    isVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
