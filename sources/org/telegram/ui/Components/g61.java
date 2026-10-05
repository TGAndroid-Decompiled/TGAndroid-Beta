package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class g61 {
    private ArrayList<View> cache;
    public final int viewType;

    public g61() {
        int i10 = h61.J;
        h61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(g61 g61Var) {
        if (h61.L == null) {
            h61.L = new HashMap();
        }
        if (h61.K == null) {
            h61.K = new LongSparseArray();
        }
        Class<?> cls = g61Var.getClass();
        if (!h61.L.containsKey(cls)) {
            h61.L.put(cls, g61Var);
            h61.K.put(g61Var.viewType, g61Var);
        }
    }

    public boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return h61Var.I(h61Var2);
    }

    public abstract View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.J(h61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof hj);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        precache(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), n2Var.getResourceProvider(), i10);
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

    public void attachedView(zl0 zl0Var, View view, h61 h61Var) {
    }

    public void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
    }
}
