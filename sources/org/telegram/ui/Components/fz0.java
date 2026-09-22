package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class fz0 extends ViewGroup.MarginLayoutParams {
    public hz0 f24127a;
    public hz0 f24128b;

    public fz0() {
        super(-2, -2);
        hz0 hz0Var = hz0.e;
        this.f24127a = hz0Var;
        this.f24128b = hz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24127a = hz0Var;
        this.f24128b = hz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        if (this.f24128b.equals(fz0Var.f24128b) && this.f24127a.equals(fz0Var.f24127a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24128b.hashCode() + (this.f24127a.hashCode() * 31);
    }
}
