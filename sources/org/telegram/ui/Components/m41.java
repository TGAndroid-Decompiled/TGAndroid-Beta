package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class m41 {
    private ArrayList<View> cache;
    public final int viewType;

    public m41() {
        int i10 = n41.J;
        n41.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(m41 m41Var) {
        if (n41.L == null) {
            n41.L = new HashMap();
        }
        if (n41.K == null) {
            n41.K = new LongSparseArray();
        }
        Class<?> cls = m41Var.getClass();
        if (n41.L.containsKey(cls)) {
            return;
        }
        n41.L.put(cls, m41Var);
        n41.K.put(m41Var.viewType, m41Var);
    }

    public boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.H(n41Var2);
    }

    public abstract View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var);

    public boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.I(n41Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return this.cache.remove(0);
    }

    public boolean isClickable() {
        return !(this instanceof pi);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        precache(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), n2Var.getResourceProvider(), i10);
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

    public void attachedView(zk0 zk0Var, View view, n41 n41Var) {
    }

    public void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
    }
}
