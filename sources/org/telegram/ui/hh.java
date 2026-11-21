package org.telegram.ui;
public final class hh implements Runnable {
    public final int f48393a = 1;
    public final bn f48394b;
    public final int f48395c;
    public final org.telegram.messenger.fj d;

    public hh(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
        this.f48394b = bnVar;
        this.f48395c = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48393a;
        org.telegram.messenger.fj fjVar = this.d;
        int i10 = this.f48395c;
        bn bnVar = this.f48394b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                fjVar.f23993k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.mp.u1(i10).p0(false);
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
        }
    }

    public hh(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.f48394b = bnVar;
        this.d = fjVar;
        this.f48395c = i7;
    }
}
