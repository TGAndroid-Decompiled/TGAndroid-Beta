package org.telegram.ui.Components;
public final class k11 implements Runnable {
    public final int f35244a;
    public final org.telegram.messenger.zi f35245b;
    public final long f35246c;
    public final String d;

    public k11(org.telegram.messenger.zi ziVar, long j10, String str, int i3) {
        this.f35244a = i3;
        this.f35245b = ziVar;
        this.f35246c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        int i3 = this.f35244a;
        String str = this.d;
        long j10 = this.f35246c;
        org.telegram.messenger.zi ziVar = this.f35245b;
        switch (i3) {
            case 0:
                m11.f(ziVar, j10, str);
                return;
            default:
                org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(ziVar.I1);
                Long valueOf = Long.valueOf(j10);
                Boolean bool = Boolean.TRUE;
                f10.k(115, ziVar, valueOf, str, bool, bool);
                return;
        }
    }
}
