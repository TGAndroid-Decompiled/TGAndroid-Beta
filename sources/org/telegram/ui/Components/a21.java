package org.telegram.ui.Components;
public final class a21 implements Runnable {
    public final int f33341a;
    public final org.telegram.messenger.fj f33342b;
    public final long f33343c;
    public final String d;

    public a21(org.telegram.messenger.fj fjVar, long j3, String str, int i7) {
        this.f33341a = i7;
        this.f33342b = fjVar;
        this.f33343c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f33341a;
        String str = this.d;
        long j3 = this.f33343c;
        org.telegram.messenger.fj fjVar = this.f33342b;
        switch (i7) {
            case 0:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(fjVar.K1);
                Long valueOf = Long.valueOf(j3);
                Boolean bool = Boolean.TRUE;
                f10.k(115, fjVar, valueOf, str, bool, bool);
                return;
            default:
                i21.f(fjVar, j3, str);
                return;
        }
    }
}
