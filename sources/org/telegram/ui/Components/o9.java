package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class o9 implements s9 {
    public final t9 f26679a;
    public final w7.i0[] f26680b;
    public final Runnable[] f26681c;
    public final y50[] d;

    public o9(t9 t9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.f26679a = t9Var;
        this.f26680b = i0VarArr;
        this.f26681c = runnableArr;
        this.d = y50VarArr;
    }

    @Override
    public final void dispose() {
        t9 t9Var = this.f26679a;
        w7.i0[] i0VarArr = this.f26680b;
        Runnable[] runnableArr = this.f26681c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (t9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            t9Var.e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) t9Var.f28040b.remove(y50Var);
            t9Var.f28041c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
