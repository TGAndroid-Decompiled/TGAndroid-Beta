package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g7 implements Utilities.Callback {
    public final int f34966a = 0;
    public final l7 f34967b;
    public final Utilities.Callback f34968c;
    public final p0 d;
    public final k0 f34969e;

    public g7(l7 l7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var) {
        this.f34967b = l7Var;
        this.f34968c = callback;
        this.f34969e = k0Var;
        this.d = p0Var;
    }

    @Override
    public final void run(Object obj) {
        String o9;
        switch (this.f34966a) {
            case 0:
                l7.Y(this.f34967b, this.f34968c, this.f34969e, this.d, (h0) obj);
                return;
            default:
                b0 b0Var = (b0) obj;
                Utilities.Callback callback = this.f34968c;
                if (b0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var.f34666c;
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
                g7 g7Var = new g7(this.f34967b, callback, this.f34969e, p0Var);
                if (bArr == null) {
                    o9 = "";
                } else {
                    o9 = p0.o(bArr);
                }
                String str = o9;
                p0.h.execute(new org.telegram.ui.Components.r2(p0Var, p0Var.l(), str, false, (Utilities.Callback) g7Var));
                return;
        }
    }

    public g7(l7 l7Var, Utilities.Callback callback, p0 p0Var, k0 k0Var) {
        this.f34967b = l7Var;
        this.f34968c = callback;
        this.d = p0Var;
        this.f34969e = k0Var;
    }
}
