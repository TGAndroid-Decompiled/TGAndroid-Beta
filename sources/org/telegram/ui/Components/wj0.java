package org.telegram.ui.Components;
public final class wj0 extends og.a {
    public final zg.p0 f29729c;

    public wj0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.f29729c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj0.class == obj.getClass()) {
            wj0 wj0Var = (wj0) obj;
            int i10 = this.f15531a;
            int i11 = wj0Var.f15531a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.p0 p0Var = this.f29729c;
                if (p0Var != null && p0Var.equals(wj0Var.f29729c)) {
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
