package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class v51 {
    private ArrayList<View> cache;
    public final int viewType;

    public v51() {
        int i10 = w51.J;
        w51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(v51 v51Var) {
        if (w51.L == null) {
            w51.L = new HashMap();
        }
        if (w51.K == null) {
            w51.K = new LongSparseArray();
        }
        Class<?> cls = v51Var.getClass();
        if (!w51.L.containsKey(cls)) {
            w51.L.put(cls, v51Var);
            w51.K.put(v51Var.viewType, v51Var);
        }
    }

    public boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return w51Var.H(w51Var2);
    }

    public abstract View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.I(w51Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof gj);
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

    public void attachedView(xl0 xl0Var, View view, w51 w51Var) {
    }

    public void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
    }
}
