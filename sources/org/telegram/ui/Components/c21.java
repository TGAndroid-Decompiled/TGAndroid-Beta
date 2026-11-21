package org.telegram.ui.Components;
public final class c21 implements Runnable {
    public final int f34005a;
    public final org.telegram.messenger.fj f34006b;
    public final long f34007c;
    public final String d;

    public c21(org.telegram.messenger.fj fjVar, long j3, String str, int i7) {
        this.f34005a = i7;
        this.f34006b = fjVar;
        this.f34007c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f34005a;
        String str = this.d;
        long j3 = this.f34007c;
        org.telegram.messenger.fj fjVar = this.f34006b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(fjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, fjVar, valueOf, str, bool, bool);
                return;
            default:
                j21.f(fjVar, j3, str);
                return;
        }
    }
}
