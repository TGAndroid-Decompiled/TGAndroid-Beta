package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class v41 {
    private ArrayList<View> cache;
    public final int viewType;

    public v41() {
        int i10 = w41.J;
        w41.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(v41 v41Var) {
        if (w41.L == null) {
            w41.L = new HashMap();
        }
        if (w41.K == null) {
            w41.K = new LongSparseArray();
        }
        Class<?> cls = v41Var.getClass();
        if (!w41.L.containsKey(cls)) {
            w41.L.put(cls, v41Var);
            w41.K.put(v41Var.viewType, v41Var);
        }
    }

    public boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.H(w41Var2);
    }

    public abstract View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var);

    public boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.I(w41Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof wi);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        precache(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), o2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, c6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(jl0 jl0Var, View view, w41 w41Var) {
    }

    public void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
    }
}
