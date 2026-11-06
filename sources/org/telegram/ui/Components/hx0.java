package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class hx0 extends ViewGroup.MarginLayoutParams {
    public jx0 f34437a;
    public jx0 f34438b;

    public hx0() {
        super(-2, -2);
        jx0 jx0Var = jx0.f35101e;
        this.f34437a = jx0Var;
        this.f34438b = jx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34437a = jx0Var;
        this.f34438b = jx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx0.class != obj.getClass()) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        if (this.f34438b.equals(hx0Var.f34438b) && this.f34437a.equals(hx0Var.f34437a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34438b.hashCode() + (this.f34437a.hashCode() * 31);
    }
}
