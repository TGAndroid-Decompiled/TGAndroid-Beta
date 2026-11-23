package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.t60;
public final class k implements w10 {
    public final int f44543a;
    public final Object f44544b;

    public k(Object obj, int i7) {
        this.f44543a = i7;
        this.f44544b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        CharSequence V;
        int i10 = this.f44543a;
        boolean z10 = false;
        Object obj2 = this.f44544b;
        switch (i10) {
            case 0:
                ai.o2 o2Var = (ai.o2) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                o2Var.a(Boolean.valueOf(z10));
                return;
            case 1:
                String str = (String) obj;
                m2.m("disconnect session", str);
                ((w10) obj2).a(str);
                return;
            case 2:
                String str2 = (String) obj;
                m2.m("approve session", str2);
                ((t60) obj2).a(str2);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new r(13, (s8) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                v8 v8Var = (v8) obj2;
                v8Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i7 = 12;
                } else {
                    i7 = 24;
                }
                if (v8Var.f45309a != i7) {
                    v8Var.f45309a = i7;
                    v8Var.b0(v8Var.getParentActivity());
                    v8Var.d0();
                    j80 j80Var = v8Var.h;
                    byte[] bArr = v8Var.f45316s;
                    Integer valueOf = Integer.valueOf(i7);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742841, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742839, objArr);
                    }
                    j80Var.setText(V);
                    return;
                }
                return;
        }
    }
}
