package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class pz0 extends ViewGroup.MarginLayoutParams {
    public rz0 f27458a;
    public rz0 f27459b;

    public pz0() {
        super(-2, -2);
        rz0 rz0Var = rz0.e;
        this.f27458a = rz0Var;
        this.f27459b = rz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27458a = rz0Var;
        this.f27459b = rz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (this.f27459b.equals(pz0Var.f27459b) && this.f27458a.equals(pz0Var.f27458a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27459b.hashCode() + (this.f27458a.hashCode() * 31);
    }
}
