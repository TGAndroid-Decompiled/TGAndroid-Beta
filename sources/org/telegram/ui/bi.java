package org.telegram.ui;
public final class bi implements org.telegram.messenger.cs {
    public final int f44047a;
    public final bi.q0 f44048b;
    public final wm f44049c;
    public final wm d;

    public bi(wm wmVar, int i3, bi.q0 q0Var, wm wmVar2) {
        this.d = wmVar;
        this.f44047a = i3;
        this.f44048b = q0Var;
        this.f44049c = wmVar2;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.hs.D;
        if (i3 == i12 && ((Integer) objArr[10]).intValue() == this.f44047a) {
            this.f44048b.run();
            org.telegram.messenger.g0.i3(new k2.a0(this.f44049c, i3, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.d2) this.d).currentAccount;
            org.telegram.messenger.hs.f(i11).n(this, i12);
        }
    }
}
