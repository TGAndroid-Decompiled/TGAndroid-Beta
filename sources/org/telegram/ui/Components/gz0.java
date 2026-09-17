package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gz0 extends ViewGroup.MarginLayoutParams {
    public iz0 f24427a;
    public iz0 f24428b;

    public gz0() {
        super(-2, -2);
        iz0 iz0Var = iz0.e;
        this.f24427a = iz0Var;
        this.f24428b = iz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24427a = iz0Var;
        this.f24428b = iz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz0.class != obj.getClass()) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        if (this.f24428b.equals(gz0Var.f24428b) && this.f24427a.equals(gz0Var.f24427a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24428b.hashCode() + (this.f24427a.hashCode() * 31);
    }
}
