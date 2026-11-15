package org.telegram.ui;
public final class fi implements org.telegram.messenger.is {
    public final int f47126a;
    public final ci.p0 f47127b;
    public final an f47128c;
    public final an d;

    public fi(an anVar, int i7, ci.p0 p0Var, an anVar2) {
        this.d = anVar;
        this.f47126a = i7;
        this.f47127b = p0Var;
        this.f47128c = anVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ns.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f47126a) {
            this.f47127b.run();
            org.telegram.messenger.g0.i3(new l2.x(this.f47128c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.e2) this.d).currentAccount;
            org.telegram.messenger.ns.f(i11).n(this, i12);
        }
    }
}
