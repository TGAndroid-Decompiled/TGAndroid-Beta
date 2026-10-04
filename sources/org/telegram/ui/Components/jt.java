package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jt implements Runnable {
    public final int f27897a;
    public final lt f27898b;

    public jt(lt ltVar, int i10) {
        this.f27897a = i10;
        this.f27898b = ltVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f27897a) {
            case 0:
                lt ltVar = this.f27898b;
                try {
                    i10 = ltVar.f28431w + 0;
                    bitmap = ltVar.f28424b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.f28432x) {
                        if (ltVar.f28424b.getHeight() != i10) {
                        }
                        ltVar.f28424b.eraseColor(0);
                        ltVar.f28425c.save();
                        ltVar.f28425c.translate(0.0f, 0);
                        ltVar.c(ltVar.f28425c);
                        ltVar.f28425c.restore();
                        ltVar.f28424b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ltVar.f28424b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.f28424b = Bitmap.createBitmap(ltVar.f28432x, i10, Bitmap.Config.ARGB_8888);
                ltVar.f28425c = new Canvas(ltVar.f28424b);
                ltVar.f28424b.eraseColor(0);
                ltVar.f28425c.save();
                ltVar.f28425c.translate(0.0f, 0);
                ltVar.c(ltVar.f28425c);
                ltVar.f28425c.restore();
                ltVar.f28424b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
                return;
            default:
                lt ltVar2 = this.f27898b;
                ltVar2.f28427f = false;
                ltVar2.g();
                if (!ltVar2.f28423a) {
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
