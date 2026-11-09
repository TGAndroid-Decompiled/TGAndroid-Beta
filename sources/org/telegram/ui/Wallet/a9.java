package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class a9 implements x10 {
    public final int f42196a;
    public final l9 f42197b;
    public final l0 f42198c;
    public final long d;

    public a9(l9 l9Var, l0 l0Var, long j3, int i7) {
        this.f42196a = i7;
        this.f42197b = l9Var;
        this.f42198c = l0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f42196a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final l9 l9Var = this.f42197b;
                TLRPC.User user = l9Var.f42738f;
                String str2 = l9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = l9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f42198c.d0(user, str2, this.d, str, bArr3, null, l9Var.f42746n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        l9 l9Var2 = l9Var;
                                        l9Var2.fragmentView.postDelayed(new v8(l9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        l9 l9Var3 = l9Var;
                                        l9Var3.fragmentView.postDelayed(new v8(l9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new z8(l9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final l9 l9Var2 = this.f42197b;
                TLRPC.User user2 = l9Var2.f42738f;
                String str4 = l9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = l9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f42198c.d0(user2, str4, this.d, str3, bArr4, null, l9Var2.f42746n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        l9 l9Var22 = l9Var2;
                                        l9Var22.fragmentView.postDelayed(new v8(l9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        l9 l9Var3 = l9Var2;
                                        l9Var3.fragmentView.postDelayed(new v8(l9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new z8(l9Var2, 3), null);
                return;
        }
    }
}
