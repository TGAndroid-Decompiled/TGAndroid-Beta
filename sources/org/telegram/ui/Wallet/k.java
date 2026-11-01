package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.nc;
import org.telegram.ui.q70;
public final class k implements r20 {
    public final int f34779a;
    public final Object f34780b;

    public k(Object obj, int i10) {
        this.f34779a = i10;
        this.f34780b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        CharSequence V;
        int i11 = this.f34779a;
        String str = null;
        boolean z10 = false;
        Object obj2 = this.f34780b;
        switch (i11) {
            case 0:
                nc ncVar = (nc) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                ncVar.a(Boolean.valueOf(z10));
                return;
            case 1:
                k20 k20Var = (k20) obj2;
                h0 h0Var = (h0) obj;
                if (h0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                k20Var.a(h0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                e2.m("disconnect session", str2);
                ((r20) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                e2.m("approve session", str3);
                ((q70) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.i0.g3(new m2(13, (h8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (k8Var.f34820a != i10) {
                    k8Var.f34820a = i10;
                    k8Var.b0(k8Var.getParentActivity());
                    k8Var.d0();
                    p80 p80Var = k8Var.h;
                    byte[] bArr = k8Var.f34826s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = dd.V(null, null, 2131743119, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = dd.V(null, null, 2131743117, objArr);
                    }
                    p80Var.setText(V);
                    return;
                }
                return;
        }
    }
}
