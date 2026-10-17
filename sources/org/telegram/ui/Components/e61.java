package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class e61 {
    private ArrayList<View> cache;
    public final int viewType;

    public e61() {
        int i10 = f61.J;
        f61.J = i10 + 1;
        this.viewType = i10;
    }

    public static void setup(e61 e61Var) {
        if (f61.L == null) {
            f61.L = new HashMap();
        }
        if (f61.K == null) {
            f61.K = new LongSparseArray();
        }
        Class<?> cls = e61Var.getClass();
        if (!f61.L.containsKey(cls)) {
            f61.L.put(cls, e61Var);
            f61.K.put(e61Var.viewType, e61Var);
        }
    }

    public boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return f61Var.H(f61Var2);
    }

    public abstract View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var);

    public boolean equals(f61 f61Var, f61 f61Var2) {
        return f61Var.I(f61Var2);
    }

    public View getCached() {
        ArrayList<View> arrayList = this.cache;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.cache.remove(0);
        }
        return null;
    }

    public boolean isClickable() {
        return !(this instanceof dj);
    }

    public boolean isShadow() {
        return false;
    }

    public void precache(org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        precache(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getClassGuid(), n2Var.getResourceProvider(), i10);
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

    public void attachedView(im0 im0Var, View view, f61 f61Var) {
    }

    public void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
    }
}
