package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f26894a;
    public final qp f26895b;
    public final TLRPC.TL_error f26896c;
    public final long d;

    public zl(qp qpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26894a = i7;
        this.f26895b = qpVar;
        this.f26896c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26894a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26896c;
        qp qpVar = this.f26895b;
        switch (i7) {
            case 0:
                qpVar.F(j3, tL_error.text);
                qs.f(qpVar.currentAccount).k(333, Long.valueOf(j3));
                return;
            default:
                qpVar.getClass();
                qpVar.F(j3, tL_error.text);
                qpVar.f24895s1.remove(Long.valueOf(j3));
                return;
        }
    }
}
