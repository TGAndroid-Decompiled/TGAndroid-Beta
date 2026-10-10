package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h7 implements Utilities.Callback {
    public final int f35055a = 0;
    public final m7 f35056b;
    public final Utilities.Callback f35057c;
    public final p0 d;
    public final k0 f35058e;

    public h7(m7 m7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var) {
        this.f35056b = m7Var;
        this.f35057c = callback;
        this.f35058e = k0Var;
        this.d = p0Var;
    }

    @Override
    public final void run(Object obj) {
        String o9;
        switch (this.f35055a) {
            case 0:
                m7.Y(this.f35056b, this.f35057c, this.f35058e, this.d, (h0) obj);
                return;
            default:
                b0 b0Var = (b0) obj;
                Utilities.Callback callback = this.f35057c;
                if (b0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var.f34692c;
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
                h7 h7Var = new h7(this.f35056b, callback, this.f35058e, p0Var);
                if (bArr == null) {
                    o9 = "";
                } else {
                    o9 = p0.o(bArr);
                }
                String str = o9;
                p0.h.execute(new org.telegram.ui.Components.r2(p0Var, p0Var.l(), str, false, (Utilities.Callback) h7Var));
                return;
        }
    }

    public h7(m7 m7Var, Utilities.Callback callback, p0 p0Var, k0 k0Var) {
        this.f35056b = m7Var;
        this.f35057c = callback;
        this.d = p0Var;
        this.f35058e = k0Var;
    }
}
