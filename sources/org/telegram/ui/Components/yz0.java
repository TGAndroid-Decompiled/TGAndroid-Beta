package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class yz0 extends ViewGroup.MarginLayoutParams {
    public a01 f32794a;
    public a01 f32795b;

    public yz0() {
        super(-2, -2);
        a01 a01Var = a01.e;
        this.f32794a = a01Var;
        this.f32795b = a01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f32794a = a01Var;
        this.f32795b = a01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        if (this.f32795b.equals(yz0Var.f32795b) && this.f32794a.equals(yz0Var.f32794a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32795b.hashCode() + (this.f32794a.hashCode() * 31);
    }
}
