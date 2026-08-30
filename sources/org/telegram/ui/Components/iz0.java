package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class iz0 extends ViewGroup.MarginLayoutParams {
    public kz0 f25805a;
    public kz0 f25806b;

    public iz0() {
        super(-2, -2);
        kz0 kz0Var = kz0.e;
        this.f25805a = kz0Var;
        this.f25806b = kz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25805a = kz0Var;
        this.f25806b = kz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        if (this.f25806b.equals(iz0Var.f25806b) && this.f25805a.equals(iz0Var.f25805a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25806b.hashCode() + (this.f25805a.hashCode() * 31);
    }
}
