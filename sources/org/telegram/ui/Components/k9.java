package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class k9 implements o9 {
    public final p9 f36713a;
    public final c8.ia[] f36714b;
    public final Runnable[] f36715c;
    public final f50[] d;

    public k9(p9 p9Var, c8.ia[] iaVarArr, Runnable[] runnableArr, f50[] f50VarArr) {
        this.f36713a = p9Var;
        this.f36714b = iaVarArr;
        this.f36715c = runnableArr;
        this.d = f50VarArr;
    }

    @Override
    public final void dispose() {
        p9 p9Var = this.f36713a;
        c8.ia[] iaVarArr = this.f36714b;
        Runnable[] runnableArr = this.f36715c;
        f50[] f50VarArr = this.d;
        iaVarArr[0] = null;
        if (p9Var.f38325e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22782e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.f38325e.remove(runnableArr);
        }
        for (f50 f50Var : f50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.f38323b.remove(f50Var);
            p9Var.f38324c.remove(f50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
