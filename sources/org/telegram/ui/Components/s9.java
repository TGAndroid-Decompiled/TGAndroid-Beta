package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f32476a;
    public final gb1[] f32477b;
    public final Runnable[] f32478c;
    public final v60[] d;

    public s9(x9 x9Var, gb1[] gb1VarArr, Runnable[] runnableArr, v60[] v60VarArr) {
        this.f32476a = x9Var;
        this.f32477b = gb1VarArr;
        this.f32478c = runnableArr;
        this.d = v60VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f32476a;
        gb1[] gb1VarArr = this.f32477b;
        Runnable[] runnableArr = this.f32478c;
        v60[] v60VarArr = this.d;
        gb1VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (v60 v60Var : v60VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f34668b.remove(v60Var);
            x9Var.f34669c.remove(v60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
