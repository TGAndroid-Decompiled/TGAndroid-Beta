package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class o9 implements s9 {
    public final t9 f26725a;
    public final w7.i0[] f26726b;
    public final Runnable[] f26727c;
    public final y50[] d;

    public o9(t9 t9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.f26725a = t9Var;
        this.f26726b = i0VarArr;
        this.f26727c = runnableArr;
        this.d = y50VarArr;
    }

    @Override
    public final void dispose() {
        t9 t9Var = this.f26725a;
        w7.i0[] i0VarArr = this.f26726b;
        Runnable[] runnableArr = this.f26727c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (t9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            t9Var.e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) t9Var.f28069b.remove(y50Var);
            t9Var.f28070c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
