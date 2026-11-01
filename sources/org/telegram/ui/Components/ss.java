package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class ss implements Runnable {
    public final int f30433a;
    public final ts f30434b;

    public ss(ts tsVar, int i10) {
        this.f30433a = i10;
        this.f30434b = tsVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f30433a) {
            case 0:
                ts tsVar = this.f30434b;
                try {
                    i10 = tsVar.f30713x + 0;
                    bitmap = tsVar.f30706b;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    tsVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == tsVar.f30714y) {
                        if (tsVar.f30706b.getHeight() != i10) {
                        }
                        tsVar.f30706b.eraseColor(0);
                        tsVar.f30707c.save();
                        tsVar.f30707c.translate(0.0f, 0);
                        tsVar.c(tsVar.f30707c);
                        tsVar.f30707c.restore();
                        tsVar.f30706b.prepareToDraw();
                        org.telegram.messenger.i0.g3(tsVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = tsVar.f30706b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                tsVar.f30706b = Bitmap.createBitmap(tsVar.f30714y, i10, Bitmap.Config.ARGB_8888);
                tsVar.f30707c = new Canvas(tsVar.f30706b);
                tsVar.f30706b.eraseColor(0);
                tsVar.f30707c.save();
                tsVar.f30707c.translate(0.0f, 0);
                tsVar.c(tsVar.f30707c);
                tsVar.f30707c.restore();
                tsVar.f30706b.prepareToDraw();
                org.telegram.messenger.i0.g3(tsVar.H);
                return;
            default:
                ts tsVar2 = this.f30434b;
                tsVar2.f30708f = false;
                tsVar2.g();
                if (!tsVar2.f30705a) {
                    tsVar2.j();
                    return;
                } else if (tsVar2.f30712w == tsVar2.J) {
                    tsVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
