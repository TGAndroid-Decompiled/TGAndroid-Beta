package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class iz0 extends ViewGroup.MarginLayoutParams {
    public kz0 f25794a;
    public kz0 f25795b;

    public iz0() {
        super(-2, -2);
        kz0 kz0Var = kz0.e;
        this.f25794a = kz0Var;
        this.f25795b = kz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25794a = kz0Var;
        this.f25795b = kz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        if (this.f25795b.equals(iz0Var.f25795b) && this.f25794a.equals(iz0Var.f25794a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25795b.hashCode() + (this.f25794a.hashCode() * 31);
    }
}
