package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class t9 implements r10 {
    public final int f45196a;
    public final ea f45197b;
    public final v0 f45198c;
    public final long d;

    public t9(ea eaVar, v0 v0Var, long j3, int i7) {
        this.f45196a = i7;
        this.f45197b = eaVar;
        this.f45198c = v0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f45196a) {
            case 0:
                String str = (String) obj;
                final w10 w10Var = (w10) obj3;
                final ea eaVar = this.f45197b;
                TLRPC.User user = eaVar.f44231f;
                String str2 = eaVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = eaVar.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f45198c.m0(user, str2, this.d, str, bArr3, null, eaVar.f44239n, new w10() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                w10Var.a(str3);
                                if (!v0.L(str3) && str3 == null) {
                                    ea eaVar2 = eaVar;
                                    eaVar2.fragmentView.postDelayed(new o9(eaVar2, 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                w10Var.a(str3);
                                if (!v0.L(str3) && str3 == null) {
                                    ea eaVar3 = eaVar;
                                    eaVar3.fragmentView.postDelayed(new o9(eaVar3, 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new s9(eaVar, 2));
                return;
            default:
                String str3 = (String) obj;
                final w10 w10Var2 = (w10) obj3;
                final ea eaVar2 = this.f45197b;
                TLRPC.User user2 = eaVar2.f44231f;
                String str4 = eaVar2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = eaVar2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f45198c.m0(user2, str4, this.d, str3, bArr4, null, eaVar2.f44239n, new w10() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                w10Var2.a(str32);
                                if (!v0.L(str32) && str32 == null) {
                                    ea eaVar22 = eaVar2;
                                    eaVar22.fragmentView.postDelayed(new o9(eaVar22, 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                w10Var2.a(str32);
                                if (!v0.L(str32) && str32 == null) {
                                    ea eaVar3 = eaVar2;
                                    eaVar3.fragmentView.postDelayed(new o9(eaVar3, 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new s9(eaVar2, 3));
                return;
        }
    }
}
