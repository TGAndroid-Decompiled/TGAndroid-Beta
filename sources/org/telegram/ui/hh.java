package org.telegram.ui;
public final class hh implements Runnable {
    public final int f48397a = 1;
    public final bn f48398b;
    public final int f48399c;
    public final org.telegram.messenger.gj d;

    public hh(bn bnVar, int i7, org.telegram.messenger.gj gjVar) {
        this.f48398b = bnVar;
        this.f48399c = i7;
        this.d = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48397a;
        org.telegram.messenger.gj gjVar = this.d;
        int i10 = this.f48399c;
        bn bnVar = this.f48398b;
        switch (i7) {
            case 0:
                bnVar.D4 = null;
                gjVar.f24213k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                org.telegram.messenger.np.u1(i10).p0(false);
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                return;
        }
    }

    public hh(bn bnVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f48398b = bnVar;
        this.d = gjVar;
        this.f48399c = i7;
    }
}
