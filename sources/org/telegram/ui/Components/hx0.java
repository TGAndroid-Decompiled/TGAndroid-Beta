package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class hx0 extends ViewGroup.MarginLayoutParams {
    public jx0 f34388a;
    public jx0 f34389b;

    public hx0() {
        super(-2, -2);
        jx0 jx0Var = jx0.f35126e;
        this.f34388a = jx0Var;
        this.f34389b = jx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34388a = jx0Var;
        this.f34389b = jx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx0.class != obj.getClass()) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        if (this.f34389b.equals(hx0Var.f34389b) && this.f34388a.equals(hx0Var.f34388a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34389b.hashCode() + (this.f34388a.hashCode() * 31);
    }
}
