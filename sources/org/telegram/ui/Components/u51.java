package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class u51 {
    private ArrayList<View> cache;
    public final int viewType;

    public u51() {
        int i10 = v51.J;
        v51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(u51 u51Var) {
        if (v51.L == null) {
            v51.L = new HashMap();
        }
        if (v51.K == null) {
            v51.K = new LongSparseArray();
        }
        Class<?> cls = u51Var.getClass();
        if (!v51.L.containsKey(cls)) {
            v51.L.put(cls, u51Var);
            v51.K.put(u51Var.viewType, u51Var);
        }
    }

    public boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.H(v51Var2);
    }

    public abstract View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.I(v51Var2);
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

    public void precache(org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        precache(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), p2Var.getResourceProvider(), i10);
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

    public void attachedView(vl0 vl0Var, View view, v51 v51Var) {
    }

    public void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
    }
}
