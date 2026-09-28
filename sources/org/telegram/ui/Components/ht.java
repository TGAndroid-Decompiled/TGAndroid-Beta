package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ht implements Runnable {
    public final int f24901a;
    public final kt f24902b;

    public ht(kt ktVar, int i10) {
        this.f24901a = i10;
        this.f24902b = ktVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24901a) {
            case 0:
                kt ktVar = this.f24902b;
                try {
                    i10 = ktVar.f25822w + 0;
                    bitmap = ktVar.f25816b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ktVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ktVar.f25823x) {
                        if (ktVar.f25816b.getHeight() != i10) {
                        }
                        ktVar.f25816b.eraseColor(0);
                        ktVar.f25817c.save();
                        ktVar.f25817c.translate(0.0f, 0);
                        ktVar.c(ktVar.f25817c);
                        ktVar.f25817c.restore();
                        ktVar.f25816b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ktVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ktVar.f25816b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ktVar.f25816b = Bitmap.createBitmap(ktVar.f25823x, i10, Bitmap.Config.ARGB_8888);
                ktVar.f25817c = new Canvas(ktVar.f25816b);
                ktVar.f25816b.eraseColor(0);
                ktVar.f25817c.save();
                ktVar.f25817c.translate(0.0f, 0);
                ktVar.c(ktVar.f25817c);
                ktVar.f25817c.restore();
                ktVar.f25816b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ktVar.H);
                return;
            default:
                kt ktVar2 = this.f24902b;
                ktVar2.f25818f = false;
                ktVar2.g();
                if (!ktVar2.f25815a) {
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
