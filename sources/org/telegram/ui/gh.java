package org.telegram.ui;
public final class gh implements Runnable {
    public final int f47451a = 1;
    public final an f47452b;
    public final int f47453c;
    public final org.telegram.messenger.gj d;

    public gh(an anVar, int i7, org.telegram.messenger.gj gjVar) {
        this.f47452b = anVar;
        this.f47453c = i7;
        this.d = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47451a;
        org.telegram.messenger.gj gjVar = this.d;
        int i10 = this.f47453c;
        an anVar = this.f47452b;
        switch (i7) {
            case 0:
                anVar.C4 = null;
                gjVar.f23817k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.np.s1(i10).o0(false);
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                return;
        }
    }

    public gh(an anVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f47452b = anVar;
        this.d = gjVar;
        this.f47453c = i7;
    }
}
