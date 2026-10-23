package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class d01 extends ViewGroup.MarginLayoutParams {
    public f01 f25476a;
    public f01 f25477b;

    public d01() {
        super(-2, -2);
        f01 f01Var = f01.e;
        this.f25476a = f01Var;
        this.f25477b = f01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25476a = f01Var;
        this.f25477b = f01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d01.class != obj.getClass()) {
            return false;
        }
        d01 d01Var = (d01) obj;
        if (this.f25477b.equals(d01Var.f25477b) && this.f25476a.equals(d01Var.f25476a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25477b.hashCode() + (this.f25476a.hashCode() * 31);
    }
}
