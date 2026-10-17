package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f29594a;
    public final w7.w5[] f29595b;
    public final Runnable[] f29596c;
    public final t60[] d;

    public q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, t60[] t60VarArr) {
        this.f29594a = v9Var;
        this.f29595b = w5VarArr;
        this.f29596c = runnableArr;
        this.d = t60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f29594a;
        w7.w5[] w5VarArr = this.f29595b;
        Runnable[] runnableArr = this.f29596c;
        t60[] t60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (t60 t60Var : t60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f31227b.remove(t60Var);
            v9Var.f31228c.remove(t60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
