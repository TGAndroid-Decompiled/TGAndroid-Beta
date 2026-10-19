package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29088a;
    public final qt f29089b;

    public ot(qt qtVar, int i10) {
        this.f29088a = i10;
        this.f29089b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29088a) {
            case 0:
                qt qtVar = this.f29089b;
                try {
                    i10 = qtVar.f29693w + 0;
                    bitmap = qtVar.f29687b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29694x) {
                        if (qtVar.f29687b.getHeight() != i10) {
                        }
                        qtVar.f29687b.eraseColor(0);
                        qtVar.f29688c.save();
                        qtVar.f29688c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29688c);
                        qtVar.f29688c.restore();
                        qtVar.f29687b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29687b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29687b = Bitmap.createBitmap(qtVar.f29694x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29688c = new Canvas(qtVar.f29687b);
                qtVar.f29687b.eraseColor(0);
                qtVar.f29688c.save();
                qtVar.f29688c.translate(0.0f, 0);
                qtVar.c(qtVar.f29688c);
                qtVar.f29688c.restore();
                qtVar.f29687b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29089b;
                qtVar2.f29689f = false;
                qtVar2.g();
                if (!qtVar2.f29686a) {
                    qtVar2.j();
                    return;
                } else if (qtVar2.v == qtVar2.J) {
                    qtVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
