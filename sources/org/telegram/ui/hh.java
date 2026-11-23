package org.telegram.ui;
public final class hh implements Runnable {
    public final int f48552a = 1;
    public final bn f48553b;
    public final int f48554c;
    public final org.telegram.messenger.fj d;

    public hh(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
        this.f48553b = bnVar;
        this.f48554c = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48552a;
        org.telegram.messenger.fj fjVar = this.d;
        int i10 = this.f48554c;
        bn bnVar = this.f48553b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                fjVar.f24073k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.kc.b0(bnVar).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.mp.u1(i10).p0(false);
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
        }
    }

    public hh(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.f48553b = bnVar;
        this.d = fjVar;
        this.f48554c = i7;
    }
}
