package org.telegram.ui;

import android.content.Context;
public final class ke0 extends mc0 {
    public final int e;
    public final org.telegram.ui.Components.zu0 f38785f;

    public ke0(me0 me0Var, Context context, int i10) {
        super(me0Var.f39682u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f38785f = me0Var;
                super(me0Var.f39682u0, context);
                return;
            default:
                this.f38785f = me0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((me0) this.f38785f).f39670k0;
            case 1:
                return ((me0) this.f38785f).f39670k0;
            default:
                return ((ld0) this.f38785f).M;
        }
    }

    @Override
    public final boolean b() {
        ke0 ke0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    me0 me0Var = (me0) this.f38785f;
                    if (me0Var.f39657a0 <= 0 || me0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                me0 me0Var2 = (me0) this.f38785f;
                if (isClickable() && getVisibility() == 0 && !me0Var2.f39665f0 && (((ke0Var = me0Var2.f39683w) == null || ke0Var.getVisibility() == 8) && !me0Var2.f39670k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ld0 ld0Var = (ld0) this.f38785f;
                    if (ld0Var.P <= 0 || ld0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ke0(ld0 ld0Var, Context context) {
        super(ld0Var.f39177a0, context);
        this.e = 2;
        this.f38785f = ld0Var;
    }
}
