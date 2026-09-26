package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27610a;
    public final w7.j0[] f27611b;
    public final Runnable[] f27612c;
    public final k60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, k60[] k60VarArr) {
        this.f27610a = v9Var;
        this.f27611b = j0VarArr;
        this.f27612c = runnableArr;
        this.d = k60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27610a;
        w7.j0[] j0VarArr = this.f27611b;
        Runnable[] runnableArr = this.f27612c;
        k60[] k60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (k60 k60Var : k60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29046b.remove(k60Var);
            v9Var.f29047c.remove(k60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
