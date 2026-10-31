package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class tj0 extends sk0 {
    public boolean f30593c;
    public boolean d;
    public ArrayList e;
    public ArrayList f30594f;

    public final void E() {
        this.f30593c = false;
        if (!this.d && this.e.isEmpty() && this.f30594f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.fm) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f30593c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i10) {
        if (!this.f30593c) {
            super.g(i10);
        }
    }

    @Override
    public void i(int i10) {
        ArrayList arrayList = this.e;
        if (!this.f30593c) {
            super.i(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void k(int i10, int i11) {
        if (!this.f30593c) {
            super.k(i10, i11);
        }
    }

    @Override
    public void o(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.f30593c) {
            super.o(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void p(int i10, int i11) {
        ArrayList arrayList = this.f30594f;
        if (!this.f30593c) {
            super.p(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void s(int i10) {
        ArrayList arrayList = this.f30594f;
        if (!this.f30593c) {
            super.s(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
