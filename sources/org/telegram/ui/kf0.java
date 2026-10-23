package org.telegram.ui;

import android.content.Context;
public final class kf0 extends gd0 {
    public final int e;
    public final org.telegram.ui.Components.tw0 f38941f;

    public kf0(mf0 mf0Var, Context context, int i10) {
        super(mf0Var.f39562u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f38941f = mf0Var;
                super(mf0Var.f39562u0, context);
                return;
            default:
                this.f38941f = mf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((mf0) this.f38941f).f39550k0;
            case 1:
                return ((mf0) this.f38941f).f39550k0;
            default:
                return ((je0) this.f38941f).M;
        }
    }

    @Override
    public final boolean b() {
        kf0 kf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    mf0 mf0Var = (mf0) this.f38941f;
                    if (mf0Var.f39537a0 <= 0 || mf0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                mf0 mf0Var2 = (mf0) this.f38941f;
                if (isClickable() && getVisibility() == 0 && !mf0Var2.f39545f0 && (((kf0Var = mf0Var2.v) == null || kf0Var.getVisibility() == 8) && !mf0Var2.f39550k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    je0 je0Var = (je0) this.f38941f;
                    if (je0Var.P <= 0 || je0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public kf0(je0 je0Var, Context context) {
        super(je0Var.f38540a0, context);
        this.e = 2;
        this.f38941f = je0Var;
    }
}
