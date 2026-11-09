package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class f9 implements j9 {
    public final k9 f33606a;
    public final c8.ea[] f33607b;
    public final Runnable[] f33608c;
    public final v40[] d;

    public f9(k9 k9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, v40[] v40VarArr) {
        this.f33606a = k9Var;
        this.f33607b = eaVarArr;
        this.f33608c = runnableArr;
        this.d = v40VarArr;
    }

    @Override
    public final void dispose() {
        k9 k9Var = this.f33606a;
        c8.ea[] eaVarArr = this.f33607b;
        Runnable[] runnableArr = this.f33608c;
        v40[] v40VarArr = this.d;
        eaVarArr[0] = null;
        if (k9Var.f35280e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21336e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            k9Var.f35280e.remove(runnableArr);
        }
        for (v40 v40Var : v40VarArr) {
            Bitmap bitmap = (Bitmap) k9Var.f35278b.remove(v40Var);
            k9Var.f35279c.remove(v40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
