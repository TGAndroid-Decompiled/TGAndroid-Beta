package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class qz0 extends ViewGroup.MarginLayoutParams {
    public sz0 f27789a;
    public sz0 f27790b;

    public qz0() {
        super(-2, -2);
        sz0 sz0Var = sz0.e;
        this.f27789a = sz0Var;
        this.f27790b = sz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27789a = sz0Var;
        this.f27790b = sz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f27790b.equals(qz0Var.f27790b) && this.f27789a.equals(qz0Var.f27789a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27790b.hashCode() + (this.f27789a.hashCode() * 31);
    }
}
