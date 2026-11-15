package org.telegram.messenger;
public final class zz implements Runnable {
    public final int f28044a;
    public final h00 f28045b;
    public final long f28046c;

    public zz(h00 h00Var, long j3, int i7) {
        this.f28044a = i7;
        this.f28045b = h00Var;
        this.f28046c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f28044a;
        long j3 = this.f28046c;
        h00 h00Var = this.f28045b;
        switch (i7) {
            case 0:
                h00Var.f24010c.put(j3, 0);
                h00Var.getNotificationCenter().k(319, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                h00Var.n(0, j3, false);
                return;
        }
    }
}
