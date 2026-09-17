package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 f25817a;
    public gz0 f25818b;

    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.f26538e;
        this.f25817a = gz0Var;
        this.f25818b = gz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25817a = gz0Var;
        this.f25818b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f25818b.equals(ez0Var.f25818b) && this.f25817a.equals(ez0Var.f25817a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25818b.hashCode() + (this.f25817a.hashCode() * 31);
    }
}
