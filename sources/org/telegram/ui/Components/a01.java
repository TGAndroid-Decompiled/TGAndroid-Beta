package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 f24430a;
    public c01 f24431b;

    public a01() {
        super(-2, -2);
        c01 c01Var = c01.e;
        this.f24430a = c01Var;
        this.f24431b = c01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24430a = c01Var;
        this.f24431b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24431b.equals(a01Var.f24431b) && this.f24430a.equals(a01Var.f24430a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24431b.hashCode() + (this.f24430a.hashCode() * 31);
    }
}
