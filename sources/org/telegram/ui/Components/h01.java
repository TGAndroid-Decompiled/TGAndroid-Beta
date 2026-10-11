package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class h01 extends ViewGroup.MarginLayoutParams {
    public j01 f26921a;
    public j01 f26922b;

    public h01() {
        super(-2, -2);
        j01 j01Var = j01.f27547e;
        this.f26921a = j01Var;
        this.f26922b = j01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f26921a = j01Var;
        this.f26922b = j01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h01.class != obj.getClass()) {
            return false;
        }
        h01 h01Var = (h01) obj;
        if (this.f26922b.equals(h01Var.f26922b) && this.f26921a.equals(h01Var.f26921a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26922b.hashCode() + (this.f26921a.hashCode() * 31);
    }
}
