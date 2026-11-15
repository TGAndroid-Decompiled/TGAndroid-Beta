package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class a41 {
    public final int f32849a;

    public a41() {
        int i7 = b41.J;
        b41.J = i7 + 1;
        this.f32849a = i7;
    }

    public static void h(a41 a41Var) {
        if (b41.L == null) {
            b41.L = new HashMap();
        }
        if (b41.K == null) {
            b41.K = new LongSparseArray();
        }
        Class<?> cls = a41Var.getClass();
        if (!b41.L.containsKey(cls)) {
            b41.L.put(cls, a41Var);
            b41.K.put(a41Var.f32849a, a41Var);
        }
    }

    public boolean c(b41 b41Var, b41 b41Var2) {
        return b41Var.I(b41Var2);
    }

    public abstract View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var);

    public boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.J(b41Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.wt);
    }

    public boolean g() {
        return this instanceof ti;
    }

    public void a(uj0 uj0Var, View view, b41 b41Var) {
    }

    public void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
    }
}
