package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i8 implements Utilities.Callback {
    public final int f34339a = 0;
    public final n8 f34340b;
    public final Utilities.Callback f34341c;
    public final q0 d;
    public final m0 e;

    public i8(n8 n8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var) {
        this.f34340b = n8Var;
        this.f34341c = callback;
        this.e = m0Var;
        this.d = q0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f34339a) {
            case 0:
                n8.Y(this.f34340b, this.f34341c, this.e, this.d, (j0) obj);
                return;
            default:
                d0 d0Var = (d0) obj;
                Utilities.Callback callback = this.f34341c;
                if (d0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = d0Var.f34116c;
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
                i8 i8Var = new i8(this.f34340b, callback, this.e, q0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = q0.o(bArr);
                }
                String str = o10;
                q0.h.execute(new org.telegram.ui.Components.r2(q0Var, q0Var.l(), str, false, (Utilities.Callback) i8Var));
                return;
        }
    }

    public i8(n8 n8Var, Utilities.Callback callback, q0 q0Var, m0 m0Var) {
        this.f34340b = n8Var;
        this.f34341c = callback;
        this.d = q0Var;
        this.e = m0Var;
    }
}
