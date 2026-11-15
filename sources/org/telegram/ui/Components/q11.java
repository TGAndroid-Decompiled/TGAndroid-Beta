package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f38470a;
    public final org.telegram.messenger.gj f38471b;
    public final long f38472c;
    public final String d;

    public q11(org.telegram.messenger.gj gjVar, long j3, String str, int i7) {
        this.f38470a = i7;
        this.f38471b = gjVar;
        this.f38472c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f38470a;
        String str = this.d;
        long j3 = this.f38472c;
        org.telegram.messenger.gj gjVar = this.f38471b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(gjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, gjVar, valueOf, str, bool, bool);
                return;
            default:
                x11.f(gjVar, j3, str);
                return;
        }
    }
}
