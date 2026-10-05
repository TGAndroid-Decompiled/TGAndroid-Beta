package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jt implements Runnable {
    public final int f27966a;
    public final lt f27967b;

    public jt(lt ltVar, int i10) {
        this.f27966a = i10;
        this.f27967b = ltVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f27966a) {
            case 0:
                lt ltVar = this.f27967b;
                try {
                    i10 = ltVar.f28533w + 0;
                    bitmap = ltVar.f28526b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.f28534x) {
                        if (ltVar.f28526b.getHeight() != i10) {
                        }
                        ltVar.f28526b.eraseColor(0);
                        ltVar.f28527c.save();
                        ltVar.f28527c.translate(0.0f, 0);
                        ltVar.c(ltVar.f28527c);
                        ltVar.f28527c.restore();
                        ltVar.f28526b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ltVar.f28526b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.f28526b = Bitmap.createBitmap(ltVar.f28534x, i10, Bitmap.Config.ARGB_8888);
                ltVar.f28527c = new Canvas(ltVar.f28526b);
                ltVar.f28526b.eraseColor(0);
                ltVar.f28527c.save();
                ltVar.f28527c.translate(0.0f, 0);
                ltVar.c(ltVar.f28527c);
                ltVar.f28527c.restore();
                ltVar.f28526b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
                return;
            default:
                lt ltVar2 = this.f27967b;
                ltVar2.f28529f = false;
                ltVar2.g();
                if (!ltVar2.f28525a) {
                    ltVar2.j();
                    return;
                } else if (ltVar2.v == ltVar2.J) {
                    ltVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
