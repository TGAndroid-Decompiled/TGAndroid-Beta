package org.telegram.ui;
public final class ch implements Runnable {
    public final int f44352a = 1;
    public final wm f44353b;
    public final int f44354c;
    public final org.telegram.messenger.zi d;

    public ch(wm wmVar, int i3, org.telegram.messenger.zi ziVar) {
        this.f44353b = wmVar;
        this.f44354c = i3;
        this.d = ziVar;
    }

    @Override
    public final void run() {
        int i3 = this.f44352a;
        org.telegram.messenger.zi ziVar = this.d;
        int i10 = this.f44354c;
        wm wmVar = this.f44353b;
        switch (i3) {
            case 0:
                wmVar.C4 = null;
                ziVar.f26868k.replies.read_max_id = i10;
                return;
            default:
                org.telegram.ui.Components.fc.a0(wmVar).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.hp.s1(i10).o0(false);
                wmVar.eb(ziVar);
                wmVar.gb(ziVar);
                return;
        }
    }

    public ch(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.f44353b = wmVar;
        this.d = ziVar;
        this.f44354c = i3;
    }
}
