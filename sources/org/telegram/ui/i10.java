package org.telegram.ui;
public final class i10 extends g.p {
    public final c40 f47866c;

    public i10(c40 c40Var) {
        this.f47866c = c40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f47866c.f45938n4.f46977e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
