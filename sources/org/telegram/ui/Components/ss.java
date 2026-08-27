package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class ss implements Runnable {

    public final int f32556a;

    public final us f32557b;

    public ss(us usVar, int i10) {
        this.f32556a = i10;
        this.f32557b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f32556a) {
            case 0:
                us usVar = this.f32557b;
                try {
                    int i10 = usVar.f33205w + 0;
                    Bitmap bitmap = usVar.f33198b;
                    if (bitmap == null || bitmap.getWidth() != usVar.f33206x || usVar.f33198b.getHeight() != i10) {
                        Bitmap bitmap2 = usVar.f33198b;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        usVar.f33198b = Bitmap.createBitmap(usVar.f33206x, i10, Bitmap.Config.ARGB_8888);
                        usVar.f33199c = new Canvas(usVar.f33198b);
                    }
                    usVar.f33198b.eraseColor(0);
                    usVar.f33199c.save();
                    usVar.f33199c.translate(0.0f, 0);
                    usVar.c(usVar.f33199c);
                    usVar.f33199c.restore();
                    usVar.f33198b.prepareToDraw();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    usVar.A = true;
                }
                AndroidUtilities.runOnUIThread(usVar.D);
                break;
            default:
                us usVar2 = this.f32557b;
                usVar2.f33201f = false;
                usVar2.g();
                if (!usVar2.f33197a) {
                    usVar2.j();
                    break;
                } else if (usVar2.v == usVar2.F) {
                    usVar2.C = true;
                    break;
                }
                break;
        }
    }
}
