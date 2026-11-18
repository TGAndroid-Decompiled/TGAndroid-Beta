package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends rg.b {
    public final int d;
    public final ArrayList f47077e = new ArrayList();

    public e7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.f47077e.size();
    }

    @Override
    public final int d(int i7) {
        return ((l7) this.f47077e.get(i7)).f56589a;
    }
}
