package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class e9 implements i9 {
    public final j9 f33192a;
    public final c8.ea[] f33193b;
    public final Runnable[] f33194c;
    public final u40[] d;

    public e9(j9 j9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, u40[] u40VarArr) {
        this.f33192a = j9Var;
        this.f33193b = eaVarArr;
        this.f33194c = runnableArr;
        this.d = u40VarArr;
    }

    @Override
    public final void dispose() {
        j9 j9Var = this.f33192a;
        c8.ea[] eaVarArr = this.f33193b;
        Runnable[] runnableArr = this.f33194c;
        u40[] u40VarArr = this.d;
        eaVarArr[0] = null;
        if (j9Var.f34871e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21341e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            j9Var.f34871e.remove(runnableArr);
        }
        for (u40 u40Var : u40VarArr) {
            Bitmap bitmap = (Bitmap) j9Var.f34869b.remove(u40Var);
            j9Var.f34870c.remove(u40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
