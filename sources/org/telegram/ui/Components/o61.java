package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class o61 {
    private ArrayList<View> cache;
    public final int viewType;

    public o61() {
        int i10 = p61.J;
        p61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(o61 o61Var) {
        if (p61.L == null) {
            p61.L = new HashMap();
        }
        if (p61.K == null) {
            p61.K = new LongSparseArray();
        }
        Class<?> cls = o61Var.getClass();
        if (!p61.L.containsKey(cls)) {
            p61.L.put(cls, o61Var);
            p61.K.put(o61Var.viewType, o61Var);
        }
    }

    public boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return p61Var.H(p61Var2);
    }

    public abstract View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var);

    public boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.I(p61Var2);
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

    public void attachedView(qm0 qm0Var, View view, p61 p61Var) {
    }

    public void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
    }
}
