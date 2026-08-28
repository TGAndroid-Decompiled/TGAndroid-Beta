package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class my0 extends ViewGroup.MarginLayoutParams {
    public oy0 f30947a;
    public oy0 f30948b;

    public my0() {
        super(-2, -2);
        oy0 oy0Var = oy0.f31474e;
        this.f30947a = oy0Var;
        this.f30948b = oy0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f30947a = oy0Var;
        this.f30948b = oy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || my0.class != obj.getClass()) {
            return false;
        }
        my0 my0Var = (my0) obj;
        if (this.f30948b.equals(my0Var.f30948b) && this.f30947a.equals(my0Var.f30947a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30948b.hashCode() + (this.f30947a.hashCode() * 31);
    }
}
