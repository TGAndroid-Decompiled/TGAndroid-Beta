package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class n9 implements r9 {
    public final s9 f30932a;
    public final i7.c6[] f30933b;
    public final Runnable[] f30934c;
    public final u50[] d;

    public n9(s9 s9Var, i7.c6[] c6VarArr, Runnable[] runnableArr, u50[] u50VarArr) {
        this.f30932a = s9Var;
        this.f30933b = c6VarArr;
        this.f30934c = runnableArr;
        this.d = u50VarArr;
    }

    @Override
    public final void dispose() {
        s9 s9Var = this.f30932a;
        i7.c6[] c6VarArr = this.f30933b;
        Runnable[] runnableArr = this.f30934c;
        u50[] u50VarArr = this.d;
        c6VarArr[0] = null;
        if (s9Var.f32590e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            s9Var.f32590e.remove(runnableArr);
        }
        for (u50 u50Var : u50VarArr) {
            Bitmap bitmap = (Bitmap) s9Var.f32588b.remove(u50Var);
            s9Var.f32589c.remove(u50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
