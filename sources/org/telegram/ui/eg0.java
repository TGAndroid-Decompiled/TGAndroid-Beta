package org.telegram.ui;
public final class eg0 implements Runnable {
    public final int f33807a;
    public final og0 f33808b;

    public eg0(og0 og0Var, int i10) {
        this.f33807a = i10;
        this.f33808b = og0Var;
    }

    @Override
    public final void run() {
        switch (this.f33807a) {
            case 0:
                og0 og0Var = this.f33808b;
                sj0 sj0Var = og0Var.f36796a;
                pg0 pg0Var = og0Var.S;
                lg0 lg0Var = og0Var.f36797b;
                if (lg0Var != null) {
                    if (pg0Var.Z) {
                        sj0Var.clearFocus();
                        lg0Var.clearFocus();
                    } else if (sj0Var.length() != 0) {
                        lg0Var.requestFocus();
                        if (!og0Var.O) {
                            lg0Var.setSelection(lg0Var.length());
                        }
                        pg0.T0(pg0Var, lg0Var);
                    } else {
                        sj0Var.requestFocus();
                        pg0.T0(pg0Var, sj0Var);
                    }
                }
                if (pg0Var.C == 0) {
                    og0Var.t(false);
                    return;
                }
                return;
            case 1:
                og0 og0Var2 = this.f33808b;
                og0Var2.postDelayed(new eg0(og0Var2, 2), 200L);
                return;
            case 2:
                this.f33808b.h(null);
                return;
            case 3:
                this.f33808b.t(true);
                return;
            default:
                og0 og0Var3 = this.f33808b;
                pg0.T0(og0Var3.S, og0Var3.f36797b);
                return;
        }
    }
}
