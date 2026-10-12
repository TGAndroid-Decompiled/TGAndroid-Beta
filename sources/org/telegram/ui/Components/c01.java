package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class c01 extends ViewGroup.MarginLayoutParams {
    public e01 f23898a;
    public e01 f23899b;

    public c01() {
        super(-2, -2);
        e01 e01Var = e01.e;
        this.f23898a = e01Var;
        this.f23899b = e01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f23898a = e01Var;
        this.f23899b = e01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.f23899b.equals(c01Var.f23899b) && this.f23898a.equals(c01Var.f23898a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23899b.hashCode() + (this.f23898a.hashCode() * 31);
    }
}
