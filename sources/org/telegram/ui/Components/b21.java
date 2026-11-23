package org.telegram.ui.Components;
public final class b21 implements Runnable {
    public final int f33693a;
    public final org.telegram.messenger.gj f33694b;
    public final long f33695c;
    public final String d;

    public b21(org.telegram.messenger.gj gjVar, long j3, String str, int i7) {
        this.f33693a = i7;
        this.f33694b = gjVar;
        this.f33695c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f33693a;
        String str = this.d;
        long j3 = this.f33695c;
        org.telegram.messenger.gj gjVar = this.f33694b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(gjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, gjVar, valueOf, str, bool, bool);
                return;
            default:
                j21.f(gjVar, j3, str);
                return;
        }
    }
}
