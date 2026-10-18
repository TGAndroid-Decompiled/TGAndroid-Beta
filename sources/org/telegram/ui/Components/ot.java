package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29070a;
    public final qt f29071b;

    public ot(qt qtVar, int i10) {
        this.f29070a = i10;
        this.f29071b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29070a) {
            case 0:
                qt qtVar = this.f29071b;
                try {
                    i10 = qtVar.f29745w + 0;
                    bitmap = qtVar.f29739b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29746x) {
                        if (qtVar.f29739b.getHeight() != i10) {
                        }
                        qtVar.f29739b.eraseColor(0);
                        qtVar.f29740c.save();
                        qtVar.f29740c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29740c);
                        qtVar.f29740c.restore();
                        qtVar.f29739b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29739b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29739b = Bitmap.createBitmap(qtVar.f29746x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29740c = new Canvas(qtVar.f29739b);
                qtVar.f29739b.eraseColor(0);
                qtVar.f29740c.save();
                qtVar.f29740c.translate(0.0f, 0);
                qtVar.c(qtVar.f29740c);
                qtVar.f29740c.restore();
                qtVar.f29739b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29071b;
                qtVar2.f29741f = false;
                qtVar2.g();
                if (!qtVar2.f29738a) {
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
