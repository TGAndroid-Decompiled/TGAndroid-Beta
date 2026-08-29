package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class mk0 extends il0 {
    public boolean f30718c;
    public boolean d;
    public ArrayList f30719e;
    public ArrayList f30720f;

    public final void E() {
        this.f30718c = false;
        if (!this.d && this.f30719e.isEmpty() && this.f30720f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.em) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f30718c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f30718c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f30719e;
        if (!this.f30718c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f30718c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f30719e;
        if (!this.f30718c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f30720f;
        if (!this.f30718c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f30720f;
        if (!this.f30718c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
