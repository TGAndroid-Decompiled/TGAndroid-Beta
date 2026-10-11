package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class tl0 extends rm0 {
    public boolean f31118c;
    public boolean d;
    public ArrayList f31119e;
    public ArrayList f31120f;

    public final void E() {
        this.f31118c = false;
        if (!this.d && this.f31119e.isEmpty() && this.f31120f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.mm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f31118c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f31118c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f31119e;
        if (!this.f31118c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f31118c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f31119e;
        if (!this.f31118c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f31120f;
        if (!this.f31118c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f31120f;
        if (!this.f31118c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
