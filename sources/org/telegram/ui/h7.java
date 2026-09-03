package org.telegram.ui;

import java.util.ArrayList;
public abstract class h7 extends cg.c {
    public final int d;
    public final ArrayList f37232e = new ArrayList();

    public h7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37232e.size();
    }

    @Override
    public final int j(int i10) {
        return ((o7) this.f37232e.get(i10)).f2505a;
    }
}
