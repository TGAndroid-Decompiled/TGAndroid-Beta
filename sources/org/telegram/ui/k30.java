package org.telegram.ui;
public final class k30 extends g.p {
    public final j60 f37928c;

    public k30(j60 j60Var) {
        this.f37928c = j60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f37928c.f37598o2.f39438e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
