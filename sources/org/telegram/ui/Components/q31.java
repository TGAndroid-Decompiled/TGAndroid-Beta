package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class q31 {
    public final int f37244a;

    public q31() {
        int i7 = r31.J;
        r31.J = i7 + 1;
        this.f37244a = i7;
    }

    public static void h(q31 q31Var) {
        if (r31.L == null) {
            r31.L = new HashMap();
        }
        if (r31.K == null) {
            r31.K = new LongSparseArray();
        }
        Class<?> cls = q31Var.getClass();
        if (!r31.L.containsKey(cls)) {
            r31.L.put(cls, q31Var);
            r31.K.put(q31Var.f37244a, q31Var);
        }
    }

    public boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.I(r31Var2);
    }

    public abstract View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.J(r31Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.zt);
    }

    public boolean g() {
        return this instanceof li;
    }

    public void a(pj0 pj0Var, View view, r31 r31Var) {
    }

    public void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
    }
}
