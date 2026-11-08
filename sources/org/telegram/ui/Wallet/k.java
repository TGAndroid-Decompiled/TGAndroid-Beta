package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.t60;
public final class k implements c20 {
    public final int f42689a;
    public final Object f42690b;

    public k(Object obj, int i7) {
        this.f42689a = i7;
        this.f42690b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f42689a;
        String str = null;
        boolean z9 = false;
        Object obj2 = this.f42690b;
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
                j0 j0Var = (j0) obj;
                if (j0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                v10Var.a(j0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                e2.m("disconnect session", str2);
                ((c20) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                e2.m("approve session", str3);
                ((t60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new n(19, (b8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                e8 e8Var = (e8) obj2;
                e8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (e8Var.f42456a != i7) {
                    e8Var.f42456a = i7;
                    e8Var.b0(e8Var.getParentActivity());
                    e8Var.d0();
                    w70 w70Var = e8Var.h;
                    byte[] bArr = e8Var.f42463s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743096, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743094, objArr);
                    }
                    w70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
