package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24085a;
    public final ht f24086b;

    public ft(ht htVar, int i10) {
        this.f24085a = i10;
        this.f24086b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24085a) {
            case 0:
                ht htVar = this.f24086b;
                try {
                    i10 = htVar.f24803w + 0;
                    bitmap = htVar.f24797b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24804x) {
                        if (htVar.f24797b.getHeight() != i10) {
                        }
                        htVar.f24797b.eraseColor(0);
                        htVar.f24798c.save();
                        htVar.f24798c.translate(0.0f, 0);
                        htVar.c(htVar.f24798c);
                        htVar.f24798c.restore();
                        htVar.f24797b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24797b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24797b = Bitmap.createBitmap(htVar.f24804x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24798c = new Canvas(htVar.f24797b);
                htVar.f24797b.eraseColor(0);
                htVar.f24798c.save();
                htVar.f24798c.translate(0.0f, 0);
                htVar.c(htVar.f24798c);
                htVar.f24798c.restore();
                htVar.f24797b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24086b;
                htVar2.f24799f = false;
                htVar2.g();
                if (!htVar2.f24796a) {
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
