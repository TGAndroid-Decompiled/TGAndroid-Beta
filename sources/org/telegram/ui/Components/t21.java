package org.telegram.ui.Components;
public final class t21 implements Runnable {
    public final int f30504a;
    public final org.telegram.messenger.kj f30505b;
    public final long f30506c;
    public final String d;

    public t21(org.telegram.messenger.kj kjVar, long j10, String str, int i10) {
        this.f30504a = i10;
        this.f30505b = kjVar;
        this.f30506c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i10 = this.f30504a;
        String str = this.d;
        long j10 = this.f30506c;
        org.telegram.messenger.kj kjVar = this.f30505b;
        switch (i10) {
            case 0:
                v21.f(kjVar, j10, str);
                return;
            default:
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(kjVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f7.k(115, kjVar, valueOf, str, bool, bool);
                return;
        }
    }
}
