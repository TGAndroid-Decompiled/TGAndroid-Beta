package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class yz0 extends ViewGroup.MarginLayoutParams {
    public a01 f32787a;
    public a01 f32788b;

    public yz0() {
        super(-2, -2);
        a01 a01Var = a01.e;
        this.f32787a = a01Var;
        this.f32788b = a01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f32787a = a01Var;
        this.f32788b = a01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        if (this.f32788b.equals(yz0Var.f32788b) && this.f32787a.equals(yz0Var.f32787a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32788b.hashCode() + (this.f32787a.hashCode() * 31);
    }
}
