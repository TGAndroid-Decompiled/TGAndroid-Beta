package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yt implements Runnable {
    public final int f33167a;
    public final au f33168b;

    public yt(au auVar, int i10) {
        this.f33167a = i10;
        this.f33168b = auVar;
    }

    @Override
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.f33167a) {
            case 0:
                au auVar = this.f33168b;
                try {
                    i10 = auVar.f24488w + 0;
                    bitmap = auVar.f24481b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    auVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == auVar.f24489x) {
                        if (auVar.f24481b.getHeight() != i10) {
                        }
                        auVar.f24481b.eraseColor(0);
                        auVar.f24482c.save();
                        auVar.f24482c.translate(0.0f, 0);
                        auVar.c(auVar.f24482c);
                        auVar.f24482c.restore();
                        auVar.f24481b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(auVar.H);
                        return;
                    }
                }
                Bitmap bitmap2 = auVar.f24481b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                auVar.f24481b = Bitmap.createBitmap(auVar.f24489x, i10, Bitmap.Config.ARGB_8888);
                auVar.f24482c = new Canvas(auVar.f24481b);
                auVar.f24481b.eraseColor(0);
                auVar.f24482c.save();
                auVar.f24482c.translate(0.0f, 0);
                auVar.c(auVar.f24482c);
                auVar.f24482c.restore();
                auVar.f24481b.prepareToDraw();
                AndroidUtilities.runOnUIThread(auVar.H);
                return;
            default:
                au auVar2 = this.f33168b;
                auVar2.f24484f = false;
                auVar2.g();
                if (!auVar2.f24480a) {
                    auVar2.j();
                    return;
                } else if (auVar2.v == auVar2.J) {
                    auVar2.G = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
