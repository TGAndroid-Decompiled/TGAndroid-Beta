package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class zb implements Runnable {
    public final int f28268a;
    public final ac f28269b;
    public final long f28270c;
    public final long d;

    public zb(ac acVar, long j3, long j10, int i7) {
        this.f28268a = i7;
        this.f28269b = acVar;
        this.f28270c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f28268a) {
            case 0:
                ac acVar = this.f28269b;
                ConcurrentHashMap concurrentHashMap = acVar.h.f23867u;
                String str = acVar.f22859a.f26957e;
                long j3 = this.f28270c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new zb(acVar, j3, j10, 1));
                return;
            default:
                tb tbVar = this.f28269b.f22859a;
                ls.f(tbVar.f26966o).k(141, tbVar.f26957e, Long.valueOf(this.f28270c), Long.valueOf(this.d));
                return;
        }
    }
}
