package org.telegram.ui;
public final class m30 implements Runnable {
    public final int f49099a;
    public final n30 f49100b;

    public m30(n30 n30Var, int i7) {
        this.f49099a = i7;
        this.f49100b = n30Var;
    }

    @Override
    public final void run() {
        switch (this.f49099a) {
            case 0:
                n30 n30Var = this.f49100b;
                rv rvVar = n30Var.f49433b;
                if (rvVar != null) {
                    rvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                return;
            case 1:
                rv rvVar2 = this.f49100b.f49433b;
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
