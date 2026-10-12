package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m01 extends ViewGroup.MarginLayoutParams {
    public o01 f28339a;
    public o01 f28340b;

    public m01() {
        super(-2, -2);
        o01 o01Var = o01.f29012e;
        this.f28339a = o01Var;
        this.f28340b = o01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f28339a = o01Var;
        this.f28340b = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        m01 m01Var = (m01) obj;
        if (this.f28340b.equals(m01Var.f28340b) && this.f28339a.equals(m01Var.f28339a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28340b.hashCode() + (this.f28339a.hashCode() * 31);
    }
}
