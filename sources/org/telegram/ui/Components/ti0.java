package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class ti0 extends sj0 {
    public boolean f38421c;
    public boolean d;
    public ArrayList f38422e;
    public ArrayList f38423f;

    public final void E() {
        this.f38421c = false;
        if (!this.d && this.f38422e.isEmpty() && this.f38423f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.fl) this).O(false);
    }

    @Override
    public void f() {
        if (!this.f38421c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i3) {
        if (!this.f38421c) {
            super.g(i3);
        }
    }

    @Override
    public void i(int i3) {
        ArrayList arrayList = this.f38422e;
        if (!this.f38421c) {
            super.i(i3);
            return;
        }
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(1);
    }

    @Override
    public void k(int i3, int i10) {
        if (!this.f38421c) {
            super.k(i3, i10);
        }
    }

    @Override
    public void o(int i3, int i10) {
        ArrayList arrayList = this.f38422e;
        if (!this.f38421c) {
            super.o(i3, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void p(int i3, int i10) {
        ArrayList arrayList = this.f38423f;
        if (!this.f38421c) {
            super.p(i3, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void s(int i3) {
        ArrayList arrayList = this.f38423f;
        if (!this.f38421c) {
            super.s(i3);
            return;
        }
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(1);
    }
}
