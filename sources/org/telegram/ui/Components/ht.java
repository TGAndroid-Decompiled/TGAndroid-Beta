package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ht implements Runnable {
    public final int f24900a;
    public final kt f24901b;

    public ht(kt ktVar, int i10) {
        this.f24900a = i10;
        this.f24901b = ktVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24900a) {
            case 0:
                kt ktVar = this.f24901b;
                try {
                    i10 = ktVar.f25821w + 0;
                    bitmap = ktVar.f25815b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ktVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ktVar.f25822x) {
                        if (ktVar.f25815b.getHeight() != i10) {
                        }
                        ktVar.f25815b.eraseColor(0);
                        ktVar.f25816c.save();
                        ktVar.f25816c.translate(0.0f, 0);
                        ktVar.c(ktVar.f25816c);
                        ktVar.f25816c.restore();
                        ktVar.f25815b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ktVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ktVar.f25815b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ktVar.f25815b = Bitmap.createBitmap(ktVar.f25822x, i10, Bitmap.Config.ARGB_8888);
                ktVar.f25816c = new Canvas(ktVar.f25815b);
                ktVar.f25815b.eraseColor(0);
                ktVar.f25816c.save();
                ktVar.f25816c.translate(0.0f, 0);
                ktVar.c(ktVar.f25816c);
                ktVar.f25816c.restore();
                ktVar.f25815b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ktVar.H);
                return;
            default:
                kt ktVar2 = this.f24901b;
                ktVar2.f25817f = false;
                ktVar2.g();
                if (!ktVar2.f25814a) {
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
