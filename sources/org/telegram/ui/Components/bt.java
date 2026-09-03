package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bt implements Runnable {
    public final int f23742a;
    public final dt f23743b;

    public bt(dt dtVar, int i10) {
        this.f23742a = i10;
        this.f23743b = dtVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f23742a) {
            case 0:
                dt dtVar = this.f23743b;
                try {
                    i10 = dtVar.f24382w + 0;
                    bitmap = dtVar.f24376b;
                } catch (Exception e) {
                    FileLog.e(e);
                    dtVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == dtVar.f24383x) {
                        if (dtVar.f24376b.getHeight() != i10) {
                        }
                        dtVar.f24376b.eraseColor(0);
                        dtVar.f24377c.save();
                        dtVar.f24377c.translate(0.0f, 0);
                        dtVar.c(dtVar.f24377c);
                        dtVar.f24377c.restore();
                        dtVar.f24376b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(dtVar.E);
                        return;
                    }
                }
                Bitmap bitmap2 = dtVar.f24376b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                dtVar.f24376b = Bitmap.createBitmap(dtVar.f24383x, i10, Bitmap.Config.ARGB_8888);
                dtVar.f24377c = new Canvas(dtVar.f24376b);
                dtVar.f24376b.eraseColor(0);
                dtVar.f24377c.save();
                dtVar.f24377c.translate(0.0f, 0);
                dtVar.c(dtVar.f24377c);
                dtVar.f24377c.restore();
                dtVar.f24376b.prepareToDraw();
                AndroidUtilities.runOnUIThread(dtVar.E);
                return;
            default:
                dt dtVar2 = this.f23743b;
                dtVar2.f24378f = false;
                dtVar2.g();
                if (!dtVar2.f24375a) {
                    dtVar2.j();
                    return;
                } else if (dtVar2.v == dtVar2.G) {
                    dtVar2.D = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
