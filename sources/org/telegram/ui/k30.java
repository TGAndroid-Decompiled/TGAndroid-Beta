package org.telegram.ui;
public final class k30 extends g.p {
    public final i60 f35045c;

    public k30(i60 i60Var) {
        this.f35045c = i60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f35045c.f34437o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
