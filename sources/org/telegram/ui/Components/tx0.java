package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tx0 extends ViewGroup.MarginLayoutParams {
    public vx0 f40076a;
    public vx0 f40077b;

    public tx0() {
        super(-2, -2);
        vx0 vx0Var = vx0.f41583e;
        this.f40076a = vx0Var;
        this.f40077b = vx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f40076a = vx0Var;
        this.f40077b = vx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        if (this.f40077b.equals(tx0Var.f40077b) && this.f40076a.equals(tx0Var.f40076a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40077b.hashCode() + (this.f40076a.hashCode() * 31);
    }
}
