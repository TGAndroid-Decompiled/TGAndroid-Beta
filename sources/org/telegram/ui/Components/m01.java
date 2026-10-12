package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m01 extends ViewGroup.MarginLayoutParams {
    public o01 f28334a;
    public o01 f28335b;

    public m01() {
        super(-2, -2);
        o01 o01Var = o01.f29016e;
        this.f28334a = o01Var;
        this.f28335b = o01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28334a = o01Var;
        this.f28335b = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        m01 m01Var = (m01) obj;
        if (this.f28335b.equals(m01Var.f28335b) && this.f28334a.equals(m01Var.f28334a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28335b.hashCode() + (this.f28334a.hashCode() * 31);
    }
}
