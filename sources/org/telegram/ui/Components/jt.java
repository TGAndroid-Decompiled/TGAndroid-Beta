package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jt implements Runnable {
    public final int f27891a;
    public final lt f27892b;

    public jt(lt ltVar, int i10) {
        this.f27891a = i10;
        this.f27892b = ltVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f27891a) {
            case 0:
                lt ltVar = this.f27892b;
                try {
                    i10 = ltVar.f28425w + 0;
                    bitmap = ltVar.f28418b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.f28426x) {
                        if (ltVar.f28418b.getHeight() != i10) {
                        }
                        ltVar.f28418b.eraseColor(0);
                        ltVar.f28419c.save();
                        ltVar.f28419c.translate(0.0f, 0);
                        ltVar.c(ltVar.f28419c);
                        ltVar.f28419c.restore();
                        ltVar.f28418b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ltVar.f28418b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.f28418b = Bitmap.createBitmap(ltVar.f28426x, i10, Bitmap.Config.ARGB_8888);
                ltVar.f28419c = new Canvas(ltVar.f28418b);
                ltVar.f28418b.eraseColor(0);
                ltVar.f28419c.save();
                ltVar.f28419c.translate(0.0f, 0);
                ltVar.c(ltVar.f28419c);
                ltVar.f28419c.restore();
                ltVar.f28418b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
                return;
            default:
                lt ltVar2 = this.f27892b;
                ltVar2.f28421f = false;
                ltVar2.g();
                if (!ltVar2.f28417a) {
                    ltVar2.j();
                    return;
                } else if (ltVar2.v == ltVar2.J) {
                    ltVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
