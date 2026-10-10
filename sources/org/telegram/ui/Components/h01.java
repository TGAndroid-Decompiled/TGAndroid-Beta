package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class h01 extends ViewGroup.MarginLayoutParams {
    public j01 f26892a;
    public j01 f26893b;

    public h01() {
        super(-2, -2);
        j01 j01Var = j01.f27490e;
        this.f26892a = j01Var;
        this.f26893b = j01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f26892a = j01Var;
        this.f26893b = j01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h01.class != obj.getClass()) {
            return false;
        }
        h01 h01Var = (h01) obj;
        if (this.f26893b.equals(h01Var.f26893b) && this.f26892a.equals(h01Var.f26892a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26893b.hashCode() + (this.f26892a.hashCode() * 31);
    }
}
