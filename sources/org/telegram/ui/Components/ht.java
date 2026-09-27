package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ht implements Runnable {
    public final int f24911a;
    public final kt f24912b;

    public ht(kt ktVar, int i10) {
        this.f24911a = i10;
        this.f24912b = ktVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24911a) {
            case 0:
                kt ktVar = this.f24912b;
                try {
                    i10 = ktVar.f25846w + 0;
                    bitmap = ktVar.f25840b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ktVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ktVar.f25847x) {
                        if (ktVar.f25840b.getHeight() != i10) {
                        }
                        ktVar.f25840b.eraseColor(0);
                        ktVar.f25841c.save();
                        ktVar.f25841c.translate(0.0f, 0);
                        ktVar.c(ktVar.f25841c);
                        ktVar.f25841c.restore();
                        ktVar.f25840b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ktVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ktVar.f25840b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ktVar.f25840b = Bitmap.createBitmap(ktVar.f25847x, i10, Bitmap.Config.ARGB_8888);
                ktVar.f25841c = new Canvas(ktVar.f25840b);
                ktVar.f25840b.eraseColor(0);
                ktVar.f25841c.save();
                ktVar.f25841c.translate(0.0f, 0);
                ktVar.c(ktVar.f25841c);
                ktVar.f25841c.restore();
                ktVar.f25840b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ktVar.H);
                return;
            default:
                kt ktVar2 = this.f24912b;
                ktVar2.f25842f = false;
                ktVar2.g();
                if (!ktVar2.f25839a) {
                    ktVar2.j();
                    return;
                } else if (ktVar2.v == ktVar2.J) {
                    ktVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
