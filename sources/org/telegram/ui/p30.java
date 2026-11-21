package org.telegram.ui;
public final class p30 implements Runnable {
    public final int f50711a;
    public final q30 f50712b;

    public p30(q30 q30Var, int i7) {
        this.f50711a = i7;
        this.f50712b = q30Var;
    }

    @Override
    public final void run() {
        switch (this.f50711a) {
            case 0:
                q30 q30Var = this.f50712b;
                uv uvVar = q30Var.f51042b;
                if (uvVar != null) {
                    uvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.h3(new p30(q30Var, 2), 16L);
                return;
            case 1:
                uv uvVar2 = this.f50712b.f51042b;
                if (uvVar2 != null) {
                    uvVar2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
