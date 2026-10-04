package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class zk0 extends yl0 {
    public boolean f33515c;
    public boolean d;
    public ArrayList f33516e;
    public ArrayList f33517f;

    public final void E() {
        this.f33515c = false;
        if (!this.d && this.f33516e.isEmpty() && this.f33517f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.jm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f33515c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f33515c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f33516e;
        if (!this.f33515c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f33515c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f33516e;
        if (!this.f33515c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f33517f;
        if (!this.f33515c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f33517f;
        if (!this.f33515c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
