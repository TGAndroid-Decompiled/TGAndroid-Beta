package org.telegram.ui;
public final class f30 extends g.p {
    public final d60 f33536c;

    public f30(d60 d60Var) {
        this.f33536c = d60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f33536c.f32992o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
