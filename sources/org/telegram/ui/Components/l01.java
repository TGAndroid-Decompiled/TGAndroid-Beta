package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l01 extends ViewGroup.MarginLayoutParams {
    public n01 f30010a;
    public n01 f30011b;

    public l01() {
        super(-2, -2);
        n01 n01Var = n01.e;
        this.f30010a = n01Var;
        this.f30011b = n01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f30010a = n01Var;
        this.f30011b = n01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        if (this.f30011b.equals(l01Var.f30011b) && this.f30010a.equals(l01Var.f30010a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30011b.hashCode() + (this.f30010a.hashCode() * 31);
    }
}
