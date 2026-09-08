package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f25810a;
    public final gt f25811b;

    public et(gt gtVar, int i10) {
        this.f25810a = i10;
        this.f25811b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25810a) {
            case 0:
                gt gtVar = this.f25811b;
                try {
                    i10 = gtVar.f26534w + 0;
                    bitmap = gtVar.f26527b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    gtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f26535x) {
                        if (gtVar.f26527b.getHeight() != i10) {
                        }
                        gtVar.f26527b.eraseColor(0);
                        gtVar.f26528c.save();
                        gtVar.f26528c.translate(0.0f, 0);
                        gtVar.c(gtVar.f26528c);
                        gtVar.f26528c.restore();
                        gtVar.f26527b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f26527b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f26527b = Bitmap.createBitmap(gtVar.f26535x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f26528c = new Canvas(gtVar.f26527b);
                gtVar.f26527b.eraseColor(0);
                gtVar.f26528c.save();
                gtVar.f26528c.translate(0.0f, 0);
                gtVar.c(gtVar.f26528c);
                gtVar.f26528c.restore();
                gtVar.f26527b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.H);
                return;
            default:
                gt gtVar2 = this.f25811b;
                gtVar2.f26530f = false;
                gtVar2.g();
                if (!gtVar2.f26526a) {
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
