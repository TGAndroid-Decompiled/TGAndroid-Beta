package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class fz0 extends ViewGroup.MarginLayoutParams {
    public hz0 f24130a;
    public hz0 f24131b;

    public fz0() {
        super(-2, -2);
        hz0 hz0Var = hz0.e;
        this.f24130a = hz0Var;
        this.f24131b = hz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24130a = hz0Var;
        this.f24131b = hz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        if (this.f24131b.equals(fz0Var.f24131b) && this.f24130a.equals(fz0Var.f24130a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24131b.hashCode() + (this.f24130a.hashCode() * 31);
    }
}
