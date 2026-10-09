package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f35402a = 1;
    public final Object f35403b;
    public final k0 f35404c;
    public final Object d;
    public final Object f35405e;

    public q(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f35404c = k0Var;
        this.d = b0Var;
        this.f35403b = str;
        this.f35405e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35402a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.f35405e;
                k0 k0Var = this.f35404c;
                k0Var.getClass();
                b0Var.f34666c = (byte[]) obj;
                if (k0Var.J.get((String) this.f35403b) == b0Var) {
                    k0Var.f0(b0Var);
                    k0Var.I();
                }
                runnable.run();
                return;
            case 1:
                a7.U((a7) this.d, (String) this.f35403b, this.f35404c, (org.telegram.ui.ActionBar.n2) this.f35405e, (String) obj);
                return;
            case 2:
                l7 l7Var = (l7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f35403b;
                ArrayList arrayList = (ArrayList) this.f35405e;
                k0 k0Var2 = this.f35404c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                h0 d = h0.d(arrayList);
                try {
                    k0Var2.A(true, false, d, new z6(3, l7Var, callback));
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
                k0 k0Var3 = this.f35404c;
                k0Var3.s((String) this.f35403b, new g7((l7) this.d, (Utilities.Callback) obj, (p0) this.f35405e, k0Var3));
                return;
        }
    }

    public q(a7 a7Var, String str, k0 k0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = a7Var;
        this.f35403b = str;
        this.f35404c = k0Var;
        this.f35405e = n2Var;
    }

    public q(l7 l7Var, Utilities.Callback callback, ArrayList arrayList, k0 k0Var) {
        this.d = l7Var;
        this.f35403b = callback;
        this.f35405e = arrayList;
        this.f35404c = k0Var;
    }

    public q(l7 l7Var, k0 k0Var, String str, p0 p0Var) {
        this.d = l7Var;
        this.f35404c = k0Var;
        this.f35403b = str;
        this.f35405e = p0Var;
    }
}
