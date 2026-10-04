package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 f24400a;
    public c01 f24401b;

    public a01() {
        super(-2, -2);
        c01 c01Var = c01.f25158e;
        this.f24400a = c01Var;
        this.f24401b = c01Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24400a = c01Var;
        this.f24401b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24401b.equals(a01Var.f24401b) && this.f24400a.equals(a01Var.f24400a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24401b.hashCode() + (this.f24400a.hashCode() * 31);
    }
}
