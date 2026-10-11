package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class p61 {
    private ArrayList<View> cache;
    public final int viewType;

    public p61() {
        int i10 = q61.J;
        q61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(p61 p61Var) {
        if (q61.L == null) {
            q61.L = new HashMap();
        }
        if (q61.K == null) {
            q61.K = new LongSparseArray();
        }
        Class<?> cls = p61Var.getClass();
        if (!q61.L.containsKey(cls)) {
            q61.L.put(cls, p61Var);
            q61.K.put(p61Var.viewType, p61Var);
        }
    }

    public boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        return q61Var.H(q61Var2);
    }

    public abstract View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(q61 q61Var, q61 q61Var2) {
        return q61Var.I(q61Var2);
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

    public void attachedView(rm0 rm0Var, View view, q61 q61Var) {
    }

    public void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
    }
}
