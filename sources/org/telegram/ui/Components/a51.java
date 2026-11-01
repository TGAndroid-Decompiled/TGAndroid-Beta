package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class a51 {
    public final int f24290a;

    public a51() {
        int i10 = b51.J;
        b51.J = i10 + 1;
        this.f24290a = i10;
    }

    public static void h(a51 a51Var) {
        if (b51.L == null) {
            b51.L = new HashMap();
        }
        if (b51.K == null) {
            b51.K = new LongSparseArray();
        }
        Class<?> cls = a51Var.getClass();
        if (!b51.L.containsKey(cls)) {
            b51.L.put(cls, a51Var);
            b51.K.put(a51Var.f24290a, a51Var);
        }
    }

    public boolean c(b51 b51Var, b51 b51Var2) {
        return b51Var.I(b51Var2);
    }

    public abstract View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var);

    public boolean e(b51 b51Var, b51 b51Var2) {
        return b51Var.J(b51Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.lu);
    }

    public boolean g() {
        return this instanceof ki;
    }

    public void a(uk0 uk0Var, View view, b51 b51Var) {
    }

    public void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
    }
}
