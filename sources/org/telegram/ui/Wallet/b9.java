package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class b9 implements x10 {
    public final int f42276a;
    public final m9 f42277b;
    public final m0 f42278c;
    public final long d;

    public b9(m9 m9Var, m0 m0Var, long j3, int i7) {
        this.f42276a = i7;
        this.f42277b = m9Var;
        this.f42278c = m0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f42276a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final m9 m9Var = this.f42277b;
                TLRPC.User user = m9Var.f42820f;
                String str2 = m9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = m9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f42278c.d0(user, str2, this.d, str, bArr3, null, m9Var.f42828n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        m9 m9Var2 = m9Var;
                                        m9Var2.fragmentView.postDelayed(new w8(m9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    c20Var.a(str3);
                                    if (str3 == null) {
                                        m9 m9Var3 = m9Var;
                                        m9Var3.fragmentView.postDelayed(new w8(m9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new a9(m9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final m9 m9Var2 = this.f42277b;
                TLRPC.User user2 = m9Var2.f42820f;
                String str4 = m9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = m9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f42278c.d0(user2, str4, this.d, str3, bArr4, null, m9Var2.f42828n, new c20() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        m9 m9Var22 = m9Var2;
                                        m9Var22.fragmentView.postDelayed(new w8(m9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    c20Var2.a(str32);
                                    if (str32 == null) {
                                        m9 m9Var3 = m9Var2;
                                        m9Var3.fragmentView.postDelayed(new w8(m9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new a9(m9Var2, 3), null);
                return;
        }
    }
}
