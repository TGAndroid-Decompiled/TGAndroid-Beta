package org.telegram.ui.ActionBar;
public final class h0 implements Runnable {
    public final int f23464a;
    public final w0 f23465b;
    public final int f23466c;

    public h0(w0 w0Var, int i10, int i11) {
        this.f23464a = i11;
        this.f23465b = w0Var;
        this.f23466c = i10;
    }

    @Override
    public final void run() {
        switch (this.f23464a) {
            case 0:
                w0 w0Var = this.f23465b;
                if (w0Var.f23915b.getSwipeBack() != null) {
                    w0Var.f23915b.getSwipeBack().e(this.f23466c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f23465b;
                if (w0Var2.f23915b.getSwipeBack() != null) {
                    w0Var2.f23915b.getSwipeBack().e(this.f23466c);
                    return;
                }
                return;
        }
    }
}
