package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class f9 implements j9 {
    public final k9 f33483a;
    public final c8.ea[] f33484b;
    public final Runnable[] f33485c;
    public final u40[] d;

    public f9(k9 k9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, u40[] u40VarArr) {
        this.f33483a = k9Var;
        this.f33484b = eaVarArr;
        this.f33485c = runnableArr;
        this.d = u40VarArr;
    }

    @Override
    public final void dispose() {
        k9 k9Var = this.f33483a;
        c8.ea[] eaVarArr = this.f33484b;
        Runnable[] runnableArr = this.f33485c;
        u40[] u40VarArr = this.d;
        eaVarArr[0] = null;
        if (k9Var.f35242e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21333e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            k9Var.f35242e.remove(runnableArr);
        }
        for (u40 u40Var : u40VarArr) {
            Bitmap bitmap = (Bitmap) k9Var.f35240b.remove(u40Var);
            k9Var.f35241c.remove(u40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
