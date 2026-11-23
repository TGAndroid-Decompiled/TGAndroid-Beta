package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tx0 extends ViewGroup.MarginLayoutParams {
    public vx0 f40077a;
    public vx0 f40078b;

    public tx0() {
        super(-2, -2);
        vx0 vx0Var = vx0.f41584e;
        this.f40077a = vx0Var;
        this.f40078b = vx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f40077a = vx0Var;
        this.f40078b = vx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        if (this.f40078b.equals(tx0Var.f40078b) && this.f40077a.equals(tx0Var.f40077a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40078b.hashCode() + (this.f40077a.hashCode() * 31);
    }
}
