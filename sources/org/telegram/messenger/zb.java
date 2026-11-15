package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class zb implements Runnable {
    public final int f27909a;
    public final ac f27910b;
    public final long f27911c;
    public final long d;

    public zb(ac acVar, long j3, long j10, int i7) {
        this.f27909a = i7;
        this.f27910b = acVar;
        this.f27911c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27909a) {
            case 0:
                ac acVar = this.f27910b;
                ConcurrentHashMap concurrentHashMap = acVar.h.f23481u;
                String str = acVar.f22486a.f26646e;
                long j3 = this.f27911c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new zb(acVar, j3, j10, 1));
                return;
            default:
                tb tbVar = this.f27910b.f22486a;
                ns.f(tbVar.f26655o).k(141, tbVar.f26646e, Long.valueOf(this.f27911c), Long.valueOf(this.d));
                return;
        }
    }
}
