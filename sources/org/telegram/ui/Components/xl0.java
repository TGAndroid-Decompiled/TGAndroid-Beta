package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class xl0 extends vm0 {
    public boolean f32808c;
    public boolean d;
    public ArrayList f32809e;
    public ArrayList f32810f;

    public final void E() {
        this.f32808c = false;
        if (!this.d && this.f32809e.isEmpty() && this.f32810f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.qm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f32808c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f32808c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f32809e;
        if (!this.f32808c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f32808c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f32809e;
        if (!this.f32808c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f32810f;
        if (!this.f32808c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f32810f;
        if (!this.f32808c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
