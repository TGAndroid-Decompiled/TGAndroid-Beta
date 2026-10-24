package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class k61 {
    private ArrayList<View> cache;
    public final int viewType;

    public k61() {
        int i10 = l61.J;
        l61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(k61 k61Var) {
        if (l61.L == null) {
            l61.L = new HashMap();
        }
        if (l61.K == null) {
            l61.K = new LongSparseArray();
        }
        Class<?> cls = k61Var.getClass();
        if (!l61.L.containsKey(cls)) {
            l61.L.put(cls, k61Var);
            l61.K.put(k61Var.viewType, k61Var);
        }
    }

    public boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return l61Var.H(l61Var2);
    }

    public abstract View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var);

    public boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.I(l61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof bj);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        precache(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getClassGuid(), o2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, g6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(lm0 lm0Var, View view, l61 l61Var) {
    }

    public void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
    }
}
