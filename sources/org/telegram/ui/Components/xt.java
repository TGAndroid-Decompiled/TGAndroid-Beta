package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class xt implements Runnable {
    public final int f33064a;
    public final zt f33065b;

    public xt(zt ztVar, int i10) {
        this.f33064a = i10;
        this.f33065b = ztVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f33064a) {
            case 0:
                zt ztVar = this.f33065b;
                try {
                    i10 = ztVar.f33697w + 0;
                    bitmap = ztVar.f33690b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ztVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ztVar.f33698x) {
                        if (ztVar.f33690b.getHeight() != i10) {
                        }
                        ztVar.f33690b.eraseColor(0);
                        ztVar.f33691c.save();
                        ztVar.f33691c.translate(0.0f, 0);
                        ztVar.c(ztVar.f33691c);
                        ztVar.f33691c.restore();
                        ztVar.f33690b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ztVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ztVar.f33690b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ztVar.f33690b = Bitmap.createBitmap(ztVar.f33698x, i10, Bitmap.Config.ARGB_8888);
                ztVar.f33691c = new Canvas(ztVar.f33690b);
                ztVar.f33690b.eraseColor(0);
                ztVar.f33691c.save();
                ztVar.f33691c.translate(0.0f, 0);
                ztVar.c(ztVar.f33691c);
                ztVar.f33691c.restore();
                ztVar.f33690b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ztVar.H);
                return;
            default:
                zt ztVar2 = this.f33065b;
                ztVar2.f33693f = false;
                ztVar2.g();
                if (!ztVar2.f33689a) {
                    ztVar2.j();
                    return;
                } else if (ztVar2.v == ztVar2.J) {
                    ztVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
