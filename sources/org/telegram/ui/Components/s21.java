package org.telegram.ui.Components;
public final class s21 implements Runnable {
    public final int f30110a;
    public final org.telegram.messenger.jj f30111b;
    public final long f30112c;
    public final String d;

    public s21(org.telegram.messenger.jj jjVar, long j10, String str, int i10) {
        this.f30110a = i10;
        this.f30111b = jjVar;
        this.f30112c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30110a;
        String str = this.d;
        long j10 = this.f30112c;
        org.telegram.messenger.jj jjVar = this.f30111b;
        switch (i10) {
            case 0:
                u21.f(jjVar, j10, str);
                return;
            default:
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(jjVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f7.k(115, jjVar, valueOf, str, bool, bool);
                return;
        }
    }
}
