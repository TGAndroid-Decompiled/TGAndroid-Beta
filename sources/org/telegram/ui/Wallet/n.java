package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class n implements Utilities.Callback {
    public final int f34884a = 2;
    public final Object f34885b;
    public final l0 f34886c;
    public final Object d;
    public final Object e;

    public n(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.f34886c = l0Var;
        this.d = c0Var;
        this.f34885b = str;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34884a) {
            case 0:
                c0 c0Var = (c0) this.d;
                Runnable runnable = (Runnable) this.e;
                l0 l0Var = this.f34886c;
                l0Var.getClass();
                c0Var.f34351c = (byte[]) obj;
                if (l0Var.N.get((String) this.f34885b) == c0Var) {
                    l0Var.h0(c0Var);
                    l0Var.J();
                }
                runnable.run();
                return;
            case 1:
                w7.U((w7) this.d, (String) this.f34885b, this.f34886c, (org.telegram.ui.ActionBar.o2) this.e, (String) obj);
                return;
            case 2:
                i8 i8Var = (i8) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f34885b;
                ArrayList arrayList = (ArrayList) this.e;
                l0 l0Var2 = this.f34886c;
                String str = (String) obj;
                if (str != null) {
                    callback.run(str);
                    return;
                }
                i0 d = i0.d(arrayList);
                try {
                    l0Var2.B(true, false, d, new w(10, i8Var, callback));
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
                l0 l0Var3 = this.f34886c;
                l0Var3.t((String) this.f34885b, new c8((i8) this.d, (Utilities.Callback) obj, (p0) this.e, l0Var3));
                return;
        }
    }

    public n(w7 w7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = w7Var;
        this.f34885b = str;
        this.f34886c = l0Var;
        this.e = o2Var;
    }

    public n(i8 i8Var, Utilities.Callback callback, ArrayList arrayList, l0 l0Var) {
        this.d = i8Var;
        this.f34885b = callback;
        this.e = arrayList;
        this.f34886c = l0Var;
    }

    public n(i8 i8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = i8Var;
        this.f34886c = l0Var;
        this.f34885b = str;
        this.e = p0Var;
    }
}
