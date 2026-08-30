package org.telegram.ui;
public final class f30 extends f2.v {
    public final c60 f34152c;

    public f30(c60 c60Var) {
        this.f34152c = c60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f34152c.f33144l2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
