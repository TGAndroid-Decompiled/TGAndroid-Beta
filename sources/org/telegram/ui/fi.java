package org.telegram.ui;
public final class fi implements org.telegram.messenger.fs {
    public final int f47707a;
    public final bi.u4 f47708b;
    public final bn f47709c;
    public final bn d;

    public fi(bn bnVar, int i7, bi.u4 u4Var, bn bnVar2) {
        this.d = bnVar;
        this.f47707a = i7;
        this.f47708b = u4Var;
        this.f47709c = bnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47707a) {
            this.f47708b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.f47709c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.h2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
