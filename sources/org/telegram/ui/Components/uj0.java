package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class uj0 extends tk0 {
    public boolean f30975c;
    public boolean d;
    public ArrayList e;
    public ArrayList f30976f;

    public final void E() {
        this.f30975c = false;
        if (!this.d && this.e.isEmpty() && this.f30976f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.fm) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f30975c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i10) {
        if (!this.f30975c) {
            super.g(i10);
        }
    }

    @Override
    public void i(int i10) {
        ArrayList arrayList = this.e;
        if (!this.f30975c) {
            super.i(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void k(int i10, int i11) {
        if (!this.f30975c) {
            super.k(i10, i11);
        }
    }

    @Override
    public void o(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.f30975c) {
            super.o(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void p(int i10, int i11) {
        ArrayList arrayList = this.f30976f;
        if (!this.f30975c) {
            super.p(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void s(int i10) {
        ArrayList arrayList = this.f30976f;
        if (!this.f30975c) {
            super.s(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
