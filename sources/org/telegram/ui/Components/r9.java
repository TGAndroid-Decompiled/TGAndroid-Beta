package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class r9 implements v9 {
    public final w9 f29990a;
    public final w7.i0[] f29991b;
    public final Runnable[] f29992c;
    public final y50[] d;

    public r9(w9 w9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.f29990a = w9Var;
        this.f29991b = i0VarArr;
        this.f29992c = runnableArr;
        this.d = y50VarArr;
    }

    @Override
    public final void dispose() {
        w9 w9Var = this.f29990a;
        w7.i0[] i0VarArr = this.f29991b;
        Runnable[] runnableArr = this.f29992c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (w9Var.f32215e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            w9Var.f32215e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) w9Var.f32213b.remove(y50Var);
            w9Var.f32214c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
