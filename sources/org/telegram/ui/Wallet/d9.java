package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class d9 implements x10 {
    public final int f42435a;
    public final o9 f42436b;
    public final l0 f42437c;
    public final long d;

    public d9(o9 o9Var, l0 l0Var, long j3, int i7) {
        this.f42435a = i7;
        this.f42436b = o9Var;
        this.f42437c = l0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f42435a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final o9 o9Var = this.f42436b;
                TLRPC.User user = o9Var.f42922f;
                String str2 = o9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = o9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f42437c.d0(user, str2, this.d, str, bArr3, null, o9Var.f42930n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        o9 o9Var2 = o9Var;
                                        o9Var2.fragmentView.postDelayed(new y8(o9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        o9 o9Var3 = o9Var;
                                        o9Var3.fragmentView.postDelayed(new y8(o9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new c9(o9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final o9 o9Var2 = this.f42436b;
                TLRPC.User user2 = o9Var2.f42922f;
                String str4 = o9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = o9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f42437c.d0(user2, str4, this.d, str3, bArr4, null, o9Var2.f42930n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        o9 o9Var22 = o9Var2;
                                        o9Var22.fragmentView.postDelayed(new y8(o9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        o9 o9Var3 = o9Var2;
                                        o9Var3.fragmentView.postDelayed(new y8(o9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new c9(o9Var2, 3), null);
                return;
        }
    }
}
