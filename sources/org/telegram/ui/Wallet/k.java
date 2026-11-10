package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.sb1;
import org.telegram.ui.w60;
public final class k implements c20 {
    public final int f42695a;
    public final Object f42696b;

    public k(Object obj, int i7) {
        this.f42695a = i7;
        this.f42696b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f42695a;
        String str = null;
        boolean z9 = false;
        Object obj2 = this.f42696b;
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
                i0 i0Var = (i0) obj;
                if (i0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                v10Var.a(i0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                d2.m("disconnect session", str2);
                ((c20) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                d2.m("approve session", str3);
                ((w60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new sb1(20, (d8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                g8 g8Var = (g8) obj2;
                g8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (g8Var.f42537a != i7) {
                    g8Var.f42537a = i7;
                    g8Var.b0(g8Var.getParentActivity());
                    g8Var.d0();
                    w70 w70Var = g8Var.h;
                    byte[] bArr = g8Var.f42544s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743091, objArr);
                    }
                    w70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
