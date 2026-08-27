package org.telegram.ui;

import java.util.ArrayList;

public abstract class f7 extends xf.b {
    public final int d;

    public final ArrayList f37950e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37950e.size();
    }

    @Override
    public final int j(int i10) {
        return ((m7) this.f37950e.get(i10)).f49413a;
    }
}
