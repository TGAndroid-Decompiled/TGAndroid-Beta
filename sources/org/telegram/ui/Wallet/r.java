package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class r implements x10 {
    public final int f44857a = 3;
    public final Object f44858b;
    public final u0 f44859c;
    public final Object d;
    public final Object f44860e;

    public r(x10 x10Var, u0 u0Var, z0 z0Var, d9 d9Var) {
        this.d = d9Var;
        this.f44858b = x10Var;
        this.f44860e = z0Var;
        this.f44859c = u0Var;
    }

    @Override
    public final void a(Object obj) {
        String p10;
        switch (this.f44857a) {
            case 0:
                j0 j0Var = (j0) this.d;
                Runnable runnable = (Runnable) this.f44860e;
                u0 u0Var = this.f44859c;
                u0Var.getClass();
                j0Var.f44376c = (byte[]) obj;
                if (u0Var.Q.get((String) this.f44858b) == j0Var) {
                    u0Var.v0(j0Var);
                    u0Var.T();
                }
                runnable.run();
                return;
            case 1:
                u8.Z((u8) this.d, (String) this.f44858b, this.f44859c, (org.telegram.ui.ActionBar.h2) this.f44860e, (String) obj);
                return;
            case 2:
                z0 z0Var = (z0) this.f44860e;
                u0 u0Var2 = this.f44859c;
                u0Var2.z((String) this.f44858b, new r((x10) obj, u0Var2, z0Var, (d9) this.d));
                return;
            default:
                d9 d9Var = (d9) this.d;
                x10 x10Var = (x10) this.f44858b;
                z0 z0Var2 = (z0) this.f44860e;
                j0 j0Var2 = (j0) obj;
                if (j0Var2 == null) {
                    x10Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = j0Var2.f44376c;
                if (bArr == null) {
                    byte[][] n10 = z0Var2.n();
                    if (n10.length <= 0) {
                        x10Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = n10[0];
                }
                if (!z0Var2.f(bArr)) {
                    x10Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                o oVar = new o(x10Var, this.f44859c, z0Var2, d9Var);
                if (bArr == null) {
                    p10 = "";
                } else {
                    p10 = z0.p(bArr);
                }
                String str = p10;
                z0.f45333i.execute(new org.telegram.ui.Components.r2(z0Var2, z0Var2.l(), str, false, (x10) oVar));
                return;
        }
    }

    public r(u0 u0Var, j0 j0Var, String str, Runnable runnable) {
        this.f44859c = u0Var;
        this.d = j0Var;
        this.f44858b = str;
        this.f44860e = runnable;
    }

    public r(u8 u8Var, String str, u0 u0Var, org.telegram.ui.ActionBar.h2 h2Var) {
        this.d = u8Var;
        this.f44858b = str;
        this.f44859c = u0Var;
        this.f44860e = h2Var;
    }

    public r(d9 d9Var, u0 u0Var, String str, z0 z0Var) {
        this.d = d9Var;
        this.f44859c = u0Var;
        this.f44858b = str;
        this.f44860e = z0Var;
    }
}
