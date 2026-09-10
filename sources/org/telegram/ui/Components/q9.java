package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f26342a;
    public final w7.x5[] f26343b;
    public final Runnable[] f26344c;
    public final h60[] d;

    public q9(v9 v9Var, w7.x5[] x5VarArr, Runnable[] runnableArr, h60[] h60VarArr) {
        this.f26342a = v9Var;
        this.f26343b = x5VarArr;
        this.f26344c = runnableArr;
        this.d = h60VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f26342a;
        w7.x5[] x5VarArr = this.f26343b;
        Runnable[] runnableArr = this.f26344c;
        h60[] h60VarArr = this.d;
        x5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (h60 h60Var : h60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f27896b.remove(h60Var);
            v9Var.f27897c.remove(h60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
