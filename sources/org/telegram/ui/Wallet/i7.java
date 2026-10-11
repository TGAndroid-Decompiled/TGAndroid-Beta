package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i7 implements Utilities.Callback {
    public final int f35085a = 0;
    public final n7 f35086b;
    public final Utilities.Callback f35087c;
    public final q0 d;
    public final l0 f35088e;

    public i7(n7 n7Var, Utilities.Callback callback, l0 l0Var, q0 q0Var) {
        this.f35086b = n7Var;
        this.f35087c = callback;
        this.f35088e = l0Var;
        this.d = q0Var;
    }

    @Override
    public final void run(Object obj) {
        String o9;
        switch (this.f35085a) {
            case 0:
                n7.Y(this.f35086b, this.f35087c, this.f35088e, this.d, (i0) obj);
                return;
            default:
                c0 c0Var = (c0) obj;
                Utilities.Callback callback = this.f35087c;
                if (c0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var.f34723c;
                q0 q0Var = this.d;
                if (bArr == null) {
                    byte[][] m10 = q0Var.m();
                    if (m10.length <= 0) {
                        callback.run("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!q0Var.f(bArr)) {
                    callback.run("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                i7 i7Var = new i7(this.f35086b, callback, this.f35088e, q0Var);
                if (bArr == null) {
                    o9 = "";
                } else {
                    o9 = q0.o(bArr);
                }
                String str = o9;
                q0.h.execute(new org.telegram.ui.Components.r2(q0Var, q0Var.l(), str, false, (Utilities.Callback) i7Var));
                return;
        }
    }

    public i7(n7 n7Var, Utilities.Callback callback, q0 q0Var, l0 l0Var) {
        this.f35086b = n7Var;
        this.f35087c = callback;
        this.d = q0Var;
        this.f35088e = l0Var;
    }
}
