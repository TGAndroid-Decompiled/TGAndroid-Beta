package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class r9 implements v9 {
    public final w9 f30017a;
    public final w7.i0[] f30018b;
    public final Runnable[] f30019c;
    public final y50[] d;

    public r9(w9 w9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.f30017a = w9Var;
        this.f30018b = i0VarArr;
        this.f30019c = runnableArr;
        this.d = y50VarArr;
    }

    @Override
    public final void dispose() {
        w9 w9Var = this.f30017a;
        w7.i0[] i0VarArr = this.f30018b;
        Runnable[] runnableArr = this.f30019c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (w9Var.f32242e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            w9Var.f32242e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) w9Var.f32240b.remove(y50Var);
            w9Var.f32241c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
