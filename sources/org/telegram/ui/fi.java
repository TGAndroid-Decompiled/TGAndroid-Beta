package org.telegram.ui;
public final class fi implements org.telegram.messenger.fs {
    public final int f47841a;
    public final ai.x0 f47842b;
    public final bn f47843c;
    public final bn d;

    public fi(bn bnVar, int i7, ai.x0 x0Var, bn bnVar2) {
        this.d = bnVar;
        this.f47841a = i7;
        this.f47842b = x0Var;
        this.f47843c = bnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47841a) {
            this.f47842b.run();
            org.telegram.messenger.g0.h3(new l2.y(this.f47843c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.g2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
