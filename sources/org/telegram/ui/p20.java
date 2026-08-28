package org.telegram.ui;
public final class p20 extends f2.x {
    public final o50 f41315c;

    public p20(o50 o50Var) {
        this.f41315c = o50Var;
    }

    @Override
    public final int i(int i9) {
        int size = this.f41315c.f40925k2.f43138e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i9 == 0 || i9 == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
