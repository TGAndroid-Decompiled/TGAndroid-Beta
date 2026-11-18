package org.telegram.ui.Components;
public final class a21 implements Runnable {
    public final int f33230a;
    public final org.telegram.messenger.fj f33231b;
    public final long f33232c;
    public final String d;

    public a21(org.telegram.messenger.fj fjVar, long j3, String str, int i7) {
        this.f33230a = i7;
        this.f33231b = fjVar;
        this.f33232c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f33230a;
        String str = this.d;
        long j3 = this.f33232c;
        org.telegram.messenger.fj fjVar = this.f33231b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(fjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, fjVar, valueOf, str, bool, bool);
                return;
            default:
                g21.f(fjVar, j3, str);
                return;
        }
    }
}
