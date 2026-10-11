package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class q61 {
    private ArrayList<View> cache;
    public final int viewType;

    public q61() {
        int i10 = r61.J;
        r61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(q61 q61Var) {
        if (r61.L == null) {
            r61.L = new HashMap();
        }
        if (r61.K == null) {
            r61.K = new LongSparseArray();
        }
        Class<?> cls = q61Var.getClass();
        if (!r61.L.containsKey(cls)) {
            r61.L.put(cls, q61Var);
            r61.K.put(q61Var.viewType, q61Var);
        }
    }

    public boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        return r61Var.H(r61Var2);
    }

    public abstract View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(r61 r61Var, r61 r61Var2) {
        return r61Var.I(r61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof ij);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        precache(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), m2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, d6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(sm0 sm0Var, View view, r61 r61Var) {
    }

    public void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
    }
}
