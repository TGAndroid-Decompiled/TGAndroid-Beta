package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class q implements c20 {
    public final int f43043a = 3;
    public final Object f43044b;
    public final m0 f43045c;
    public final Object d;
    public final Object f43046e;

    public q(c20 c20Var, m0 m0Var, q0 q0Var, n8 n8Var) {
        this.d = n8Var;
        this.f43044b = c20Var;
        this.f43046e = q0Var;
        this.f43045c = m0Var;
    }

    @Override
    public final void a(Object obj) {
        String o4;
        switch (this.f43043a) {
            case 0:
                d0 d0Var = (d0) this.d;
                Runnable runnable = (Runnable) this.f43046e;
                m0 m0Var = this.f43045c;
                m0Var.getClass();
                d0Var.f42375c = (byte[]) obj;
                if (m0Var.N.get((String) this.f43044b) == d0Var) {
                    m0Var.k0(d0Var);
                    m0Var.L();
                }
                runnable.run();
                return;
            case 1:
                e8.Z((e8) this.d, (String) this.f43044b, this.f43045c, (org.telegram.ui.ActionBar.f2) this.f43046e, (String) obj);
                return;
            case 2:
                q0 q0Var = (q0) this.f43046e;
                m0 m0Var2 = this.f43045c;
                m0Var2.u((String) this.f43044b, new q((c20) obj, m0Var2, q0Var, (n8) this.d));
                return;
            default:
                n8 n8Var = (n8) this.d;
                c20 c20Var = (c20) this.f43044b;
                q0 q0Var2 = (q0) this.f43046e;
                d0 d0Var2 = (d0) obj;
                if (d0Var2 == null) {
                    c20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = d0Var2.f42375c;
                if (bArr == null) {
                    byte[][] m10 = q0Var2.m();
                    if (m10.length <= 0) {
                        c20Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!q0Var2.f(bArr)) {
                    c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(c20Var, this.f43045c, q0Var2, n8Var);
                if (bArr == null) {
                    o4 = "";
                } else {
                    o4 = q0.o(bArr);
                }
                String str = o4;
                q0.h.execute(new org.telegram.ui.Components.j2(q0Var2, q0Var2.l(), str, false, (c20) mVar));
                return;
        }
    }

    public q(m0 m0Var, d0 d0Var, String str, Runnable runnable) {
        this.f43045c = m0Var;
        this.d = d0Var;
        this.f43044b = str;
        this.f43046e = runnable;
    }

    public q(e8 e8Var, String str, m0 m0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = e8Var;
        this.f43044b = str;
        this.f43045c = m0Var;
        this.f43046e = f2Var;
    }

    public q(n8 n8Var, m0 m0Var, String str, q0 q0Var) {
        this.d = n8Var;
        this.f43045c = m0Var;
        this.f43044b = str;
        this.f43046e = q0Var;
    }
}
