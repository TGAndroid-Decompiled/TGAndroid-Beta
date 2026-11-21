package org.telegram.ui.Components;
public final class oi0 extends rg.a {
    public final ch.p0 f38248c;

    public oi0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.f38248c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oi0.class == obj.getClass()) {
            oi0 oi0Var = (oi0) obj;
            int i7 = this.f56630a;
            int i10 = oi0Var.f56630a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.f38248c;
                if (p0Var != null && p0Var.equals(oi0Var.f38248c)) {
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
