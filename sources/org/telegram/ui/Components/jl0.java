package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class jl0 extends hm0 {
    public boolean f27557c;
    public boolean d;
    public ArrayList e;
    public ArrayList f27558f;

    public final void E() {
        this.f27557c = false;
        if (!this.d && this.e.isEmpty() && this.f27558f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.dm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f27557c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f27557c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.e;
        if (!this.f27557c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f27557c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.e;
        if (!this.f27557c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f27558f;
        if (!this.f27557c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f27558f;
        if (!this.f27557c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
