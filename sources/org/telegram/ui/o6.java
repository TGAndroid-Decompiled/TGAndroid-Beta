package org.telegram.ui;
public final class o6 implements Runnable {
    public final int f40147a;
    public final boolean[] f40148b;
    public final fg.i f40149c;
    public final long[] d;
    public final p6 e;

    public o6(boolean[] zArr, fg.i iVar, long[] jArr, p6 p6Var, int i10) {
        this.f40147a = i10;
        this.f40148b = zArr;
        this.f40149c = iVar;
        this.d = jArr;
        this.e = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f40147a) {
            case 0:
                org.telegram.messenger.i0.g3(new o6(this.f40148b, this.f40149c, this.d, this.e, 1));
                return;
            default:
                this.f40148b[0] = true;
                this.f40149c.d(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                p6 p6Var = this.e;
                if (i10 > 0) {
                    org.telegram.messenger.i0.h3(new rr0(p6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    p6Var.dismiss();
                    return;
                }
        }
    }
}
