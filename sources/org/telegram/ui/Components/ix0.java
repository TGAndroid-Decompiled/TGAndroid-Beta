package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ix0 extends ViewGroup.MarginLayoutParams {
    public kx0 f34877a;
    public kx0 f34878b;

    public ix0() {
        super(-2, -2);
        kx0 kx0Var = kx0.f35510e;
        this.f34877a = kx0Var;
        this.f34878b = kx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34877a = kx0Var;
        this.f34878b = kx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        if (this.f34878b.equals(ix0Var.f34878b) && this.f34877a.equals(ix0Var.f34877a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34878b.hashCode() + (this.f34877a.hashCode() * 31);
    }
}
