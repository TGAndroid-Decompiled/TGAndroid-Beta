package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
public final class p implements r20 {
    public final int f35000a = 3;
    public final Object f35001b;
    public final k0 f35002c;
    public final Object d;
    public final Object e;

    public p(r20 r20Var, k0 k0Var, p0 p0Var, t8 t8Var) {
        this.d = t8Var;
        this.f35001b = r20Var;
        this.e = p0Var;
        this.f35002c = k0Var;
    }

    @Override
    public final void a(Object obj) {
        String o10;
        switch (this.f35000a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.e;
                k0 k0Var = this.f35002c;
                k0Var.getClass();
                b0Var.f34222c = (byte[]) obj;
                if (k0Var.N.get((String) this.f35001b) == b0Var) {
                    k0Var.k0(b0Var);
                    k0Var.L();
                }
                runnable.run();
                return;
            case 1:
                k8.Z((k8) this.d, (String) this.f35001b, this.f35002c, (org.telegram.ui.ActionBar.k2) this.e, (String) obj);
                return;
            case 2:
                p0 p0Var = (p0) this.e;
                k0 k0Var2 = this.f35002c;
                k0Var2.u((String) this.f35001b, new p((r20) obj, k0Var2, p0Var, (t8) this.d));
                return;
            default:
                t8 t8Var = (t8) this.d;
                r20 r20Var = (r20) this.f35001b;
                p0 p0Var2 = (p0) this.e;
                b0 b0Var2 = (b0) obj;
                if (b0Var2 == null) {
                    r20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var2.f34222c;
                if (bArr == null) {
                    byte[][] m10 = p0Var2.m();
                    if (m10.length <= 0) {
                        r20Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!p0Var2.f(bArr)) {
                    r20Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(r20Var, this.f35002c, p0Var2, t8Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = p0.o(bArr);
                }
                String str = o10;
                p0.h.execute(new org.telegram.ui.Components.k2(p0Var2, p0Var2.l(), str, false, (r20) mVar));
                return;
        }
    }

    public p(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f35002c = k0Var;
        this.d = b0Var;
        this.f35001b = str;
        this.e = runnable;
    }

    public p(k8 k8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = k8Var;
        this.f35001b = str;
        this.f35002c = k0Var;
        this.e = k2Var;
    }

    public p(t8 t8Var, k0 k0Var, String str, p0 p0Var) {
        this.d = t8Var;
        this.f35002c = k0Var;
        this.f35001b = str;
        this.e = p0Var;
    }
}
