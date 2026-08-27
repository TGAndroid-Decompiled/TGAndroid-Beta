package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

public final class h9 implements l9 {

    public final m9 f28945a;

    public final h7.w5[] f28946b;

    public final Runnable[] f28947c;
    public final m50[] d;

    public h9(m9 m9Var, h7.w5[] w5VarArr, Runnable[] runnableArr, m50[] m50VarArr) {
        this.f28945a = m9Var;
        this.f28946b = w5VarArr;
        this.f28947c = runnableArr;
        this.d = m50VarArr;
    }

    @Override
    public final void dispose() {
        m9 m9Var = this.f28945a;
        h7.w5[] w5VarArr = this.f28946b;
        Runnable[] runnableArr = this.f28947c;
        m50[] m50VarArr = this.d;
        w5VarArr[0] = null;
        if (m9Var.f30626e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            m9Var.f30626e.remove(runnableArr);
        }
        for (m50 m50Var : m50VarArr) {
            Bitmap bitmap = (Bitmap) m9Var.f30624b.remove(m50Var);
            m9Var.f30625c.remove(m50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
