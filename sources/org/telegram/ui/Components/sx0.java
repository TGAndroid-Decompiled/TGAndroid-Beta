package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sx0 extends ViewGroup.MarginLayoutParams {
    public ux0 f39740a;
    public ux0 f39741b;

    public sx0() {
        super(-2, -2);
        ux0 ux0Var = ux0.f40500e;
        this.f39740a = ux0Var;
        this.f39741b = ux0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f39740a = ux0Var;
        this.f39741b = ux0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        if (this.f39741b.equals(sx0Var.f39741b) && this.f39740a.equals(sx0Var.f39740a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39741b.hashCode() + (this.f39740a.hashCode() * 31);
    }
}
