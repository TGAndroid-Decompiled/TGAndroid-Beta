package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29137a;
    public final qt f29138b;

    public ot(qt qtVar, int i10) {
        this.f29137a = i10;
        this.f29138b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29137a) {
            case 0:
                qt qtVar = this.f29138b;
                try {
                    i10 = qtVar.f29703w + 0;
                    bitmap = qtVar.f29697b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29704x) {
                        if (qtVar.f29697b.getHeight() != i10) {
                        }
                        qtVar.f29697b.eraseColor(0);
                        qtVar.f29698c.save();
                        qtVar.f29698c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29698c);
                        qtVar.f29698c.restore();
                        qtVar.f29697b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29697b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29697b = Bitmap.createBitmap(qtVar.f29704x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29698c = new Canvas(qtVar.f29697b);
                qtVar.f29697b.eraseColor(0);
                qtVar.f29698c.save();
                qtVar.f29698c.translate(0.0f, 0);
                qtVar.c(qtVar.f29698c);
                qtVar.f29698c.restore();
                qtVar.f29697b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29138b;
                qtVar2.f29699f = false;
                qtVar2.g();
                if (!qtVar2.f29696a) {
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
