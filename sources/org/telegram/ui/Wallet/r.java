package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f35304a = 1;
    public final Object f35305b;
    public final l0 f35306c;
    public final Object d;
    public final Object f35307e;

    public r(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.f35306c = l0Var;
        this.d = c0Var;
        this.f35305b = str;
        this.f35307e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35304a) {
            case 0:
                c0 c0Var = (c0) this.d;
                Runnable runnable = (Runnable) this.f35307e;
                l0 l0Var = this.f35306c;
                l0Var.getClass();
                c0Var.f34534c = (byte[]) obj;
                if (l0Var.J.get((String) this.f35305b) == c0Var) {
                    l0Var.f0(c0Var);
                    l0Var.I();
                }
                runnable.run();
                return;
            case 1:
                c7.U((c7) this.d, (String) this.f35305b, this.f35306c, (org.telegram.ui.ActionBar.m2) this.f35307e, (String) obj);
                return;
            case 2:
                n7 n7Var = (n7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f35305b;
                ArrayList arrayList = (ArrayList) this.f35307e;
                l0 l0Var2 = this.f35306c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                i0 d = i0.d(arrayList);
                try {
                    l0Var2.A(true, false, d, new b7(3, n7Var, callback));
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
                l0 l0Var3 = this.f35306c;
                l0Var3.s((String) this.f35305b, new i7((n7) this.d, (Utilities.Callback) obj, (q0) this.f35307e, l0Var3));
                return;
        }
    }

    public r(c7 c7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = c7Var;
        this.f35305b = str;
        this.f35306c = l0Var;
        this.f35307e = m2Var;
    }

    public r(n7 n7Var, Utilities.Callback callback, ArrayList arrayList, l0 l0Var) {
        this.d = n7Var;
        this.f35305b = callback;
        this.f35307e = arrayList;
        this.f35306c = l0Var;
    }

    public r(n7 n7Var, l0 l0Var, String str, q0 q0Var) {
        this.d = n7Var;
        this.f35306c = l0Var;
        this.f35305b = str;
        this.f35307e = q0Var;
    }
}
