package org.telegram.ui.Components;
public final class dj0 extends hg.b {
    public final sg.o0 f25433c;

    public dj0(int i10, sg.o0 o0Var) {
        super(i10, false);
        this.f25433c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dj0.class == obj.getClass()) {
            dj0 dj0Var = (dj0) obj;
            int i10 = this.f7680a;
            int i11 = dj0Var.f7680a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                sg.o0 o0Var = this.f25433c;
                if (o0Var != null && o0Var.equals(dj0Var.f25433c)) {
                    return true;
                }
                return false;
            } else if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
