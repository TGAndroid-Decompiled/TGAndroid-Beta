package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class g01 extends ViewGroup.MarginLayoutParams {
    public i01 f26538a;
    public i01 f26539b;

    public g01() {
        super(-2, -2);
        i01 i01Var = i01.f27175e;
        this.f26538a = i01Var;
        this.f26539b = i01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f26538a = i01Var;
        this.f26539b = i01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g01.class != obj.getClass()) {
            return false;
        }
        g01 g01Var = (g01) obj;
        if (this.f26539b.equals(g01Var.f26539b) && this.f26538a.equals(g01Var.f26538a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26539b.hashCode() + (this.f26538a.hashCode() * 31);
    }
}
