package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 f25843a;
    public gz0 f25844b;

    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.f26564e;
        this.f25843a = gz0Var;
        this.f25844b = gz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25843a = gz0Var;
        this.f25844b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f25844b.equals(ez0Var.f25844b) && this.f25843a.equals(ez0Var.f25843a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25844b.hashCode() + (this.f25843a.hashCode() * 31);
    }
}
