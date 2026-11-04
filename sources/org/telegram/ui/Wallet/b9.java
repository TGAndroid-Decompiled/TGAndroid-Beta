package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class b9 implements p10 {
    public final int f42348a;
    public final m9 f42349b;
    public final k0 f42350c;
    public final long d;

    public b9(m9 m9Var, k0 k0Var, long j10, int i3) {
        this.f42348a = i3;
        this.f42349b = m9Var;
        this.f42350c = k0Var;
        this.d = j10;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f42348a) {
            case 0:
                String str = (String) obj;
                final u10 u10Var = (u10) obj3;
                final m9 m9Var = this.f42349b;
                TLRPC.User user = m9Var.f42875f;
                String str2 = m9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = m9Var.r0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f42350c.d0(user, str2, this.d, str, bArr3, null, m9Var.f42883n, new u10() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    u10Var.a(str3);
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
                                    u10Var.a(str3);
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
                final u10 u10Var2 = (u10) obj3;
                final m9 m9Var2 = this.f42349b;
                TLRPC.User user2 = m9Var2.f42875f;
                String str4 = m9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = m9Var2.r0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f42350c.d0(user2, str4, this.d, str3, bArr4, null, m9Var2.f42883n, new u10() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    u10Var2.a(str32);
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
                                    u10Var2.a(str32);
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
