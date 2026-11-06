package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gx0 extends ViewGroup.MarginLayoutParams {
    public ix0 f34064a;
    public ix0 f34065b;

    public gx0() {
        super(-2, -2);
        ix0 ix0Var = ix0.f34816e;
        this.f34064a = ix0Var;
        this.f34065b = ix0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34064a = ix0Var;
        this.f34065b = ix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34065b.equals(gx0Var.f34065b) && this.f34064a.equals(gx0Var.f34064a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34065b.hashCode() + (this.f34064a.hashCode() * 31);
    }
}
