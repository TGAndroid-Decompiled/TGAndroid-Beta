package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class f61 {
    private ArrayList<View> cache;
    public final int viewType;

    public f61() {
        int i10 = g61.J;
        g61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(f61 f61Var) {
        if (g61.L == null) {
            g61.L = new HashMap();
        }
        if (g61.K == null) {
            g61.K = new LongSparseArray();
        }
        Class<?> cls = f61Var.getClass();
        if (!g61.L.containsKey(cls)) {
            g61.L.put(cls, f61Var);
            g61.K.put(f61Var.viewType, f61Var);
        }
    }

    public boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.H(g61Var2);
    }

    public abstract View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.I(g61Var2);
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

    public void attachedView(zl0 zl0Var, View view, g61 g61Var) {
    }

    public void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
    }
}
