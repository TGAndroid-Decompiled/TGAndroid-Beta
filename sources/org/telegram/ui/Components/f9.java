package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class f9 implements j9 {
    public final k9 f33500a;
    public final c8.ea[] f33501b;
    public final Runnable[] f33502c;
    public final u40[] d;

    public f9(k9 k9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, u40[] u40VarArr) {
        this.f33500a = k9Var;
        this.f33501b = eaVarArr;
        this.f33502c = runnableArr;
        this.d = u40VarArr;
    }

    @Override
    public final void dispose() {
        k9 k9Var = this.f33500a;
        c8.ea[] eaVarArr = this.f33501b;
        Runnable[] runnableArr = this.f33502c;
        u40[] u40VarArr = this.d;
        eaVarArr[0] = null;
        if (k9Var.f35259e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21336e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            k9Var.f35259e.remove(runnableArr);
        }
        for (u40 u40Var : u40VarArr) {
            Bitmap bitmap = (Bitmap) k9Var.f35257b.remove(u40Var);
            k9Var.f35258c.remove(u40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
