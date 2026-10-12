package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class t61 {
    private ArrayList<View> cache;
    public final int viewType;

    public t61() {
        int i10 = u61.J;
        u61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(t61 t61Var) {
        if (u61.L == null) {
            u61.L = new HashMap();
        }
        if (u61.K == null) {
            u61.K = new LongSparseArray();
        }
        Class<?> cls = t61Var.getClass();
        if (!u61.L.containsKey(cls)) {
            u61.L.put(cls, t61Var);
            u61.K.put(t61Var.viewType, t61Var);
        }
    }

    public boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.H(u61Var2);
    }

    public abstract View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var);

    public boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.I(u61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof kj);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        precache(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getClassGuid(), m2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, c6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(wm0 wm0Var, View view, u61 u61Var) {
    }

    public void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
    }
}
