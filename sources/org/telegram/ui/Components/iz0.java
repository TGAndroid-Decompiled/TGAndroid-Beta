package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class iz0 extends ViewGroup.MarginLayoutParams {
    public kz0 f27920a;
    public kz0 f27921b;

    public iz0() {
        super(-2, -2);
        kz0 kz0Var = kz0.f28526e;
        this.f27920a = kz0Var;
        this.f27921b = kz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27920a = kz0Var;
        this.f27921b = kz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        if (this.f27921b.equals(iz0Var.f27921b) && this.f27920a.equals(iz0Var.f27920a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27921b.hashCode() + (this.f27920a.hashCode() * 31);
    }
}
