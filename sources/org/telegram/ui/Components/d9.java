package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class d9 implements h9 {
    public final j9 f33020a;
    public final b8.jf[] f33021b;
    public final Runnable[] f33022c;
    public final q40[] d;

    public d9(j9 j9Var, b8.jf[] jfVarArr, Runnable[] runnableArr, q40[] q40VarArr) {
        this.f33020a = j9Var;
        this.f33021b = jfVarArr;
        this.f33022c = runnableArr;
        this.d = q40VarArr;
    }

    @Override
    public final void dispose() {
        j9 j9Var = this.f33020a;
        b8.jf[] jfVarArr = this.f33021b;
        Runnable[] runnableArr = this.f33022c;
        q40[] q40VarArr = this.d;
        jfVarArr[0] = null;
        if (j9Var.f35001e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21387e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            j9Var.f35001e.remove(runnableArr);
        }
        for (q40 q40Var : q40VarArr) {
            Bitmap bitmap = (Bitmap) j9Var.f34999b.remove(q40Var);
            j9Var.f35000c.remove(q40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
