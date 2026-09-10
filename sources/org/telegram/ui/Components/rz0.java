package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 f26881a;
    public tz0 f26882b;

    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.f26881a = tz0Var;
        this.f26882b = tz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f26881a = tz0Var;
        this.f26882b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f26882b.equals(rz0Var.f26882b) && this.f26881a.equals(rz0Var.f26881a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26882b.hashCode() + (this.f26881a.hashCode() * 31);
    }
}
