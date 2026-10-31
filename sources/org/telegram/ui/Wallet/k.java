package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.nc;
import org.telegram.ui.r70;
public final class k implements q20 {
    public final int f34774a;
    public final Object f34775b;

    public k(Object obj, int i10) {
        this.f34774a = i10;
        this.f34775b = obj;
    }

    @Override
    public final void a(Object obj) {
        CharSequence V;
        int i10 = this.f34774a;
        String str = null;
        int i11 = 12;
        boolean z10 = false;
        Object obj2 = this.f34775b;
        switch (i10) {
            case 0:
                nc ncVar = (nc) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                ncVar.a(Boolean.valueOf(z10));
                return;
            case 1:
                j20 j20Var = (j20) obj2;
                h0 h0Var = (h0) obj;
                if (h0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                j20Var.a(h0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                e2.m("disconnect session", str2);
                ((q20) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                e2.m("approve session", str3);
                ((r70) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.i0.g3(new k3(12, (h8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                if (((Integer) obj).intValue() != 0) {
                    i11 = 24;
                }
                if (k8Var.f34816a != i11) {
                    k8Var.f34816a = i11;
                    k8Var.a0(k8Var.getParentActivity());
                    k8Var.c0();
                    p80 p80Var = k8Var.h;
                    if (k8Var.f34822s != null) {
                        V = cd.V(null, null, 2131743119, Integer.valueOf(i11));
                    } else {
                        V = cd.V(null, null, 2131743117, Integer.valueOf(i11));
                    }
                    p80Var.setText(V);
                    return;
                }
                return;
        }
    }
}
