package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends rg.b {
    public final int d;
    public final ArrayList f45508e = new ArrayList();

    public f7(int i7) {
        this.d = i7;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.f45508e.size();
    }

    @Override
    public final int d(int i7) {
        return ((m7) this.f45508e.get(i7)).f54439a;
    }
}
