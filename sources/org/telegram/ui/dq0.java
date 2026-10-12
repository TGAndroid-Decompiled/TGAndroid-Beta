package org.telegram.ui;

import android.view.KeyEvent;
public final class dq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final int f36861a;
    public final mq0 f36862b;

    public dq0(mq0 mq0Var, int i10) {
        this.f36861a = i10;
        this.f36862b = mq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36861a) {
            case 0:
                mq0 mq0Var = this.f36862b;
                mq0Var.V(mq0Var.f40108b, mq0Var.f40109c, z10, i10);
                mq0Var.finishFragment();
                return;
            default:
                mq0 mq0Var2 = this.f36862b;
                mq0Var2.V(mq0Var2.f40108b, mq0Var2.f40109c, z10, i10);
                mq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        mq0 mq0Var = this.f36862b;
        mq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = mq0Var.I) != null && m1Var.isShowing()) {
            mq0Var.I.d(true);
        }
    }
}
