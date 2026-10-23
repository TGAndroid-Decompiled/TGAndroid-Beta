package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29142a;
    public final qt f29143b;

    public ot(qt qtVar, int i10) {
        this.f29142a = i10;
        this.f29143b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29142a) {
            case 0:
                qt qtVar = this.f29143b;
                try {
                    i10 = qtVar.f29708w + 0;
                    bitmap = qtVar.f29702b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29709x) {
                        if (qtVar.f29702b.getHeight() != i10) {
                        }
                        qtVar.f29702b.eraseColor(0);
                        qtVar.f29703c.save();
                        qtVar.f29703c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29703c);
                        qtVar.f29703c.restore();
                        qtVar.f29702b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29702b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29702b = Bitmap.createBitmap(qtVar.f29709x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29703c = new Canvas(qtVar.f29702b);
                qtVar.f29702b.eraseColor(0);
                qtVar.f29703c.save();
                qtVar.f29703c.translate(0.0f, 0);
                qtVar.c(qtVar.f29703c);
                qtVar.f29703c.restore();
                qtVar.f29702b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29143b;
                qtVar2.f29704f = false;
                qtVar2.g();
                if (!qtVar2.f29701a) {
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
