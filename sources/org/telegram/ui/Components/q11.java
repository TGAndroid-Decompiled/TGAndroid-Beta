package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f37137a;
    public final org.telegram.messenger.ij f37138b;
    public final long f37139c;
    public final String d;

    public q11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.f37137a = i7;
        this.f37138b = ijVar;
        this.f37139c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f37137a;
        String str = this.d;
        long j3 = this.f37139c;
        org.telegram.messenger.ij ijVar = this.f37138b;
        switch (i7) {
            case 0:
                s11.f(ijVar, j3, str);
                return;
            default:
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(ijVar.I1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, ijVar, valueOf, str, bool, bool);
                return;
        }
    }
}
