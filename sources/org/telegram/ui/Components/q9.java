package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27487a;
    public final w7.j0[] f27488b;
    public final Runnable[] f27489c;
    public final h60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, h60[] h60VarArr) {
        this.f27487a = v9Var;
        this.f27488b = j0VarArr;
        this.f27489c = runnableArr;
        this.d = h60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27487a;
        w7.j0[] j0VarArr = this.f27488b;
        Runnable[] runnableArr = this.f27489c;
        h60[] h60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (h60 h60Var : h60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f28964b.remove(h60Var);
            v9Var.f28965c.remove(h60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
