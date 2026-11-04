package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
public final class p implements u10 {
    public final int f43029a = 3;
    public final Object f43030b;
    public final k0 f43031c;
    public final Object d;
    public final Object f43032e;

    public p(u10 u10Var, k0 k0Var, o0 o0Var, n8 n8Var) {
        this.d = n8Var;
        this.f43030b = u10Var;
        this.f43032e = o0Var;
        this.f43031c = k0Var;
    }

    @Override
    public final void a(Object obj) {
        String o10;
        switch (this.f43029a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.f43032e;
                k0 k0Var = this.f43031c;
                k0Var.getClass();
                b0Var.f42213c = (byte[]) obj;
                if (k0Var.N.get((String) this.f43030b) == b0Var) {
                    k0Var.k0(b0Var);
                    k0Var.L();
                }
                runnable.run();
                return;
            case 1:
                e8.Z((e8) this.d, (String) this.f43030b, this.f43031c, (org.telegram.ui.ActionBar.d2) this.f43032e, (String) obj);
                return;
            case 2:
                o0 o0Var = (o0) this.f43032e;
                k0 k0Var2 = this.f43031c;
                k0Var2.u((String) this.f43030b, new p((u10) obj, k0Var2, o0Var, (n8) this.d));
                return;
            default:
                n8 n8Var = (n8) this.d;
                u10 u10Var = (u10) this.f43030b;
                o0 o0Var2 = (o0) this.f43032e;
                b0 b0Var2 = (b0) obj;
                if (b0Var2 == null) {
                    u10Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var2.f42213c;
                if (bArr == null) {
                    byte[][] m10 = o0Var2.m();
                    if (m10.length <= 0) {
                        u10Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!o0Var2.f(bArr)) {
                    u10Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(u10Var, this.f43031c, o0Var2, n8Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = o0.o(bArr);
                }
                String str = o10;
                o0.h.execute(new org.telegram.ui.Components.h2(o0Var2, o0Var2.l(), str, false, (u10) mVar));
                return;
        }
    }

    public p(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f43031c = k0Var;
        this.d = b0Var;
        this.f43030b = str;
        this.f43032e = runnable;
    }

    public p(e8 e8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = e8Var;
        this.f43030b = str;
        this.f43031c = k0Var;
        this.f43032e = d2Var;
    }

    public p(n8 n8Var, k0 k0Var, String str, o0 o0Var) {
        this.d = n8Var;
        this.f43031c = k0Var;
        this.f43030b = str;
        this.f43032e = o0Var;
    }
}
