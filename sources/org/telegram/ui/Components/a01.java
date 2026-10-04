package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 f24396a;
    public c01 f24397b;

    public a01() {
        super(-2, -2);
        c01 c01Var = c01.f25153e;
        this.f24396a = c01Var;
        this.f24397b = c01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24396a = c01Var;
        this.f24397b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24397b.equals(a01Var.f24397b) && this.f24396a.equals(a01Var.f24396a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24397b.hashCode() + (this.f24396a.hashCode() * 31);
    }
}
