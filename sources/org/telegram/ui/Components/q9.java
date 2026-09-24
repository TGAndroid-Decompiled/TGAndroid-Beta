package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27536a;
    public final w7.j0[] f27537b;
    public final Runnable[] f27538c;
    public final j60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, j60[] j60VarArr) {
        this.f27536a = v9Var;
        this.f27537b = j0VarArr;
        this.f27538c = runnableArr;
        this.d = j60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27536a;
        w7.j0[] j0VarArr = this.f27537b;
        Runnable[] runnableArr = this.f27538c;
        j60[] j60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (j60 j60Var : j60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29102b.remove(j60Var);
            v9Var.f29103c.remove(j60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
