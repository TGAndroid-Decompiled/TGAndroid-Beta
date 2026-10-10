package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f30712a;
    public final w7.i0[] f30713b;
    public final Runnable[] f30714c;
    public final b70[] d;

    public s9(x9 x9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, b70[] b70VarArr) {
        this.f30712a = x9Var;
        this.f30713b = i0VarArr;
        this.f30714c = runnableArr;
        this.d = b70VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f30712a;
        w7.i0[] i0VarArr = this.f30713b;
        Runnable[] runnableArr = this.f30714c;
        b70[] b70VarArr = this.d;
        i0VarArr[0] = null;
        if (x9Var.f32877e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.f32877e.remove(runnableArr);
        }
        for (b70 b70Var : b70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f32875b.remove(b70Var);
            x9Var.f32876c.remove(b70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
