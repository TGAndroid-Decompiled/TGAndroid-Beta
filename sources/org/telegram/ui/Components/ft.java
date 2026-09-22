package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24357a;
    public final ht f24358b;

    public ft(ht htVar, int i10) {
        this.f24357a = i10;
        this.f24358b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24357a) {
            case 0:
                ht htVar = this.f24358b;
                try {
                    i10 = htVar.f24885w + 0;
                    bitmap = htVar.f24879b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24886x) {
                        if (htVar.f24879b.getHeight() != i10) {
                        }
                        htVar.f24879b.eraseColor(0);
                        htVar.f24880c.save();
                        htVar.f24880c.translate(0.0f, 0);
                        htVar.c(htVar.f24880c);
                        htVar.f24880c.restore();
                        htVar.f24879b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24879b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24879b = Bitmap.createBitmap(htVar.f24886x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24880c = new Canvas(htVar.f24879b);
                htVar.f24879b.eraseColor(0);
                htVar.f24880c.save();
                htVar.f24880c.translate(0.0f, 0);
                htVar.c(htVar.f24880c);
                htVar.f24880c.restore();
                htVar.f24879b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24358b;
                htVar2.f24881f = false;
                htVar2.g();
                if (!htVar2.f24878a) {
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
