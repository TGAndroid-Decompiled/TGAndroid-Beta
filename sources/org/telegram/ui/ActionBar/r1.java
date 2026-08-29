package org.telegram.ui.ActionBar;
public final class r1 implements Runnable {
    public final int f23769a;
    public final c2 f23770b;

    public r1(c2 c2Var, int i10) {
        this.f23769a = i10;
        this.f23770b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f23769a) {
            case 0:
                this.f23770b.dismiss();
                return;
            default:
                c2 c2Var = this.f23770b;
                if (!c2Var.isShowing()) {
                    try {
                        c2Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
