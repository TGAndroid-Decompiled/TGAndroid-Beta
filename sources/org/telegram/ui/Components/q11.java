package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f37167a;
    public final org.telegram.messenger.ij f37168b;
    public final long f37169c;
    public final String d;

    public q11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.f37167a = i7;
        this.f37168b = ijVar;
        this.f37169c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f37167a;
        String str = this.d;
        long j3 = this.f37169c;
        org.telegram.messenger.ij ijVar = this.f37168b;
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
