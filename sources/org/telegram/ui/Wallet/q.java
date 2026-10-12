package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f33613a = 0;
    public final Object f33614b;
    public final j0 f33615c;
    public final Object d;
    public final Object e;

    public q(j0 j0Var, a0 a0Var, String str, Runnable runnable) {
        this.f33615c = j0Var;
        this.d = a0Var;
        this.f33614b = str;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33613a) {
            case 0:
                a0 a0Var = (a0) this.d;
                Runnable runnable = (Runnable) this.e;
                j0 j0Var = this.f33615c;
                j0Var.getClass();
                a0Var.f32911c = (byte[]) obj;
                if (j0Var.J.get((String) this.f33614b) == a0Var) {
                    j0Var.f0(a0Var);
                    j0Var.I();
                }
                runnable.run();
                return;
            case 1:
                z6.U((z6) this.d, (String) this.f33614b, this.f33615c, (org.telegram.ui.ActionBar.m2) this.e, (String) obj);
                return;
            case 2:
                k7 k7Var = (k7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f33614b;
                ArrayList arrayList = (ArrayList) this.e;
                j0 j0Var2 = this.f33615c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                g0 d = g0.d(arrayList);
                try {
                    j0Var2.A(true, false, d, new y6(3, k7Var, callback));
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
                j0 j0Var3 = this.f33615c;
                j0Var3.s((String) this.f33614b, new f7((k7) this.d, (Utilities.Callback) obj, (o0) this.e, j0Var3));
                return;
        }
    }

    public q(z6 z6Var, String str, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = z6Var;
        this.f33614b = str;
        this.f33615c = j0Var;
        this.e = m2Var;
    }

    public q(k7 k7Var, Utilities.Callback callback, ArrayList arrayList, j0 j0Var) {
        this.d = k7Var;
        this.f33614b = callback;
        this.e = arrayList;
        this.f33615c = j0Var;
    }

    public q(k7 k7Var, j0 j0Var, String str, o0 o0Var) {
        this.d = k7Var;
        this.f33615c = j0Var;
        this.f33614b = str;
        this.e = o0Var;
    }
}
