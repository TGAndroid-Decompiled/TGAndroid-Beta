package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class mt implements Runnable {
    public final int f28694a;
    public final ot f28695b;

    public mt(ot otVar, int i10) {
        this.f28694a = i10;
        this.f28695b = otVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f28694a) {
            case 0:
                ot otVar = this.f28695b;
                try {
                    i10 = otVar.f29377w + 0;
                    bitmap = otVar.f29371b;
                } catch (Exception e) {
                    FileLog.e(e);
                    otVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == otVar.f29378x) {
                        if (otVar.f29371b.getHeight() != i10) {
                        }
                        otVar.f29371b.eraseColor(0);
                        otVar.f29372c.save();
                        otVar.f29372c.translate(0.0f, 0);
                        otVar.c(otVar.f29372c);
                        otVar.f29372c.restore();
                        otVar.f29371b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(otVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = otVar.f29371b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                otVar.f29371b = Bitmap.createBitmap(otVar.f29378x, i10, Bitmap.Config.ARGB_8888);
                otVar.f29372c = new Canvas(otVar.f29371b);
                otVar.f29371b.eraseColor(0);
                otVar.f29372c.save();
                otVar.f29372c.translate(0.0f, 0);
                otVar.c(otVar.f29372c);
                otVar.f29372c.restore();
                otVar.f29371b.prepareToDraw();
                AndroidUtilities.runOnUIThread(otVar.H);
                return;
            default:
                ot otVar2 = this.f28695b;
                otVar2.f29373f = false;
                otVar2.g();
                if (!otVar2.f29370a) {
                    otVar2.j();
                    return;
                } else if (otVar2.v == otVar2.J) {
                    otVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
