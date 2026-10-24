package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class c8 implements Utilities.Callback {
    public final int f34377a = 0;
    public final i8 f34378b;
    public final Utilities.Callback f34379c;
    public final p0 d;
    public final l0 e;

    public c8(i8 i8Var, Utilities.Callback callback, l0 l0Var, p0 p0Var) {
        this.f34378b = i8Var;
        this.f34379c = callback;
        this.e = l0Var;
        this.d = p0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f34377a) {
            case 0:
                i8.Y(this.f34378b, this.f34379c, this.e, this.d, (i0) obj);
                return;
            default:
                c0 c0Var = (c0) obj;
                Utilities.Callback callback = this.f34379c;
                if (c0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = c0Var.f34353c;
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
                c8 c8Var = new c8(this.f34378b, callback, this.e, p0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = p0.o(bArr);
                }
                String str = o10;
                p0.h.execute(new org.telegram.ui.Components.p2(p0Var, p0Var.l(), str, false, (Utilities.Callback) c8Var));
                return;
        }
    }

    public c8(i8 i8Var, Utilities.Callback callback, p0 p0Var, l0 l0Var) {
        this.f34378b = i8Var;
        this.f34379c = callback;
        this.d = p0Var;
        this.e = l0Var;
    }
}
