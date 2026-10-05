package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class zk0 extends yl0 {
    public boolean f33523c;
    public boolean d;
    public ArrayList f33524e;
    public ArrayList f33525f;

    public final void E() {
        this.f33523c = false;
        if (!this.d && this.f33524e.isEmpty() && this.f33525f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.jm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f33523c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f33523c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f33524e;
        if (!this.f33523c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f33523c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f33524e;
        if (!this.f33523c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f33525f;
        if (!this.f33523c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f33525f;
        if (!this.f33523c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
