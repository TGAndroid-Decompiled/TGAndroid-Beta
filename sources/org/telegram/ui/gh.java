package org.telegram.ui;
public final class gh implements Runnable {
    public final int f48035a = 1;
    public final bn f48036b;
    public final int f48037c;
    public final org.telegram.messenger.fj d;

    public gh(bn bnVar, int i7, org.telegram.messenger.fj fjVar) {
        this.f48036b = bnVar;
        this.f48037c = i7;
        this.d = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48035a;
        org.telegram.messenger.fj fjVar = this.d;
        int i10 = this.f48037c;
        bn bnVar = this.f48036b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                fjVar.f23965k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                org.telegram.messenger.mp.u1(i10).p0(false);
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
        }
    }

    public gh(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.f48036b = bnVar;
        this.d = fjVar;
        this.f48037c = i7;
    }
}
