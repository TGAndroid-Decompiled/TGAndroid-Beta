package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class qz0 extends ViewGroup.MarginLayoutParams {
    public sz0 f27697a;
    public sz0 f27698b;

    public qz0() {
        super(-2, -2);
        sz0 sz0Var = sz0.e;
        this.f27697a = sz0Var;
        this.f27698b = sz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27697a = sz0Var;
        this.f27698b = sz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f27698b.equals(qz0Var.f27698b) && this.f27697a.equals(qz0Var.f27697a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27698b.hashCode() + (this.f27697a.hashCode() * 31);
    }
}
