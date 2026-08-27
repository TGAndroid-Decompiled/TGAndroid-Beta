package org.telegram.ui.Components;

import android.view.ViewGroup;

public final class oy0 extends ViewGroup.MarginLayoutParams {

    public qy0 f31445a;

    public qy0 f31446b;

    public oy0() {
        super(-2, -2);
        qy0 qy0Var = qy0.f32004e;
        this.f31445a = qy0Var;
        this.f31446b = qy0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f31445a = qy0Var;
        this.f31446b = qy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy0.class != obj.getClass()) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        return this.f31446b.equals(oy0Var.f31446b) && this.f31445a.equals(oy0Var.f31445a);
    }

    public final int hashCode() {
        return this.f31446b.hashCode() + (this.f31445a.hashCode() * 31);
    }
}
