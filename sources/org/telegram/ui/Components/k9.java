package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class k9 implements o9 {
    public final p9 f36859a;
    public final c8.ia[] f36860b;
    public final Runnable[] f36861c;
    public final i50[] d;

    public k9(p9 p9Var, c8.ia[] iaVarArr, Runnable[] runnableArr, i50[] i50VarArr) {
        this.f36859a = p9Var;
        this.f36860b = iaVarArr;
        this.f36861c = runnableArr;
        this.d = i50VarArr;
    }

    @Override
    public final void dispose() {
        p9 p9Var = this.f36859a;
        c8.ia[] iaVarArr = this.f36860b;
        Runnable[] runnableArr = this.f36861c;
        i50[] i50VarArr = this.d;
        iaVarArr[0] = null;
        if (p9Var.f38536e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22810e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.f38536e.remove(runnableArr);
        }
        for (i50 i50Var : i50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.f38534b.remove(i50Var);
            p9Var.f38535c.remove(i50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
