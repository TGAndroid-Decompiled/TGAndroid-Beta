package org.telegram.ui.Components;
public final class b21 implements Runnable {
    public final int f33716a;
    public final org.telegram.messenger.gj f33717b;
    public final long f33718c;
    public final String d;

    public b21(org.telegram.messenger.gj gjVar, long j3, String str, int i7) {
        this.f33716a = i7;
        this.f33717b = gjVar;
        this.f33718c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f33716a;
        String str = this.d;
        long j3 = this.f33718c;
        org.telegram.messenger.gj gjVar = this.f33717b;
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
