package org.telegram.ui;
public final class fi implements org.telegram.messenger.ls {
    public final int f45634a;
    public final ai.a1 f45635b;
    public final an f45636c;
    public final an d;

    public fi(an anVar, int i7, ai.a1 a1Var, an anVar2) {
        this.d = anVar;
        this.f45634a = i7;
        this.f45635b = a1Var;
        this.f45636c = anVar2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.qs.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.f45634a) {
            this.f45635b.run();
            org.telegram.messenger.g0.i3(new l2.a0(this.f45636c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.f2) this.d).currentAccount;
            org.telegram.messenger.qs.f(i11).n(this, i12);
        }
    }
}
