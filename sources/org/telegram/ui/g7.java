package org.telegram.ui;

import java.util.ArrayList;
public abstract class g7 extends sg.b {
    public final int d;
    public final ArrayList f45561e = new ArrayList();

    public g7(int i3) {
        this.d = i3;
    }

    public abstract void F();

    @Override
    public final int b() {
        return this.f45561e.size();
    }

    @Override
    public final int d(int i3) {
        return ((n7) this.f45561e.get(i3)).f54715a;
    }
}
