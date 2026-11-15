package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
public final class p implements z10 {
    public final int f44285a = 3;
    public final Object f44286b;
    public final l0 f44287c;
    public final Object d;
    public final Object f44288e;

    public p(z10 z10Var, l0 l0Var, p0 p0Var, p8 p8Var) {
        this.d = p8Var;
        this.f44286b = z10Var;
        this.f44288e = p0Var;
        this.f44287c = l0Var;
    }

    @Override
    public final void a(Object obj) {
        String o4;
        switch (this.f44285a) {
            case 0:
                c0 c0Var = (c0) this.d;
                Runnable runnable = (Runnable) this.f44288e;
                l0 l0Var = this.f44287c;
                l0Var.getClass();
                c0Var.f43549c = (byte[]) obj;
                if (l0Var.N.get((String) this.f44286b) == c0Var) {
                    l0Var.k0(c0Var);
                    l0Var.L();
                }
                runnable.run();
                return;
            case 1:
                f8.Z((f8) this.d, (String) this.f44286b, this.f44287c, (org.telegram.ui.ActionBar.e2) this.f44288e, (String) obj);
                return;
            case 2:
                p0 p0Var = (p0) this.f44288e;
                l0 l0Var2 = this.f44287c;
                l0Var2.u((String) this.f44286b, new p((z10) obj, l0Var2, p0Var, (p8) this.d));
                return;
            default:
                p8 p8Var = (p8) this.d;
                z10 z10Var = (z10) this.f44286b;
                p0 p0Var2 = (p0) this.f44288e;
                c0 c0Var2 = (c0) obj;
                if (c0Var2 == null) {
                    z10Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var2.f43549c;
                if (bArr == null) {
                    byte[][] m10 = p0Var2.m();
                    if (m10.length <= 0) {
                        z10Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!p0Var2.f(bArr)) {
                    z10Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(z10Var, this.f44287c, p0Var2, p8Var);
                if (bArr == null) {
                    o4 = "";
                } else {
                    o4 = p0.o(bArr);
                }
                String str = o4;
                p0.h.execute(new org.telegram.ui.Components.i2(p0Var2, p0Var2.l(), str, false, (z10) mVar));
                return;
        }
    }

    public p(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.f44287c = l0Var;
        this.d = c0Var;
        this.f44286b = str;
        this.f44288e = runnable;
    }

    public p(f8 f8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = f8Var;
        this.f44286b = str;
        this.f44287c = l0Var;
        this.f44288e = e2Var;
    }

    public p(p8 p8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = p8Var;
        this.f44287c = l0Var;
        this.f44286b = str;
        this.f44288e = p0Var;
    }
}
