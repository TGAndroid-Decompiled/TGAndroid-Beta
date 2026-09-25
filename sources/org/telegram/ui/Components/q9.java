package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27543a;
    public final w7.j0[] f27544b;
    public final Runnable[] f27545c;
    public final j60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, j60[] j60VarArr) {
        this.f27543a = v9Var;
        this.f27544b = j0VarArr;
        this.f27545c = runnableArr;
        this.d = j60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27543a;
        w7.j0[] j0VarArr = this.f27544b;
        Runnable[] runnableArr = this.f27545c;
        j60[] j60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (j60 j60Var : j60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29109b.remove(j60Var);
            v9Var.f29110c.remove(j60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
