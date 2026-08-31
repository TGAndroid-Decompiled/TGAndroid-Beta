package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class jz0 extends ViewGroup.MarginLayoutParams {
    public lz0 f28234a;
    public lz0 f28235b;

    public jz0() {
        super(-2, -2);
        lz0 lz0Var = lz0.f28865e;
        this.f28234a = lz0Var;
        this.f28235b = lz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28234a = lz0Var;
        this.f28235b = lz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jz0.class != obj.getClass()) {
            return false;
        }
        jz0 jz0Var = (jz0) obj;
        if (this.f28235b.equals(jz0Var.f28235b) && this.f28234a.equals(jz0Var.f28234a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28235b.hashCode() + (this.f28234a.hashCode() * 31);
    }
}
