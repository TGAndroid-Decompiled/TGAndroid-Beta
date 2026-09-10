package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class lt implements Runnable {
    public final int f25107a;
    public final nt f25108b;

    public lt(nt ntVar, int i10) {
        this.f25107a = i10;
        this.f25108b = ntVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25107a) {
            case 0:
                nt ntVar = this.f25108b;
                try {
                    i10 = ntVar.f25591w + 0;
                    bitmap = ntVar.f25585b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ntVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ntVar.f25592x) {
                        if (ntVar.f25585b.getHeight() != i10) {
                        }
                        ntVar.f25585b.eraseColor(0);
                        ntVar.f25586c.save();
                        ntVar.f25586c.translate(0.0f, 0);
                        ntVar.c(ntVar.f25586c);
                        ntVar.f25586c.restore();
                        ntVar.f25585b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ntVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ntVar.f25585b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ntVar.f25585b = Bitmap.createBitmap(ntVar.f25592x, i10, Bitmap.Config.ARGB_8888);
                ntVar.f25586c = new Canvas(ntVar.f25585b);
                ntVar.f25585b.eraseColor(0);
                ntVar.f25586c.save();
                ntVar.f25586c.translate(0.0f, 0);
                ntVar.c(ntVar.f25586c);
                ntVar.f25586c.restore();
                ntVar.f25585b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ntVar.H);
                return;
            default:
                nt ntVar2 = this.f25108b;
                ntVar2.f25587f = false;
                ntVar2.g();
                if (!ntVar2.f25584a) {
                    ntVar2.j();
                    return;
                } else if (ntVar2.v == ntVar2.J) {
                    ntVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
