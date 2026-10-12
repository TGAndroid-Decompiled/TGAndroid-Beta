package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f30502a;
    public final w7.h0[] f30503b;
    public final Runnable[] f30504c;
    public final d70[] d;

    public s9(x9 x9Var, w7.h0[] h0VarArr, Runnable[] runnableArr, d70[] d70VarArr) {
        this.f30502a = x9Var;
        this.f30503b = h0VarArr;
        this.f30504c = runnableArr;
        this.d = d70VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f30502a;
        w7.h0[] h0VarArr = this.f30503b;
        Runnable[] runnableArr = this.f30504c;
        d70[] d70VarArr = this.d;
        h0VarArr[0] = null;
        if (x9Var.f32684e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.f32684e.remove(runnableArr);
        }
        for (d70 d70Var : d70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f32682b.remove(d70Var);
            x9Var.f32683c.remove(d70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
