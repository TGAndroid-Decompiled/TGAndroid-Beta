package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class l61 {
    private ArrayList<View> cache;
    public final int viewType;

    public l61() {
        int i10 = m61.J;
        m61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(l61 l61Var) {
        if (m61.L == null) {
            m61.L = new HashMap();
        }
        if (m61.K == null) {
            m61.K = new LongSparseArray();
        }
        Class<?> cls = l61Var.getClass();
        if (!m61.L.containsKey(cls)) {
            m61.L.put(cls, l61Var);
            m61.K.put(l61Var.viewType, l61Var);
        }
    }

    public boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return m61Var.H(m61Var2);
    }

    public abstract View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var);

    public boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.I(m61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof fj);
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

    public void attachedView(mm0 mm0Var, View view, m61 m61Var) {
    }

    public void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
    }
}
