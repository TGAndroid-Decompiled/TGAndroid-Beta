package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class zb implements Runnable {
    public final int f28304a;
    public final ac f28305b;
    public final long f28306c;
    public final long d;

    public zb(ac acVar, long j3, long j10, int i7) {
        this.f28304a = i7;
        this.f28305b = acVar;
        this.f28306c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28304a) {
            case 0:
                ac acVar = this.f28305b;
                ConcurrentHashMap concurrentHashMap = acVar.h.f23903u;
                String str = acVar.f22895a.f26993e;
                long j3 = this.f28306c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new zb(acVar, j3, j10, 1));
                return;
            default:
                tb tbVar = this.f28305b.f22895a;
                ls.f(tbVar.f27002o).k(141, tbVar.f26993e, Long.valueOf(this.f28306c), Long.valueOf(this.d));
                return;
        }
    }
}
