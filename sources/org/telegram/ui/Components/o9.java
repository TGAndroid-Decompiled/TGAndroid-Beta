package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class o9 implements s9 {
    public final t9 f29172a;
    public final w7.w5[] f29173b;
    public final Runnable[] f29174c;
    public final s60[] d;

    public o9(t9 t9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, s60[] s60VarArr) {
        this.f29172a = t9Var;
        this.f29173b = w5VarArr;
        this.f29174c = runnableArr;
        this.d = s60VarArr;
    }

    @Override
    public final void dispose() {
        t9 t9Var = this.f29172a;
        w7.w5[] w5VarArr = this.f29173b;
        Runnable[] runnableArr = this.f29174c;
        s60[] s60VarArr = this.d;
        w5VarArr[0] = null;
        if (t9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            t9Var.e.remove(runnableArr);
        }
        for (s60 s60Var : s60VarArr) {
            Bitmap bitmap = (Bitmap) t9Var.f30759b.remove(s60Var);
            t9Var.f30760c.remove(s60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
