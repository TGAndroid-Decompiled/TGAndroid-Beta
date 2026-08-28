package org.telegram.ui;

import java.util.ArrayList;
public abstract class e7 extends wf.b {
    public final int d;
    public final ArrayList f37834e = new ArrayList();

    public e7(int i9) {
        this.d = i9;
    }

    public abstract void F();

    @Override
    public final int h() {
        return this.f37834e.size();
    }

    @Override
    public final int j(int i9) {
        return ((l7) this.f37834e.get(i9)).f48814a;
    }
}
