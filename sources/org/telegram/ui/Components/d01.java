package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class d01 extends ViewGroup.MarginLayoutParams {
    public f01 f23926a;
    public f01 f23927b;

    public d01() {
        super(-2, -2);
        f01 f01Var = f01.e;
        this.f23926a = f01Var;
        this.f23927b = f01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f23926a = f01Var;
        this.f23927b = f01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d01.class != obj.getClass()) {
            return false;
        }
        d01 d01Var = (d01) obj;
        if (this.f23927b.equals(d01Var.f23927b) && this.f23926a.equals(d01Var.f23926a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23927b.hashCode() + (this.f23926a.hashCode() * 31);
    }
}
