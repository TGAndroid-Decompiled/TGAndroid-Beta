package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29138a;
    public final qt f29139b;

    public ot(qt qtVar, int i10) {
        this.f29138a = i10;
        this.f29139b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29138a) {
            case 0:
                qt qtVar = this.f29139b;
                try {
                    i10 = qtVar.f29704w + 0;
                    bitmap = qtVar.f29698b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29705x) {
                        if (qtVar.f29698b.getHeight() != i10) {
                        }
                        qtVar.f29698b.eraseColor(0);
                        qtVar.f29699c.save();
                        qtVar.f29699c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29699c);
                        qtVar.f29699c.restore();
                        qtVar.f29698b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29698b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29698b = Bitmap.createBitmap(qtVar.f29705x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29699c = new Canvas(qtVar.f29698b);
                qtVar.f29698b.eraseColor(0);
                qtVar.f29699c.save();
                qtVar.f29699c.translate(0.0f, 0);
                qtVar.c(qtVar.f29699c);
                qtVar.f29699c.restore();
                qtVar.f29698b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29139b;
                qtVar2.f29700f = false;
                qtVar2.g();
                if (!qtVar2.f29697a) {
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
