package org.telegram.ui;
public final class h30 extends f2.v {
    public final e60 f34562c;

    public h30(e60 e60Var) {
        this.f34562c = e60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f34562c.f33663l2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
