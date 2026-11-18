package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
import org.telegram.ui.t60;
public final class k implements x10 {
    public final int f44427a;
    public final Object f44428b;

    public k(Object obj, int i7) {
        this.f44427a = i7;
        this.f44428b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f44427a;
        boolean z10 = false;
        Object obj2 = this.f44428b;
        switch (i10) {
            case 0:
                ai.u2 u2Var = (ai.u2) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                u2Var.a(Boolean.valueOf(z10));
                return;
            case 1:
                String str = (String) obj;
                l2.m("disconnect session", str);
                ((x10) obj2).a(str);
                return;
            case 2:
                String str2 = (String) obj;
                l2.m("approve session", str2);
                ((t60) obj2).a(str2);
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
                if (u8Var.f45137a != i7) {
                    u8Var.f45137a = i7;
                    u8Var.b0(u8Var.getParentActivity());
                    u8Var.d0();
                    k80 k80Var = u8Var.h;
                    byte[] bArr = u8Var.f45144s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742854, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742852, objArr);
                    }
                    k80Var.setText(V);
                    return;
                }
                return;
        }
    }
}
