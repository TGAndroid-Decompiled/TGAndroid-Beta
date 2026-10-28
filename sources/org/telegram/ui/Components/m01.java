package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m01 extends ViewGroup.MarginLayoutParams {
    public o01 f30329a;
    public o01 f30330b;

    public m01() {
        super(-2, -2);
        o01 o01Var = o01.e;
        this.f30329a = o01Var;
        this.f30330b = o01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f30329a = o01Var;
        this.f30330b = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        m01 m01Var = (m01) obj;
        if (this.f30330b.equals(m01Var.f30330b) && this.f30329a.equals(m01Var.f30329a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30330b.hashCode() + (this.f30329a.hashCode() * 31);
    }
}
