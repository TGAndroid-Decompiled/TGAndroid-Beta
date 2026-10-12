package org.telegram.ui.Components;

import java.util.ArrayList;
public abstract class xl0 extends vm0 {
    public boolean f32798c;
    public boolean d;
    public ArrayList f32799e;
    public ArrayList f32800f;

    public final void E() {
        this.f32798c = false;
        if (!this.d && this.f32799e.isEmpty() && this.f32800f.isEmpty()) {
            return;
        }
        ((org.telegram.ui.qm) this).O(false);
    }

    @Override
    public void l() {
        if (!this.f32798c) {
            super.l();
        } else {
            this.d = true;
        }
    }

    @Override
    public void m(int i10) {
        if (!this.f32798c) {
            super.m(i10);
        }
    }

    @Override
    public void o(int i10) {
        ArrayList arrayList = this.f32799e;
        if (!this.f32798c) {
            super.o(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }

    @Override
    public void q(int i10, int i11) {
        if (!this.f32798c) {
            super.q(i10, i11);
        }
    }

    @Override
    public void s(int i10, int i11) {
        ArrayList arrayList = this.f32799e;
        if (!this.f32798c) {
            super.s(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void t(int i10, int i11) {
        ArrayList arrayList = this.f32800f;
        if (!this.f32798c) {
            super.t(i10, i11);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(Integer.valueOf(i11));
    }

    @Override
    public void u(int i10) {
        ArrayList arrayList = this.f32800f;
        if (!this.f32798c) {
            super.u(i10);
            return;
        }
        arrayList.add(Integer.valueOf(i10));
        arrayList.add(1);
    }
}
