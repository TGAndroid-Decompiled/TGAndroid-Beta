package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class yb implements Runnable {
    public final int f28108a;
    public final zb f28109b;
    public final long f28110c;
    public final long d;

    public yb(zb zbVar, long j3, long j10, int i7) {
        this.f28108a = i7;
        this.f28109b = zbVar;
        this.f28110c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28108a) {
            case 0:
                zb zbVar = this.f28109b;
                ConcurrentHashMap concurrentHashMap = zbVar.h.f23694u;
                String str = zbVar.f28276a.f26765e;
                long j3 = this.f28110c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new yb(zbVar, j3, j10, 1));
                return;
            default:
                sb sbVar = this.f28109b.f28276a;
                ks.f(sbVar.f26774o).k(141, sbVar.f26765e, Long.valueOf(this.f28110c), Long.valueOf(this.d));
                return;
        }
    }
}
