package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sz0 extends ViewGroup.MarginLayoutParams {
    public uz0 f28348a;
    public uz0 f28349b;

    public sz0() {
        super(-2, -2);
        uz0 uz0Var = uz0.e;
        this.f28348a = uz0Var;
        this.f28349b = uz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28348a = uz0Var;
        this.f28349b = uz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        if (this.f28349b.equals(sz0Var.f28349b) && this.f28348a.equals(sz0Var.f28348a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28349b.hashCode() + (this.f28348a.hashCode() * 31);
    }
}
