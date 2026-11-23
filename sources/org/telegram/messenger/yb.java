package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class yb implements Runnable {
    public final int f28208a;
    public final zb f28209b;
    public final long f28210c;
    public final long d;

    public yb(zb zbVar, long j3, long j10, int i7) {
        this.f28208a = i7;
        this.f28209b = zbVar;
        this.f28210c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28208a) {
            case 0:
                zb zbVar = this.f28209b;
                ConcurrentHashMap concurrentHashMap = zbVar.h.f23799u;
                String str = zbVar.f28368a.f26866e;
                long j3 = this.f28210c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new yb(zbVar, j3, j10, 1));
                return;
            default:
                sb sbVar = this.f28209b.f28368a;
                ks.f(sbVar.f26875o).k(141, sbVar.f26866e, Long.valueOf(this.f28210c), Long.valueOf(this.d));
                return;
        }
    }
}
