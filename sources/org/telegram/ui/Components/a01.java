package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 f24395a;
    public c01 f24396b;

    public a01() {
        super(-2, -2);
        c01 c01Var = c01.f25152e;
        this.f24395a = c01Var;
        this.f24396b = c01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24395a = c01Var;
        this.f24396b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24396b.equals(a01Var.f24396b) && this.f24395a.equals(a01Var.f24395a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24396b.hashCode() + (this.f24395a.hashCode() * 31);
    }
}
