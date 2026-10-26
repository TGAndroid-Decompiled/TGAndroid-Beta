package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qt implements Runnable {
    public final int f32023a;
    public final st f32024b;

    public qt(st stVar, int i10) {
        this.f32023a = i10;
        this.f32024b = stVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f32023a) {
            case 0:
                st stVar = this.f32024b;
                try {
                    i10 = stVar.f32676w + 0;
                    bitmap = stVar.f32670b;
                } catch (Exception e) {
                    FileLog.e(e);
                    stVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == stVar.f32677x) {
                        if (stVar.f32670b.getHeight() != i10) {
                        }
                        stVar.f32670b.eraseColor(0);
                        stVar.f32671c.save();
                        stVar.f32671c.translate(0.0f, 0);
                        stVar.c(stVar.f32671c);
                        stVar.f32671c.restore();
                        stVar.f32670b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(stVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = stVar.f32670b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                stVar.f32670b = Bitmap.createBitmap(stVar.f32677x, i10, Bitmap.Config.ARGB_8888);
                stVar.f32671c = new Canvas(stVar.f32670b);
                stVar.f32670b.eraseColor(0);
                stVar.f32671c.save();
                stVar.f32671c.translate(0.0f, 0);
                stVar.c(stVar.f32671c);
                stVar.f32671c.restore();
                stVar.f32670b.prepareToDraw();
                AndroidUtilities.runOnUIThread(stVar.H);
                return;
            default:
                st stVar2 = this.f32024b;
                stVar2.f32672f = false;
                stVar2.g();
                if (!stVar2.f32669a) {
                    stVar2.j();
                    return;
                } else if (stVar2.v == stVar2.J) {
                    stVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
