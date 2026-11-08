package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f26890a;
    public final qp f26891b;
    public final TLRPC.TL_error f26892c;
    public final long d;

    public zl(qp qpVar, TLRPC.TL_error tL_error, long j3, int i7) {
        this.f26890a = i7;
        this.f26891b = qpVar;
        this.f26892c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26890a;
        long j3 = this.d;
        TLRPC.TL_error tL_error = this.f26892c;
        qp qpVar = this.f26891b;
        switch (i7) {
            case 0:
                qpVar.F(j3, tL_error.text);
                qs.f(qpVar.currentAccount).k(333, Long.valueOf(j3));
                return;
            default:
                qpVar.getClass();
                qpVar.F(j3, tL_error.text);
                qpVar.f24891s1.remove(Long.valueOf(j3));
                return;
        }
    }
}
