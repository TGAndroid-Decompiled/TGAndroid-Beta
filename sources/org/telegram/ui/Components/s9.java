package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f30672a;
    public final w7.i0[] f30673b;
    public final Runnable[] f30674c;
    public final b70[] d;

    public s9(x9 x9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, b70[] b70VarArr) {
        this.f30672a = x9Var;
        this.f30673b = i0VarArr;
        this.f30674c = runnableArr;
        this.d = b70VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f30672a;
        w7.i0[] i0VarArr = this.f30673b;
        Runnable[] runnableArr = this.f30674c;
        b70[] b70VarArr = this.d;
        i0VarArr[0] = null;
        if (x9Var.f32854e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.f32854e.remove(runnableArr);
        }
        for (b70 b70Var : b70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f32852b.remove(b70Var);
            x9Var.f32853c.remove(b70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
