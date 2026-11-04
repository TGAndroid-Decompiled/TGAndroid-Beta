package org.telegram.ui;
public final class nd0 implements Runnable {
    public final int f47976a;
    public final wd0 f47977b;

    public nd0(wd0 wd0Var, int i3) {
        this.f47976a = i3;
        this.f47977b = wd0Var;
    }

    @Override
    public final void run() {
        switch (this.f47976a) {
            case 0:
                wd0 wd0Var = this.f47977b;
                ud0 ud0Var = wd0Var.f50782a;
                xd0 xd0Var = wd0Var.f50785b0;
                ud0 ud0Var2 = wd0Var.f50784b;
                if (ud0Var2 != null) {
                    if (xd0Var.f51952d0) {
                        ud0Var.clearFocus();
                        ud0Var2.clearFocus();
                    } else if (ud0Var.length() != 0) {
                        ud0Var2.requestFocus();
                        if (!wd0Var.U) {
                            ud0Var2.setSelection(ud0Var2.length());
                        }
                        xd0.a1(xd0Var, ud0Var2);
                    } else {
                        ud0Var.requestFocus();
                        xd0.a1(xd0Var, ud0Var);
                    }
                }
                if (xd0Var.G == 0) {
                    wd0Var.r(false);
                    return;
                }
                return;
            case 1:
                wd0 wd0Var2 = this.f47977b;
                wd0Var2.postDelayed(new nd0(wd0Var2, 2), 200L);
                return;
            case 2:
                this.f47977b.h(null);
                return;
            case 3:
                this.f47977b.r(true);
                return;
            default:
                wd0 wd0Var3 = this.f47977b;
                xd0.a1(wd0Var3.f50785b0, wd0Var3.f50784b);
                return;
        }
    }
}
