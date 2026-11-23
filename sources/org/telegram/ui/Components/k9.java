package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class k9 implements o9 {
    public final p9 f36825a;
    public final c8.ja[] f36826b;
    public final Runnable[] f36827c;
    public final i50[] d;

    public k9(p9 p9Var, c8.ja[] jaVarArr, Runnable[] runnableArr, i50[] i50VarArr) {
        this.f36825a = p9Var;
        this.f36826b = jaVarArr;
        this.f36827c = runnableArr;
        this.d = i50VarArr;
    }

    @Override
    public final void dispose() {
        p9 p9Var = this.f36825a;
        c8.ja[] jaVarArr = this.f36826b;
        Runnable[] runnableArr = this.f36827c;
        i50[] i50VarArr = this.d;
        jaVarArr[0] = null;
        if (p9Var.f38494e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22774e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.f38494e.remove(runnableArr);
        }
        for (i50 i50Var : i50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.f38492b.remove(i50Var);
            p9Var.f38493c.remove(i50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
