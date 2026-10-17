package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f8 implements Utilities.Callback {
    public final int f34205a = 0;
    public final k8 f34206b;
    public final Utilities.Callback f34207c;
    public final q0 d;
    public final m0 e;

    public f8(k8 k8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var) {
        this.f34206b = k8Var;
        this.f34207c = callback;
        this.e = m0Var;
        this.d = q0Var;
    }

    @Override
    public final void run(Object obj) {
        String o10;
        switch (this.f34205a) {
            case 0:
                k8.Y(this.f34206b, this.f34207c, this.e, this.d, (j0) obj);
                return;
            default:
                d0 d0Var = (d0) obj;
                Utilities.Callback callback = this.f34207c;
                if (d0Var == null) {
                    callback.run("ADDRESS_NO_INFO");
                    return;
                }
                byte[] bArr = d0Var.f34106c;
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
                f8 f8Var = new f8(this.f34206b, callback, this.e, q0Var);
                if (bArr == null) {
                    o10 = "";
                } else {
                    o10 = q0.o(bArr);
                }
                String str = o10;
                q0.h.execute(new org.telegram.ui.Components.q2(q0Var, q0Var.l(), str, false, (Utilities.Callback) f8Var));
                return;
        }
    }

    public f8(k8 k8Var, Utilities.Callback callback, q0 q0Var, m0 m0Var) {
        this.f34206b = k8Var;
        this.f34207c = callback;
        this.d = q0Var;
        this.e = m0Var;
    }
}
