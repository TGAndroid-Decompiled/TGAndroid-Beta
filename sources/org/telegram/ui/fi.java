package org.telegram.ui;
public final class fi implements org.telegram.messenger.fs {
    public final int f47671a;
    public final bi.t4 f47672b;
    public final bn f47673c;
    public final bn d;

    public fi(bn bnVar, int i7, bi.t4 t4Var, bn bnVar2) {
        this.d = bnVar;
        this.f47671a = i7;
        this.f47672b = t4Var;
        this.f47673c = bnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47671a) {
            this.f47672b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.f47673c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.h2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
