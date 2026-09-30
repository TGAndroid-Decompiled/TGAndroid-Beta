package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f28083a;
    public tz0 f28084b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f28083a = tz0Var;
        this.f28084b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28083a = tz0Var;
        this.f28084b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28084b.equals(rz0Var.f28084b) && this.f28083a.equals(rz0Var.f28083a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28084b.hashCode() + (this.f28083a.hashCode() * 31);
    }
}
