package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class x51 {
    private ArrayList<View> cache;
    public final int viewType;

    public x51() {
        int i10 = y51.J;
        y51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(x51 x51Var) {
        if (y51.L == null) {
            y51.L = new HashMap();
        }
        if (y51.K == null) {
            y51.K = new LongSparseArray();
        }
        Class<?> cls = x51Var.getClass();
        if (!y51.L.containsKey(cls)) {
            y51.L.put(cls, x51Var);
            y51.K.put(x51Var.viewType, x51Var);
        }
    }

    public boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return y51Var.H(y51Var2);
    }

    public abstract View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.I(y51Var2);
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

    public void attachedView(yl0 yl0Var, View view, y51 y51Var) {
    }

    public void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
    }
}
