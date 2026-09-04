package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class g51 {
    private ArrayList<View> cache;
    public final int viewType;

    public g51() {
        int i10 = h51.J;
        h51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(g51 g51Var) {
        if (h51.L == null) {
            h51.L = new HashMap();
        }
        if (h51.K == null) {
            h51.K = new LongSparseArray();
        }
        Class<?> cls = g51Var.getClass();
        if (!h51.L.containsKey(cls)) {
            h51.L.put(cls, g51Var);
            h51.K.put(g51Var.viewType, g51Var);
        }
    }

    public boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.H(h51Var2);
    }

    public abstract View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.I(h51Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof ej);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        precache(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), n2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, f6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(ll0 ll0Var, View view, h51 h51Var) {
    }

    public void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
    }
}
