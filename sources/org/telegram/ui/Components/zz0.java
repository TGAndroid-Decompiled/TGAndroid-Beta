package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class zz0 extends ViewGroup.MarginLayoutParams {
    public b01 f33067a;
    public b01 f33068b;

    public zz0() {
        super(-2, -2);
        b01 b01Var = b01.e;
        this.f33067a = b01Var;
        this.f33068b = b01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f33067a = b01Var;
        this.f33068b = b01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33068b.equals(zz0Var.f33068b) && this.f33067a.equals(zz0Var.f33067a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33068b.hashCode() + (this.f33067a.hashCode() * 31);
    }
}
