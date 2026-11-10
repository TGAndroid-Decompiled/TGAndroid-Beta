package org.telegram.ui;
public final class m10 extends g.p {
    public final f40 f47772c;

    public m10(f40 f40Var) {
        this.f47772c = f40Var;
    }

    @Override
    public final int i(int i7) {
        int size = this.f47772c.f45537i4.f46480e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i7 == 0 || i7 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
