package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24088a;
    public final ht f24089b;

    public ft(ht htVar, int i10) {
        this.f24088a = i10;
        this.f24089b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24088a) {
            case 0:
                ht htVar = this.f24089b;
                try {
                    i10 = htVar.f24797w + 0;
                    bitmap = htVar.f24791b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24798x) {
                        if (htVar.f24791b.getHeight() != i10) {
                        }
                        htVar.f24791b.eraseColor(0);
                        htVar.f24792c.save();
                        htVar.f24792c.translate(0.0f, 0);
                        htVar.c(htVar.f24792c);
                        htVar.f24792c.restore();
                        htVar.f24791b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24791b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24791b = Bitmap.createBitmap(htVar.f24798x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24792c = new Canvas(htVar.f24791b);
                htVar.f24791b.eraseColor(0);
                htVar.f24792c.save();
                htVar.f24792c.translate(0.0f, 0);
                htVar.c(htVar.f24792c);
                htVar.f24792c.restore();
                htVar.f24791b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24089b;
                htVar2.f24793f = false;
                htVar2.g();
                if (!htVar2.f24790a) {
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
