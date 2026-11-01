package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ly0 extends ViewGroup.MarginLayoutParams {
    public ny0 f28306a;
    public ny0 f28307b;

    public ly0() {
        super(-2, -2);
        ny0 ny0Var = ny0.e;
        this.f28306a = ny0Var;
        this.f28307b = ny0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28306a = ny0Var;
        this.f28307b = ny0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly0.class != obj.getClass()) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        if (this.f28307b.equals(ly0Var.f28307b) && this.f28306a.equals(ly0Var.f28306a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28307b.hashCode() + (this.f28306a.hashCode() * 31);
    }
}
