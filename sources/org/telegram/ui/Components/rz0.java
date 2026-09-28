package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f28085a;
    public tz0 f28086b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f28085a = tz0Var;
        this.f28086b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28085a = tz0Var;
        this.f28086b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28086b.equals(rz0Var.f28086b) && this.f28085a.equals(rz0Var.f28085a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28086b.hashCode() + (this.f28085a.hashCode() * 31);
    }
}
