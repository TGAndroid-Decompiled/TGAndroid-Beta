package org.telegram.ui;
public final class hi implements org.telegram.messenger.ls {
    public final int f46314a;
    public final ai.a1 f46315b;
    public final cn f46316c;
    public final cn d;

    public hi(cn cnVar, int i7, ai.a1 a1Var, cn cnVar2) {
        this.d = cnVar;
        this.f46314a = i7;
        this.f46315b = a1Var;
        this.f46316c = cnVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.qs.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f46314a) {
            this.f46315b.run();
            org.telegram.messenger.g0.i3(new l2.z(this.f46316c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.f2) this.d).currentAccount;
            org.telegram.messenger.qs.f(i11).n(this, i12);
        }
    }
}
