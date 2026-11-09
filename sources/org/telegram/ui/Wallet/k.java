package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x70;
import org.telegram.ui.v60;
import org.telegram.ui.wb1;
public final class k implements c20 {
    public final int f42641a;
    public final Object f42642b;

    public k(Object obj, int i7) {
        this.f42641a = i7;
        this.f42642b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f42641a;
        String str = null;
        boolean z9 = false;
        Object obj2 = this.f42642b;
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
                ((v60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new wb1(20, (a8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                d8 d8Var = (d8) obj2;
                d8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (d8Var.f42374a != i7) {
                    d8Var.f42374a = i7;
                    d8Var.b0(d8Var.getParentActivity());
                    d8Var.d0();
                    x70 x70Var = d8Var.h;
                    byte[] bArr = d8Var.f42381s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743091, objArr);
                    }
                    x70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
