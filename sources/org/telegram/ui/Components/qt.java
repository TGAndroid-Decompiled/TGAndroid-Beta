package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qt implements Runnable {
    public final int f32020a;
    public final st f32021b;

    public qt(st stVar, int i10) {
        this.f32020a = i10;
        this.f32021b = stVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f32020a) {
            case 0:
                st stVar = this.f32021b;
                try {
                    i10 = stVar.f32679w + 0;
                    bitmap = stVar.f32673b;
                } catch (Exception e) {
                    FileLog.e(e);
                    stVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == stVar.f32680x) {
                        if (stVar.f32673b.getHeight() != i10) {
                        }
                        stVar.f32673b.eraseColor(0);
                        stVar.f32674c.save();
                        stVar.f32674c.translate(0.0f, 0);
                        stVar.c(stVar.f32674c);
                        stVar.f32674c.restore();
                        stVar.f32673b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(stVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = stVar.f32673b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                stVar.f32673b = Bitmap.createBitmap(stVar.f32680x, i10, Bitmap.Config.ARGB_8888);
                stVar.f32674c = new Canvas(stVar.f32673b);
                stVar.f32673b.eraseColor(0);
                stVar.f32674c.save();
                stVar.f32674c.translate(0.0f, 0);
                stVar.c(stVar.f32674c);
                stVar.f32674c.restore();
                stVar.f32673b.prepareToDraw();
                AndroidUtilities.runOnUIThread(stVar.H);
                return;
            default:
                st stVar2 = this.f32021b;
                stVar2.f32675f = false;
                stVar2.g();
                if (!stVar2.f32672a) {
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
