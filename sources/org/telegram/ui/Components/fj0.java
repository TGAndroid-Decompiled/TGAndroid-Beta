package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class fj0 extends dk0 {
    public boolean f35243c;
    public boolean d;
    public ArrayList f35244e;
    public ArrayList f35245f;

    public final void E() {
        this.f35243c = false;
        if (!this.d && this.f35244e.isEmpty() && this.f35245f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.kl) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f35243c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i7) {
        if (!this.f35243c) {
            super.g(i7);
        }
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList = this.f35244e;
        if (!this.f35243c) {
            super.i(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }

    @Override
    public void k(int i7, int i10) {
        if (!this.f35243c) {
            super.k(i7, i10);
        }
    }

    @Override
    public void o(int i7, int i10) {
        ArrayList arrayList = this.f35244e;
        if (!this.f35243c) {
            super.o(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f35245f;
        if (!this.f35243c) {
            super.p(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void s(int i7) {
        ArrayList arrayList = this.f35245f;
        if (!this.f35243c) {
            super.s(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }
}
