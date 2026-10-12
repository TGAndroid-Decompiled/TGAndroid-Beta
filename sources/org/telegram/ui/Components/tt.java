package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tt implements Runnable {
    public final int f29484a;
    public final vt f29485b;

    public tt(vt vtVar, int i10) {
        this.f29484a = i10;
        this.f29485b = vtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29484a) {
            case 0:
                vt vtVar = this.f29485b;
                try {
                    i10 = vtVar.f30645w + 0;
                    bitmap = vtVar.f30639b;
                } catch (Exception e) {
                    FileLog.e(e);
                    vtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vtVar.f30646x) {
                        if (vtVar.f30639b.getHeight() != i10) {
                        }
                        vtVar.f30639b.eraseColor(0);
                        vtVar.f30640c.save();
                        vtVar.f30640c.translate(0.0f, 0);
                        vtVar.c(vtVar.f30640c);
                        vtVar.f30640c.restore();
                        vtVar.f30639b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(vtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = vtVar.f30639b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vtVar.f30639b = Bitmap.createBitmap(vtVar.f30646x, i10, Bitmap.Config.ARGB_8888);
                vtVar.f30640c = new Canvas(vtVar.f30639b);
                vtVar.f30639b.eraseColor(0);
                vtVar.f30640c.save();
                vtVar.f30640c.translate(0.0f, 0);
                vtVar.c(vtVar.f30640c);
                vtVar.f30640c.restore();
                vtVar.f30639b.prepareToDraw();
                AndroidUtilities.runOnUIThread(vtVar.H);
                return;
            default:
                vt vtVar2 = this.f29485b;
                vtVar2.f30641f = false;
                vtVar2.g();
                if (!vtVar2.f30638a) {
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
