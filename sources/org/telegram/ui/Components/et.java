package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f26640a;
    public final gt f26641b;

    public et(gt gtVar, int i10) {
        this.f26640a = i10;
        this.f26641b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f26640a) {
            case 0:
                gt gtVar = this.f26641b;
                try {
                    i10 = gtVar.f27292w + 0;
                    bitmap = gtVar.f27285b;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    gtVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f27293x) {
                        if (gtVar.f27285b.getHeight() != i10) {
                        }
                        gtVar.f27285b.eraseColor(0);
                        gtVar.f27286c.save();
                        gtVar.f27286c.translate(0.0f, 0);
                        gtVar.c(gtVar.f27286c);
                        gtVar.f27286c.restore();
                        gtVar.f27285b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.E);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f27285b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f27285b = Bitmap.createBitmap(gtVar.f27293x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f27286c = new Canvas(gtVar.f27285b);
                gtVar.f27285b.eraseColor(0);
                gtVar.f27286c.save();
                gtVar.f27286c.translate(0.0f, 0);
                gtVar.c(gtVar.f27286c);
                gtVar.f27286c.restore();
                gtVar.f27285b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.E);
                return;
            default:
                gt gtVar2 = this.f26641b;
                gtVar2.f27288f = false;
                gtVar2.g();
                if (!gtVar2.f27284a) {
                    gtVar2.j();
                    return;
                } else if (gtVar2.v == gtVar2.G) {
                    gtVar2.D = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
