package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.t60;
public final class k implements c20 {
    public final int f42661a;
    public final Object f42662b;

    public k(Object obj, int i7) {
        this.f42661a = i7;
        this.f42662b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f42661a;
        String str = null;
        boolean z9 = false;
        Object obj2 = this.f42662b;
        switch (i10) {
            case 0:
                bi.b9 b9Var = (bi.b9) obj2;
                if (((String) obj) == null) {
                    z9 = true;
                }
                b9Var.a(Boolean.valueOf(z9));
                return;
            case 1:
                v10 v10Var = (v10) obj2;
                k0 k0Var = (k0) obj;
                if (k0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                v10Var.a(k0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                f2.m("disconnect session", str2);
                ((c20) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                f2.m("approve session", str3);
                ((t60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new n(19, (c8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                f8 f8Var = (f8) obj2;
                f8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (f8Var.f42464a != i7) {
                    f8Var.f42464a = i7;
                    f8Var.b0(f8Var.getParentActivity());
                    f8Var.d0();
                    w70 w70Var = f8Var.h;
                    byte[] bArr = f8Var.f42471s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743094, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743092, objArr);
                    }
                    w70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
