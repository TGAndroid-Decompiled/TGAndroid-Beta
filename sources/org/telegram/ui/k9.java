package org.telegram.ui;
public final class k9 implements o1.g {
    public final int f39773a;
    public final s9 f39774b;

    public k9(s9 s9Var, int i9) {
        this.f39773a = i9;
        this.f39774b = s9Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        float f12;
        switch (this.f39773a) {
            case 0:
                s9 s9Var = this.f39774b;
                s9Var.f42604y = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                s9 s9Var2 = this.f39774b;
                if (s9Var2.I) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                s9Var2.W = f12;
                s9Var2.fragmentView.invalidate();
                return;
        }
    }
}
