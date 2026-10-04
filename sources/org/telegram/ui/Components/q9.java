package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f29961a;
    public final w7.w5[] f29962b;
    public final Runnable[] f29963c;
    public final m60[] d;

    public q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, m60[] m60VarArr) {
        this.f29961a = v9Var;
        this.f29962b = w5VarArr;
        this.f29963c = runnableArr;
        this.d = m60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f29961a;
        w7.w5[] w5VarArr = this.f29962b;
        Runnable[] runnableArr = this.f29963c;
        m60[] m60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.f31612e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.f31612e.remove(runnableArr);
        }
        for (m60 m60Var : m60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f31610b.remove(m60Var);
            v9Var.f31611c.remove(m60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
