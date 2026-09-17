package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 f25844a;
    public gz0 f25845b;

    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.f26565e;
        this.f25844a = gz0Var;
        this.f25845b = gz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25844a = gz0Var;
        this.f25845b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f25845b.equals(ez0Var.f25845b) && this.f25844a.equals(ez0Var.f25844a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25845b.hashCode() + (this.f25844a.hashCode() * 31);
    }
}
