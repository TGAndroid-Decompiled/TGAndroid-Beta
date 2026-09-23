package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class q9 implements u9 {
    public final v9 f27273a;
    public final w7.i0[] f27274b;
    public final Runnable[] f27275c;
    public final z50[] d;

    public q9(v9 v9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, z50[] z50VarArr) {
        this.f27273a = v9Var;
        this.f27274b = i0VarArr;
        this.f27275c = runnableArr;
        this.d = z50VarArr;
    }

    @Override
    public final void dispose() {
        v9 v9Var = this.f27273a;
        w7.i0[] i0VarArr = this.f27274b;
        Runnable[] runnableArr = this.f27275c;
        z50[] z50VarArr = this.d;
        i0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (z50 z50Var : z50VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.f28693b.remove(z50Var);
            v9Var.f28694c.remove(z50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
