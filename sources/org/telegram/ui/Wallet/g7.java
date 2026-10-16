package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g7 implements Utilities.Callback {
    public final int f32956a = 0;
    public final l7 f32957b;
    public final Utilities.Callback f32958c;
    public final p0 d;
    public final k0 e;

    public g7(l7 l7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var) {
        this.f32957b = l7Var;
        this.f32958c = callback;
        this.e = k0Var;
        this.d = p0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f32956a) {
            case 0:
                l7.Y(this.f32957b, this.f32958c, this.e, this.d, (h0) obj);
                return;
            default:
                b0 b0Var = (b0) obj;
                Utilities.Callback callback = this.f32958c;
                if (b0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = b0Var.f32683c;
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
                g7 g7Var = new g7(this.f32957b, callback, this.e, p0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = p0.o(bArr);
                }
                String str = o10;
                p0.h.execute(new org.telegram.ui.Components.r2(p0Var, p0Var.l(), str, false, (Utilities.Callback) g7Var));
                return;
        }
    }

    public g7(l7 l7Var, Utilities.Callback callback, p0 p0Var, k0 k0Var) {
        this.f32957b = l7Var;
        this.f32958c = callback;
        this.d = p0Var;
        this.e = k0Var;
    }
}
