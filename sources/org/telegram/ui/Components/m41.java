package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class m41 {
    public final int f37371a;

    public m41() {
        int i7 = n41.K;
        n41.K = i7 + 1;
        this.f37371a = i7;
    }

    public static void h(m41 m41Var) {
        if (n41.M == null) {
            n41.M = new HashMap();
        }
        if (n41.L == null) {
            n41.L = new LongSparseArray();
        }
        Class<?> cls = m41Var.getClass();
        if (!n41.M.containsKey(cls)) {
            n41.M.put(cls, m41Var);
            n41.L.put(m41Var.f37371a, m41Var);
        }
    }

    public boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.I(n41Var2);
    }

    public abstract View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var);

    public boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.J(n41Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.tt);
    }

    public boolean g() {
        return this instanceof bj;
    }

    public void a(ek0 ek0Var, View view, n41 n41Var) {
    }

    public void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
    }
}
