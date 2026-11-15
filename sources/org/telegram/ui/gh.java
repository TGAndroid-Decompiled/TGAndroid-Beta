package org.telegram.ui;
public final class gh implements Runnable {
    public final int f47441a = 1;
    public final an f47442b;
    public final int f47443c;
    public final org.telegram.messenger.gj d;

    public gh(an anVar, int i7, org.telegram.messenger.gj gjVar) {
        this.f47442b = anVar;
        this.f47443c = i7;
        this.d = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47441a;
        org.telegram.messenger.gj gjVar = this.d;
        int i10 = this.f47443c;
        an anVar = this.f47442b;
        switch (i7) {
            case 0:
                anVar.C4 = null;
                gjVar.f23819k.replies.read_max_id = i10;
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
        this.f47442b = anVar;
        this.d = gjVar;
        this.f47443c = i7;
    }
}
