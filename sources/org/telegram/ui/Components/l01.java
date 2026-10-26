package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l01 extends ViewGroup.MarginLayoutParams {
    public n01 f30012a;
    public n01 f30013b;

    public l01() {
        super(-2, -2);
        n01 n01Var = n01.e;
        this.f30012a = n01Var;
        this.f30013b = n01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f30012a = n01Var;
        this.f30013b = n01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        if (this.f30013b.equals(l01Var.f30013b) && this.f30012a.equals(l01Var.f30012a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30013b.hashCode() + (this.f30012a.hashCode() * 31);
    }
}
