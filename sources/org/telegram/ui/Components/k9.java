package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class k9 implements o9 {
    public final p9 f36857a;
    public final c8.ia[] f36858b;
    public final Runnable[] f36859c;
    public final i50[] d;

    public k9(p9 p9Var, c8.ia[] iaVarArr, Runnable[] runnableArr, i50[] i50VarArr) {
        this.f36857a = p9Var;
        this.f36858b = iaVarArr;
        this.f36859c = runnableArr;
        this.d = i50VarArr;
    }

    @Override
    public final void dispose() {
        p9 p9Var = this.f36857a;
        c8.ia[] iaVarArr = this.f36858b;
        Runnable[] runnableArr = this.f36859c;
        i50[] i50VarArr = this.d;
        iaVarArr[0] = null;
        if (p9Var.f38538e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22807e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.f38538e.remove(runnableArr);
        }
        for (i50 i50Var : i50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.f38536b.remove(i50Var);
            p9Var.f38537c.remove(i50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
