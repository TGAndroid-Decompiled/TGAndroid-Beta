package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ts implements Runnable {
    public final int f32785a;
    public final vs f32786b;

    public ts(vs vsVar, int i9) {
        this.f32785a = i9;
        this.f32786b = vsVar;
    }

    @Override
    public final void run() {
        int i9;
        Bitmap bitmap;
        switch (this.f32785a) {
            case 0:
                vs vsVar = this.f32786b;
                try {
                    i9 = vsVar.f33994w + 0;
                    bitmap = vsVar.f33987b;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    vsVar.A = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vsVar.f33995x) {
                        if (vsVar.f33987b.getHeight() != i9) {
                        }
                        vsVar.f33987b.eraseColor(0);
                        vsVar.f33988c.save();
                        vsVar.f33988c.translate(0.0f, 0);
                        vsVar.c(vsVar.f33988c);
                        vsVar.f33988c.restore();
                        vsVar.f33987b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(vsVar.D);
                        return;
                    }
                }
                Bitmap bitmap2 = vsVar.f33987b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vsVar.f33987b = Bitmap.createBitmap(vsVar.f33995x, i9, Bitmap.Config.ARGB_8888);
                vsVar.f33988c = new Canvas(vsVar.f33987b);
                vsVar.f33987b.eraseColor(0);
                vsVar.f33988c.save();
                vsVar.f33988c.translate(0.0f, 0);
                vsVar.c(vsVar.f33988c);
                vsVar.f33988c.restore();
                vsVar.f33987b.prepareToDraw();
                AndroidUtilities.runOnUIThread(vsVar.D);
                return;
            default:
                vs vsVar2 = this.f32786b;
                vsVar2.f33990f = false;
                vsVar2.g();
                if (!vsVar2.f33986a) {
                    vsVar2.j();
                    return;
                } else if (vsVar2.v == vsVar2.F) {
                    vsVar2.C = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
