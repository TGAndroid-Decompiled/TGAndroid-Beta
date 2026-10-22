package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ot implements Runnable {
    public final int f29141a;
    public final qt f29142b;

    public ot(qt qtVar, int i10) {
        this.f29141a = i10;
        this.f29142b = qtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f29141a) {
            case 0:
                qt qtVar = this.f29142b;
                try {
                    i10 = qtVar.f29707w + 0;
                    bitmap = qtVar.f29701b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.f29708x) {
                        if (qtVar.f29701b.getHeight() != i10) {
                        }
                        qtVar.f29701b.eraseColor(0);
                        qtVar.f29702c.save();
                        qtVar.f29702c.translate(0.0f, 0);
                        qtVar.c(qtVar.f29702c);
                        qtVar.f29702c.restore();
                        qtVar.f29701b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = qtVar.f29701b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.f29701b = Bitmap.createBitmap(qtVar.f29708x, i10, Bitmap.Config.ARGB_8888);
                qtVar.f29702c = new Canvas(qtVar.f29701b);
                qtVar.f29701b.eraseColor(0);
                qtVar.f29702c.save();
                qtVar.f29702c.translate(0.0f, 0);
                qtVar.c(qtVar.f29702c);
                qtVar.f29702c.restore();
                qtVar.f29701b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
                return;
            default:
                qt qtVar2 = this.f29142b;
                qtVar2.f29703f = false;
                qtVar2.g();
                if (!qtVar2.f29700a) {
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
