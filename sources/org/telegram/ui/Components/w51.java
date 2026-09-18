package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class w51 {
    private ArrayList<View> cache;
    public final int viewType;

    public w51() {
        int i10 = x51.J;
        x51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(w51 w51Var) {
        if (x51.L == null) {
            x51.L = new HashMap();
        }
        if (x51.K == null) {
            x51.K = new LongSparseArray();
        }
        Class<?> cls = w51Var.getClass();
        if (!x51.L.containsKey(cls)) {
            x51.L.put(cls, w51Var);
            x51.K.put(w51Var.viewType, w51Var);
        }
    }

    public boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.H(x51Var2);
    }

    public abstract View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var);

    public boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.I(x51Var2);
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

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, e6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(wl0 wl0Var, View view, x51 x51Var) {
    }

    public void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
    }
}
