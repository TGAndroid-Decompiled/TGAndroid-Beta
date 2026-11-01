package org.telegram.ui;
public final class pz0 implements Runnable {
    public final int f40642a;
    public final boolean[] f40643b;
    public final org.telegram.messenger.r20 f40644c;

    public pz0(int i10, org.telegram.messenger.r20 r20Var, boolean[] zArr) {
        this.f40642a = i10;
        this.f40643b = zArr;
        this.f40644c = r20Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.r20 r20Var;
        org.telegram.messenger.r20 r20Var2;
        org.telegram.messenger.r20 r20Var3;
        switch (this.f40642a) {
            case 0:
                boolean[] zArr = this.f40643b;
                if (!zArr[0] && (r20Var = this.f40644c) != null) {
                    zArr[0] = true;
                    r20Var.a(Boolean.TRUE);
                }
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(14), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f40643b;
                if (!zArr2[0] && (r20Var2 = this.f40644c) != null) {
                    zArr2[0] = true;
                    r20Var2.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f40643b;
                if (!zArr3[0] && (r20Var3 = this.f40644c) != null) {
                    r20Var3.a("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public pz0(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.r20 r20Var) {
        this.f40642a = 2;
        this.f40643b = zArr;
        this.f40644c = r20Var;
    }
}
