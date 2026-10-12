package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class t9 implements x9 {
    public final y9 f29311a;
    public final w7.x5[] f29312b;
    public final Runnable[] f29313c;
    public final w60[] d;

    public t9(y9 y9Var, w7.x5[] x5VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.f29311a = y9Var;
        this.f29312b = x5VarArr;
        this.f29313c = runnableArr;
        this.d = w60VarArr;
    }

    @Override
    public final void dispose() {
        y9 y9Var = this.f29311a;
        w7.x5[] x5VarArr = this.f29312b;
        Runnable[] runnableArr = this.f29313c;
        w60[] w60VarArr = this.d;
        x5VarArr[0] = null;
        if (y9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            y9Var.e.remove(runnableArr);
        }
        for (w60 w60Var : w60VarArr) {
            Bitmap bitmap = (Bitmap) y9Var.f31515b.remove(w60Var);
            y9Var.f31516c.remove(w60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
