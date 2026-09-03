package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class et implements Runnable {
    public final int f26661a;
    public final gt f26662b;

    public et(gt gtVar, int i10) {
        this.f26661a = i10;
        this.f26662b = gtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f26661a) {
            case 0:
                gt gtVar = this.f26662b;
                try {
                    i10 = gtVar.f27275w + 0;
                    bitmap = gtVar.f27268b;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    gtVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.f27276x) {
                        if (gtVar.f27268b.getHeight() != i10) {
                        }
                        gtVar.f27268b.eraseColor(0);
                        gtVar.f27269c.save();
                        gtVar.f27269c.translate(0.0f, 0);
                        gtVar.c(gtVar.f27269c);
                        gtVar.f27269c.restore();
                        gtVar.f27268b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.E);
                        return;
                    }
                }
                Bitmap bitmap2 = gtVar.f27268b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.f27268b = Bitmap.createBitmap(gtVar.f27276x, i10, Bitmap.Config.ARGB_8888);
                gtVar.f27269c = new Canvas(gtVar.f27268b);
                gtVar.f27268b.eraseColor(0);
                gtVar.f27269c.save();
                gtVar.f27269c.translate(0.0f, 0);
                gtVar.c(gtVar.f27269c);
                gtVar.f27269c.restore();
                gtVar.f27268b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.E);
                return;
            default:
                gt gtVar2 = this.f26662b;
                gtVar2.f27271f = false;
                gtVar2.g();
                if (!gtVar2.f27267a) {
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
