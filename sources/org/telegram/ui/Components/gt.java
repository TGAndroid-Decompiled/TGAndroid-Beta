package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class gt implements Runnable {
    public final int f24529a;
    public final jt f24530b;

    public gt(jt jtVar, int i10) {
        this.f24529a = i10;
        this.f24530b = jtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24529a) {
            case 0:
                jt jtVar = this.f24530b;
                try {
                    i10 = jtVar.f25490w + 0;
                    bitmap = jtVar.f25484b;
                } catch (Exception e) {
                    FileLog.e(e);
                    jtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == jtVar.f25491x) {
                        if (jtVar.f25484b.getHeight() != i10) {
                        }
                        jtVar.f25484b.eraseColor(0);
                        jtVar.f25485c.save();
                        jtVar.f25485c.translate(0.0f, 0);
                        jtVar.c(jtVar.f25485c);
                        jtVar.f25485c.restore();
                        jtVar.f25484b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(jtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = jtVar.f25484b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                jtVar.f25484b = Bitmap.createBitmap(jtVar.f25491x, i10, Bitmap.Config.ARGB_8888);
                jtVar.f25485c = new Canvas(jtVar.f25484b);
                jtVar.f25484b.eraseColor(0);
                jtVar.f25485c.save();
                jtVar.f25485c.translate(0.0f, 0);
                jtVar.c(jtVar.f25485c);
                jtVar.f25485c.restore();
                jtVar.f25484b.prepareToDraw();
                AndroidUtilities.runOnUIThread(jtVar.H);
                return;
            default:
                jt jtVar2 = this.f24530b;
                jtVar2.f25486f = false;
                jtVar2.g();
                if (!jtVar2.f25483a) {
                    jtVar2.j();
                    return;
                } else if (jtVar2.v == jtVar2.J) {
                    jtVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
