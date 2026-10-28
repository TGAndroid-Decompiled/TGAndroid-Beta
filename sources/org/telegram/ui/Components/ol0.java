package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class ol0 extends mm0 {
    public boolean f31340c;
    public boolean d;
    public ArrayList e;
    public ArrayList f31341f;

    public final void E() {
        this.f31340c = false;
        if (!this.d && this.e.isEmpty() && this.f31341f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.hm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f31340c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f31340c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.e;
        if (!this.f31340c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f31340c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.f31340c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f31341f;
        if (!this.f31340c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f31341f;
        if (!this.f31340c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
