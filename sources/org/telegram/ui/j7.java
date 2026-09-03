package org.telegram.ui;

import java.util.ArrayList;
public abstract class j7 extends bg.c {
    public final int d;
    public final ArrayList e = new ArrayList();

    public j7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final int j(int i10) {
        return ((q7) this.e.get(i10)).f1830a;
    }
}
