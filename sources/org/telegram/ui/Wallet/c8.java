package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class c8 implements Utilities.Callback {
    public final int f34070a = 0;
    public final h8 f34071b;
    public final Utilities.Callback f34072c;
    public final q0 d;
    public final m0 e;

    public c8(h8 h8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var) {
        this.f34071b = h8Var;
        this.f34072c = callback;
        this.e = m0Var;
        this.d = q0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f34070a) {
            case 0:
                h8.Y(this.f34071b, this.f34072c, this.e, this.d, (j0) obj);
                return;
            default:
                d0 d0Var = (d0) obj;
                Utilities.Callback callback = this.f34072c;
                if (d0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = d0Var.f34082c;
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
                c8 c8Var = new c8(this.f34071b, callback, this.e, q0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = q0.o(bArr);
                }
                String str = o10;
                q0.h.execute(new org.telegram.ui.Components.r2(q0Var, q0Var.l(), str, false, (Utilities.Callback) c8Var));
                return;
        }
    }

    public c8(h8 h8Var, Utilities.Callback callback, q0 q0Var, m0 m0Var) {
        this.f34071b = h8Var;
        this.f34072c = callback;
        this.d = q0Var;
        this.e = m0Var;
    }
}
