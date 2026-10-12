package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f33182a = 0;
    public final k7 f33183b;
    public final Utilities.Callback f33184c;
    public final o0 d;
    public final j0 e;

    public f7(k7 k7Var, Utilities.Callback callback, j0 j0Var, o0 o0Var) {
        this.f33183b = k7Var;
        this.f33184c = callback;
        this.e = j0Var;
        this.d = o0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f33182a) {
            case 0:
                k7.Y(this.f33183b, this.f33184c, this.e, this.d, (g0) obj);
                return;
            default:
                a0 a0Var = (a0) obj;
                Utilities.Callback callback = this.f33184c;
                if (a0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = a0Var.f32911c;
                o0 o0Var = this.d;
                if (bArr == null) {
                    byte[][] m10 = o0Var.m();
                    if (m10.length <= 0) {
                        callback.run("STORAGE_NO_PUBLIC_KEY");
                        return;
                    }
                    bArr = m10[0];
                }
                if (!o0Var.f(bArr)) {
                    callback.run("STORAGE_OLD_PUBLIC_KEY");
                    return;
                }
                f7 f7Var = new f7(this.f33183b, callback, this.e, o0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = o0.o(bArr);
                }
                String str = o10;
                o0.h.execute(new org.telegram.ui.Components.r2(o0Var, o0Var.l(), str, false, (Utilities.Callback) f7Var));
                return;
        }
    }

    public f7(k7 k7Var, Utilities.Callback callback, o0 o0Var, j0 j0Var) {
        this.f33183b = k7Var;
        this.f33184c = callback;
        this.d = o0Var;
        this.e = j0Var;
    }
}
