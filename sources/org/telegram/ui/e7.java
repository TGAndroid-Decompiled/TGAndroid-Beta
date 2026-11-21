package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends rg.b {
    public final int d;
    public final ArrayList f47150e = new ArrayList();

    public e7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.f47150e.size();
    }

    @Override
    public final int d(int i7) {
        return ((l7) this.f47150e.get(i7)).f56630a;
    }
}
