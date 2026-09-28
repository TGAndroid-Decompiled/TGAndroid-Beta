package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f28086a;
    public tz0 f28087b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f28086a = tz0Var;
        this.f28087b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28086a = tz0Var;
        this.f28087b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28087b.equals(rz0Var.f28087b) && this.f28086a.equals(rz0Var.f28086a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28087b.hashCode() + (this.f28086a.hashCode() * 31);
    }
}
