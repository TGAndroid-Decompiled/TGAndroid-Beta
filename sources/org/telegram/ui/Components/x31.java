package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class x31 {
    public final int f40286a;

    public x31() {
        int i7 = y31.J;
        y31.J = i7 + 1;
        this.f40286a = i7;
    }

    public static void h(x31 x31Var) {
        if (y31.L == null) {
            y31.L = new HashMap();
        }
        if (y31.K == null) {
            y31.K = new LongSparseArray();
        }
        Class<?> cls = x31Var.getClass();
        if (!y31.L.containsKey(cls)) {
            y31.L.put(cls, x31Var);
            y31.K.put(x31Var.f40286a, x31Var);
        }
    }

    public boolean c(y31 y31Var, y31 y31Var2) {
        return y31Var.I(y31Var2);
    }

    public abstract View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var);

    public boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.J(y31Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.zt);
    }

    public boolean g() {
        return this instanceof li;
    }

    public void a(qj0 qj0Var, View view, y31 y31Var) {
    }

    public void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
    }
}
