package org.telegram.ui;

public final class l9 implements o1.g {

    public final int f39991a;

    public final t9 f39992b;

    public l9(t9 t9Var, int i10) {
        this.f39991a = i10;
        this.f39992b = t9Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f39991a) {
            case 0:
                t9 t9Var = this.f39992b;
                t9Var.f42829y = f10 / 500.0f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                t9 t9Var2 = this.f39992b;
                t9Var2.W = t9Var2.I ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                t9Var2.fragmentView.invalidate();
                break;
        }
    }
}
