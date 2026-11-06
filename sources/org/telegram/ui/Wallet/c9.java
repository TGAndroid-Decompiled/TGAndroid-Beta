package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class c9 implements x10 {
    public final int f42286a;
    public final n9 f42287b;
    public final n0 f42288c;
    public final long d;

    public c9(n9 n9Var, n0 n0Var, long j3, int i7) {
        this.f42286a = i7;
        this.f42287b = n9Var;
        this.f42288c = n0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f42286a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final n9 n9Var = this.f42287b;
                TLRPC.User user = n9Var.f42826f;
                String str2 = n9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = n9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f42288c.d0(user, str2, this.d, str, bArr3, null, n9Var.f42834n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        n9 n9Var2 = n9Var;
                                        n9Var2.fragmentView.postDelayed(new x8(n9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        n9 n9Var3 = n9Var;
                                        n9Var3.fragmentView.postDelayed(new x8(n9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new b9(n9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final n9 n9Var2 = this.f42287b;
                TLRPC.User user2 = n9Var2.f42826f;
                String str4 = n9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = n9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f42288c.d0(user2, str4, this.d, str3, bArr4, null, n9Var2.f42834n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        n9 n9Var22 = n9Var2;
                                        n9Var22.fragmentView.postDelayed(new x8(n9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        n9 n9Var3 = n9Var2;
                                        n9Var3.fragmentView.postDelayed(new x8(n9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new b9(n9Var2, 3), null);
                return;
        }
    }
}
