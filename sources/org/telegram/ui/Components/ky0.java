package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ky0 extends ViewGroup.MarginLayoutParams {
    public my0 f27940a;
    public my0 f27941b;

    public ky0() {
        super(-2, -2);
        my0 my0Var = my0.e;
        this.f27940a = my0Var;
        this.f27941b = my0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f27940a = my0Var;
        this.f27941b = my0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ky0.class != obj.getClass()) {
            return false;
        }
        ky0 ky0Var = (ky0) obj;
        if (this.f27941b.equals(ky0Var.f27941b) && this.f27940a.equals(ky0Var.f27940a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27941b.hashCode() + (this.f27940a.hashCode() * 31);
    }
}
