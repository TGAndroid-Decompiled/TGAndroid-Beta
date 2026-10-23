package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29311a;
    public final qt f29312b;

    public ot(qt qtVar, int i10) {
        this.f29311a = i10;
        this.f29312b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29311a) {
            case 0:
                qt qtVar = this.f29312b;
                try {
                    i10 = qtVar.f29984w + 0;
                    bitmap = qtVar.f29978b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29985x) {
                        if (qtVar.f29978b.getHeight() != i10) {
                        }
                        qtVar.f29978b.eraseColor(0);
                        qtVar.f29979c.save();
                        qtVar.f29979c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29979c);
                        qtVar.f29979c.restore();
                        qtVar.f29978b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29978b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29978b = Bitmap.createBitmap(qtVar.f29985x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29979c = new Canvas(qtVar.f29978b);
                qtVar.f29978b.eraseColor(0);
                qtVar.f29979c.save();
                qtVar.f29979c.translate(0.0f, 0);
                qtVar.c(qtVar.f29979c);
                qtVar.f29979c.restore();
                qtVar.f29978b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29312b;
                qtVar2.f29980f = false;
                qtVar2.g();
                if (!qtVar2.f29977a) {
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
