package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;
public final class i9 implements m9 {
    public final n9 f29391a;
    public final g7.b6[] f29392b;
    public final Runnable[] f29393c;
    public final h50[] d;

    public i9(n9 n9Var, g7.b6[] b6VarArr, Runnable[] runnableArr, h50[] h50VarArr) {
        this.f29391a = n9Var;
        this.f29392b = b6VarArr;
        this.f29393c = runnableArr;
        this.d = h50VarArr;
    }

    @Override
    public final void dispose() {
        n9 n9Var = this.f29391a;
        g7.b6[] b6VarArr = this.f29392b;
        Runnable[] runnableArr = this.f29393c;
        h50[] h50VarArr = this.d;
        b6VarArr[0] = null;
        if (n9Var.f31052e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            n9Var.f31052e.remove(runnableArr);
        }
        for (h50 h50Var : h50VarArr) {
            Bitmap bitmap = (Bitmap) n9Var.f31050b.remove(h50Var);
            n9Var.f31051c.remove(h50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
