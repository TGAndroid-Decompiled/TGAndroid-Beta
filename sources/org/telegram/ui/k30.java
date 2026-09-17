package org.telegram.ui;
public final class k30 extends g.p {
    public final j60 f37902c;

    public k30(j60 j60Var) {
        this.f37902c = j60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f37902c.f37572o2.f39412e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
