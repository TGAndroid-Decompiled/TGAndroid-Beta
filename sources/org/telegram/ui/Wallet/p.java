package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class p implements c20 {
    public final int f42948a = 3;
    public final Object f42949b;
    public final l0 f42950c;
    public final Object d;
    public final Object f42951e;

    public p(c20 c20Var, l0 l0Var, p0 p0Var, p8 p8Var) {
        this.d = p8Var;
        this.f42949b = c20Var;
        this.f42951e = p0Var;
        this.f42950c = l0Var;
    }

    @Override
    public final void a(Object obj) {
        String o4;
        switch (this.f42948a) {
            case 0:
                c0 c0Var = (c0) this.d;
                Runnable runnable = (Runnable) this.f42951e;
                l0 l0Var = this.f42950c;
                l0Var.getClass();
                c0Var.f42200c = (byte[]) obj;
                if (l0Var.N.get((String) this.f42949b) == c0Var) {
                    l0Var.k0(c0Var);
                    l0Var.L();
                }
                runnable.run();
                return;
            case 1:
                g8.Z((g8) this.d, (String) this.f42949b, this.f42950c, (org.telegram.ui.ActionBar.f2) this.f42951e, (String) obj);
                return;
            case 2:
                p0 p0Var = (p0) this.f42951e;
                l0 l0Var2 = this.f42950c;
                l0Var2.u((String) this.f42949b, new p((c20) obj, l0Var2, p0Var, (p8) this.d));
                return;
            default:
                p8 p8Var = (p8) this.d;
                c20 c20Var = (c20) this.f42949b;
                p0 p0Var2 = (p0) this.f42951e;
                c0 c0Var2 = (c0) obj;
                if (c0Var2 == null) {
                    c20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var2.f42200c;
                if (bArr == null) {
                    byte[][] m10 = p0Var2.m();
                    if (m10.length <= 0) {
                        c20Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!p0Var2.f(bArr)) {
                    c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(c20Var, this.f42950c, p0Var2, p8Var);
                if (bArr == null) {
                    o4 = "";
                } else {
                    o4 = p0.o(bArr);
                }
                String str = o4;
                p0.h.execute(new org.telegram.ui.Components.i2(p0Var2, p0Var2.l(), str, false, (c20) mVar));
                return;
        }
    }

    public p(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.f42950c = l0Var;
        this.d = c0Var;
        this.f42949b = str;
        this.f42951e = runnable;
    }

    public p(g8 g8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = g8Var;
        this.f42949b = str;
        this.f42950c = l0Var;
        this.f42951e = f2Var;
    }

    public p(p8 p8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = p8Var;
        this.f42950c = l0Var;
        this.f42949b = str;
        this.f42951e = p0Var;
    }
}
