package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f30798a;
    public final w7.i0[] f30799b;
    public final Runnable[] f30800c;
    public final a70[] d;

    public s9(x9 x9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, a70[] a70VarArr) {
        this.f30798a = x9Var;
        this.f30799b = i0VarArr;
        this.f30800c = runnableArr;
        this.d = a70VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f30798a;
        w7.i0[] i0VarArr = this.f30799b;
        Runnable[] runnableArr = this.f30800c;
        a70[] a70VarArr = this.d;
        i0VarArr[0] = null;
        if (x9Var.f32909e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.f32909e.remove(runnableArr);
        }
        for (a70 a70Var : a70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f32907b.remove(a70Var);
            x9Var.f32908c.remove(a70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
