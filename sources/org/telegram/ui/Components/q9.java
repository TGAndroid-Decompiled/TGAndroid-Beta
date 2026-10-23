package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f29805a;
    public final w7.w5[] f29806b;
    public final Runnable[] f29807c;
    public final u60[] d;

    public q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, u60[] u60VarArr) {
        this.f29805a = v9Var;
        this.f29806b = w5VarArr;
        this.f29807c = runnableArr;
        this.d = u60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f29805a;
        w7.w5[] w5VarArr = this.f29806b;
        Runnable[] runnableArr = this.f29807c;
        u60[] u60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (u60 u60Var : u60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f31387b.remove(u60Var);
            v9Var.f31388c.remove(u60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
