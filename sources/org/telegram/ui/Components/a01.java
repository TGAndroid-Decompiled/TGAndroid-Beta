package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 f24433a;
    public c01 f24434b;

    public a01() {
        super(-2, -2);
        c01 c01Var = c01.e;
        this.f24433a = c01Var;
        this.f24434b = c01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24433a = c01Var;
        this.f24434b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24434b.equals(a01Var.f24434b) && this.f24433a.equals(a01Var.f24433a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24434b.hashCode() + (this.f24433a.hashCode() * 31);
    }
}
