package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class s61 {
    private ArrayList<View> cache;
    public final int viewType;

    public s61() {
        int i10 = t61.J;
        t61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(s61 s61Var) {
        if (t61.L == null) {
            t61.L = new HashMap();
        }
        if (t61.K == null) {
            t61.K = new LongSparseArray();
        }
        Class<?> cls = s61Var.getClass();
        if (!t61.L.containsKey(cls)) {
            t61.L.put(cls, s61Var);
            t61.K.put(s61Var.viewType, s61Var);
        }
    }

    public boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return t61Var.I(t61Var2);
    }

    public abstract View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var);

    public boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.J(t61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof org.telegram.ui.Cells.r3);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        precache(r2Var.getContext(), r2Var.getCurrentAccount(), r2Var.getClassGuid(), r2Var.getResourceProvider(), i10);
    }

    public void precache(Context context, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var, int i12) {
        if (context == null) {
            return;
        }
        if (this.cache == null) {
            this.cache = new ArrayList<>();
        }
        int i13 = 0;
        while (i13 < this.cache.size() - i12) {
            Context context2 = context;
            this.cache.add(createView(context2, null, i10, i11, u6Var));
            i13++;
            context = context2;
        }
    }

    public void attachedView(mm0 mm0Var, View view, t61 t61Var) {
    }

    public void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
    }
}
