package org.telegram.ui;
public final class k30 extends g.p {
    public final j60 f37901c;

    public k30(j60 j60Var) {
        this.f37901c = j60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f37901c.f37571o2.f39411e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
