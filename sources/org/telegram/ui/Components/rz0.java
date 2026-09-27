package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f28121a;
    public tz0 f28122b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f28121a = tz0Var;
        this.f28122b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28121a = tz0Var;
        this.f28122b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28122b.equals(rz0Var.f28122b) && this.f28121a.equals(rz0Var.f28121a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28122b.hashCode() + (this.f28121a.hashCode() * 31);
    }
}
