package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class sl0 extends qm0 {
    public boolean f30895c;
    public boolean d;
    public ArrayList f30896e;
    public ArrayList f30897f;

    public final void E() {
        this.f30895c = false;
        if (!this.d && this.f30896e.isEmpty() && this.f30897f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.mm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f30895c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f30895c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f30896e;
        if (!this.f30895c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f30895c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f30896e;
        if (!this.f30895c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f30897f;
        if (!this.f30895c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f30897f;
        if (!this.f30895c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
