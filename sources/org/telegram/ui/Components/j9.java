package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class j9 implements n9 {
    public final o9 f28068a;
    public final k7.z5[] f28069b;
    public final Runnable[] f28070c;
    public final b60[] d;

    public j9(o9 o9Var, k7.z5[] z5VarArr, Runnable[] runnableArr, b60[] b60VarArr) {
        this.f28068a = o9Var;
        this.f28069b = z5VarArr;
        this.f28070c = runnableArr;
        this.d = b60VarArr;
    }

    @Override
    public final void dispose() {
        o9 o9Var = this.f28068a;
        k7.z5[] z5VarArr = this.f28069b;
        Runnable[] runnableArr = this.f28070c;
        b60[] b60VarArr = this.d;
        z5VarArr[0] = null;
        if (o9Var.f29718e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.f29718e.remove(runnableArr);
        }
        for (b60 b60Var : b60VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.f29716b.remove(b60Var);
            o9Var.f29717c.remove(b60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
