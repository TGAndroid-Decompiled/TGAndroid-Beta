package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class c01 extends ViewGroup.MarginLayoutParams {
    public e01 f25148a;
    public e01 f25149b;

    public c01() {
        super(-2, -2);
        e01 e01Var = e01.e;
        this.f25148a = e01Var;
        this.f25149b = e01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25148a = e01Var;
        this.f25149b = e01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.f25149b.equals(c01Var.f25149b) && this.f25148a.equals(c01Var.f25148a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25149b.hashCode() + (this.f25148a.hashCode() * 31);
    }
}
