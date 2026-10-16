package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class t9 implements x9 {
    public final y9 f28996a;
    public final w7.w5[] f28997b;
    public final Runnable[] f28998c;
    public final w60[] d;

    public t9(y9 y9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.f28996a = y9Var;
        this.f28997b = w5VarArr;
        this.f28998c = runnableArr;
        this.d = w60VarArr;
    }

    @Override
    public final void dispose() {
        y9 y9Var = this.f28996a;
        w7.w5[] w5VarArr = this.f28997b;
        Runnable[] runnableArr = this.f28998c;
        w60[] w60VarArr = this.d;
        w5VarArr[0] = null;
        if (y9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            y9Var.e.remove(runnableArr);
        }
        for (w60 w60Var : w60VarArr) {
            Bitmap bitmap = (Bitmap) y9Var.f31197b.remove(w60Var);
            y9Var.f31198c.remove(w60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
