package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f34902a = 0;
    public final k7 f34903b;
    public final Utilities.Callback f34904c;
    public final p0 d;
    public final k0 f34905e;

    public f7(k7 k7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var) {
        this.f34903b = k7Var;
        this.f34904c = callback;
        this.f34905e = k0Var;
        this.d = p0Var;
    }

    @Override
    public final void run(Object obj) {
        String o9;
        switch (this.f34902a) {
            case 0:
                k7.Y(this.f34903b, this.f34904c, this.f34905e, this.d, (h0) obj);
                return;
            default:
                b0 b0Var = (b0) obj;
                Utilities.Callback callback = this.f34904c;
                if (b0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var.f34638c;
                p0 p0Var = this.d;
                if (bArr == null) {
                    byte[][] m10 = p0Var.m();
                    if (m10.length <= 0) {
                        callback.run("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!p0Var.f(bArr)) {
                    callback.run("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                f7 f7Var = new f7(this.f34903b, callback, this.f34905e, p0Var);
                if (bArr == null) {
                    o9 = "";
                } else {
                    o9 = p0.o(bArr);
                }
                String str = o9;
                p0.h.execute(new org.telegram.ui.Components.r2(p0Var, p0Var.l(), str, false, (Utilities.Callback) f7Var));
                return;
        }
    }

    public f7(k7 k7Var, Utilities.Callback callback, p0 p0Var, k0 k0Var) {
        this.f34903b = k7Var;
        this.f34904c = callback;
        this.d = p0Var;
        this.f34905e = k0Var;
    }
}
