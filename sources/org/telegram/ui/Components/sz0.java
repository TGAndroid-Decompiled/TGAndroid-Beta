package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sz0 extends ViewGroup.MarginLayoutParams {
    public uz0 f28380a;
    public uz0 f28381b;

    public sz0() {
        super(-2, -2);
        uz0 uz0Var = uz0.e;
        this.f28380a = uz0Var;
        this.f28381b = uz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28380a = uz0Var;
        this.f28381b = uz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        if (this.f28381b.equals(sz0Var.f28381b) && this.f28380a.equals(sz0Var.f28380a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28381b.hashCode() + (this.f28380a.hashCode() * 31);
    }
}
