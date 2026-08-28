package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class bk0 extends vk0 {
    public boolean f27230c;
    public boolean d;
    public ArrayList f27231e;
    public ArrayList f27232f;

    public final void E() {
        this.f27230c = false;
        if (!this.d && this.f27231e.isEmpty() && this.f27232f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.bm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f27230c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i9) {
        if (!this.f27230c) {
            super.m(i9);
        }
    }

    @Override
    public void o(int i9) {
        ArrayList arrayList = this.f27231e;
        if (!this.f27230c) {
            super.o(i9);
            return;
        }
        arrayList.add(Integer.valueOf(i9));
        arrayList.add(1);
    }

    @Override
    public void q(int i9, int i10) {
        if (!this.f27230c) {
            super.q(i9, i10);
        }
    }

    @Override
    public void s(int i9, int i10) {
        ArrayList arrayList = this.f27231e;
        if (!this.f27230c) {
            super.s(i9, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i9));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void t(int i9, int i10) {
        ArrayList arrayList = this.f27232f;
        if (!this.f27230c) {
            super.t(i9, i10);
            return;
        }
        arrayList.add(Integer.valueOf(i9));
        arrayList.add(Integer.valueOf(i10));
    }

    @Override
    public void u(int i9) {
        ArrayList arrayList = this.f27232f;
        if (!this.f27230c) {
            super.u(i9);
            return;
        }
        arrayList.add(Integer.valueOf(i9));
        arrayList.add(1);
    }
}
