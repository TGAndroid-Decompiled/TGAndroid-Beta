package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class kx0 extends ViewGroup.MarginLayoutParams {
    public mx0 f36648a;
    public mx0 f36649b;

    public kx0() {
        super(-2, -2);
        mx0 mx0Var = mx0.f37401e;
        this.f36648a = mx0Var;
        this.f36649b = mx0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f36648a = mx0Var;
        this.f36649b = mx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx0.class != obj.getClass()) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        if (this.f36649b.equals(kx0Var.f36649b) && this.f36648a.equals(kx0Var.f36648a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36649b.hashCode() + (this.f36648a.hashCode() * 31);
    }
}
