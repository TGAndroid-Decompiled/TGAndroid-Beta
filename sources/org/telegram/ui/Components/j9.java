package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class j9 implements n9 {
    public final o9 f36364a;
    public final c8.ja[] f36365b;
    public final Runnable[] f36366c;
    public final f50[] d;

    public j9(o9 o9Var, c8.ja[] jaVarArr, Runnable[] runnableArr, f50[] f50VarArr) {
        this.f36364a = o9Var;
        this.f36365b = jaVarArr;
        this.f36366c = runnableArr;
        this.d = f50VarArr;
    }

    @Override
    public final void dispose() {
        o9 o9Var = this.f36364a;
        c8.ja[] jaVarArr = this.f36365b;
        Runnable[] runnableArr = this.f36366c;
        f50[] f50VarArr = this.d;
        jaVarArr[0] = null;
        if (o9Var.f38072e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22877e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            o9Var.f38072e.remove(runnableArr);
        }
        for (f50 f50Var : f50VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.f38070b.remove(f50Var);
            o9Var.f38071c.remove(f50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
