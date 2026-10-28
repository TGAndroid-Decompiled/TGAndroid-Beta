package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f32517a;
    public final kb1[] f32518b;
    public final Runnable[] f32519c;
    public final w60[] d;

    public s9(x9 x9Var, kb1[] kb1VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.f32517a = x9Var;
        this.f32518b = kb1VarArr;
        this.f32519c = runnableArr;
        this.d = w60VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f32517a;
        kb1[] kb1VarArr = this.f32518b;
        Runnable[] runnableArr = this.f32519c;
        w60[] w60VarArr = this.d;
        kb1VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (w60 w60Var : w60VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f34703b.remove(w60Var);
            x9Var.f34704c.remove(w60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
