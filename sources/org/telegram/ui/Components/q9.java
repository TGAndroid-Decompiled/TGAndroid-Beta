package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27618a;
    public final w7.j0[] f27619b;
    public final Runnable[] f27620c;
    public final l60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, l60[] l60VarArr) {
        this.f27618a = v9Var;
        this.f27619b = j0VarArr;
        this.f27620c = runnableArr;
        this.d = l60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27618a;
        w7.j0[] j0VarArr = this.f27619b;
        Runnable[] runnableArr = this.f27620c;
        l60[] l60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (l60 l60Var : l60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29081b.remove(l60Var);
            v9Var.f29082c.remove(l60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
