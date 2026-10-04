package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jt implements Runnable {
    public final int f27892a;
    public final lt f27893b;

    public jt(lt ltVar, int i10) {
        this.f27892a = i10;
        this.f27893b = ltVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f27892a) {
            case 0:
                lt ltVar = this.f27893b;
                try {
                    i10 = ltVar.f28426w + 0;
                    bitmap = ltVar.f28419b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.f28427x) {
                        if (ltVar.f28419b.getHeight() != i10) {
                        }
                        ltVar.f28419b.eraseColor(0);
                        ltVar.f28420c.save();
                        ltVar.f28420c.translate(0.0f, 0);
                        ltVar.c(ltVar.f28420c);
                        ltVar.f28420c.restore();
                        ltVar.f28419b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ltVar.f28419b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.f28419b = Bitmap.createBitmap(ltVar.f28427x, i10, Bitmap.Config.ARGB_8888);
                ltVar.f28420c = new Canvas(ltVar.f28419b);
                ltVar.f28419b.eraseColor(0);
                ltVar.f28420c.save();
                ltVar.f28420c.translate(0.0f, 0);
                ltVar.c(ltVar.f28420c);
                ltVar.f28420c.restore();
                ltVar.f28419b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
                return;
            default:
                lt ltVar2 = this.f27893b;
                ltVar2.f28422f = false;
                ltVar2.g();
                if (!ltVar2.f28418a) {
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
