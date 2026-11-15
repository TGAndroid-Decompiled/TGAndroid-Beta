package org.telegram.ui;
public final class m30 implements Runnable {
    public final int f49095a;
    public final n30 f49096b;

    public m30(n30 n30Var, int i7) {
        this.f49095a = i7;
        this.f49096b = n30Var;
    }

    @Override
    public final void run() {
        switch (this.f49095a) {
            case 0:
                n30 n30Var = this.f49096b;
                rv rvVar = n30Var.f49432b;
                if (rvVar != null) {
                    rvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                return;
            case 1:
                rv rvVar2 = this.f49096b.f49432b;
                if (rvVar2 != null) {
                    rvVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
