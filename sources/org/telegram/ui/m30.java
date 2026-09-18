package org.telegram.ui;
public final class m30 extends g.p {
    public final k60 f35679c;

    public m30(k60 k60Var) {
        this.f35679c = k60Var;
    }

    @Override
    public final int i(int i10) {
        int size = this.f35679c.f35074o2.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i10 == 0 || i10 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
