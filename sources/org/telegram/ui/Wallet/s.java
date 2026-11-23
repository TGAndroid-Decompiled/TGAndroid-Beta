package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
public final class s implements w10 {
    public final int f45029a = 3;
    public final Object f45030b;
    public final v0 f45031c;
    public final Object d;
    public final Object f45032e;

    public s(w10 w10Var, v0 v0Var, a1 a1Var, e9 e9Var) {
        this.d = e9Var;
        this.f45030b = w10Var;
        this.f45032e = a1Var;
        this.f45031c = v0Var;
    }

    @Override
    public final void a(Object obj) {
        String p10;
        switch (this.f45029a) {
            case 0:
                k0 k0Var = (k0) this.d;
                Runnable runnable = (Runnable) this.f45032e;
                v0 v0Var = this.f45031c;
                v0Var.getClass();
                k0Var.f44547c = (byte[]) obj;
                if (v0Var.Q.get((String) this.f45030b) == k0Var) {
                    v0Var.v0(k0Var);
                    v0Var.T();
                }
                runnable.run();
                return;
            case 1:
                v8.Z((v8) this.d, (String) this.f45030b, this.f45031c, (org.telegram.ui.ActionBar.g2) this.f45032e, (String) obj);
                return;
            case 2:
                a1 a1Var = (a1) this.f45032e;
                v0 v0Var2 = this.f45031c;
                v0Var2.z((String) this.f45030b, new s((w10) obj, v0Var2, a1Var, (e9) this.d));
                return;
            default:
                e9 e9Var = (e9) this.d;
                w10 w10Var = (w10) this.f45030b;
                a1 a1Var2 = (a1) this.f45032e;
                k0 k0Var2 = (k0) obj;
                if (k0Var2 == null) {
                    w10Var.a("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = k0Var2.f44547c;
                if (bArr == null) {
                    byte[][] n10 = a1Var2.n();
                    if (n10.length <= 0) {
                        w10Var.a("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = n10[0];
                }
                if (!a1Var2.f(bArr)) {
                    w10Var.a("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                o oVar = new o(w10Var, this.f45031c, a1Var2, e9Var);
                if (bArr == null) {
                    p10 = "";
                } else {
                    p10 = a1.p(bArr);
                }
                String str = p10;
                a1.f44035i.execute(new org.telegram.ui.Components.r2(a1Var2, a1Var2.l(), str, false, (w10) oVar));
                return;
        }
    }

    public s(v0 v0Var, k0 k0Var, String str, Runnable runnable) {
        this.f45031c = v0Var;
        this.d = k0Var;
        this.f45030b = str;
        this.f45032e = runnable;
    }

    public s(v8 v8Var, String str, v0 v0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = v8Var;
        this.f45030b = str;
        this.f45031c = v0Var;
        this.f45032e = g2Var;
    }

    public s(e9 e9Var, v0 v0Var, String str, a1 a1Var) {
        this.d = e9Var;
        this.f45031c = v0Var;
        this.f45030b = str;
        this.f45032e = a1Var;
    }
}
