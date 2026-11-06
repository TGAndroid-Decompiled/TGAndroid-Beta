package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class v31 {
    public final int f38813a;

    public v31() {
        int i7 = w31.J;
        w31.J = i7 + 1;
        this.f38813a = i7;
    }

    public static void h(v31 v31Var) {
        if (w31.L == null) {
            w31.L = new HashMap();
        }
        if (w31.K == null) {
            w31.K = new LongSparseArray();
        }
        Class<?> cls = v31Var.getClass();
        if (!w31.L.containsKey(cls)) {
            w31.L.put(cls, v31Var);
            w31.K.put(v31Var.f38813a, v31Var);
        }
    }

    public boolean c(w31 w31Var, w31 w31Var2) {
        return w31Var.I(w31Var2);
    }

    public abstract View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean e(w31 w31Var, w31 w31Var2) {
        return w31Var.J(w31Var2);
    }

    public boolean f() {
        return !(this instanceof org.telegram.messenger.zt);
    }

    public boolean g() {
        return this instanceof li;
    }

    public void a(pj0 pj0Var, View view, w31 w31Var) {
    }

    public void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
    }
}
