package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class hs implements Runnable {
    public final int f34359a;
    public final is f34360b;

    public hs(is isVar, int i7) {
        this.f34359a = i7;
        this.f34360b = isVar;
    }

    @Override
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.f34359a) {
            case 0:
                is isVar = this.f34360b;
                try {
                    i7 = isVar.f34737x + 0;
                    bitmap = isVar.f34729b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.f34738y) {
                        if (isVar.f34729b.getHeight() != i7) {
                        }
                        isVar.f34729b.eraseColor(0);
                        isVar.f34730c.save();
                        isVar.f34730c.translate(0.0f, 0);
                        isVar.c(isVar.f34730c);
                        isVar.f34730c.restore();
                        isVar.f34729b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = isVar.f34729b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.f34729b = Bitmap.createBitmap(isVar.f34738y, i7, Bitmap.Config.ARGB_8888);
                isVar.f34730c = new Canvas(isVar.f34729b);
                isVar.f34729b.eraseColor(0);
                isVar.f34730c.save();
                isVar.f34730c.translate(0.0f, 0);
                isVar.c(isVar.f34730c);
                isVar.f34730c.restore();
                isVar.f34729b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
                return;
            default:
                is isVar2 = this.f34360b;
                isVar2.f34732f = false;
                isVar2.g();
                if (!isVar2.f34728a) {
                    isVar2.j();
                    return;
                } else if (isVar2.f34736w == isVar2.J) {
                    isVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
