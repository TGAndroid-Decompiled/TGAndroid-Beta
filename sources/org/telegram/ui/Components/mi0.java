package org.telegram.ui.Components;
public final class mi0 extends rg.a {
    public final ch.p0 f37517c;

    public mi0(int i7, ch.p0 p0Var) {
        super(i7, false);
        this.f37517c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mi0.class == obj.getClass()) {
            mi0 mi0Var = (mi0) obj;
            int i7 = this.f56589a;
            int i10 = mi0Var.f56589a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.p0 p0Var = this.f37517c;
                if (p0Var != null && p0Var.equals(mi0Var.f37517c)) {
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
