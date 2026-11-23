package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
import org.telegram.ui.u60;
public final class k implements y10 {
    public final int f44437a;
    public final Object f44438b;

    public k(Object obj, int i7) {
        this.f44437a = i7;
        this.f44438b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f44437a;
        boolean z10 = false;
        Object obj2 = this.f44438b;
        switch (i10) {
            case 0:
                ai.n2 n2Var = (ai.n2) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                n2Var.a(Boolean.valueOf(z10));
                return;
            case 1:
                String str = (String) obj;
                l2.m("disconnect session", str);
                ((y10) obj2).a(str);
                return;
            case 2:
                String str2 = (String) obj;
                l2.m("approve session", str2);
                ((u60) obj2).a(str2);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new c5(7, (r8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                u8 u8Var = (u8) obj2;
                u8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (u8Var.f45147a != i7) {
                    u8Var.f45147a = i7;
                    u8Var.b0(u8Var.getParentActivity());
                    u8Var.d0();
                    m80 m80Var = u8Var.h;
                    byte[] bArr = u8Var.f45154s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131742848, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131742846, objArr);
                    }
                    m80Var.setText(V);
                    return;
                }
                return;
        }
    }
}
