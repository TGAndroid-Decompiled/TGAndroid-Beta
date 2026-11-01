package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f40047a;
    public final boolean[] f40048b;
    public final fg.i f40049c;
    public final long[] d;
    public final p6 e;

    public o6(boolean[] zArr, fg.i iVar, long[] jArr, p6 p6Var, int i10) {
        this.f40047a = i10;
        this.f40048b = zArr;
        this.f40049c = iVar;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f40047a) {
            case 0:
                org.telegram.messenger.i0.g3(new o6(this.f40048b, this.f40049c, this.d, this.e, 1));
                return;
            default:
                this.f40048b[0] = true;
                this.f40049c.d(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.e;
                if (i10 > 0) {
                    org.telegram.messenger.i0.h3(new qr0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
