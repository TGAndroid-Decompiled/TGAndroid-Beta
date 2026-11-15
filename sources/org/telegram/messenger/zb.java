package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class zb implements Runnable {
    public final int f27899a;
    public final ac f27900b;
    public final long f27901c;
    public final long d;

    public zb(ac acVar, long j3, long j10, int i7) {
        this.f27899a = i7;
        this.f27900b = acVar;
        this.f27901c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27899a) {
            case 0:
                ac acVar = this.f27900b;
                ConcurrentHashMap concurrentHashMap = acVar.h.f23478u;
                String str = acVar.f22486a.f26637e;
                long j3 = this.f27901c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new zb(acVar, j3, j10, 1));
                return;
            default:
                tb tbVar = this.f27900b.f22486a;
                ns.f(tbVar.f26646o).k(141, tbVar.f26637e, Long.valueOf(this.f27901c), Long.valueOf(this.d));
                return;
        }
    }
}
