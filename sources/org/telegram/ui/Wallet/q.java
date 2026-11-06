package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class q implements c20 {
    public final int f43034a = 3;
    public final Object f43035b;
    public final n0 f43036c;
    public final Object d;
    public final Object f43037e;

    public q(c20 c20Var, n0 n0Var, r0 r0Var, o8 o8Var) {
        this.d = o8Var;
        this.f43035b = c20Var;
        this.f43037e = r0Var;
        this.f43036c = n0Var;
    }

    @Override
    public final void a(Object obj) {
        String o4;
        switch (this.f43034a) {
            case 0:
                e0 e0Var = (e0) this.d;
                Runnable runnable = (Runnable) this.f43037e;
                n0 n0Var = this.f43036c;
                n0Var.getClass();
                e0Var.f42406c = (byte[]) obj;
                if (n0Var.N.get((String) this.f43035b) == e0Var) {
                    n0Var.k0(e0Var);
                    n0Var.L();
                }
                runnable.run();
                return;
            case 1:
                f8.Z((f8) this.d, (String) this.f43035b, this.f43036c, (org.telegram.ui.ActionBar.f2) this.f43037e, (String) obj);
                return;
            case 2:
                r0 r0Var = (r0) this.f43037e;
                n0 n0Var2 = this.f43036c;
                n0Var2.u((String) this.f43035b, new q((c20) obj, n0Var2, r0Var, (o8) this.d));
                return;
            default:
                o8 o8Var = (o8) this.d;
                c20 c20Var = (c20) this.f43035b;
                r0 r0Var2 = (r0) this.f43037e;
                e0 e0Var2 = (e0) obj;
                if (e0Var2 == null) {
                    c20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = e0Var2.f42406c;
                if (bArr == null) {
                    byte[][] m10 = r0Var2.m();
                    if (m10.length <= 0) {
                        c20Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!r0Var2.f(bArr)) {
                    c20Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(c20Var, this.f43036c, r0Var2, o8Var);
                if (bArr == null) {
                    o4 = "";
                } else {
                    o4 = r0.o(bArr);
                }
                String str = o4;
                r0.h.execute(new org.telegram.ui.Components.j2(r0Var2, r0Var2.l(), str, false, (c20) mVar));
                return;
        }
    }

    public q(n0 n0Var, e0 e0Var, String str, Runnable runnable) {
        this.f43036c = n0Var;
        this.d = e0Var;
        this.f43035b = str;
        this.f43037e = runnable;
    }

    public q(f8 f8Var, String str, n0 n0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = f8Var;
        this.f43035b = str;
        this.f43036c = n0Var;
        this.f43037e = f2Var;
    }

    public q(o8 o8Var, n0 n0Var, String str, r0 r0Var) {
        this.d = o8Var;
        this.f43036c = n0Var;
        this.f43035b = str;
        this.f43037e = r0Var;
    }
}
