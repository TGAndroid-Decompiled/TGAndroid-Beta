package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rx0 extends ViewGroup.MarginLayoutParams {
    public tx0 f39330a;
    public tx0 f39331b;

    public rx0() {
        super(-2, -2);
        tx0 tx0Var = tx0.f40130e;
        this.f39330a = tx0Var;
        this.f39331b = tx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f39330a = tx0Var;
        this.f39331b = tx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rx0.class != obj.getClass()) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        if (this.f39331b.equals(rx0Var.f39331b) && this.f39330a.equals(rx0Var.f39330a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39331b.hashCode() + (this.f39330a.hashCode() * 31);
    }
}
