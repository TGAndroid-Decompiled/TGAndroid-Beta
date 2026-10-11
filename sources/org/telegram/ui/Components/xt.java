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
                    i10 = ztVar.f33657w + 0;
                    bitmap = ztVar.f33650b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ztVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ztVar.f33658x) {
                        if (ztVar.f33650b.getHeight() != i10) {
                        }
                        ztVar.f33650b.eraseColor(0);
                        ztVar.f33651c.save();
                        ztVar.f33651c.translate(0.0f, 0);
                        ztVar.c(ztVar.f33651c);
                        ztVar.f33651c.restore();
                        ztVar.f33650b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ztVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ztVar.f33650b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ztVar.f33650b = Bitmap.createBitmap(ztVar.f33658x, i10, Bitmap.Config.ARGB_8888);
                ztVar.f33651c = new Canvas(ztVar.f33650b);
                ztVar.f33650b.eraseColor(0);
                ztVar.f33651c.save();
                ztVar.f33651c.translate(0.0f, 0);
                ztVar.c(ztVar.f33651c);
                ztVar.f33651c.restore();
                ztVar.f33650b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ztVar.H);
                return;
            default:
                zt ztVar2 = this.f33027b;
                ztVar2.f33653f = false;
                ztVar2.g();
                if (!ztVar2.f33649a) {
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
