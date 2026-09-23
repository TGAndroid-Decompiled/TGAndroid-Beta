package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class gt implements Runnable {
    public final int f24424a;
    public final jt f24425b;

    public gt(jt jtVar, int i10) {
        this.f24424a = i10;
        this.f24425b = jtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24424a) {
            case 0:
                jt jtVar = this.f24425b;
                try {
                    i10 = jtVar.f25404w + 0;
                    bitmap = jtVar.f25398b;
                } catch (Exception e) {
                    FileLog.e(e);
                    jtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == jtVar.f25405x) {
                        if (jtVar.f25398b.getHeight() != i10) {
                        }
                        jtVar.f25398b.eraseColor(0);
                        jtVar.f25399c.save();
                        jtVar.f25399c.translate(0.0f, 0);
                        jtVar.c(jtVar.f25399c);
                        jtVar.f25399c.restore();
                        jtVar.f25398b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(jtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = jtVar.f25398b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                jtVar.f25398b = Bitmap.createBitmap(jtVar.f25405x, i10, Bitmap.Config.ARGB_8888);
                jtVar.f25399c = new Canvas(jtVar.f25398b);
                jtVar.f25398b.eraseColor(0);
                jtVar.f25399c.save();
                jtVar.f25399c.translate(0.0f, 0);
                jtVar.c(jtVar.f25399c);
                jtVar.f25399c.restore();
                jtVar.f25398b.prepareToDraw();
                AndroidUtilities.runOnUIThread(jtVar.H);
                return;
            default:
                jt jtVar2 = this.f24425b;
                jtVar2.f25400f = false;
                jtVar2.g();
                if (!jtVar2.f25397a) {
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
