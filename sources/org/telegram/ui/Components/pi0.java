package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class pi0 extends oj0 {
    public boolean f37024c;
    public boolean d;
    public ArrayList f37025e;
    public ArrayList f37026f;

    public final void E() {
        this.f37024c = false;
        if (!this.d && this.f37025e.isEmpty() && this.f37026f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.jl) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f37024c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i7) {
        if (!this.f37024c) {
            super.g(i7);
        }
    }

    @Override
    public void i(int i7) {
        ArrayList arrayList = this.f37025e;
        if (!this.f37024c) {
            super.i(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }

    @Override
    public void k(int i7, int i10) {
        if (!this.f37024c) {
            super.k(i7, i10);
        }
    }

    @Override
    public void o(int i7, int i10) {
        ArrayList arrayList = this.f37025e;
        if (!this.f37024c) {
            super.o(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void p(int i7, int i10) {
        ArrayList arrayList = this.f37026f;
        if (!this.f37024c) {
            super.p(i7, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void s(int i7) {
        ArrayList arrayList = this.f37026f;
        if (!this.f37024c) {
            super.s(i7);
            return;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(1);
    }
}
