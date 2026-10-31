package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
public final class p implements q20 {
    public final int f34997a = 3;
    public final Object f34998b;
    public final k0 f34999c;
    public final Object d;
    public final Object e;

    public p(q20 q20Var, k0 k0Var, p0 p0Var, t8 t8Var) {
        this.d = t8Var;
        this.f34998b = q20Var;
        this.e = p0Var;
        this.f34999c = k0Var;
    }

    @Override
    public final void a(Object obj) {
        String o10;
        switch (this.f34997a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.e;
                k0 k0Var = this.f34999c;
                k0Var.getClass();
                b0Var.f34223c = (byte[]) obj;
                if (k0Var.N.get((String) this.f34998b) == b0Var) {
                    k0Var.k0(b0Var);
                    k0Var.L();
                }
                runnable.run();
                return;
            case 1:
                k8.Y((k8) this.d, (String) this.f34998b, this.f34999c, (org.telegram.ui.ActionBar.k2) this.e, (String) obj);
                return;
            case 2:
                p0 p0Var = (p0) this.e;
                k0 k0Var2 = this.f34999c;
                k0Var2.u((String) this.f34998b, new p((q20) obj, k0Var2, p0Var, (t8) this.d));
                return;
            default:
                t8 t8Var = (t8) this.d;
                q20 q20Var = (q20) this.f34998b;
                p0 p0Var2 = (p0) this.e;
                b0 b0Var2 = (b0) obj;
                if (b0Var2 == null) {
                    q20Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var2.f34223c;
                if (bArr == null) {
                    byte[][] m10 = p0Var2.m();
                    if (m10.length <= 0) {
                        q20Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!p0Var2.f(bArr)) {
                    q20Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                m mVar = new m(q20Var, this.f34999c, p0Var2, t8Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = p0.o(bArr);
                }
                String str = o10;
                p0.h.execute(new org.telegram.ui.Components.k2(p0Var2, p0Var2.l(), str, false, (q20) mVar));
                return;
        }
    }

    public p(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f34999c = k0Var;
        this.d = b0Var;
        this.f34998b = str;
        this.e = runnable;
    }

    public p(k8 k8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = k8Var;
        this.f34998b = str;
        this.f34999c = k0Var;
        this.e = k2Var;
    }

    public p(t8 t8Var, k0 k0Var, String str, p0 p0Var) {
        this.d = t8Var;
        this.f34999c = k0Var;
        this.f34998b = str;
        this.e = p0Var;
    }
}
