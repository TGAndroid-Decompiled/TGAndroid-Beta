package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24229a;
    public final ht f24230b;

    public ft(ht htVar, int i10) {
        this.f24229a = i10;
        this.f24230b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24229a) {
            case 0:
                ht htVar = this.f24230b;
                try {
                    i10 = htVar.f24733w + 0;
                    bitmap = htVar.f24727b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24734x) {
                        if (htVar.f24727b.getHeight() != i10) {
                        }
                        htVar.f24727b.eraseColor(0);
                        htVar.f24728c.save();
                        htVar.f24728c.translate(0.0f, 0);
                        htVar.c(htVar.f24728c);
                        htVar.f24728c.restore();
                        htVar.f24727b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24727b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24727b = Bitmap.createBitmap(htVar.f24734x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24728c = new Canvas(htVar.f24727b);
                htVar.f24727b.eraseColor(0);
                htVar.f24728c.save();
                htVar.f24728c.translate(0.0f, 0);
                htVar.c(htVar.f24728c);
                htVar.f24728c.restore();
                htVar.f24727b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24230b;
                htVar2.f24729f = false;
                htVar2.g();
                if (!htVar2.f24726a) {
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
