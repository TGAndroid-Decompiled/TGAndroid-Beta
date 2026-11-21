package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class yb implements Runnable {
    public final int f28136a;
    public final zb f28137b;
    public final long f28138c;
    public final long d;

    public yb(zb zbVar, long j3, long j10, int i7) {
        this.f28136a = i7;
        this.f28137b = zbVar;
        this.f28138c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28136a) {
            case 0:
                zb zbVar = this.f28137b;
                ConcurrentHashMap concurrentHashMap = zbVar.h.f23722u;
                String str = zbVar.f28304a.f26793e;
                long j3 = this.f28138c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new yb(zbVar, j3, j10, 1));
                return;
            default:
                sb sbVar = this.f28137b.f28304a;
                ks.f(sbVar.f26802o).k(141, sbVar.f26793e, Long.valueOf(this.f28138c), Long.valueOf(this.d));
                return;
        }
    }
}
