package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class a9 implements e9 {
    public final f9 f24321a;
    public final w7.y5[] f24322b;
    public final Runnable[] f24323c;
    public final k50[] d;

    public a9(f9 f9Var, w7.y5[] y5VarArr, Runnable[] runnableArr, k50[] k50VarArr) {
        this.f24321a = f9Var;
        this.f24322b = y5VarArr;
        this.f24323c = runnableArr;
        this.d = k50VarArr;
    }

    @Override
    public final void dispose() {
        f9 f9Var = this.f24321a;
        w7.y5[] y5VarArr = this.f24322b;
        Runnable[] runnableArr = this.f24323c;
        k50[] k50VarArr = this.d;
        y5VarArr[0] = null;
        if (f9Var.e.contains(runnableArr)) {
            org.telegram.messenger.r5 r5Var = Utilities.e;
            r5Var.getClass();
            for (Runnable runnable : runnableArr) {
                r5Var.a(runnable);
            }
            f9Var.e.remove(runnableArr);
        }
        for (k50 k50Var : k50VarArr) {
            Bitmap bitmap = (Bitmap) f9Var.f26114b.remove(k50Var);
            f9Var.f26115c.remove(k50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
