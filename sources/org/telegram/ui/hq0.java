package org.telegram.ui;

import android.text.Editable;
public final class hq0 implements cr0 {
    public final mq0 f38497a;

    public hq0(mq0 mq0Var) {
        this.f38497a = mq0Var;
    }

    @Override
    public final void a() {
        mq0 mq0Var = this.f38497a;
        if (mq0Var.f40108b.size() == 0) {
            mq0Var.Q.setPivotX(0.0f);
            mq0Var.Q.setPivotY(0.0f);
            mq0Var.W(false);
            return;
        }
        mq0Var.Q.invalidate();
        mq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        mq0 mq0Var = this.f38497a;
        org.telegram.ui.Components.cv cvVar = mq0Var.M;
        mq0Var.f40107a = editable;
        cvVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        mq0 mq0Var = this.f38497a;
        mq0Var.removeSelfFromStack();
        if (!z10) {
            mq0Var.V(mq0Var.f40108b, mq0Var.f40109c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
