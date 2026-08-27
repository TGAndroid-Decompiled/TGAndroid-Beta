package org.telegram.ui;

import android.content.Context;

public final class kf0 extends org.telegram.ui.Components.voip.m2 {

    public final int f39712e;

    public final org.telegram.ui.Components.ev0 f39713f;

    public kf0(mf0 mf0Var, Context context, int i10) {
        super(mf0Var.f40497o0, context);
        this.f39712e = i10;
        switch (i10) {
            case 1:
                this.f39713f = mf0Var;
                super(mf0Var.f40497o0, context);
                break;
            default:
                this.f39713f = mf0Var;
                break;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f39712e) {
            case 0:
                return ((mf0) this.f39713f).f40486e0;
            case 1:
                return ((mf0) this.f39713f).f40486e0;
            default:
                return ((je0) this.f39713f).I;
        }
    }

    @Override
    public final boolean b() {
        kf0 kf0Var;
        switch (this.f39712e) {
            case 0:
                if (getVisibility() == 0) {
                    mf0 mf0Var = (mf0) this.f39713f;
                    if (mf0Var.R <= 0 || mf0Var.N == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                mf0 mf0Var2 = (mf0) this.f39713f;
                return isClickable() && getVisibility() == 0 && !mf0Var2.W && ((kf0Var = mf0Var2.v) == null || kf0Var.getVisibility() == 8) && !mf0Var2.f40486e0;
            default:
                if (getVisibility() == 0) {
                    je0 je0Var = (je0) this.f39713f;
                    if (je0Var.L <= 0 || je0Var.J == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public kf0(je0 je0Var, Context context) {
        super(je0Var.T, context);
        this.f39712e = 2;
        this.f39713f = je0Var;
    }
}
