package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class s9 implements w9 {
    public final x9 f30735a;
    public final w7.i0[] f30736b;
    public final Runnable[] f30737c;
    public final a70[] d;

    public s9(x9 x9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, a70[] a70VarArr) {
        this.f30735a = x9Var;
        this.f30736b = i0VarArr;
        this.f30737c = runnableArr;
        this.d = a70VarArr;
    }

    @Override
    public final void dispose() {
        x9 x9Var = this.f30735a;
        w7.i0[] i0VarArr = this.f30736b;
        Runnable[] runnableArr = this.f30737c;
        a70[] a70VarArr = this.d;
        i0VarArr[0] = null;
        if (x9Var.f32777e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.f32777e.remove(runnableArr);
        }
        for (a70 a70Var : a70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.f32775b.remove(a70Var);
            x9Var.f32776c.remove(a70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
