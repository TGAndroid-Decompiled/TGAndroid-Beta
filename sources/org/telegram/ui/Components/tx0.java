package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tx0 extends ViewGroup.MarginLayoutParams {
    public vx0 f40059a;
    public vx0 f40060b;

    public tx0() {
        super(-2, -2);
        vx0 vx0Var = vx0.f41557e;
        this.f40059a = vx0Var;
        this.f40060b = vx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f40059a = vx0Var;
        this.f40060b = vx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        if (this.f40060b.equals(tx0Var.f40060b) && this.f40059a.equals(tx0Var.f40059a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40060b.hashCode() + (this.f40059a.hashCode() * 31);
    }
}
