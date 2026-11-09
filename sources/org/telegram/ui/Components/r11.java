package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f37530a;
    public final org.telegram.messenger.ij f37531b;
    public final long f37532c;
    public final String d;

    public r11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.f37530a = i7;
        this.f37531b = ijVar;
        this.f37532c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f37530a;
        String str = this.d;
        long j3 = this.f37532c;
        org.telegram.messenger.ij ijVar = this.f37531b;
        switch (i7) {
            case 0:
                t11.f(ijVar, j3, str);
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
