package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f29497a;
    public final w7.w5[] f29498b;
    public final Runnable[] f29499c;
    public final t60[] d;

    public q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, t60[] t60VarArr) {
        this.f29497a = v9Var;
        this.f29498b = w5VarArr;
        this.f29499c = runnableArr;
        this.d = t60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f29497a;
        w7.w5[] w5VarArr = this.f29498b;
        Runnable[] runnableArr = this.f29499c;
        t60[] t60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (t60 t60Var : t60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f31206b.remove(t60Var);
            v9Var.f31207c.remove(t60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
