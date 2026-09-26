package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ht implements Runnable {
    public final int f24867a;
    public final kt f24868b;

    public ht(kt ktVar, int i10) {
        this.f24867a = i10;
        this.f24868b = ktVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24867a) {
            case 0:
                kt ktVar = this.f24868b;
                try {
                    i10 = ktVar.f25796w + 0;
                    bitmap = ktVar.f25790b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ktVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ktVar.f25797x) {
                        if (ktVar.f25790b.getHeight() != i10) {
                        }
                        ktVar.f25790b.eraseColor(0);
                        ktVar.f25791c.save();
                        ktVar.f25791c.translate(0.0f, 0);
                        ktVar.c(ktVar.f25791c);
                        ktVar.f25791c.restore();
                        ktVar.f25790b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ktVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ktVar.f25790b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ktVar.f25790b = Bitmap.createBitmap(ktVar.f25797x, i10, Bitmap.Config.ARGB_8888);
                ktVar.f25791c = new Canvas(ktVar.f25790b);
                ktVar.f25790b.eraseColor(0);
                ktVar.f25791c.save();
                ktVar.f25791c.translate(0.0f, 0);
                ktVar.c(ktVar.f25791c);
                ktVar.f25791c.restore();
                ktVar.f25790b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ktVar.H);
                return;
            default:
                kt ktVar2 = this.f24868b;
                ktVar2.f25792f = false;
                ktVar2.g();
                if (!ktVar2.f25789a) {
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
