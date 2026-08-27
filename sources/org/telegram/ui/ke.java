package org.telegram.ui;

public final class ke implements Runnable {

    public final int f39704a;

    public final org.telegram.ui.Components.ol0 f39705b;

    public ke(org.telegram.ui.Components.ol0 ol0Var, int i10) {
        this.f39704a = i10;
        this.f39705b = ol0Var;
    }

    @Override
    public final void run() {
        switch (this.f39704a) {
            case 0:
                org.telegram.ui.Components.ol0 ol0Var = this.f39705b;
                if (!ol0Var.I) {
                    ol0Var.I = true;
                    ol0Var.c(new org.telegram.ui.Components.ml0(ol0Var, 0), false);
                    ol0Var.f31355s.invalidate();
                    break;
                }
                break;
            default:
                this.f39705b.dismiss();
                break;
        }
    }
}
