package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ys implements Runnable {
    public final int f35125a;
    public final at f35126b;

    public ys(at atVar, int i10) {
        this.f35125a = i10;
        this.f35126b = atVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f35125a) {
            case 0:
                at atVar = this.f35126b;
                try {
                    i10 = atVar.f26875w + 0;
                    bitmap = atVar.f26868b;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    atVar.A = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == atVar.f26876x) {
                        if (atVar.f26868b.getHeight() != i10) {
                        }
                        atVar.f26868b.eraseColor(0);
                        atVar.f26869c.save();
                        atVar.f26869c.translate(0.0f, 0);
                        atVar.c(atVar.f26869c);
                        atVar.f26869c.restore();
                        atVar.f26868b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(atVar.D);
                        return;
                    }
                }
                Bitmap bitmap2 = atVar.f26868b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                atVar.f26868b = Bitmap.createBitmap(atVar.f26876x, i10, Bitmap.Config.ARGB_8888);
                atVar.f26869c = new Canvas(atVar.f26868b);
                atVar.f26868b.eraseColor(0);
                atVar.f26869c.save();
                atVar.f26869c.translate(0.0f, 0);
                atVar.c(atVar.f26869c);
                atVar.f26869c.restore();
                atVar.f26868b.prepareToDraw();
                AndroidUtilities.runOnUIThread(atVar.D);
                return;
            default:
                at atVar2 = this.f35126b;
                atVar2.f26871f = false;
                atVar2.g();
                if (!atVar2.f26867a) {
                    atVar2.j();
                    return;
                } else if (atVar2.v == atVar2.F) {
                    atVar2.C = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
