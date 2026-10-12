package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i7 implements Utilities.Callback {
    public final int f34894a = 0;
    public final n7 f34895b;
    public final Utilities.Callback f34896c;
    public final q0 d;
    public final l0 f34897e;

    public i7(n7 n7Var, Utilities.Callback callback, l0 l0Var, q0 q0Var) {
        this.f34895b = n7Var;
        this.f34896c = callback;
        this.f34897e = l0Var;
        this.d = q0Var;
    }

    @Override
    public final void run(Object obj) {
        String o9;
        switch (this.f34894a) {
            case 0:
                n7.Y(this.f34895b, this.f34896c, this.f34897e, this.d, (i0) obj);
                return;
            default:
                c0 c0Var = (c0) obj;
                Utilities.Callback callback = this.f34896c;
                if (c0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var.f34532c;
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
                i7 i7Var = new i7(this.f34895b, callback, this.f34897e, q0Var);
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
        this.f34895b = n7Var;
        this.f34896c = callback;
        this.d = q0Var;
        this.f34897e = l0Var;
    }
}
