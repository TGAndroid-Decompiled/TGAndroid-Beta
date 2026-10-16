package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tt implements Runnable {
    public final int f29187a;
    public final vt f29188b;

    public tt(vt vtVar, int i10) {
        this.f29187a = i10;
        this.f29188b = vtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29187a) {
            case 0:
                vt vtVar = this.f29188b;
                try {
                    i10 = vtVar.f30314w + 0;
                    bitmap = vtVar.f30308b;
                } catch (Exception e) {
                    FileLog.e(e);
                    vtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vtVar.f30315x) {
                        if (vtVar.f30308b.getHeight() != i10) {
                        }
                        vtVar.f30308b.eraseColor(0);
                        vtVar.f30309c.save();
                        vtVar.f30309c.translate(0.0f, 0);
                        vtVar.c(vtVar.f30309c);
                        vtVar.f30309c.restore();
                        vtVar.f30308b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(vtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = vtVar.f30308b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vtVar.f30308b = Bitmap.createBitmap(vtVar.f30315x, i10, Bitmap.Config.ARGB_8888);
                vtVar.f30309c = new Canvas(vtVar.f30308b);
                vtVar.f30308b.eraseColor(0);
                vtVar.f30309c.save();
                vtVar.f30309c.translate(0.0f, 0);
                vtVar.c(vtVar.f30309c);
                vtVar.f30309c.restore();
                vtVar.f30308b.prepareToDraw();
                AndroidUtilities.runOnUIThread(vtVar.H);
                return;
            default:
                vt vtVar2 = this.f29188b;
                vtVar2.f30310f = false;
                vtVar2.g();
                if (!vtVar2.f30307a) {
                    vtVar2.j();
                    return;
                } else if (vtVar2.v == vtVar2.J) {
                    vtVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
