package org.telegram.ui.Components;
public final class om0 extends f2.s {
    public final sm0 f31413b;

    public om0(sm0 sm0Var) {
        this.f31413b = sm0Var;
    }

    @Override
    public final boolean a(int i9, int i10) {
        sm0 sm0Var = this.f31413b;
        return ((pm0) sm0Var.f32523n.get(i9)).equals(sm0Var.f32524r.get(i10));
    }

    @Override
    public final boolean b(int i9, int i10) {
        sm0 sm0Var = this.f31413b;
        if (((pm0) sm0Var.f32523n.get(i9)).f31693a.h == ((pm0) sm0Var.f32524r.get(i10)).f31693a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f31413b.f32524r.size();
    }

    @Override
    public final int e() {
        return this.f31413b.f32523n.size();
    }
}
