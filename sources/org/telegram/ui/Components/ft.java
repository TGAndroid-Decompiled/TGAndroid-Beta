package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24183a;
    public final ht f24184b;

    public ft(ht htVar, int i10) {
        this.f24183a = i10;
        this.f24184b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24183a) {
            case 0:
                ht htVar = this.f24184b;
                try {
                    i10 = htVar.f24755w + 0;
                    bitmap = htVar.f24749b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24756x) {
                        if (htVar.f24749b.getHeight() != i10) {
                        }
                        htVar.f24749b.eraseColor(0);
                        htVar.f24750c.save();
                        htVar.f24750c.translate(0.0f, 0);
                        htVar.c(htVar.f24750c);
                        htVar.f24750c.restore();
                        htVar.f24749b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24749b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24749b = Bitmap.createBitmap(htVar.f24756x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24750c = new Canvas(htVar.f24749b);
                htVar.f24749b.eraseColor(0);
                htVar.f24750c.save();
                htVar.f24750c.translate(0.0f, 0);
                htVar.c(htVar.f24750c);
                htVar.f24750c.restore();
                htVar.f24749b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24184b;
                htVar2.f24751f = false;
                htVar2.g();
                if (!htVar2.f24748a) {
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
