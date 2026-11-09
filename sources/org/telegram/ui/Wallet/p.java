package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class p implements c20 {
    public final int f42961a = 3;
    public final Object f42962b;
    public final l0 f42963c;
    public final Object d;
    public final Object f42964e;

    public p(c20 c20Var, l0 l0Var, p0 p0Var, m8 m8Var) {
        this.d = m8Var;
        this.f42962b = c20Var;
        this.f42964e = p0Var;
        this.f42963c = l0Var;
    }

    @Override
    public final void a(Object obj) {
        String o4;
        switch (this.f42961a) {
            case 0:
                c0 c0Var = (c0) this.d;
                Runnable runnable = (Runnable) this.f42964e;
                l0 l0Var = this.f42963c;
                l0Var.getClass();
                c0Var.f42294c = (byte[]) obj;
                if (l0Var.N.get((String) this.f42962b) == c0Var) {
                    l0Var.k0(c0Var);
                    l0Var.L();
                }
                runnable.run();
                return;
            case 1:
                d8.Z((d8) this.d, (String) this.f42962b, this.f42963c, (org.telegram.ui.ActionBar.f2) this.f42964e, (String) obj);
                return;
            case 2:
                p0 p0Var = (p0) this.f42964e;
                l0 l0Var2 = this.f42963c;
                l0Var2.u((String) this.f42962b, new p((c20) obj, l0Var2, p0Var, (m8) this.d));
                return;
            default:
                m8 m8Var = (m8) this.d;
                c20 c20Var = (c20) this.f42962b;
                p0 p0Var2 = (p0) this.f42964e;
                c0 c0Var2 = (c0) obj;
                if (c0Var2 == null) {
                    c20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var2.f42294c;
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
                m mVar = new m(c20Var, this.f42963c, p0Var2, m8Var);
                if (bArr == null) {
                    o4 = "";
                } else {
                    o4 = p0.o(bArr);
                }
                String str = o4;
                p0.h.execute(new org.telegram.ui.Components.j2(p0Var2, p0Var2.l(), str, false, (c20) mVar));
                return;
        }
    }

    public p(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.f42963c = l0Var;
        this.d = c0Var;
        this.f42962b = str;
        this.f42964e = runnable;
    }

    public p(d8 d8Var, String str, l0 l0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = d8Var;
        this.f42962b = str;
        this.f42963c = l0Var;
        this.f42964e = f2Var;
    }

    public p(m8 m8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = m8Var;
        this.f42963c = l0Var;
        this.f42962b = str;
        this.f42964e = p0Var;
    }
}
