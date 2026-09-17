package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f25811a;
    public final gt f25812b;

    public et(gt gtVar, int i10) {
        this.f25811a = i10;
        this.f25812b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25811a) {
            case 0:
                gt gtVar = this.f25812b;
                try {
                    i10 = gtVar.f26535w + 0;
                    bitmap = gtVar.f26528b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    gtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f26536x) {
                        if (gtVar.f26528b.getHeight() != i10) {
                        }
                        gtVar.f26528b.eraseColor(0);
                        gtVar.f26529c.save();
                        gtVar.f26529c.translate(0.0f, 0);
                        gtVar.c(gtVar.f26529c);
                        gtVar.f26529c.restore();
                        gtVar.f26528b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f26528b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f26528b = Bitmap.createBitmap(gtVar.f26536x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f26529c = new Canvas(gtVar.f26528b);
                gtVar.f26528b.eraseColor(0);
                gtVar.f26529c.save();
                gtVar.f26529c.translate(0.0f, 0);
                gtVar.c(gtVar.f26529c);
                gtVar.f26529c.restore();
                gtVar.f26528b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.H);
                return;
            default:
                gt gtVar2 = this.f25812b;
                gtVar2.f26531f = false;
                gtVar2.g();
                if (!gtVar2.f26527a) {
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
