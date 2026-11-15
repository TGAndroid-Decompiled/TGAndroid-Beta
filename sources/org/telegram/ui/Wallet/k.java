package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
import org.telegram.ui.r60;
public final class k implements z10 {
    public final int f44040a;
    public final Object f44041b;

    public k(Object obj, int i7) {
        this.f44040a = i7;
        this.f44041b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f44040a;
        String str = null;
        boolean z10 = false;
        Object obj2 = this.f44041b;
        switch (i10) {
            case 0:
                ai.u2 u2Var = (ai.u2) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                u2Var.a(Boolean.valueOf(z10));
                return;
            case 1:
                s10 s10Var = (s10) obj2;
                i0 i0Var = (i0) obj;
                if (i0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                }
                s10Var.a(i0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                d2.m("disconnect session", str2);
                ((z10) obj2).a(str2);
                return;
            case 3:
                String str3 = (String) obj;
                d2.m("approve session", str3);
                ((r60) obj2).a(str3);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new r(15, (c8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                f8 f8Var = (f8) obj2;
                f8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (f8Var.f43839a != i7) {
                    f8Var.f43839a = i7;
                    f8Var.b0(f8Var.getParentActivity());
                    f8Var.d0();
                    z70 z70Var = f8Var.h;
                    byte[] bArr = f8Var.f43846s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743091, objArr);
                    }
                    z70Var.setText(V);
                    return;
                }
                return;
        }
    }
}
