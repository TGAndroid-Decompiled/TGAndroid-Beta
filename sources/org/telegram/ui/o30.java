package org.telegram.ui;
public final class o30 implements Runnable {
    public final int f50515a;
    public final p30 f50516b;

    public o30(p30 p30Var, int i7) {
        this.f50515a = i7;
        this.f50516b = p30Var;
    }

    @Override
    public final void run() {
        switch (this.f50515a) {
            case 0:
                p30 p30Var = this.f50516b;
                tv tvVar = p30Var.f50815b;
                if (tvVar != null) {
                    tvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.h3(new o30(p30Var, 2), 16L);
                return;
            case 1:
                tv tvVar2 = this.f50516b.f50815b;
                if (tvVar2 != null) {
                    tvVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
