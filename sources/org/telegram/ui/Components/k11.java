package org.telegram.ui.Components;
public final class k11 implements Runnable {
    public final int f35144a;
    public final org.telegram.messenger.ij f35145b;
    public final long f35146c;
    public final String d;

    public k11(org.telegram.messenger.ij ijVar, long j3, String str, int i7) {
        this.f35144a = i7;
        this.f35145b = ijVar;
        this.f35146c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        int i7 = this.f35144a;
        String str = this.d;
        long j3 = this.f35146c;
        org.telegram.messenger.ij ijVar = this.f35145b;
        switch (i7) {
            case 0:
                m11.f(ijVar, j3, str);
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
