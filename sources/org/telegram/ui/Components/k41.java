package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class k41 {
    private ArrayList<View> cache;
    public final int viewType;

    public k41() {
        int i9 = l41.J;
        l41.J = i9 + 1;
        this.viewType = i9;
    }

    public static void setup(k41 k41Var) {
        if (l41.L == null) {
            l41.L = new HashMap();
        }
        if (l41.K == null) {
            l41.K = new LongSparseArray();
        }
        Class<?> cls = k41Var.getClass();
        if (!l41.L.containsKey(cls)) {
            l41.L.put(cls, k41Var);
            l41.K.put(k41Var.viewType, k41Var);
        }
    }

    public boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.H(l41Var2);
    }

    public abstract View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var);

    public boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.I(l41Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof ti);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        precache(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), o2Var.getResourceProvider(), i9);
    }

    public void precache(Context context, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var, int i11) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i12 = 0;
        while (i12 < this.cache.size() - i11) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i9, i10, b6Var));
            i12++;
            context = context2;
        }
    }

    public void attachedView(wk0 wk0Var, View view, l41 l41Var) {
    }

    public void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
    }
}
