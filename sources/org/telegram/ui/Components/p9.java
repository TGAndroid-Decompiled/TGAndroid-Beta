package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class p9 implements t9 {
    public final u9 f27282a;
    public final w7.j0[] f27283b;
    public final Runnable[] f27284c;
    public final j60[] d;

    public p9(u9 u9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, j60[] j60VarArr) {
        this.f27282a = u9Var;
        this.f27283b = j0VarArr;
        this.f27284c = runnableArr;
        this.d = j60VarArr;
    }

    @Override
    public final void dispose() {
        u9 u9Var = this.f27282a;
        w7.j0[] j0VarArr = this.f27283b;
        Runnable[] runnableArr = this.f27284c;
        j60[] j60VarArr = this.d;
        j0VarArr[0] = null;
        if (u9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            u9Var.e.remove(runnableArr);
        }
        for (j60 j60Var : j60VarArr) {
            Bitmap bitmap = (Bitmap) u9Var.f28699b.remove(j60Var);
            u9Var.f28700c.remove(j60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
