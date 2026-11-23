package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class n41 {
    public final int f37728a;

    public n41() {
        int i7 = o41.K;
        o41.K = i7 + 1;
        this.f37728a = i7;
    }

    public static void h(n41 n41Var) {
        if (o41.M == null) {
            o41.M = new HashMap();
        }
        if (o41.L == null) {
            o41.L = new LongSparseArray();
        }
        Class<?> cls = n41Var.getClass();
        if (!o41.M.containsKey(cls)) {
            o41.M.put(cls, n41Var);
            o41.L.put(n41Var.f37728a, n41Var);
        }
    }

    public boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.I(o41Var2);
    }

    public abstract View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var);

    public boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.J(o41Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.ut);
    }

    public boolean g() {
        return this instanceof cj;
    }

    public void a(ek0 ek0Var, View view, o41 o41Var) {
    }

    public void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
    }
}
