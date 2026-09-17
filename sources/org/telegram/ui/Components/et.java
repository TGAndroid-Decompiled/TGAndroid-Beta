package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f25784a;
    public final gt f25785b;

    public et(gt gtVar, int i10) {
        this.f25784a = i10;
        this.f25785b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25784a) {
            case 0:
                gt gtVar = this.f25785b;
                try {
                    i10 = gtVar.f26508w + 0;
                    bitmap = gtVar.f26501b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    gtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f26509x) {
                        if (gtVar.f26501b.getHeight() != i10) {
                        }
                        gtVar.f26501b.eraseColor(0);
                        gtVar.f26502c.save();
                        gtVar.f26502c.translate(0.0f, 0);
                        gtVar.c(gtVar.f26502c);
                        gtVar.f26502c.restore();
                        gtVar.f26501b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f26501b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f26501b = Bitmap.createBitmap(gtVar.f26509x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f26502c = new Canvas(gtVar.f26501b);
                gtVar.f26501b.eraseColor(0);
                gtVar.f26502c.save();
                gtVar.f26502c.translate(0.0f, 0);
                gtVar.c(gtVar.f26502c);
                gtVar.f26502c.restore();
                gtVar.f26501b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.H);
                return;
            default:
                gt gtVar2 = this.f25785b;
                gtVar2.f26504f = false;
                gtVar2.g();
                if (!gtVar2.f26500a) {
                    gtVar2.j();
                    return;
                } else if (gtVar2.v == gtVar2.J) {
                    gtVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
