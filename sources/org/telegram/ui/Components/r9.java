package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class r9 implements v9 {
    public final w9 f30018a;
    public final w7.i0[] f30019b;
    public final Runnable[] f30020c;
    public final y50[] d;

    public r9(w9 w9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.f30018a = w9Var;
        this.f30019b = i0VarArr;
        this.f30020c = runnableArr;
        this.d = y50VarArr;
    }

    @Override
    public final void dispose() {
        w9 w9Var = this.f30018a;
        w7.i0[] i0VarArr = this.f30019b;
        Runnable[] runnableArr = this.f30020c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (w9Var.f32243e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            w9Var.f32243e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) w9Var.f32241b.remove(y50Var);
            w9Var.f32242c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
