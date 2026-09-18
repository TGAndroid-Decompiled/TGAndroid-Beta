package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f28006a;
    public tz0 f28007b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f28006a = tz0Var;
        this.f28007b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28006a = tz0Var;
        this.f28007b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28007b.equals(rz0Var.f28007b) && this.f28006a.equals(rz0Var.f28006a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28007b.hashCode() + (this.f28006a.hashCode() * 31);
    }
}
