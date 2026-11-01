package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class yb implements Runnable {
    public final int f19569a;
    public final zb f19570b;
    public final long f19571c;
    public final long d;

    public yb(zb zbVar, long j10, long j11, int i10) {
        this.f19569a = i10;
        this.f19570b = zbVar;
        this.f19571c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19569a) {
            case 0:
                zb zbVar = this.f19570b;
                ConcurrentHashMap concurrentHashMap = zbVar.f19682i.f16263u;
                String str = zbVar.f19677a;
                long j10 = this.f19571c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new yb(zbVar, j10, j11, 1));
                return;
            default:
                zb zbVar2 = this.f19570b;
                at.f(zbVar2.h).k(141, zbVar2.f19677a, Long.valueOf(this.f19571c), Long.valueOf(this.d));
                return;
        }
    }
}
