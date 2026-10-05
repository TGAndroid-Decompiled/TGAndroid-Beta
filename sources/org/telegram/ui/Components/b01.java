package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class b01 extends ViewGroup.MarginLayoutParams {
    public d01 f24789a;
    public d01 f24790b;

    public b01() {
        super(-2, -2);
        d01 d01Var = d01.f25568e;
        this.f24789a = d01Var;
        this.f24790b = d01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24789a = d01Var;
        this.f24790b = d01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        if (this.f24790b.equals(b01Var.f24790b) && this.f24789a.equals(b01Var.f24789a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24790b.hashCode() + (this.f24789a.hashCode() * 31);
    }
}
