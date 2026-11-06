package org.telegram.ui;
public final class gh implements Runnable {
    public final int f45976a = 1;
    public final an f45977b;
    public final int f45978c;
    public final org.telegram.messenger.ij d;

    public gh(an anVar, int i7, org.telegram.messenger.ij ijVar) {
        this.f45977b = anVar;
        this.f45978c = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45976a;
        org.telegram.messenger.ij ijVar = this.d;
        int i10 = this.f45978c;
        an anVar = this.f45977b;
        switch (i7) {
            case 0:
                anVar.B4 = null;
                ijVar.f23237k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i10).o0(false);
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
        }
    }

    public gh(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f45977b = anVar;
        this.d = ijVar;
        this.f45978c = i7;
    }
}
