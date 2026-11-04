package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s70;
import org.telegram.ui.ma1;
import org.telegram.ui.n60;
public final class k implements u10 {
    public final int f42716a;
    public final Object f42717b;

    public k(Object obj, int i3) {
        this.f42716a = i3;
        this.f42717b = obj;
    }

    @Override
    public final void a(Object obj) {
        CharSequence V;
        int i3 = this.f42716a;
        String str = null;
        int i10 = 24;
        boolean z10 = false;
        Object obj2 = this.f42717b;
        switch (i3) {
            case 0:
                ci.b8 b8Var = (ci.b8) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                b8Var.a(Boolean.valueOf(z10));
                return;
            case 1:
                n10 n10Var = (n10) obj2;
                h0 h0Var = (h0) obj;
                if (h0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                n10Var.a(h0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                c2.m("disconnect session", str2);
                ((u10) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                c2.m("approve session", str3);
                ((n60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new ma1(24, (b8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                e8 e8Var = (e8) obj2;
                e8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                }
                if (e8Var.f42479a != i10) {
                    e8Var.f42479a = i10;
                    e8Var.b0(e8Var.getParentActivity());
                    e8Var.d0();
                    s70 s70Var = e8Var.h;
                    if (e8Var.f42486s != null) {
                        V = bd.V(null, null, 2131743103, Integer.valueOf(i10));
                    } else {
                        V = bd.V(null, null, 2131743101, Integer.valueOf(i10));
                    }
                    s70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
