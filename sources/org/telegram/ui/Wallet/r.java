package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f35492a = 1;
    public final Object f35493b;
    public final k0 f35494c;
    public final Object d;
    public final Object f35495e;

    public r(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f35494c = k0Var;
        this.d = b0Var;
        this.f35493b = str;
        this.f35495e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35492a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.f35495e;
                k0 k0Var = this.f35494c;
                k0Var.getClass();
                b0Var.f34692c = (byte[]) obj;
                if (k0Var.J.get((String) this.f35493b) == b0Var) {
                    k0Var.f0(b0Var);
                    k0Var.I();
                }
                runnable.run();
                return;
            case 1:
                b7.U((b7) this.d, (String) this.f35493b, this.f35494c, (org.telegram.ui.ActionBar.n2) this.f35495e, (String) obj);
                return;
            case 2:
                m7 m7Var = (m7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f35493b;
                ArrayList arrayList = (ArrayList) this.f35495e;
                k0 k0Var2 = this.f35494c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                h0 d = h0.d(arrayList);
                try {
                    k0Var2.A(true, false, d, new a7(3, m7Var, callback));
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
                k0 k0Var3 = this.f35494c;
                k0Var3.s((String) this.f35493b, new h7((m7) this.d, (Utilities.Callback) obj, (p0) this.f35495e, k0Var3));
                return;
        }
    }

    public r(b7 b7Var, String str, k0 k0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = b7Var;
        this.f35493b = str;
        this.f35494c = k0Var;
        this.f35495e = n2Var;
    }

    public r(m7 m7Var, Utilities.Callback callback, ArrayList arrayList, k0 k0Var) {
        this.d = m7Var;
        this.f35493b = callback;
        this.f35495e = arrayList;
        this.f35494c = k0Var;
    }

    public r(m7 m7Var, k0 k0Var, String str, p0 p0Var) {
        this.d = m7Var;
        this.f35494c = k0Var;
        this.f35493b = str;
        this.f35495e = p0Var;
    }
}
