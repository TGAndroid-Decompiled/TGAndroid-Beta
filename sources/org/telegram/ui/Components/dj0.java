package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class dj0 extends bk0 {
    public boolean f34449c;
    public boolean d;
    public ArrayList f34450e;
    public ArrayList f34451f;

    public final void E() {
        this.f34449c = false;
        if (!this.d && this.f34450e.isEmpty() && this.f34451f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.kl) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f34449c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i7) {
        if (!this.f34449c) {
            super.g(i7);
        }
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList = this.f34450e;
        if (!this.f34449c) {
            super.i(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }

    @Override
    public void k(int i7, int i10) {
        if (!this.f34449c) {
            super.k(i7, i10);
        }
    }

    @Override
    public void o(int i7, int i10) {
        ArrayList arrayList = this.f34450e;
        if (!this.f34449c) {
            super.o(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f34451f;
        if (!this.f34449c) {
            super.p(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void s(int i7) {
        ArrayList arrayList = this.f34451f;
        if (!this.f34449c) {
            super.s(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }
}
