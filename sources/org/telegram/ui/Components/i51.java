package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class i51 {
    private ArrayList<View> cache;
    public final int viewType;

    public i51() {
        int i10 = j51.J;
        j51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(i51 i51Var) {
        if (j51.L == null) {
            j51.L = new HashMap();
        }
        if (j51.K == null) {
            j51.K = new LongSparseArray();
        }
        Class<?> cls = i51Var.getClass();
        if (!j51.L.containsKey(cls)) {
            j51.L.put(cls, i51Var);
            j51.K.put(i51Var.viewType, i51Var);
        }
    }

    public boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.H(j51Var2);
    }

    public abstract View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var);

    public boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.I(j51Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof vi);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        precache(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getClassGuid(), p2Var.getResourceProvider(), i10);
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

    public void attachedView(tl0 tl0Var, View view, j51 j51Var) {
    }

    public void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
    }
}
