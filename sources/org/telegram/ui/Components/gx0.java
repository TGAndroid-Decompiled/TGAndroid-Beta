package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gx0 extends ViewGroup.MarginLayoutParams {
    public ix0 f34223a;
    public ix0 f34224b;

    public gx0() {
        super(-2, -2);
        ix0 ix0Var = ix0.f34854e;
        this.f34223a = ix0Var;
        this.f34224b = ix0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34223a = ix0Var;
        this.f34224b = ix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34224b.equals(gx0Var.f34224b) && this.f34223a.equals(gx0Var.f34223a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34224b.hashCode() + (this.f34223a.hashCode() * 31);
    }
}
