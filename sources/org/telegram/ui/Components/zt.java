package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class zt implements Runnable {
    public final int f33491a;
    public final bu f33492b;

    public zt(bu buVar, int i10) {
        this.f33491a = i10;
        this.f33492b = buVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f33491a) {
            case 0:
                bu buVar = this.f33492b;
                try {
                    i10 = buVar.f24742w + 0;
                    bitmap = buVar.f24735b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    buVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == buVar.f24743x) {
                        if (buVar.f24735b.getHeight() != i10) {
                        }
                        buVar.f24735b.eraseColor(0);
                        buVar.f24736c.save();
                        buVar.f24736c.translate(0.0f, 0);
                        buVar.c(buVar.f24736c);
                        buVar.f24736c.restore();
                        buVar.f24735b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(buVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = buVar.f24735b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                buVar.f24735b = Bitmap.createBitmap(buVar.f24743x, i10, Bitmap.Config.ARGB_8888);
                buVar.f24736c = new Canvas(buVar.f24735b);
                buVar.f24735b.eraseColor(0);
                buVar.f24736c.save();
                buVar.f24736c.translate(0.0f, 0);
                buVar.c(buVar.f24736c);
                buVar.f24736c.restore();
                buVar.f24735b.prepareToDraw();
                AndroidUtilities.runOnUIThread(buVar.H);
                return;
            default:
                bu buVar2 = this.f33492b;
                buVar2.f24738f = false;
                buVar2.g();
                if (!buVar2.f24734a) {
                    buVar2.j();
                    return;
                } else if (buVar2.v == buVar2.J) {
                    buVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
