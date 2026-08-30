package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class h51 {
    private ArrayList<View> cache;
    public final int viewType;

    public h51() {
        int i10 = i51.J;
        i51.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(h51 h51Var) {
        if (i51.L == null) {
            i51.L = new HashMap();
        }
        if (i51.K == null) {
            i51.K = new LongSparseArray();
        }
        Class<?> cls = h51Var.getClass();
        if (!i51.L.containsKey(cls)) {
            i51.L.put(cls, h51Var);
            i51.K.put(h51Var.viewType, h51Var);
        }
    }

    public boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.H(i51Var2);
    }

    public abstract View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var);

    public boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.I(i51Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof ui);
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

    public void attachedView(sl0 sl0Var, View view, i51 i51Var) {
    }

    public void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
    }
}
