package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class kx0 extends ViewGroup.MarginLayoutParams {
    public mx0 f36636a;
    public mx0 f36637b;

    public kx0() {
        super(-2, -2);
        mx0 mx0Var = mx0.f37400e;
        this.f36636a = mx0Var;
        this.f36637b = mx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f36636a = mx0Var;
        this.f36637b = mx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx0.class != obj.getClass()) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        if (this.f36637b.equals(kx0Var.f36637b) && this.f36636a.equals(kx0Var.f36636a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36637b.hashCode() + (this.f36636a.hashCode() * 31);
    }
}
