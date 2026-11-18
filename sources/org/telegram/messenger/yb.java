package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class yb implements Runnable {
    public final int f28110a;
    public final zb f28111b;
    public final long f28112c;
    public final long d;

    public yb(zb zbVar, long j3, long j10, int i7) {
        this.f28110a = i7;
        this.f28111b = zbVar;
        this.f28112c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28110a) {
            case 0:
                zb zbVar = this.f28111b;
                ConcurrentHashMap concurrentHashMap = zbVar.h.f23697u;
                String str = zbVar.f28278a.f26767e;
                long j3 = this.f28112c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new yb(zbVar, j3, j10, 1));
                return;
            default:
                sb sbVar = this.f28111b.f28278a;
                ks.f(sbVar.f26776o).k(141, sbVar.f26767e, Long.valueOf(this.f28112c), Long.valueOf(this.d));
                return;
        }
    }
}
