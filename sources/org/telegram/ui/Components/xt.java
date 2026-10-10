package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class xt implements Runnable {
    public final int f33026a;
    public final zt f33027b;

    public xt(zt ztVar, int i10) {
        this.f33026a = i10;
        this.f33027b = ztVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f33026a) {
            case 0:
                zt ztVar = this.f33027b;
                try {
                    i10 = ztVar.f33673w + 0;
                    bitmap = ztVar.f33666b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ztVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ztVar.f33674x) {
                        if (ztVar.f33666b.getHeight() != i10) {
                        }
                        ztVar.f33666b.eraseColor(0);
                        ztVar.f33667c.save();
                        ztVar.f33667c.translate(0.0f, 0);
                        ztVar.c(ztVar.f33667c);
                        ztVar.f33667c.restore();
                        ztVar.f33666b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ztVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ztVar.f33666b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ztVar.f33666b = Bitmap.createBitmap(ztVar.f33674x, i10, Bitmap.Config.ARGB_8888);
                ztVar.f33667c = new Canvas(ztVar.f33666b);
                ztVar.f33666b.eraseColor(0);
                ztVar.f33667c.save();
                ztVar.f33667c.translate(0.0f, 0);
                ztVar.c(ztVar.f33667c);
                ztVar.f33667c.restore();
                ztVar.f33666b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ztVar.H);
                return;
            default:
                zt ztVar2 = this.f33027b;
                ztVar2.f33669f = false;
                ztVar2.g();
                if (!ztVar2.f33665a) {
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
