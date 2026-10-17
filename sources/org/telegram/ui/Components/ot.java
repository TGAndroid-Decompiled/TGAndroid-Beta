package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29063a;
    public final qt f29064b;

    public ot(qt qtVar, int i10) {
        this.f29063a = i10;
        this.f29064b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29063a) {
            case 0:
                qt qtVar = this.f29064b;
                try {
                    i10 = qtVar.f29739w + 0;
                    bitmap = qtVar.f29733b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29740x) {
                        if (qtVar.f29733b.getHeight() != i10) {
                        }
                        qtVar.f29733b.eraseColor(0);
                        qtVar.f29734c.save();
                        qtVar.f29734c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29734c);
                        qtVar.f29734c.restore();
                        qtVar.f29733b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29733b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29733b = Bitmap.createBitmap(qtVar.f29740x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29734c = new Canvas(qtVar.f29733b);
                qtVar.f29733b.eraseColor(0);
                qtVar.f29734c.save();
                qtVar.f29734c.translate(0.0f, 0);
                qtVar.c(qtVar.f29734c);
                qtVar.f29734c.restore();
                qtVar.f29733b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29064b;
                qtVar2.f29735f = false;
                qtVar2.g();
                if (!qtVar2.f29732a) {
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
