package org.telegram.ui.Components;

import java.util.ArrayList;

public abstract class dk0 extends yk0 {

    public boolean f27786c;
    public boolean d;

    public ArrayList f27787e;

    public ArrayList f27788f;

    public final void E() {
        this.f27786c = false;
        if (!this.d && this.f27787e.isEmpty() && this.f27788f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.dm) this).O(false);
    }

    @Override
    public void l() {
        if (this.f27786c) {
            this.d = true;
        } else {
            super.l();
        }
    }

    @Override
    public void m(int i10) {
        if (this.f27786c) {
            return;
        }
        super.m(i10);
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f27787e;
        if (!this.f27786c) {
            super.o(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }

    @Override
    public void q(int i10, int i11) {
        if (this.f27786c) {
            return;
        }
        super.q(i10, i11);
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f27787e;
        if (!this.f27786c) {
            super.s(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f27788f;
        if (!this.f27786c) {
            super.t(i10, i11);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f27788f;
        if (!this.f27786c) {
            super.u(i10);
        } else {
            arrayList.add(Integer.valueOf(i10));
            arrayList.add(1);
        }
    }
}
