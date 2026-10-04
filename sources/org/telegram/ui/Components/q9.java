package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f29956a;
    public final w7.w5[] f29957b;
    public final Runnable[] f29958c;
    public final m60[] d;

    public q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, m60[] m60VarArr) {
        this.f29956a = v9Var;
        this.f29957b = w5VarArr;
        this.f29958c = runnableArr;
        this.d = m60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f29956a;
        w7.w5[] w5VarArr = this.f29957b;
        Runnable[] runnableArr = this.f29958c;
        m60[] m60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.f31606e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.f31606e.remove(runnableArr);
        }
        for (m60 m60Var : m60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f31604b.remove(m60Var);
            v9Var.f31605c.remove(m60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
