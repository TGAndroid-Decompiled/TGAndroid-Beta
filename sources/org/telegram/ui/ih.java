package org.telegram.ui;
public final class ih implements Runnable {
    public final int f46665a = 1;
    public final cn f46666b;
    public final int f46667c;
    public final org.telegram.messenger.ij d;

    public ih(cn cnVar, int i7, org.telegram.messenger.ij ijVar) {
        this.f46666b = cnVar;
        this.f46667c = i7;
        this.d = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f46665a;
        org.telegram.messenger.ij ijVar = this.d;
        int i10 = this.f46667c;
        cn cnVar = this.f46666b;
        switch (i7) {
            case 0:
                cnVar.B4 = null;
                ijVar.f23262k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i10).o0(false);
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
        }
    }

    public ih(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46666b = cnVar;
        this.d = ijVar;
        this.f46667c = i7;
    }
}
