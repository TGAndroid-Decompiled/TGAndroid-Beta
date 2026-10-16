package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f33387a = 1;
    public final Object f33388b;
    public final k0 f33389c;
    public final Object d;
    public final Object e;

    public r(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.f33389c = k0Var;
        this.d = b0Var;
        this.f33388b = str;
        this.e = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33387a) {
            case 0:
                b0 b0Var = (b0) this.d;
                Runnable runnable = (Runnable) this.e;
                k0 k0Var = this.f33389c;
                k0Var.getClass();
                b0Var.f32683c = (byte[]) obj;
                if (k0Var.J.get((String) this.f33388b) == b0Var) {
                    k0Var.f0(b0Var);
                    k0Var.I();
                }
                runnable.run();
                return;
            case 1:
                a7.U((a7) this.d, (String) this.f33388b, this.f33389c, (org.telegram.ui.ActionBar.m2) this.e, (String) obj);
                return;
            case 2:
                l7 l7Var = (l7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f33388b;
                ArrayList arrayList = (ArrayList) this.e;
                k0 k0Var2 = this.f33389c;
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
                k0 k0Var3 = this.f33389c;
                k0Var3.s((String) this.f33388b, new g7((l7) this.d, (Utilities.Callback) obj, (p0) this.e, k0Var3));
                return;
        }
    }

    public r(a7 a7Var, String str, k0 k0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = a7Var;
        this.f33388b = str;
        this.f33389c = k0Var;
        this.e = m2Var;
    }

    public r(l7 l7Var, Utilities.Callback callback, ArrayList arrayList, k0 k0Var) {
        this.d = l7Var;
        this.f33388b = callback;
        this.e = arrayList;
        this.f33389c = k0Var;
    }

    public r(l7 l7Var, k0 k0Var, String str, p0 p0Var) {
        this.d = l7Var;
        this.f33389c = k0Var;
        this.f33388b = str;
        this.e = p0Var;
    }
}
