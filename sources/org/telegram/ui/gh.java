package org.telegram.ui;
public final class gh implements Runnable {
    public final int f46004a = 1;
    public final an f46005b;
    public final int f46006c;
    public final org.telegram.messenger.ij d;

    public gh(an anVar, int i7, org.telegram.messenger.ij ijVar) {
        this.f46005b = anVar;
        this.f46006c = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f46004a;
        org.telegram.messenger.ij ijVar = this.d;
        int i10 = this.f46006c;
        an anVar = this.f46005b;
        switch (i7) {
            case 0:
                anVar.B4 = null;
                ijVar.f23262k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i10).o0(false);
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
        }
    }

    public gh(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46005b = anVar;
        this.d = ijVar;
        this.f46006c = i7;
    }
}
