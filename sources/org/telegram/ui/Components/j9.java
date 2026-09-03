package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class j9 implements n9 {
    public final o9 f25901a;
    public final k7.y5[] f25902b;
    public final Runnable[] f25903c;
    public final a60[] d;

    public j9(o9 o9Var, k7.y5[] y5VarArr, Runnable[] runnableArr, a60[] a60VarArr) {
        this.f25901a = o9Var;
        this.f25902b = y5VarArr;
        this.f25903c = runnableArr;
        this.d = a60VarArr;
    }

    @Override
    public final void dispose() {
        o9 o9Var = this.f25901a;
        k7.y5[] y5VarArr = this.f25902b;
        Runnable[] runnableArr = this.f25903c;
        a60[] a60VarArr = this.d;
        y5VarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.e.remove(runnableArr);
        }
        for (a60 a60Var : a60VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.f27497b.remove(a60Var);
            o9Var.f27498c.remove(a60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
