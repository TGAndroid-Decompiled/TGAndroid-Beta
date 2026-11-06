package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f26887a;
    public final qp f26888b;
    public final TLRPC.TL_error f26889c;
    public final long d;

    public zl(qp qpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26887a = i7;
        this.f26888b = qpVar;
        this.f26889c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26887a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26889c;
        qp qpVar = this.f26888b;
        switch (i7) {
            case 0:
                qpVar.F(j3, tL_error.text);
                qs.f(qpVar.currentAccount).k(333, Long.valueOf(j3));
                return;
            default:
                qpVar.getClass();
                qpVar.F(j3, tL_error.text);
                qpVar.f24876s1.remove(Long.valueOf(j3));
                return;
        }
    }
}
