package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f35374a = 0;
    public final Object f35375b;
    public final k0 f35376c;
    public final Object d;
    public final Object f35377e;

    public q(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f35376c = k0Var;
        this.d = b0Var;
        this.f35375b = str;
        this.f35377e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35374a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.f35377e;
                k0 k0Var = this.f35376c;
                k0Var.getClass();
                b0Var.f34638c = (byte[]) obj;
                if (k0Var.J.get((String) this.f35375b) == b0Var) {
                    k0Var.f0(b0Var);
                    k0Var.I();
                }
                runnable.run();
                return;
            case 1:
                z6.U((z6) this.d, (String) this.f35375b, this.f35376c, (org.telegram.ui.ActionBar.n2) this.f35377e, (String) obj);
                return;
            case 2:
                k7 k7Var = (k7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f35375b;
                ArrayList arrayList = (ArrayList) this.f35377e;
                k0 k0Var2 = this.f35376c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                h0 d = h0.d(arrayList);
                try {
                    k0Var2.A(true, false, d, new y6(3, k7Var, callback));
                    d.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        d.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                k0 k0Var3 = this.f35376c;
                k0Var3.s((String) this.f35375b, new f7((k7) this.d, (Utilities.Callback) obj, (p0) this.f35377e, k0Var3));
                return;
        }
    }

    public q(z6 z6Var, String str, k0 k0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z6Var;
        this.f35375b = str;
        this.f35376c = k0Var;
        this.f35377e = n2Var;
    }

    public q(k7 k7Var, Utilities.Callback callback, ArrayList arrayList, k0 k0Var) {
        this.d = k7Var;
        this.f35375b = callback;
        this.f35377e = arrayList;
        this.f35376c = k0Var;
    }

    public q(k7 k7Var, k0 k0Var, String str, p0 p0Var) {
        this.d = k7Var;
        this.f35376c = k0Var;
        this.f35375b = str;
        this.f35377e = p0Var;
    }
}
