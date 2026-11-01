package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends hg.c {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i10) {
        return ((m7) this.e.get(i10)).f7681a;
    }
}
