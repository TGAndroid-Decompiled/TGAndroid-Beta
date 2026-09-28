package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27575a;
    public final w7.j0[] f27576b;
    public final Runnable[] f27577c;
    public final l60[] d;

    public q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, l60[] l60VarArr) {
        this.f27575a = v9Var;
        this.f27576b = j0VarArr;
        this.f27577c = runnableArr;
        this.d = l60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27575a;
        w7.j0[] j0VarArr = this.f27576b;
        Runnable[] runnableArr = this.f27577c;
        l60[] l60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (l60 l60Var : l60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f29022b.remove(l60Var);
            v9Var.f29023c.remove(l60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
