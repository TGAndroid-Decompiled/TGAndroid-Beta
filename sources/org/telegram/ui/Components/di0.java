package org.telegram.ui.Components;
public final class di0 extends rg.a {
    public final ch.p0 f33942c;

    public di0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.f33942c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && di0.class == obj.getClass()) {
            di0 di0Var = (di0) obj;
            int i7 = this.f56015a;
            int i10 = di0Var.f56015a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.f33942c;
                if (p0Var != null && p0Var.equals(di0Var.f33942c)) {
                    return true;
                }
                return false;
            } else if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
