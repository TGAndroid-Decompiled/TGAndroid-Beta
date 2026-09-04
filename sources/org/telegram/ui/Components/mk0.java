package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class mk0 extends kl0 {
    public boolean f28462c;
    public boolean d;
    public ArrayList f28463e;
    public ArrayList f28464f;

    public final void E() {
        this.f28462c = false;
        if (!this.d && this.f28463e.isEmpty() && this.f28464f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.om) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f28462c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f28462c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f28463e;
        if (!this.f28462c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f28462c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f28463e;
        if (!this.f28462c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f28464f;
        if (!this.f28462c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f28464f;
        if (!this.f28462c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
