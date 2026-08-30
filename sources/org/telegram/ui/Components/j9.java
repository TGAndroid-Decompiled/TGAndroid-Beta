package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class j9 implements n9 {
    public final o9 f25934a;
    public final k7.y5[] f25935b;
    public final Runnable[] f25936c;
    public final z50[] d;

    public j9(o9 o9Var, k7.y5[] y5VarArr, Runnable[] runnableArr, z50[] z50VarArr) {
        this.f25934a = o9Var;
        this.f25935b = y5VarArr;
        this.f25936c = runnableArr;
        this.d = z50VarArr;
    }

    @Override
    public final void dispose() {
        o9 o9Var = this.f25934a;
        k7.y5[] y5VarArr = this.f25935b;
        Runnable[] runnableArr = this.f25936c;
        z50[] z50VarArr = this.d;
        y5VarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.e.remove(runnableArr);
        }
        for (z50 z50Var : z50VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.f27520b.remove(z50Var);
            o9Var.f27521c.remove(z50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
