package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class pz0 extends ViewGroup.MarginLayoutParams {
    public rz0 f27451a;
    public rz0 f27452b;

    public pz0() {
        super(-2, -2);
        rz0 rz0Var = rz0.e;
        this.f27451a = rz0Var;
        this.f27452b = rz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27451a = rz0Var;
        this.f27452b = rz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (this.f27452b.equals(pz0Var.f27452b) && this.f27451a.equals(pz0Var.f27451a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27452b.hashCode() + (this.f27451a.hashCode() * 31);
    }
}
