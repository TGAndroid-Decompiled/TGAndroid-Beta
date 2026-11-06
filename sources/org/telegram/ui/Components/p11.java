package org.telegram.ui.Components;
public final class p11 implements Runnable {
    public final int f36746a;
    public final org.telegram.messenger.ij f36747b;
    public final long f36748c;
    public final String d;

    public p11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.f36746a = i7;
        this.f36747b = ijVar;
        this.f36748c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f36746a;
        String str = this.d;
        long j3 = this.f36748c;
        org.telegram.messenger.ij ijVar = this.f36747b;
        switch (i7) {
            case 0:
                r11.f(ijVar, j3, str);
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
