package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class s9 implements s10 {
    public final int f45064a;
    public final da f45065b;
    public final u0 f45066c;
    public final long d;

    public s9(da daVar, u0 u0Var, long j3, int i7) {
        this.f45064a = i7;
        this.f45065b = daVar;
        this.f45066c = u0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f45064a) {
            case 0:
                String str = (String) obj;
                final x10 x10Var = (x10) obj3;
                final da daVar = this.f45065b;
                TLRPC.User user = daVar.f44099f;
                String str2 = daVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = daVar.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f45066c.m0(user, str2, this.d, str, bArr3, null, daVar.f44107n, new x10() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                x10Var.a(str3);
                                if (!u0.L(str3) && str3 == null) {
                                    da daVar2 = daVar;
                                    daVar2.fragmentView.postDelayed(new n9(daVar2, 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                x10Var.a(str3);
                                if (!u0.L(str3) && str3 == null) {
                                    da daVar3 = daVar;
                                    daVar3.fragmentView.postDelayed(new n9(daVar3, 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new r9(daVar, 2));
                return;
            default:
                String str3 = (String) obj;
                final x10 x10Var2 = (x10) obj3;
                final da daVar2 = this.f45065b;
                TLRPC.User user2 = daVar2.f44099f;
                String str4 = daVar2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = daVar2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f45066c.m0(user2, str4, this.d, str3, bArr4, null, daVar2.f44107n, new x10() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                x10Var2.a(str32);
                                if (!u0.L(str32) && str32 == null) {
                                    da daVar22 = daVar2;
                                    daVar22.fragmentView.postDelayed(new n9(daVar22, 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                x10Var2.a(str32);
                                if (!u0.L(str32) && str32 == null) {
                                    da daVar3 = daVar2;
                                    daVar3.fragmentView.postDelayed(new n9(daVar3, 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new r9(daVar2, 3));
                return;
        }
    }
}
