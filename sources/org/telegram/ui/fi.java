package org.telegram.ui;
public final class fi implements org.telegram.messenger.fs {
    public final int f47738a;
    public final bi.x4 f47739b;
    public final bn f47740c;
    public final bn d;

    public fi(bn bnVar, int i7, bi.x4 x4Var, bn bnVar2) {
        this.d = bnVar;
        this.f47738a = i7;
        this.f47739b = x4Var;
        this.f47740c = bnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47738a) {
            this.f47739b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.f47740c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.g2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
