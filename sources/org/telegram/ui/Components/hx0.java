package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class hx0 extends ViewGroup.MarginLayoutParams {
    public jx0 f34478a;
    public jx0 f34479b;

    public hx0() {
        super(-2, -2);
        jx0 jx0Var = jx0.f35101e;
        this.f34478a = jx0Var;
        this.f34479b = jx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34478a = jx0Var;
        this.f34479b = jx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx0.class != obj.getClass()) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        if (this.f34479b.equals(hx0Var.f34479b) && this.f34478a.equals(hx0Var.f34478a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34479b.hashCode() + (this.f34478a.hashCode() * 31);
    }
}
