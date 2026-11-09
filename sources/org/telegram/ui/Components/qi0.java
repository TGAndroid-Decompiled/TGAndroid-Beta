package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class qi0 extends pj0 {
    public boolean f37343c;
    public boolean d;
    public ArrayList f37344e;
    public ArrayList f37345f;

    public final void E() {
        this.f37343c = false;
        if (!this.d && this.f37344e.isEmpty() && this.f37345f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.ll) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f37343c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i7) {
        if (!this.f37343c) {
            super.g(i7);
        }
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList = this.f37344e;
        if (!this.f37343c) {
            super.i(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }

    @Override
    public void k(int i7, int i10) {
        if (!this.f37343c) {
            super.k(i7, i10);
        }
    }

    @Override
    public void o(int i7, int i10) {
        ArrayList arrayList = this.f37344e;
        if (!this.f37343c) {
            super.o(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f37345f;
        if (!this.f37343c) {
            super.p(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void s(int i7) {
        ArrayList arrayList = this.f37345f;
        if (!this.f37343c) {
            super.s(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }
}
