package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class wt implements Runnable {
    public final int f32671a;
    public final yt f32672b;

    public wt(yt ytVar, int i10) {
        this.f32671a = i10;
        this.f32672b = ytVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f32671a) {
            case 0:
                yt ytVar = this.f32672b;
                try {
                    i10 = ytVar.f33350w + 0;
                    bitmap = ytVar.f33343b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ytVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ytVar.f33351x) {
                        if (ytVar.f33343b.getHeight() != i10) {
                        }
                        ytVar.f33343b.eraseColor(0);
                        ytVar.f33344c.save();
                        ytVar.f33344c.translate(0.0f, 0);
                        ytVar.c(ytVar.f33344c);
                        ytVar.f33344c.restore();
                        ytVar.f33343b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ytVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = ytVar.f33343b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ytVar.f33343b = Bitmap.createBitmap(ytVar.f33351x, i10, Bitmap.Config.ARGB_8888);
                ytVar.f33344c = new Canvas(ytVar.f33343b);
                ytVar.f33343b.eraseColor(0);
                ytVar.f33344c.save();
                ytVar.f33344c.translate(0.0f, 0);
                ytVar.c(ytVar.f33344c);
                ytVar.f33344c.restore();
                ytVar.f33343b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ytVar.H);
                return;
            default:
                yt ytVar2 = this.f32672b;
                ytVar2.f33346f = false;
                ytVar2.g();
                if (!ytVar2.f33342a) {
                    ytVar2.j();
                    return;
                } else if (ytVar2.v == ytVar2.J) {
                    ytVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
