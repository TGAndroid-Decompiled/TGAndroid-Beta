package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tx0 extends ViewGroup.MarginLayoutParams {
    public vx0 f40084a;
    public vx0 f40085b;

    public tx0() {
        super(-2, -2);
        vx0 vx0Var = vx0.f41582e;
        this.f40084a = vx0Var;
        this.f40085b = vx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f40084a = vx0Var;
        this.f40085b = vx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        if (this.f40085b.equals(tx0Var.f40085b) && this.f40084a.equals(tx0Var.f40084a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40085b.hashCode() + (this.f40084a.hashCode() * 31);
    }
}
