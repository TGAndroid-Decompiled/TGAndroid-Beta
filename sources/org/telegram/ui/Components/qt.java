package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qt implements Runnable {
    public final int f32021a;
    public final st f32022b;

    public qt(st stVar, int i10) {
        this.f32021a = i10;
        this.f32022b = stVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f32021a) {
            case 0:
                st stVar = this.f32022b;
                try {
                    i10 = stVar.f32674w + 0;
                    bitmap = stVar.f32668b;
                } catch (Exception e) {
                    FileLog.e(e);
                    stVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == stVar.f32675x) {
                        if (stVar.f32668b.getHeight() != i10) {
                        }
                        stVar.f32668b.eraseColor(0);
                        stVar.f32669c.save();
                        stVar.f32669c.translate(0.0f, 0);
                        stVar.c(stVar.f32669c);
                        stVar.f32669c.restore();
                        stVar.f32668b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(stVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = stVar.f32668b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                stVar.f32668b = Bitmap.createBitmap(stVar.f32675x, i10, Bitmap.Config.ARGB_8888);
                stVar.f32669c = new Canvas(stVar.f32668b);
                stVar.f32668b.eraseColor(0);
                stVar.f32669c.save();
                stVar.f32669c.translate(0.0f, 0);
                stVar.c(stVar.f32669c);
                stVar.f32669c.restore();
                stVar.f32668b.prepareToDraw();
                AndroidUtilities.runOnUIThread(stVar.H);
                return;
            default:
                st stVar2 = this.f32022b;
                stVar2.f32670f = false;
                stVar2.g();
                if (!stVar2.f32667a) {
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
