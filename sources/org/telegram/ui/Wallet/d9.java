package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class d9 implements u10 {
    public final int f43758a;
    public final p9 f43759b;
    public final l0 f43760c;
    public final long d;

    public d9(p9 p9Var, l0 l0Var, long j3, int i7) {
        this.f43758a = i7;
        this.f43759b = p9Var;
        this.f43760c = l0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f43758a) {
            case 0:
                String str = (String) obj;
                final z10 z10Var = (z10) obj3;
                final p9 p9Var = this.f43759b;
                TLRPC.User user = p9Var.f44339f;
                String str2 = p9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = p9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f43760c.d0(user, str2, this.d, str, bArr3, null, p9Var.f44347n, new z10() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    z10Var.a(str3);
                                    if (str3 == null) {
                                        p9 p9Var2 = p9Var;
                                        p9Var2.fragmentView.postDelayed(new y8(p9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    z10Var.a(str3);
                                    if (str3 == null) {
                                        p9 p9Var3 = p9Var;
                                        p9Var3.fragmentView.postDelayed(new y8(p9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new c9(p9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final z10 z10Var2 = (z10) obj3;
                final p9 p9Var2 = this.f43759b;
                TLRPC.User user2 = p9Var2.f44339f;
                String str4 = p9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = p9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f43760c.d0(user2, str4, this.d, str3, bArr4, null, p9Var2.f44347n, new z10() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    z10Var2.a(str32);
                                    if (str32 == null) {
                                        p9 p9Var22 = p9Var2;
                                        p9Var22.fragmentView.postDelayed(new y8(p9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    z10Var2.a(str32);
                                    if (str32 == null) {
                                        p9 p9Var3 = p9Var2;
                                        p9Var3.fragmentView.postDelayed(new y8(p9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new c9(p9Var2, 3), null);
                return;
        }
    }
}
