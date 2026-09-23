package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 f23776a;
    public gz0 f23777b;

    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.e;
        this.f23776a = gz0Var;
        this.f23777b = gz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f23776a = gz0Var;
        this.f23777b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f23777b.equals(ez0Var.f23777b) && this.f23776a.equals(ez0Var.f23776a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23777b.hashCode() + (this.f23776a.hashCode() * 31);
    }
}
