package org.telegram.ui;
public final class fi implements org.telegram.messenger.gs {
    public final int f47710a;
    public final ai.w0 f47711b;
    public final bn f47712c;
    public final bn d;

    public fi(bn bnVar, int i7, ai.w0 w0Var, bn bnVar2) {
        this.d = bnVar;
        this.f47710a = i7;
        this.f47711b = w0Var;
        this.f47712c = bnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ls.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47710a) {
            this.f47711b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.f47712c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.g2) this.d).currentAccount;
            org.telegram.messenger.ls.f(i11).n(this, i12);
        }
    }
}
