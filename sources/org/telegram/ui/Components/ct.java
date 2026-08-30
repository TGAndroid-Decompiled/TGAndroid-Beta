package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ct implements Runnable {
    public final int f24047a;
    public final et f24048b;

    public ct(et etVar, int i10) {
        this.f24047a = i10;
        this.f24048b = etVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f24047a) {
            case 0:
                et etVar = this.f24048b;
                try {
                    i10 = etVar.f24672w + 0;
                    bitmap = etVar.f24666b;
                } catch (Exception e) {
                    FileLog.e(e);
                    etVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == etVar.f24673x) {
                        if (etVar.f24666b.getHeight() != i10) {
                        }
                        etVar.f24666b.eraseColor(0);
                        etVar.f24667c.save();
                        etVar.f24667c.translate(0.0f, 0);
                        etVar.c(etVar.f24667c);
                        etVar.f24667c.restore();
                        etVar.f24666b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(etVar.E);
                        return;
                    }
                }
                Bitmap bitmap2 = etVar.f24666b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                etVar.f24666b = Bitmap.createBitmap(etVar.f24673x, i10, Bitmap.Config.ARGB_8888);
                etVar.f24667c = new Canvas(etVar.f24666b);
                etVar.f24666b.eraseColor(0);
                etVar.f24667c.save();
                etVar.f24667c.translate(0.0f, 0);
                etVar.c(etVar.f24667c);
                etVar.f24667c.restore();
                etVar.f24666b.prepareToDraw();
                AndroidUtilities.runOnUIThread(etVar.E);
                return;
            default:
                et etVar2 = this.f24048b;
                etVar2.f24668f = false;
                etVar2.g();
                if (!etVar2.f24665a) {
                    etVar2.j();
                    return;
                } else if (etVar2.v == etVar2.G) {
                    etVar2.D = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
