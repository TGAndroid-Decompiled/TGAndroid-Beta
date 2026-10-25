package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f32474a;
    public final gb1[] f32475b;
    public final Runnable[] f32476c;
    public final v60[] d;

    public s9(x9 x9Var, gb1[] gb1VarArr, Runnable[] runnableArr, v60[] v60VarArr) {
        this.f32474a = x9Var;
        this.f32475b = gb1VarArr;
        this.f32476c = runnableArr;
        this.d = v60VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f32474a;
        gb1[] gb1VarArr = this.f32475b;
        Runnable[] runnableArr = this.f32476c;
        v60[] v60VarArr = this.d;
        gb1VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (v60 v60Var : v60VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f34665b.remove(v60Var);
            x9Var.f34666c.remove(v60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
