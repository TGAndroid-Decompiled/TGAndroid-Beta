package org.telegram.ui.Wallet;

import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class h9 implements l20 {
    public final int f34686a;
    public final r9 f34687b;
    public final k0 f34688c;
    public final long d;

    public h9(r9 r9Var, k0 k0Var, long j10, int i10) {
        this.f34686a = i10;
        this.f34687b = r9Var;
        this.f34688c = k0Var;
        this.d = j10;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f34686a) {
            case 0:
                String str = (String) obj;
                final q20 q20Var = (q20) obj3;
                final r9 r9Var = this.f34687b;
                TLRPC.User user = r9Var.f35130f;
                String str2 = r9Var.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = r9Var.q0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f34688c.d0(user, str2, this.d, str, bArr3, null, r9Var.f35138n, new q20() {
                    @Override
                    public final void a(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    q20Var.a(str3);
                                    if (str3 == null) {
                                        r9 r9Var2 = r9Var;
                                        r9Var2.fragmentView.postDelayed(new c9(r9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    q20Var.a(str3);
                                    if (str3 == null) {
                                        r9 r9Var3 = r9Var;
                                        r9Var3.fragmentView.postDelayed(new c9(r9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new g9(r9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final q20 q20Var2 = (q20) obj3;
                final r9 r9Var2 = this.f34687b;
                TLRPC.User user2 = r9Var2.f35130f;
                String str4 = r9Var2.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = r9Var2.q0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f34688c.d0(user2, str4, this.d, str3, bArr4, null, r9Var2.f35138n, new q20() {
                    @Override
                    public final void a(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    q20Var2.a(str32);
                                    if (str32 == null) {
                                        r9 r9Var22 = r9Var2;
                                        r9Var22.fragmentView.postDelayed(new c9(r9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    q20Var2.a(str32);
                                    if (str32 == null) {
                                        r9 r9Var3 = r9Var2;
                                        r9Var3.fragmentView.postDelayed(new c9(r9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new g9(r9Var2, 3), null);
                return;
        }
    }
}
