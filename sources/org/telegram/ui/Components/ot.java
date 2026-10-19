package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29090a;
    public final qt f29091b;

    public ot(qt qtVar, int i10) {
        this.f29090a = i10;
        this.f29091b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29090a) {
            case 0:
                qt qtVar = this.f29091b;
                try {
                    i10 = qtVar.f29695w + 0;
                    bitmap = qtVar.f29689b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29696x) {
                        if (qtVar.f29689b.getHeight() != i10) {
                        }
                        qtVar.f29689b.eraseColor(0);
                        qtVar.f29690c.save();
                        qtVar.f29690c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29690c);
                        qtVar.f29690c.restore();
                        qtVar.f29689b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29689b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29689b = Bitmap.createBitmap(qtVar.f29696x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29690c = new Canvas(qtVar.f29689b);
                qtVar.f29689b.eraseColor(0);
                qtVar.f29690c.save();
                qtVar.f29690c.translate(0.0f, 0);
                qtVar.c(qtVar.f29690c);
                qtVar.f29690c.restore();
                qtVar.f29689b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29091b;
                qtVar2.f29691f = false;
                qtVar2.g();
                if (!qtVar2.f29688a) {
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
