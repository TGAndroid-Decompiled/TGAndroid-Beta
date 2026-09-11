package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 f25816a;
    public gz0 f25817b;

    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.f26537e;
        this.f25816a = gz0Var;
        this.f25817b = gz0Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f25816a = gz0Var;
        this.f25817b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f25817b.equals(ez0Var.f25817b) && this.f25816a.equals(ez0Var.f25816a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25817b.hashCode() + (this.f25816a.hashCode() * 31);
    }
}
