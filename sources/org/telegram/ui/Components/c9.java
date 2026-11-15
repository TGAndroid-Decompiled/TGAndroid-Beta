package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class c9 implements g9 {
    public final h9 f33527a;
    public final c8.ga[] f33528b;
    public final Runnable[] f33529c;
    public final x40[] d;

    public c9(h9 h9Var, c8.ga[] gaVarArr, Runnable[] runnableArr, x40[] x40VarArr) {
        this.f33527a = h9Var;
        this.f33528b = gaVarArr;
        this.f33529c = runnableArr;
        this.d = x40VarArr;
    }

    @Override
    public final void dispose() {
        h9 h9Var = this.f33527a;
        c8.ga[] gaVarArr = this.f33528b;
        Runnable[] runnableArr = this.f33529c;
        x40[] x40VarArr = this.d;
        gaVarArr[0] = null;
        if (h9Var.f35198e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f22416e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            h9Var.f35198e.remove(runnableArr);
        }
        for (x40 x40Var : x40VarArr) {
            Bitmap bitmap = (Bitmap) h9Var.f35196b.remove(x40Var);
            h9Var.f35197c.remove(x40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
