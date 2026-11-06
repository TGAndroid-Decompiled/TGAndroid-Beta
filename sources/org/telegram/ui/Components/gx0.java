package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gx0 extends ViewGroup.MarginLayoutParams {
    public ix0 f34012a;
    public ix0 f34013b;

    public gx0() {
        super(-2, -2);
        ix0 ix0Var = ix0.f34779e;
        this.f34012a = ix0Var;
        this.f34013b = ix0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f34012a = ix0Var;
        this.f34013b = ix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34013b.equals(gx0Var.f34013b) && this.f34012a.equals(gx0Var.f34012a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34013b.hashCode() + (this.f34012a.hashCode() * 31);
    }
}
