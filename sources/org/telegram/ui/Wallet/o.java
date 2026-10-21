package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f34622a = 2;
    public final Object f34623b;
    public final m0 f34624c;
    public final Object d;
    public final Object e;

    public o(m0 m0Var, d0 d0Var, String str, Runnable runnable) {
        this.f34624c = m0Var;
        this.d = d0Var;
        this.f34623b = str;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34622a) {
            case 0:
                d0 d0Var = (d0) this.d;
                Runnable runnable = (Runnable) this.e;
                m0 m0Var = this.f34624c;
                m0Var.getClass();
                d0Var.f34091c = (byte[]) obj;
                if (m0Var.N.get((String) this.f34623b) == d0Var) {
                    m0Var.h0(d0Var);
                    m0Var.J();
                }
                runnable.run();
                return;
            case 1:
                w7.U((w7) this.d, (String) this.f34623b, this.f34624c, (org.telegram.ui.ActionBar.n2) this.e, (String) obj);
                return;
            case 2:
                h8 h8Var = (h8) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f34623b;
                ArrayList arrayList = (ArrayList) this.e;
                m0 m0Var2 = this.f34624c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                j0 d = j0.d(arrayList);
                try {
                    m0Var2.B(true, false, d, new x(10, h8Var, callback));
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
                m0 m0Var3 = this.f34624c;
                m0Var3.t((String) this.f34623b, new c8((h8) this.d, (Utilities.Callback) obj, (q0) this.e, m0Var3));
                return;
        }
    }

    public o(w7 w7Var, String str, m0 m0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = w7Var;
        this.f34623b = str;
        this.f34624c = m0Var;
        this.e = n2Var;
    }

    public o(h8 h8Var, Utilities.Callback callback, ArrayList arrayList, m0 m0Var) {
        this.d = h8Var;
        this.f34623b = callback;
        this.e = arrayList;
        this.f34624c = m0Var;
    }

    public o(h8 h8Var, m0 m0Var, String str, q0 q0Var) {
        this.d = h8Var;
        this.f34624c = m0Var;
        this.f34623b = str;
        this.e = q0Var;
    }
}
