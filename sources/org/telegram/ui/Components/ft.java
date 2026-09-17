package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ft implements Runnable {
    public final int f24011a;
    public final ht f24012b;

    public ft(ht htVar, int i10) {
        this.f24011a = i10;
        this.f24012b = htVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24011a) {
            case 0:
                ht htVar = this.f24012b;
                try {
                    i10 = htVar.f24735w + 0;
                    bitmap = htVar.f24729b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.f24736x) {
                        if (htVar.f24729b.getHeight() != i10) {
                        }
                        htVar.f24729b.eraseColor(0);
                        htVar.f24730c.save();
                        htVar.f24730c.translate(0.0f, 0);
                        htVar.c(htVar.f24730c);
                        htVar.f24730c.restore();
                        htVar.f24729b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = htVar.f24729b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.f24729b = Bitmap.createBitmap(htVar.f24736x, i10, Bitmap.Config.ARGB_8888);
                htVar.f24730c = new Canvas(htVar.f24729b);
                htVar.f24729b.eraseColor(0);
                htVar.f24730c.save();
                htVar.f24730c.translate(0.0f, 0);
                htVar.c(htVar.f24730c);
                htVar.f24730c.restore();
                htVar.f24729b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
                return;
            default:
                ht htVar2 = this.f24012b;
                htVar2.f24731f = false;
                htVar2.g();
                if (!htVar2.f24728a) {
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
