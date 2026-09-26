package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class gt implements Runnable {
    public final int f24528a;
    public final jt f24529b;

    public gt(jt jtVar, int i10) {
        this.f24528a = i10;
        this.f24529b = jtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24528a) {
            case 0:
                jt jtVar = this.f24529b;
                try {
                    i10 = jtVar.f25489w + 0;
                    bitmap = jtVar.f25483b;
                } catch (Exception e) {
                    FileLog.e(e);
                    jtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == jtVar.f25490x) {
                        if (jtVar.f25483b.getHeight() != i10) {
                        }
                        jtVar.f25483b.eraseColor(0);
                        jtVar.f25484c.save();
                        jtVar.f25484c.translate(0.0f, 0);
                        jtVar.c(jtVar.f25484c);
                        jtVar.f25484c.restore();
                        jtVar.f25483b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(jtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = jtVar.f25483b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                jtVar.f25483b = Bitmap.createBitmap(jtVar.f25490x, i10, Bitmap.Config.ARGB_8888);
                jtVar.f25484c = new Canvas(jtVar.f25483b);
                jtVar.f25483b.eraseColor(0);
                jtVar.f25484c.save();
                jtVar.f25484c.translate(0.0f, 0);
                jtVar.c(jtVar.f25484c);
                jtVar.f25484c.restore();
                jtVar.f25483b.prepareToDraw();
                AndroidUtilities.runOnUIThread(jtVar.H);
                return;
            default:
                jt jtVar2 = this.f24529b;
                jtVar2.f25485f = false;
                jtVar2.g();
                if (!jtVar2.f25482a) {
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
