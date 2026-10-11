package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class i01 extends ViewGroup.MarginLayoutParams {
    public k01 f27120a;
    public k01 f27121b;

    public i01() {
        super(-2, -2);
        k01 k01Var = k01.f27797e;
        this.f27120a = k01Var;
        this.f27121b = k01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27120a = k01Var;
        this.f27121b = k01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i01.class != obj.getClass()) {
            return false;
        }
        i01 i01Var = (i01) obj;
        if (this.f27121b.equals(i01Var.f27121b) && this.f27120a.equals(i01Var.f27120a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27121b.hashCode() + (this.f27120a.hashCode() * 31);
    }
}
