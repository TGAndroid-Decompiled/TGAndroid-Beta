package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27592a;
    public final w7.j0[] f27593b;
    public final Runnable[] f27594c;
    public final m60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, m60[] m60VarArr) {
        this.f27592a = v9Var;
        this.f27593b = j0VarArr;
        this.f27594c = runnableArr;
        this.d = m60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27592a;
        w7.j0[] j0VarArr = this.f27593b;
        Runnable[] runnableArr = this.f27594c;
        m60[] m60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (m60 m60Var : m60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29090b.remove(m60Var);
            v9Var.f29091c.remove(m60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
