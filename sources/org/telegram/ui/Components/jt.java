package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jt implements Runnable {
    public final int f25545a;
    public final lt f25546b;

    public jt(lt ltVar, int i10) {
        this.f25545a = i10;
        this.f25546b = ltVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f25545a) {
            case 0:
                lt ltVar = this.f25546b;
                try {
                    i10 = ltVar.f26110w + 0;
                    bitmap = ltVar.f26104b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.f26111x) {
                        if (ltVar.f26104b.getHeight() != i10) {
                        }
                        ltVar.f26104b.eraseColor(0);
                        ltVar.f26105c.save();
                        ltVar.f26105c.translate(0.0f, 0);
                        ltVar.c(ltVar.f26105c);
                        ltVar.f26105c.restore();
                        ltVar.f26104b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ltVar.f26104b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.f26104b = Bitmap.createBitmap(ltVar.f26111x, i10, Bitmap.Config.ARGB_8888);
                ltVar.f26105c = new Canvas(ltVar.f26104b);
                ltVar.f26104b.eraseColor(0);
                ltVar.f26105c.save();
                ltVar.f26105c.translate(0.0f, 0);
                ltVar.c(ltVar.f26105c);
                ltVar.f26105c.restore();
                ltVar.f26104b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
                return;
            default:
                lt ltVar2 = this.f25546b;
                ltVar2.f26106f = false;
                ltVar2.g();
                if (!ltVar2.f26103a) {
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
