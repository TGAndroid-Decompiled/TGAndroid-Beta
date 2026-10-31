package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class z41 {
    public final int f32898a;

    public z41() {
        int i10 = a51.J;
        a51.J = i10 + 1;
        this.f32898a = i10;
    }

    public static void h(z41 z41Var) {
        if (a51.L == null) {
            a51.L = new HashMap();
        }
        if (a51.K == null) {
            a51.K = new LongSparseArray();
        }
        Class<?> cls = z41Var.getClass();
        if (!a51.L.containsKey(cls)) {
            a51.L.put(cls, z41Var);
            a51.K.put(z41Var.f32898a, z41Var);
        }
    }

    public boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.I(a51Var2);
    }

    public abstract View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var);

    public boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.J(a51Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.ku);
    }

    public boolean g() {
        return this instanceof ki;
    }

    public void a(tk0 tk0Var, View view, a51 a51Var) {
    }

    public void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
    }
}
