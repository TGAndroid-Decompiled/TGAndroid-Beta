package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class xy0 extends ViewGroup.MarginLayoutParams {
    public zy0 f34854a;
    public zy0 f34855b;

    public xy0() {
        super(-2, -2);
        zy0 zy0Var = zy0.f35454e;
        this.f34854a = zy0Var;
        this.f34855b = zy0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34854a = zy0Var;
        this.f34855b = zy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xy0.class != obj.getClass()) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        if (this.f34855b.equals(xy0Var.f34855b) && this.f34854a.equals(xy0Var.f34854a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34855b.hashCode() + (this.f34854a.hashCode() * 31);
    }
}
