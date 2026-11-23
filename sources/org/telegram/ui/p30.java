package org.telegram.ui;
public final class p30 implements Runnable {
    public final int f50715a;
    public final q30 f50716b;

    public p30(q30 q30Var, int i7) {
        this.f50715a = i7;
        this.f50716b = q30Var;
    }

    @Override
    public final void run() {
        switch (this.f50715a) {
            case 0:
                q30 q30Var = this.f50716b;
                uv uvVar = q30Var.f51046b;
                if (uvVar != null) {
                    uvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.h3(new p30(q30Var, 2), 16L);
                return;
            case 1:
                uv uvVar2 = this.f50716b.f51046b;
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
