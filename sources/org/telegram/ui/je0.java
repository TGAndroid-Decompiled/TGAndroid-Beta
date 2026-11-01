package org.telegram.ui;

import android.content.Context;
public final class je0 extends lc0 {
    public final int e;
    public final org.telegram.ui.Components.av0 f38374f;

    public je0(le0 le0Var, Context context, int i10) {
        super(le0Var.f39259u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f38374f = le0Var;
                super(le0Var.f39259u0, context);
                return;
            default:
                this.f38374f = le0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((le0) this.f38374f).f39247k0;
            case 1:
                return ((le0) this.f38374f).f39247k0;
            default:
                return ((kd0) this.f38374f).M;
        }
    }

    @Override
    public final boolean b() {
        je0 je0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    le0 le0Var = (le0) this.f38374f;
                    if (le0Var.f39234a0 <= 0 || le0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                le0 le0Var2 = (le0) this.f38374f;
                if (isClickable() && getVisibility() == 0 && !le0Var2.f39242f0 && (((je0Var = le0Var2.f39260w) == null || je0Var.getVisibility() == 8) && !le0Var2.f39247k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    kd0 kd0Var = (kd0) this.f38374f;
                    if (kd0Var.P <= 0 || kd0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public je0(kd0 kd0Var, Context context) {
        super(kd0Var.f38841a0, context);
        this.e = 2;
        this.f38374f = kd0Var;
    }
}
