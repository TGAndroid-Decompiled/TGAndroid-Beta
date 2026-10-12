package org.telegram.ui;
public final class fq0 extends org.telegram.ui.ActionBar.j {
    public final mq0 f37825a;

    public fq0(mq0 mq0Var) {
        this.f37825a = mq0Var;
    }

    @Override
    public final void b(int i10) {
        mq0 mq0Var = this.f37825a;
        if (i10 == -1) {
            mq0Var.finishFragment();
        } else if (i10 == 1) {
            if (mq0Var.V != null) {
                mq0Var.finishFragment(false);
                mq0Var.V.b();
            }
        } else if (i10 == 2) {
            mq0.U(mq0Var, null);
        }
    }
}
