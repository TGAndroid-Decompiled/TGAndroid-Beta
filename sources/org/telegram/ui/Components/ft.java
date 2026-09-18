package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24014a;
    public final ht f24015b;

    public ft(ht htVar, int i10) {
        this.f24014a = i10;
        this.f24015b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24014a) {
            case 0:
                ht htVar = this.f24015b;
                try {
                    i10 = htVar.f24738w + 0;
                    bitmap = htVar.f24732b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24739x) {
                        if (htVar.f24732b.getHeight() != i10) {
                        }
                        htVar.f24732b.eraseColor(0);
                        htVar.f24733c.save();
                        htVar.f24733c.translate(0.0f, 0);
                        htVar.c(htVar.f24733c);
                        htVar.f24733c.restore();
                        htVar.f24732b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24732b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24732b = Bitmap.createBitmap(htVar.f24739x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24733c = new Canvas(htVar.f24732b);
                htVar.f24732b.eraseColor(0);
                htVar.f24733c.save();
                htVar.f24733c.translate(0.0f, 0);
                htVar.c(htVar.f24733c);
                htVar.f24733c.restore();
                htVar.f24732b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24015b;
                htVar2.f24734f = false;
                htVar2.g();
                if (!htVar2.f24731a) {
                    htVar2.j();
                    return;
                } else if (htVar2.v == htVar2.J) {
                    htVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
