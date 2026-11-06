package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class w31 {
    public final int f39845a;

    public w31() {
        int i7 = x31.J;
        x31.J = i7 + 1;
        this.f39845a = i7;
    }

    public static void h(w31 w31Var) {
        if (x31.L == null) {
            x31.L = new HashMap();
        }
        if (x31.K == null) {
            x31.K = new LongSparseArray();
        }
        Class<?> cls = w31Var.getClass();
        if (!x31.L.containsKey(cls)) {
            x31.L.put(cls, w31Var);
            x31.K.put(w31Var.f39845a, w31Var);
        }
    }

    public boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.I(x31Var2);
    }

    public abstract View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.J(x31Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.zt);
    }

    public boolean g() {
        return this instanceof li;
    }

    public void a(pj0 pj0Var, View view, x31 x31Var) {
    }

    public void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
    }
}
