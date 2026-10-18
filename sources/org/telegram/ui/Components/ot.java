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
                    i10 = qtVar.f29738w + 0;
                    bitmap = qtVar.f29732b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29739x) {
                        if (qtVar.f29732b.getHeight() != i10) {
                        }
                        qtVar.f29732b.eraseColor(0);
                        qtVar.f29733c.save();
                        qtVar.f29733c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29733c);
                        qtVar.f29733c.restore();
                        qtVar.f29732b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29732b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29732b = Bitmap.createBitmap(qtVar.f29739x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29733c = new Canvas(qtVar.f29732b);
                qtVar.f29732b.eraseColor(0);
                qtVar.f29733c.save();
                qtVar.f29733c.translate(0.0f, 0);
                qtVar.c(qtVar.f29733c);
                qtVar.f29733c.restore();
                qtVar.f29732b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29064b;
                qtVar2.f29734f = false;
                qtVar2.g();
                if (!qtVar2.f29731a) {
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
