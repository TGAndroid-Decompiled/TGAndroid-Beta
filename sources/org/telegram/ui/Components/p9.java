package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class p9 implements t9 {
    public final u9 f27189a;
    public final w7.j0[] f27190b;
    public final Runnable[] f27191c;
    public final g60[] d;

    public p9(u9 u9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, g60[] g60VarArr) {
        this.f27189a = u9Var;
        this.f27190b = j0VarArr;
        this.f27191c = runnableArr;
        this.d = g60VarArr;
    }

    @Override
    public final void dispose() {
        u9 u9Var = this.f27189a;
        w7.j0[] j0VarArr = this.f27190b;
        Runnable[] runnableArr = this.f27191c;
        g60[] g60VarArr = this.d;
        j0VarArr[0] = null;
        if (u9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            u9Var.e.remove(runnableArr);
        }
        for (g60 g60Var : g60VarArr) {
            Bitmap bitmap = (Bitmap) u9Var.f28629b.remove(g60Var);
            u9Var.f28630c.remove(g60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
