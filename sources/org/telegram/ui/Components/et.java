package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f25783a;
    public final gt f25784b;

    public et(gt gtVar, int i10) {
        this.f25783a = i10;
        this.f25784b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25783a) {
            case 0:
                gt gtVar = this.f25784b;
                try {
                    i10 = gtVar.f26507w + 0;
                    bitmap = gtVar.f26500b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    gtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f26508x) {
                        if (gtVar.f26500b.getHeight() != i10) {
                        }
                        gtVar.f26500b.eraseColor(0);
                        gtVar.f26501c.save();
                        gtVar.f26501c.translate(0.0f, 0);
                        gtVar.c(gtVar.f26501c);
                        gtVar.f26501c.restore();
                        gtVar.f26500b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f26500b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f26500b = Bitmap.createBitmap(gtVar.f26508x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f26501c = new Canvas(gtVar.f26500b);
                gtVar.f26500b.eraseColor(0);
                gtVar.f26501c.save();
                gtVar.f26501c.translate(0.0f, 0);
                gtVar.c(gtVar.f26501c);
                gtVar.f26501c.restore();
                gtVar.f26500b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.H);
                return;
            default:
                gt gtVar2 = this.f25784b;
                gtVar2.f26503f = false;
                gtVar2.g();
                if (!gtVar2.f26499a) {
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
