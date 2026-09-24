package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class gt implements Runnable {
    public final int f24523a;
    public final jt f24524b;

    public gt(jt jtVar, int i10) {
        this.f24523a = i10;
        this.f24524b = jtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24523a) {
            case 0:
                jt jtVar = this.f24524b;
                try {
                    i10 = jtVar.f25483w + 0;
                    bitmap = jtVar.f25477b;
                } catch (Exception e) {
                    FileLog.e(e);
                    jtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == jtVar.f25484x) {
                        if (jtVar.f25477b.getHeight() != i10) {
                        }
                        jtVar.f25477b.eraseColor(0);
                        jtVar.f25478c.save();
                        jtVar.f25478c.translate(0.0f, 0);
                        jtVar.c(jtVar.f25478c);
                        jtVar.f25478c.restore();
                        jtVar.f25477b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(jtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = jtVar.f25477b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                jtVar.f25477b = Bitmap.createBitmap(jtVar.f25484x, i10, Bitmap.Config.ARGB_8888);
                jtVar.f25478c = new Canvas(jtVar.f25477b);
                jtVar.f25477b.eraseColor(0);
                jtVar.f25478c.save();
                jtVar.f25478c.translate(0.0f, 0);
                jtVar.c(jtVar.f25478c);
                jtVar.f25478c.restore();
                jtVar.f25477b.prepareToDraw();
                AndroidUtilities.runOnUIThread(jtVar.H);
                return;
            default:
                jt jtVar2 = this.f24524b;
                jtVar2.f25479f = false;
                jtVar2.g();
                if (!jtVar2.f25476a) {
                    jtVar2.j();
                    return;
                } else if (jtVar2.v == jtVar2.J) {
                    jtVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
