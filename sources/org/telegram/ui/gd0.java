package org.telegram.ui;

import android.content.Context;
public final class gd0 extends fb0 {
    public final int f45977e;
    public final org.telegram.ui.Components.yt0 f45978f;

    public gd0(id0 id0Var, Context context, int i7) {
        super(id0Var.f46649u0, context);
        this.f45977e = i7;
        switch (i7) {
            case 1:
                this.f45978f = id0Var;
                super(id0Var.f46649u0, context);
                return;
            default:
                this.f45978f = id0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f45977e) {
            case 0:
                return ((id0) this.f45978f).f46637k0;
            case 1:
                return ((id0) this.f45978f).f46637k0;
            default:
                return ((gc0) this.f45978f).M;
        }
    }

    @Override
    public final boolean b() {
        gd0 gd0Var;
        switch (this.f45977e) {
            case 0:
                if (getVisibility() == 0) {
                    id0 id0Var = (id0) this.f45978f;
                    if (id0Var.f46623a0 <= 0 || id0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                id0 id0Var2 = (id0) this.f45978f;
                if (isClickable() && getVisibility() == 0 && !id0Var2.f46632f0 && (((gd0Var = id0Var2.f46650w) == null || gd0Var.getVisibility() == 8) && !id0Var2.f46637k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    gc0 gc0Var = (gc0) this.f45978f;
                    if (gc0Var.P <= 0 || gc0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public gd0(gc0 gc0Var, Context context) {
        super(gc0Var.f45963a0, context);
        this.f45977e = 2;
        this.f45978f = gc0Var;
    }
}
